package com.example.akash.xploro;

import android.graphics.drawable.Drawable;

public class Places {

    private String placeName,webAddress, physicalAddress;
    private Drawable placePic;
    private String phone;
    private float ratings;
    private boolean selected = false;

    public Places(String placeName, String webAddress, String physicalAddress, Drawable placePic, float ratings, String phone) {
        this.placeName = placeName;
        this.webAddress = webAddress;
        this.physicalAddress = physicalAddress;
        this.placePic = placePic;
        this.ratings = ratings;
        this.phone = phone;
    }

    public String getPlaceName() {
        return placeName;
    }

    public Drawable getPlacePic() {
        return placePic;
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
