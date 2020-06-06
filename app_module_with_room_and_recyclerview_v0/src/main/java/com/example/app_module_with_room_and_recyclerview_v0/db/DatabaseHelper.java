package com.example.app_module_with_room_and_recyclerview_v0.db;


import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.example.app_module_with_room_and_recyclerview_v0.db.model.DataModel;

@Database(entities = { DataModel.class }, version = 2, exportSchema = false)
public abstract class DatabaseHelper extends RoomDatabase {

    public abstract DataDao getDataDao();

    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }
}