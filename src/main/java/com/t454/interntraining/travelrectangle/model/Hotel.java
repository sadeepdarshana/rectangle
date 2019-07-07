package com.t454.interntraining.travelrectangle.model;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hotels")
final public class Hotel extends BusinessLogicObject
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hotelId;
    private String hotelName;
    private String hotelAddress;
    private int hotelDistrictIndex;
    private String hotelEmail;

    public Hotel(){}


    public Hotel(String hotelName, String hotelAddress, int hotelDistrictIndex, String hotelEmail) {
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.hotelDistrictIndex = hotelDistrictIndex;
        this.hotelEmail = hotelEmail;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public int getHotelDistrictIndex() {
        return hotelDistrictIndex;
    }

    public void setHotelDistrictIndex(int hotelDistrictIndex) {
        this.hotelDistrictIndex = hotelDistrictIndex;
    }

    public String getHotelEmail() {
        return hotelEmail;
    }

    public void setHotelEmail(String hotelEmail) {
        this.hotelEmail = hotelEmail;
    }
}
