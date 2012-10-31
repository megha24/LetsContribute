package com.example.db;

import android.content.Context;
import com.example.model.Person;


public class DatabaseRepository {
    private DatabaseHelper dbHelper;

    public DatabaseRepository(Context context) {
        dbHelper=new DatabaseHelper(context);
    }
    public void addPerson(Person person){
        dbHelper.insert(person);
    }


}
