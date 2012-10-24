package com.example.db;

import android.content.Context;
import com.example.model.Person;

/**
 * Created by IntelliJ IDEA.
 * User: meghaagr
 * Date: 12/9/12
 * Time: 11:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class DatabaseRepository {
    private DatabaseHelper dbHelper;

    public DatabaseRepository(Context context) {
        dbHelper=new DatabaseHelper(context);
    }
    public void addPerson(Person person){
        dbHelper.insert(person);
    }


}
