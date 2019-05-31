package com.sematech.android.basic.farvardin98;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class TestHandlerActivity extends AppCompatActivity {

    Boolean hasUserClickedOnBackBtn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_handler);
    }


    @Override
    public void onBackPressed() {
        if (hasUserClickedOnBackBtn)
            super.onBackPressed();
        else {

            Toast.makeText(this, "Please click on back again", Toast.LENGTH_SHORT).show();

            hasUserClickedOnBackBtn = true;

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    hasUserClickedOnBackBtn = false;
                }
            }, 2000);
        }
    }
}
