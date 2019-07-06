package com.t454.interntraining.travelrectangle.service.responseobjects;

public class DataResponse extends SuccessResponse {

    private Object data;

    public DataResponse(Object data) {
        super("Required object in data field");
        this.data = data;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
