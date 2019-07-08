package com.t454.interntraining.travelrectangle.controller;

import com.t454.interntraining.travelrectangle.model.Contract;
import com.t454.interntraining.travelrectangle.model.ContractRequest;
import com.t454.interntraining.travelrectangle.model.ContractRoomItem;
import com.t454.interntraining.travelrectangle.model.RoomType;
import com.t454.interntraining.travelrectangle.repository.ContractRepository;
import com.t454.interntraining.travelrectangle.repository.RoomTypeRepository;
import com.t454.interntraining.travelrectangle.service.responseobjects.CreatedResponse;
import com.t454.interntraining.travelrectangle.service.responseobjects.InternalServerErrorResponse;
import com.t454.interntraining.travelrectangle.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/contracts")
public class ContractController {

    @Autowired
    private ContractRepository contractRepository;
    @Autowired
    private RoomTypeRepository roomTypeRepository;


    @PostMapping(path="/add")
    @ResponseBody
    public ResponseEntity<?> addContract (@RequestBody ContractRequest contractRequest) {

        try {

            Contract contract = new Contract(contractRequest.getHotelId(),contractRequest.getStartDate(),contractRequest.getEndDate());
            Utils.addTimestamp(contract);
            contractRepository.save(contract);

            int contractId = contract.getContractId();

            for(ContractRoomItem item:contractRequest.getItems()){
                RoomType roomType = roomTypeRepository.findRoomTypeByRoomTypeId(item.getRoomTypeId());
                roomType.setContractId(contractId);
                roomType.setQuantity(item.getQuantity());
                roomTypeRepository.save(roomType);
            }


            return new ResponseEntity<>(new CreatedResponse(-1), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(new InternalServerErrorResponse(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @GetMapping(path="/all")
    public @ResponseBody Iterable<Contract> getAllUsers() {
        return contractRepository.findAll();
    }
}
