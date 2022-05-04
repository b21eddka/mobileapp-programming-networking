package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {

    private String ID;
    private String name;
    private String type;
    private String location;
    @SerializedName("size")
    private int height;
    @SerializedName("cost")
    private int feet;

    public Mountain(String ID, String name, String type, String location, int height, int feet) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.location = location;
        this.height = height;
        this.feet = feet;
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

    public int getFeet() {
        return feet;
    }
}
