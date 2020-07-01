package com.cordist;

import android.content.Context;

import androidx.room.Room;

public class DatabaseClient {

    private Context mCtx;
    private static DatabaseClient mInstance;

    private static CoordinateDatabase coordinateDatabase;

    private DatabaseClient(Context mCtx) {
        this.mCtx = mCtx;

        coordinateDatabase = Room.databaseBuilder(mCtx, CoordinateDatabase.class, "coordinates_database").build();
    }
        public static synchronized DatabaseClient getInstance (Context mCtx){
            if (mInstance == null) {
                mInstance = new DatabaseClient(mCtx);
            }
            return mInstance;
        }

        public CoordinateDatabase getAppDatabase () {
            return coordinateDatabase;
        }
    }
