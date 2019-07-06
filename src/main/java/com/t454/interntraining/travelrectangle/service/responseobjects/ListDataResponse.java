package com.t454.interntraining.travelrectangle.service.responseobjects;

import java.util.ArrayList;

public class ListDataResponse extends DataResponse {

    private int objectsCount;

    public ListDataResponse(ArrayList data) {
        super(data);
        setDescription("Required objects in data field");
        setObjectsCount(data.size());

    }

    public int getObjectsCount() {
        return objectsCount;
    }

    public void setObjectsCount(int objectsCount) {
        this.objectsCount = objectsCount;
    }
}
