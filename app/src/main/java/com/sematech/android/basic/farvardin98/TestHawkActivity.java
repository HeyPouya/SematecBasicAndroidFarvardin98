package com.sematech.android.basic.farvardin98;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.orhanobut.hawk.Hawk;

public class TestHawkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_hawk);


        Hawk.init(TestHawkActivity.this).build();

        Hawk.put("name","Pouya");
    }
}
