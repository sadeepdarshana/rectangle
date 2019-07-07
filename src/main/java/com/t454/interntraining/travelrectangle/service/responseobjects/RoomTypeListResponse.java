package com.t454.interntraining.travelrectangle.service.responseobjects;

import com.t454.interntraining.travelrectangle.model.Hotel;
import com.t454.interntraining.travelrectangle.model.RoomType;

import java.util.List;

public class RoomTypeListResponse extends ListDataResponse {


    public RoomTypeListResponse(List<RoomType> roomTypes) {
        super(roomTypes);
    }
}
