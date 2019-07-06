package com.t454.interntraining.travelrectangle.service.responseobjects;

public class CreatedResponse extends SuccessResponse {

    private int newObjectId;

    public CreatedResponse(int newObjectId) {
        super("Object created. Id in newObjectId field");
        this.newObjectId = newObjectId;
    }

    public int getNewObjectId() {
        return newObjectId;
    }

    public void setNewObjectId(int newObjectId) {
        this.newObjectId = newObjectId;
    }
}
