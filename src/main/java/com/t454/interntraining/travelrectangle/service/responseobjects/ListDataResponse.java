package com.t454.interntraining.travelrectangle.service.responseobjects;

import java.util.ArrayList;
import java.util.List;

public class ListDataResponse extends DataResponse {

    private int objectsCount;

    public ListDataResponse(List data) {
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
