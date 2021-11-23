package com.example.hometask_42;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.annotation.NonNull;

@Entity
public class Pets {

    @PrimaryKey
    @NonNull
   public String name ;
   public String type;
   public int growth;
   public double weight;

    public Pets(String name, String type, int growth, double weight) {
        this.name = name;
        this.type = type;
        this.growth = growth;
        this.weight = weight;
    }

}
