package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThankYouActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thankyou_page);
    }

    public void home(View view){
        Intent mainPageActivity = new Intent(this,MainPageActivity.class);
        startActivity(mainPageActivity);
    }
}
