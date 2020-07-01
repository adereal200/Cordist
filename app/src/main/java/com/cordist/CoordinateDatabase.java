package com.cordist;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = Coordinate.class,version = 1)
public  abstract class CoordinateDatabase extends RoomDatabase {


    public  abstract CoordinateDao coordinateDao();
    }
