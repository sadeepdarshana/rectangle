package com.t454.interntraining.travelrectangle.controller;

import com.t454.interntraining.travelrectangle.model.Hotel;
import com.t454.interntraining.travelrectangle.repository.HotelRepository;
import com.t454.interntraining.travelrectangle.service.responseobjects.*;
import com.t454.interntraining.travelrectangle.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

import static com.t454.interntraining.travelrectangle.utils.Utils.*;


@Controller
@RequestMapping(path = "/hotels")
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;


    //----------------------------------------addHotel----------------------------------------------------------------
    @PostMapping(path="/add")
    @ResponseBody
    public ResponseEntity<?> addHotel (@RequestBody Hotel newHotelInfo) {


        if (emptyStringAvailable(newHotelInfo.getHotelName(), newHotelInfo.getHotelAddress(), newHotelInfo.getHotelEmail())) {
            return new ResponseEntity<>(new ArgumentsInvalidResponse(), HttpStatus.BAD_REQUEST);
        }

        if (newHotelInfo.getHotelDistrictIndex() < 0 || newHotelInfo.getHotelDistrictIndex() >= DISTRICTS.length) {
            return new ResponseEntity<>(new ArgumentsInvalidResponse("Arguments missing/invalid. District invalid"), HttpStatus.BAD_REQUEST);
        }
        if (!isValidEmailAddress(newHotelInfo.getHotelEmail())) {
            return new ResponseEntity<>(new ArgumentsInvalidResponse("Arguments missing/invalid. Email invalid."), HttpStatus.BAD_REQUEST);
        }

        try {

            hotelRepository.save(newHotelInfo);
            return new ResponseEntity<>(new CreatedResponse(newHotelInfo.getHotelId()), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(new InternalServerErrorResponse(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    //----------------------------------------getAllHotels------------------------------------------------------------
    @GetMapping(path="/all")
    @ResponseBody
    public ResponseEntity<?> getAllHotels() {
        try {
            ArrayList<Hotel> allHotels = Utils.iteratorToArrayList(hotelRepository.findAll());
            return new ResponseEntity<>(new HotelListResponse(allHotels), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new InternalServerErrorResponse(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    //----------------------------------------getHotel----------------------------------------------------------------
    @GetMapping(path="/{hotelId}")
    @ResponseBody
    public ResponseEntity<?> getHotel(@PathVariable int hotelId) {
        try {
            Optional<Hotel> hotel = hotelRepository.findById(hotelId);
            if(hotel.isPresent()) {
                return new ResponseEntity<>(new HotelResponse(hotel.get()), HttpStatus.OK);
            }else {
                return new ResponseEntity<>(new NotFoundResponse(), HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>(new InternalServerErrorResponse(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
