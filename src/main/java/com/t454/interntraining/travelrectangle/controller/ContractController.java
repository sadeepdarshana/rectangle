package com.t454.interntraining.travelrectangle.controller;

import com.t454.interntraining.travelrectangle.model.Contract;
import com.t454.interntraining.travelrectangle.model.RoomType;
import com.t454.interntraining.travelrectangle.repository.ContractRepository;
import com.t454.interntraining.travelrectangle.repository.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


@Controller
@RequestMapping(path = "/contract")
public class ContractController {

    @Autowired
    private ContractRepository contractRepository;


    @GetMapping(path="/add")
    public @ResponseBody
    String addContract (@RequestParam int hotelId,@RequestParam  int noOfRooms,@RequestParam  Date startDate,@RequestParam  Date endDate) {
        Contract n = new Contract(hotelId,noOfRooms,startDate,endDate);
        contractRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Contract> getAllUsers() {
        return contractRepository.findAll();
    }
}
