package com.t454.interntraining.travelrectangle.service.responseobjects;

public class Response {
    private boolean success;
    private String description;


    public Response(boolean success, String description) {
        this.success = success;
        this.description = description;
    }

    public boolean getSuccess() {
        return success;
    }


    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
