package com.example.weatherapp.model;

public class ToDay {
    private  String temperature;
    private String time;


    public ToDay() {
    }

    public ToDay(String temperature, String time) {
        this.temperature = temperature;
        this.time = time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
