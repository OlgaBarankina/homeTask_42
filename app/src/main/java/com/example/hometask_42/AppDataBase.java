package com.example.hometask_42;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Pets.class}, version = 1)

public abstract class AppDataBase extends RoomDatabase {
    public abstract DaoPets getPetsDao();
    
}
