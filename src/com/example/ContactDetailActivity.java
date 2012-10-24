package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.example.db.DatabaseRepository;
import com.example.model.Person;

public class ContactDetailActivity extends Activity
{
    private DatabaseRepository dbRepository;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        dbRepository = new DatabaseRepository(this);
    }
    public void setDbRepository(DatabaseRepository dbRepository){
        this.dbRepository = dbRepository;
    }
    
    public void submit(View view){
        System.out.println("*****************************************************");
        String personName =  ((EditText)findViewById(R.id.personName)).getText().toString();
        String contactNumber =  ((EditText)findViewById(R.id.contactNumber)).getText().toString();
        String address =  ((EditText)findViewById(R.id.address)).getText().toString();
        String bloodGroup =  ((EditText)findViewById(R.id.bloodGroup)).getText().toString();
        System.out.println("Submitting to the repository");
        dbRepository.addPerson(new Person(personName,contactNumber,address,bloodGroup));
    }
}
