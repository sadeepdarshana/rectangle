package com.t454.interntraining.travelrectangle.model;


import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BusinessLogicObject {

    //unix timestamp of the time when record added to the database
    private long addedTime;


    //TODO need to include,
    //  support documents info
    //  added system operator's id
    //  other misc. info regarding adding this object to the database

    public long getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(long addedTime) {
        this.addedTime = addedTime;
    }
}
