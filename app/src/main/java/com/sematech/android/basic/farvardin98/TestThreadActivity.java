package com.sematech.android.basic.farvardin98;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class TestThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_thread);


        Log.d("THREADNAME", Thread.currentThread().getName());


        new Thread(new Runnable() {
            @Override
            public void run() {

                Log.d("THREADNAME", Thread.currentThread().getName());

            }
        }).start();

    }
}
