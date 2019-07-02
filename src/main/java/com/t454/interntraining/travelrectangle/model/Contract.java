package com.t454.interntraining.travelrectangle.model;



import javax.persistence.*;

@Entity
@Table(name = "room_type")
final public class RoomType {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int hotelId;

    private String name;

    private float price;
    private int noOfAdults;

    private float markUp;

    public RoomType(){}

    public RoomType(int id, int hotelId, float price, int noOfAdults, float markUp) {
        this.id = id;
        this.hotelId = hotelId;
        this.price = price;
        this.noOfAdults = noOfAdults;
        this.markUp = markUp;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNoOfAdults() {
        return noOfAdults;
    }

    public void setNoOfAdults(int noOfAdults) {
        this.noOfAdults = noOfAdults;
    }

    public float getMarkUp() {
        return markUp;
    }

    public void setMarkUp(float markUp) {
        this.markUp = markUp;
    }
}
