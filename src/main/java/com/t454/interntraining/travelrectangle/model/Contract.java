package com.t454.interntraining.travelrectangle.model;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contract")
final public class Contract {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int hotelId;

    private int noOfRooms;


    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;

    public Contract(){}

    public Contract(int hotelId, int noOfRooms, Date startDate, Date endDate) {
        this.hotelId = hotelId;
        this.noOfRooms = noOfRooms;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
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
}
