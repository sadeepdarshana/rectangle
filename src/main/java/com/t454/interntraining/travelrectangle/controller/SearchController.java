package com.t454.interntraining.travelrectangle.controller;

import com.t454.interntraining.travelrectangle.model.Contract;
import com.t454.interntraining.travelrectangle.model.RoomType;
import com.t454.interntraining.travelrectangle.model.SearchRequest;
import com.t454.interntraining.travelrectangle.repository.ContractRepository;
import com.t454.interntraining.travelrectangle.repository.RoomTypeRepository;
import com.t454.interntraining.travelrectangle.service.MainSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller
@RequestMapping(path = "/search")
public class SearchController {

    @Autowired
    ContractRepository contractRepository;
    @Autowired
    RoomTypeRepository roomTypeRepository;
    @Autowired
    MainSearchService mainSearchService;

    @PostMapping(path="/request")
    @ResponseBody
    public ResponseEntity<?> searchRequest (@RequestBody SearchRequest searchRequest) {



            return mainSearchService.search(searchRequest);

    }

}


