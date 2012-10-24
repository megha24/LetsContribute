package com.example.stub;

import android.content.Context;
import com.example.db.DatabaseRepository;
import com.example.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: meghaagr
 * Date: 20/10/12
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class DatabaseRepositoryStub extends DatabaseRepository{
   private List<Person> personList = new ArrayList<Person>();
    public DatabaseRepositoryStub(Context context) {
        super(context);
    }

    @Override
    public void addPerson(Person person) {
        System.out.println("person added !!!!");
    personList.add(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
