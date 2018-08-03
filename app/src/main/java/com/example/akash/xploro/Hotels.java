package com.example.akash.xploro;

import android.graphics.drawable.Drawable;

public class Hotels {

    private String hotelName,type,webAddress, physicalAddress;
    private Drawable hotelPic;
    private int phone;
    private float ratings;

    public Hotels(String hotelName, String type, String webAddress, String physicalAddress, Drawable hotelPic, float ratings, int phone) {
        this.hotelName = hotelName;
        this.type = type;
        this.webAddress = webAddress;
        this.physicalAddress = physicalAddress;
        this.hotelPic = hotelPic;
        this.ratings = ratings;
        this.phone = phone;
    }

    public Hotels(String hotelName, Drawable hotelPic, float ratings) {
        this.hotelName = hotelName;
        this.hotelPic = hotelPic;
        this.ratings = ratings;
    }

    public String getHotelName() {
        return hotelName;
    }

    public Drawable getHotelPic() {
        return hotelPic;
    }

    public String getType() {
        return type;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public float getRatings() {
        return ratings;
    }

    public int getPhone() {
        return phone;
    }
}
