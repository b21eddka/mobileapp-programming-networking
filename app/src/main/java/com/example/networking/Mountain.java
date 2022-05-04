package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {

    private String ID;
    private String name;
    private String type;
    private String location;
    @SerializedName("size")
    private int height;


    public Mountain(String ID, String name, String type, String location, int height) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.location = location;
        this.height = height;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public int getHeight() {
        return height;
    }
}
