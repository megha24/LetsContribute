package com.example.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

import static android.provider.BaseColumns._ID;

/**
 * Created by IntelliJ IDEA.
 * User: meghaagr
 * Date: 6/9/12
 * Time: 5:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class databaseHelper extends SQLiteOpenHelper {
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
                    BLOOD_GROUP_COL + "TEXT,"+
                    CONTACT_NUMBER_COL + " TEXT,"+
                    ADDRESS_COL+"TEXT);";



    public databaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int DATABASE_VERSION) {
        super(context, DB_NAME, factory, DATABASE_VERSION);
    }

    public void insertData(){
        SQLiteDatabase db = getWritableDatabase();
        SQLiteStatement stmt = db.compileStatement("insert into "+TABLE_NAME+
                " (" + PERSON_NAME_COL +  ","+CONTACT_NUMBER_COL+ ","+ADDRESS_COL+","+ BLOOD_GROUP_COL +") values ( ?,?,?,?,? );");
        stmt.executeInsert();
    }

    //TO DO
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
