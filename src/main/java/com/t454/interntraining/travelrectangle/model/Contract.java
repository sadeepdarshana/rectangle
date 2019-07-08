package com.t454.interntraining.travelrectangle.model;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contract")
final public class Contract extends BusinessLogicObject{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractId;
    private int hotelId;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;

    public Contract(){}

    public Contract(int hotelId, Date startDate, Date endDate) {
        this.hotelId = hotelId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
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
}
