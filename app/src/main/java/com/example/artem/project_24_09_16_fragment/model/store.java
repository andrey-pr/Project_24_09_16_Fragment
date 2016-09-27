package com.example.artem.project_24_09_16_fragment.model;

import android.location.Location;

/**
 * Created by Artem on 24.09.2016.
 */
public class store {private int id;
    private String name;
    private String address;
    private String phone;
    private Location location;

    public store(int id, String name, String address,
                     String phone, Location location) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.location = location;
    }

    public store() {

    }

    public int getId() {
        return id;
    }

    public store setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public store setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public store setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public store setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public store setLocation(Location location) {
        this.location = location;
        return this;
    }
}
