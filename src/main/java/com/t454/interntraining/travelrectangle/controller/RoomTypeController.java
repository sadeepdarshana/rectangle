package com.t454.interntraining.travelrectangle.controller;

import com.t454.interntraining.travelrectangle.model.Hotel;
import com.t454.interntraining.travelrectangle.model.RoomType;
import com.t454.interntraining.travelrectangle.model.projections.HotelNameId;
import com.t454.interntraining.travelrectangle.repository.RoomTypeRepository;
import com.t454.interntraining.travelrectangle.service.responseobjects.*;
import com.t454.interntraining.travelrectangle.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.t454.interntraining.travelrectangle.utils.Utils.*;


@Controller
@RequestMapping(path = "/roomtypes")
public class RoomTypeController {

    @Autowired
    private RoomTypeRepository roomTypeRepository;


    @PostMapping(path="/add")
    @ResponseBody
    public ResponseEntity<?> addHotel (@RequestBody RoomType newRoomTypeInfo) {

        try {
            Utils.addTimestamp(newRoomTypeInfo);
            roomTypeRepository.save(newRoomTypeInfo);
            return new ResponseEntity<>(new CreatedResponse(newRoomTypeInfo.getRoomTypeId()), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(new InternalServerErrorResponse(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping(path="/all")
    @ResponseBody
    public ResponseEntity<?> getAllRoomTypes() {
        try
        {
            ArrayList<RoomType> allRoomTypes = Utils.iteratorToArrayList(roomTypeRepository.findAll());
            return new ResponseEntity<>(new RoomTypeListResponse(allRoomTypes), HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(new InternalServerErrorResponse(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
