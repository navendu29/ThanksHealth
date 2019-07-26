package com.example.navendu.airtel;

/**
 * Created by navendu on 24/7/19.
 */

public class Item {

    String date;
    String value;

    public Item(){}

    public Item(String date, String value){
        this.date=date;
        this.value=value;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
