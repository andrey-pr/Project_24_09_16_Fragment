package com.example.artem.project_24_09_16_fragment.model;

/**
 * Created by Artem on 24.09.2016.
 */
public class location {
    private int latitude;
    private int longitude;

    public location(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public location() {

    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
}
