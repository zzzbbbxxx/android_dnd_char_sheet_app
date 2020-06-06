package com.example.app_module_with_room_and_recyclerview_v0;

import android.app.Application;

import androidx.room.Room;

import com.example.app_module_with_room_and_recyclerview_v0.db.DatabaseHelper;

public class App extends Application {

    private static App instance;
    private DatabaseHelper db;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        db = Room.databaseBuilder(getApplicationContext(), DatabaseHelper.class, "data-database")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
    }

    public DatabaseHelper getDatabaseInstance() {
        return db;
    }
}