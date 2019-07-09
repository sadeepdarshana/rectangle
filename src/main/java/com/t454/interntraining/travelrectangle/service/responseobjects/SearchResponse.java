package com.t454.interntraining.travelrectangle.service.responseobjects;

import com.t454.interntraining.travelrectangle.model.HotelResult;
import com.t454.interntraining.travelrectangle.service.responseobjects.ListDataResponse;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class SearchResponse extends ListDataResponse {


    public SearchResponse(List<HotelResult> hotelResults) {
        super(hotelResults);
    }



}
