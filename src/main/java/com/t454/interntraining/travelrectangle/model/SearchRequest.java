package com.t454.interntraining.travelrectangle.model;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Date;

public class SearchRequest {


    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    private int hotelId;
    private CapacityCount[] items;

    public SearchRequest() {
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public CapacityCount[] getItems() {
        return items;
    }

    public void setItems(CapacityCount[] items) {
        this.items = items;
    }
}
