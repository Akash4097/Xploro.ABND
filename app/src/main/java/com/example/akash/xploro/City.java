package com.example.akash.xploro;

import android.graphics.drawable.Drawable;

public class City {
    private String name;
    private Drawable thumbnail;

    public City(String name, Drawable thumbnail) {
        this.name = name;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public Drawable getThumbnail() {
        return thumbnail;
    }
}
