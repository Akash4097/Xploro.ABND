package com.example.akash.xploro;

import android.graphics.drawable.Drawable;

public class Places {

    private String placeName,type,webAddress, physicalAddress;
    private Drawable placePic;
    private String phone;
    private float ratings;
    private boolean selected = false;

    public Places(String placeName, String type, String webAddress, String physicalAddress, Drawable placePic, float ratings, String phone) {
        this.placeName = placeName;
        this.type = type;
        this.webAddress = webAddress;
        this.physicalAddress = physicalAddress;
        this.placePic = placePic;
        this.ratings = ratings;
        this.phone = phone;
    }

    public Places(String placeName, Drawable placePic, float ratings) {
        this.placeName = placeName;
        this.placePic = placePic;
        this.ratings = ratings;
    }

    public String getPlaceName() {
        return placeName;
    }

    public Drawable getPlacePic() {
        return placePic;
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

    public String getPhone() {
        return phone;
    }


    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
