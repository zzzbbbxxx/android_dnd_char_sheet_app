package com.example.app_module_with_room_and_recyclerview_v0.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.app_module_with_room_and_recyclerview_v0.db.model.DataModel;

import java.util.List;

@Dao
public interface DataDao {
    @Insert
    void insert(DataModel dataModel);

    @Delete
    void delete(DataModel dataModel);

    @Query("SELECT * FROM DataModel")
    List<DataModel> getAllData();

    //пример запроса с выборкой
    @Query("SELECT * FROM DataModel WHERE character_name LIKE :char_name")
    List<DataModel> getByCharName(String char_name);
}