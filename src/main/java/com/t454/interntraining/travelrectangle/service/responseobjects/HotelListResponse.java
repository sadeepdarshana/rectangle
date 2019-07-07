package com.t454.interntraining.travelrectangle.service.responseobjects;

import com.t454.interntraining.travelrectangle.model.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelListResponse extends ListDataResponse {


    public HotelListResponse(List<Hotel> hotels) {
        super(hotels);
    }
}
