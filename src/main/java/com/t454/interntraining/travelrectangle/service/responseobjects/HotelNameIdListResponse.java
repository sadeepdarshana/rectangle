package com.t454.interntraining.travelrectangle.service.responseobjects;

import com.t454.interntraining.travelrectangle.model.Hotel;
import com.t454.interntraining.travelrectangle.model.projections.HotelNameId;

import java.util.List;

public class HotelNameIdListResponse extends ListDataResponse {


    public HotelNameIdListResponse(List<HotelNameId> hotels) {
        super(hotels);
    }
}
