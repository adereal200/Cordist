package com.cordist;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "coordinate_table")
public class Coordinate {

@PrimaryKey(autoGenerate = true)
    private int id;

    private double fromLongitude;

private  double fromLatitude;

private  double toLongitude;

private  double toLatitude;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getFromLongitude() {
        return fromLongitude;
    }

    public double getFromLatitude() {
        return fromLatitude;
    }

    public double getToLongitude() {
        return toLongitude;
    }

    public double getToLatitude() {
        return toLatitude;
    }

    public void setFromLongitude(double fromLongitude) {
        this.fromLongitude = fromLongitude;
    }

    public void setFromLatitude(double fromLatitude) {
        this.fromLatitude = fromLatitude;
    }

    public void setToLongitude(double toLongitude) {
        this.toLongitude = toLongitude;
    }

    public void setToLatitude(double toLatitude) {
        this.toLatitude = toLatitude;
    }
}
