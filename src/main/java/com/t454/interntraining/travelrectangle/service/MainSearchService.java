package com.t454.interntraining.travelrectangle.service;

import com.t454.interntraining.travelrectangle.model.Contract;
import com.t454.interntraining.travelrectangle.model.Hotel;
import com.t454.interntraining.travelrectangle.model.RoomType;
import com.t454.interntraining.travelrectangle.model.SearchRequest;
import com.t454.interntraining.travelrectangle.repository.ContractRepository;
import com.t454.interntraining.travelrectangle.repository.HotelRepository;
import com.t454.interntraining.travelrectangle.repository.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class MainSearchService {

    @Autowired
    ContractRepository contractRepository;
    @Autowired
    RoomTypeRepository roomTypeRepository;
    @Autowired
    HotelRepository hotelRepository;



    public ResponseEntity<?>  search(SearchRequest searchRequest){



        ArrayList<Contract> contracts =  contractRepository.
                findContractsByStartDateLessThanEqualAndEndDateGreaterThanEqual
                        (searchRequest.getStartDate(),searchRequest.getEndDate());


        ArrayList<RoomType>roomTypes = new ArrayList<>();

        for(Contract c:contracts) {
            ArrayList<RoomType> _roomTypes =
                    roomTypeRepository.findRoomTypesByContractId(c.getContractId());
            roomTypes.addAll(_roomTypes);
        }

        HashSet<Integer> hotelIds = new HashSet<>();
        for (RoomType r :roomTypes) {
            hotelIds.add(r.getHotelId());
        }

        int searchDistrict = searchRequest.getHotelDistrictIndex();
        List<Hotel> hotels =hotelIds.stream()
                .map(p->hotelRepository.findHotelByHotelId(p))
                .filter(p->p.getHotelDistrictIndex()==searchDistrict||searchDistrict==-1)
                .collect(Collectors.toList());

        HashMap<Integer,boolean[]> hotelValidationMatrix = new HashMap<>();

        //1 capacity,2 capacity,3 capacity,4 capacity
        for(int i:hotelIds)hotelValidationMatrix.put(i,new boolean[]{false,false,false,false});

        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }

}
