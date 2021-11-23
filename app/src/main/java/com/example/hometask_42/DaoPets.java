package com.example.hometask_42;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DaoPets {

    @Query("SELECT * FROM Pets")
    List<Pets> getAllPets();

    @Query("SELECT * FROM Pets WHERE NAME =:name")
    Pets getbyName(String name);

    @Query("SELECT * FROM Pets WHERE TYPE =:type")
    Pets getbyType(String type);

    @Query("SELECT * FROM Pets WHERE TYPE =:type ORDER BY name")
    List<Pets> getbyTypeList(String type);

    @Insert
    void insert(Pets pets);

    /*@Update
    void update(Pets pets);*/

    @Delete
    void delete(Pets pets);
}
