package com.t454.interntraining.travelrectangle.service.responseobjects;

import com.t454.interntraining.travelrectangle.model.Hotel;

import java.util.ArrayList;

public class HotelListResponse extends ListDataResponse {


    public HotelListResponse(ArrayList<Hotel> hotels) {
        super(hotels);
    }
}
