package com.t454.interntraining.travelrectangle.model;

import java.util.ArrayList;

public class HotelResult extends Hotel{

        private ArrayList<RoomType> roomTypes;

        public HotelResult(Hotel hotel){
            this.setAddedTime(hotel.getAddedTime());
            this.setHotelName(hotel.getHotelName());
            this.setHotelId(hotel.getHotelId());
            this.setHotelEmail(hotel.getHotelEmail());
            this.setHotelDistrictIndex(hotel.getHotelDistrictIndex());
            this.setHotelAddress(hotel.getHotelAddress());
        }

        public ArrayList<RoomType> getRoomTypes() {
            return roomTypes;
        }

        public void setRoomTypes(ArrayList<RoomType> roomTypes) {
            this.roomTypes = roomTypes;
        }
    }