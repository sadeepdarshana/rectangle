package com.t454.interntraining.travelrectangle.service.responseobjects;

public class ArgumentsInvalidResponse extends FailureResponse {


    public ArgumentsInvalidResponse() {
        super("Arguments missing/invalid");
    }
    public ArgumentsInvalidResponse(String description) {
        super(description);
    }

}
