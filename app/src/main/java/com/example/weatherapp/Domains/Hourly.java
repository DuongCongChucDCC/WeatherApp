package com.example.weatherapp.Domains;

public class Hourly {
    private String Hour;
    private int Temp;
    private String Icon;

    public Hourly() {
    }

    public Hourly(String hour, int temp, String icon) {
        Hour = hour;
        Temp = temp;
        Icon = icon;
    }

    public String getHour() {
        return Hour;
    }

    public void setHour(String hour) {
        Hour = hour;
    }

    public int getTemp() {
        return Temp;
    }

    public void setTemp(int temp) {
        Temp = temp;
    }

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String icon) {
        Icon = icon;
    }
}
