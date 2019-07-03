package com.t454.interntraining.travelrectangle.controller;

import com.t454.interntraining.travelrectangle.model.RoomType;
import com.t454.interntraining.travelrectangle.repository.RoomTypeRepository;
import com.t454.interntraining.travelrectangle.service.MainQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


@Controller
@RequestMapping(path = "/query")
public class MainQueryController {


    @GetMapping(path="/search")
    public @ResponseBody
    String search (@RequestParam  int noOfR1,@RequestParam  int noOfR2,@RequestParam  int noOfR3,@RequestParam  int noOfR4
            ,@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date fromDate,@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date toDate) {
        return MainQueryService.search(noOfR1,noOfR2,noOfR3,noOfR4,fromDate,toDate);
    }


}
