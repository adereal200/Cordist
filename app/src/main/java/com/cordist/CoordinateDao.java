package com.cordist;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CoordinateDao {
    @Insert
    void insert(Coordinate coordinate);

    @Update
    void  update(Coordinate coordinate);
    @Delete
    void delete(Coordinate coordinate);

    @Query("SELECT * FROM coordinate_table")
    List<Coordinate> getAll();



}
