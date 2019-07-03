package com.t454.interntraining.travelrectangle.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

public final class MainQueryService {
    private MainQueryService(){}


    public static String search(int noOfR1, int noOfR2, int noOfR3, int noOfR4, Date fromDate, Date toDate){

        return "";
    }

    public class RoomTypeContractData {
        int hotelId,roomTypeId,fromDate,toDate;

        public RoomTypeContractData(int hotelId, int roomTypeId, int fromDate, int toDate) {
            this.hotelId = hotelId;
            this.roomTypeId = roomTypeId;
            this.fromDate = fromDate;
            this.toDate = toDate;
        }
    }

}
