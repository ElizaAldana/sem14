package com.example.sem14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Recordatorio {
    private String descName, description, status;
    private boolean done;
    private long date;

    //Porque yolo
    public Recordatorio() {

    }

    public Recordatorio(String descName, String description, String status) {
        this.descName = descName;
        this.description = description;
        this.status = status;
        this.done = false;
        this.date = new Date().getTime();
    }

    //Esto es para la fecha
    public String getDateStr() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        date.setTime(this.date);
        return sdf.format(date);
    }

    public String toString(){
        if (done == false){
            status = "Pending";
        }
        if (done == true){
            status = "Done";
        }
        return descName+"\n"+description+"\n"+getDateStr()+"\n"+status;
    }

    //Getters y Setters :D
    public String getDescName() {
        return descName;
    }

    public void setDescName(String descName) {
        this.descName = descName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
