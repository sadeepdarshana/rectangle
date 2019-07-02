package com.t454.interntraining.travelrectangle.model;


import java.util.ArrayList;
import java.util.Date;

public class Contract {
    private long contractId;
    private long hotelId;

    private Date startDate;
    private Date   endDate;

    private ArrayList<Integer> roomIds;

    public Contract(){}

    public long getContractId() {
        return contractId;
    }

    public void setContractId(long contractId) {
        this.contractId = contractId;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
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

    public ArrayList<Integer> getRoomIds() {
        return roomIds;
    }

    public void setRoomIds(ArrayList<Integer> roomIds) {
        this.roomIds = roomIds;
    }
}
