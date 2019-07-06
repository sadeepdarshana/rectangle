package com.t454.interntraining.travelrectangle.service.responseobjects;

public class FailureResponse extends Response {
    public FailureResponse(String description) {
        super(false, description);
    }
}
