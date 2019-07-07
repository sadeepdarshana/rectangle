package com.t454.interntraining.travelrectangle.utils;


import com.t454.interntraining.travelrectangle.model.BusinessLogicObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class Utils {

    private Utils(){}


    public static final String [] DISTRICTS= {"Colombo", "Gampaha", "Kalutara", "Kandy", "Matale",
            "Nuwara Eliya", "Galle", "Matara", "Hambantota", "Jaffna", "Mannar", "Vauniya", "Mullativue",
            "Ampara", "Trincomalee", "Batticaloa", "Kilinochchi", "Kurunegala", "Puttalam",
            "Anuradhapura", "Polonnaruwa", "Badulla", "Moneragala", "Ratnapura", "Kegalle"};

    public static boolean emptyStringAvailable(String ... strs){
        for (int i = 0; i < strs.length; i++) {
            if(strs[i] == null || strs[i].equals("")){
                return true;
            }
        }
        return false;
    }

    public static boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }



    public static <E> ArrayList<E> iteratorToArrayList(Iterable<E> iter) {
        ArrayList<E> list = new ArrayList<E>();
        for (E item : iter) {
            list.add(item);
        }
        return list;
    }

    public static void addTimestamp(BusinessLogicObject blo){
        blo.setAddedTime(System.currentTimeMillis());
    }
}
