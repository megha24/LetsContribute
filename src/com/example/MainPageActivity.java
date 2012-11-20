package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainPageActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.main_page);
        
    }
    public void register(View v){
        Intent newActivity = new Intent(this,ContactDetailActivity.class);
        newActivity.putExtra(DonateBloodConstants.REQUEST_TYPE,DonateBloodConstants.REGISTER);
        startActivity(newActivity);
    }

    public void find(View v){
        Intent newActivity = new Intent(this,ContactDetailActivity.class);
        newActivity.putExtra(DonateBloodConstants.REQUEST_TYPE,DonateBloodConstants.FIND_DONOR);
        startActivity(newActivity);
    }
}
