package com.t454.interntraining.travelrectangle.model;



import javax.persistence.*;

@Entity
@Table(name = "room_type")
final public class RoomType extends BusinessLogicObject
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomTypeId;
    private int hotelId;
    private String roomTypeName;
    private float roomTypePrice;
    private int roomTypeCapacity;
    private float roomTypeMarkup;
    private int contractId;
    private int quantity;

    public RoomType(){}

    public int getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(int roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }

    public float getRoomTypePrice() {
        return roomTypePrice;
    }

    public void setRoomTypePrice(float roomTypePrice) {
        this.roomTypePrice = roomTypePrice;
    }

    public int getRoomTypeCapacity() {
        return roomTypeCapacity;
    }

    public void setRoomTypeCapacity(int roomTypeCapacity) {
        this.roomTypeCapacity = roomTypeCapacity;
    }

    public float getRoomTypeMarkup() {
        return roomTypeMarkup;
    }

    public void setRoomTypeMarkup(float roomTypeMarkup) {
        this.roomTypeMarkup = roomTypeMarkup;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
