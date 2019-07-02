package com.t454.interntraining.travelrectangle.controller;

import com.t454.interntraining.travelrectangle.model.RoomType;
import com.t454.interntraining.travelrectangle.repository.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/roomtype")
public class RoomTypeController {

    @Autowired
    private RoomTypeRepository roomTypeRepository;


    @GetMapping(path="/add")
    public @ResponseBody
    String addRoomType (@RequestParam int id,@RequestParam  int hotelId,@RequestParam  float price,@RequestParam  int noOfAdults,@RequestParam  float markUp) {
        RoomType n = new RoomType(id,hotelId,price,noOfAdults,markUp);
        roomTypeRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<RoomType> getAllUsers() {
        return roomTypeRepository.findAll();
    }
}
