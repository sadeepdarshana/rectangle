package com.t454.interntraining.travelrectangle.controller;

import com.t454.interntraining.travelrectangle.model.RoomType;
import com.t454.interntraining.travelrectangle.model.SearchRequest;
import com.t454.interntraining.travelrectangle.repository.RoomTypeRepository;
import com.t454.interntraining.travelrectangle.service.MainQueryService;
import com.t454.interntraining.travelrectangle.service.responseobjects.CreatedResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@Controller
@RequestMapping(path = "/search")
public class SearchController {


    @PostMapping(path="/request")
    @ResponseBody
    public ResponseEntity<?> searchRequest (@RequestBody SearchRequest searchRequest) {

int h = 8;
            return null;

        }

}


