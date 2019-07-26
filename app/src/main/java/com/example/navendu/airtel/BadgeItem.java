package com.example.navendu.airtel;

/**
 * Created by navendu on 25/7/19.
 */

public class BadgeItem {
    String name;
    int id;

    public BadgeItem(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BadgeItem()
    {}
}
