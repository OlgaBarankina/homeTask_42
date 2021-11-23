package com.example.hometask_42;

import android.app.Application;

import androidx.room.Room;

public class App extends Application {  // в манифесте добавили android:name=".App"
    public static App instance;
    private AppDataBase database;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
        database = Room.databaseBuilder(this, AppDataBase.class, "database").build();     //"database" это просто название
    }

    public static App getInstance() {
        return instance;

    }

    public AppDataBase getDatabase() {
        return database;
    }


}
