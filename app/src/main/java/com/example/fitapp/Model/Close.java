package com.example.fitapp.Model;

public class Close {
    private String time;
    private String day;


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString(){
        return "Class Pojo [time = "+time+", day = "+day+"]";
    }
}
