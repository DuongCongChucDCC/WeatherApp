package com.example.weatherapp.Domains;

public class FutureDomain {
    private String day;
    private String iconImg;
    private String status;
    private int tempHigh;
    private int tempLow;

    public FutureDomain() {
    }

    public FutureDomain(String day, String iconImg, String status, int tempHigh, int tempLow) {
        this.day = day;
        this.iconImg = iconImg;
        this.status = status;
        this.tempHigh = tempHigh;
        this.tempLow = tempLow;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getIconImg() {
        return iconImg;
    }

    public void setIconImg(String iconImg) {
        this.iconImg = iconImg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTempHigh() {
        return tempHigh;
    }

    public void setTempHigh(int tempHigh) {
        this.tempHigh = tempHigh;
    }

    public int getTempLow() {
        return tempLow;
    }

    public void setTempLow(int tempLow) {
        this.tempLow = tempLow;
    }
}
