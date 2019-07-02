package com.t454.interntraining.travelrectangle;

import com.t454.interntraining.travelrectangle.model.RoomType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;






@RestController
public class Controller {


    @RequestMapping(value = "/products")
    public RoomType getProduct() {
        return new RoomType(234234,567567,3457.0f,4,76,.15f);
    }
}
