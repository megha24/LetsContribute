package com.example.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.example.model.Person;

import static android.provider.BaseColumns._ID;

/**
 * Created by IntelliJ IDEA.
 * User: meghaagr
 * Date: 6/9/12
 * Time: 5:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 2;
    private static final String TABLE_NAME = "donors";
    private static final String PERSON_NAME_COL = "name";
    private static final String CONTACT_NUMBER_COL = "contactNumber";
    private static final String ADDRESS_COL = "address";
    private static final String BLOOD_GROUP_COL = "bloodGroup";
    private static final String DB_NAME = "bloodGroup";
    private static final String DONOR_TABLE_CREATE =
            "CREATE TABLE " + TABLE_NAME + " (" +_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                    PERSON_NAME_COL + " TEXT NOT NULL, " +
                    BLOOD_GROUP_COL + " TEXT NOT NULL,"+
                    CONTACT_NUMBER_COL + " TEXT NOT NULL,"+
                    ADDRESS_COL+" TEXT NOT NULL);";



    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DATABASE_VERSION);
    }

    public void insert(Person person){
        SQLiteDatabase db = getWritableDatabase();
        SQLiteStatement stmt = db.compileStatement("insert into "+TABLE_NAME+
                " (" + PERSON_NAME_COL +  ","+CONTACT_NUMBER_COL+ ","+ADDRESS_COL+","+ BLOOD_GROUP_COL +") values ( ?,?,?,? );");
        stmt.bindString(1,person.getName());
        stmt.bindString(2,person.getContactNumber());
        stmt.bindString(3, person.getAddress());
        stmt.bindString(4, person.getBloodGroup());
        stmt.executeInsert();
        Cursor cursor = db.query(TABLE_NAME, new String[]{PERSON_NAME_COL}, null, null, null, null, null);
        cursor.moveToFirst();
        System.out.println("*************"+cursor.getString(0));
    }

    public void getDonorInfo(String bloodGroup, String Location){
        SQLiteDatabase db = getReadableDatabase();

//        SQLiteStatement stmt = db.compileStatement("select * from "+TABLE_NAME+ "where" + BLOOD_GROUP_COL + "=" + bloodGroup + ";");
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DONOR_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
