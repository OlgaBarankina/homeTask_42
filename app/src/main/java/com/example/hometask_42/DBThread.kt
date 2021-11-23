package com.example.hometask_42

import android.text.TextUtils.indexOf
import android.text.TextUtils.lastIndexOf
import android.util.Log

class DBThread(name: String): Runnable { //работа с базой данных в отдельном потоке

    init {
        Thread(this).start() //конструктор
     }

    override fun run() {
          var db = App.instance.database
          var petsDao = db.petsDao

        //insert

        /*var pet = Pets("Meggy", "Dog", 75, 3.0)
        petsDao.insert(pet)

        var pet1 = Pets("Emma", "Cat", 45, 2.0)
        petsDao.insert(pet1)

        var pet3 = Pets("Eddy", "Rabbit", 35, 1.3)
        petsDao.insert(pet3)

        var pet4 = Pets("Robert", "Dog", 45, 2.0)
        petsDao.insert(pet4)

        var pet5 = Pets("Missy", "Mouse", 15, 0.2)
        petsDao.insert(pet5)

        var pet6 = Pets("Alisa", "Cat", 28, 2.3)
        petsDao.insert(pet6)

        var pet7 = Pets("Mini", "Rabbit", 28, 1.7)
        petsDao.insert(pet7)

        var pet8 = Pets("John", "Snake", 110, 2.0)
        petsDao.insert(pet8)

        var pet9 = Pets("Kate", "turtle", 8, 0.1)
        petsDao.insert(pet9)

        var pet10 = Pets("Ken", "turtle", 12, 0.6)
        petsDao.insert(pet10)*/

        //delete

        /*var pet11 = Pets("Ken", "turtle", 12, 0.6)
        petsDao.delete(pet11)*/


        var spesificPetName = petsDao.getbyName("Meggy").name
        var spesificPetType = petsDao.getbyName("Meggy").type
        var spesificPetGrowth = petsDao.getbyName("Meggy").growth
        var spesificPetWeight = petsDao.getbyName("Meggy").weight
        Log.d("MyLog42",
            "Find by name: $spesificPetName $spesificPetType with growth of $spesificPetGrowth sm and weight of $spesificPetWeight kg"
        );

        //check how many we have under pets = Cat
        //var getbyTypeListCount = petsDao.getbyTypeList("Cat").size
        //Log.d("MyLog42", getbyTypeListCount.toString());

        var getbyTypeList = petsDao.getbyTypeList("Cat")
        Log.d("MyLog42", "Cat: " + getbyTypeList[0].name);
        Log.d("MyLog42", "Cat: " + getbyTypeList[1].name);


       //var pets = petsDao.allPets
       /*Log.d("MyLog42", pets[0].name);
       Log.d("MyLog42", pets[0].type);
       Log.d("MyLog42", pets[0].growth.toString());
       Log.d("MyLog42", pets[0].weight.toString());
       Log.d("Mylog42", pets[1].name);*/

   }



}