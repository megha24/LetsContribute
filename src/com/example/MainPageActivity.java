package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by IntelliJ IDEA.
 * User: meghaagr
 * Date: 24/10/12
 * Time: 8:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainPageActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.main_page);
        
    }
    public void register(View v){
        Intent newActivity = new Intent(this,ContactDetailActivity.class);
        startActivity(newActivity);
    }
}
