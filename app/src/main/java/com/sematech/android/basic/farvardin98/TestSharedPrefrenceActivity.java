package com.sematech.android.basic.farvardin98;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Toast;

public class TestSharedPrefrenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shared_prefrence);

        String name = "Pouya";

        PreferenceManager.getDefaultSharedPreferences(TestSharedPrefrenceActivity.this).edit().putString("name", name).apply();


        String userName = PreferenceManager.getDefaultSharedPreferences(TestSharedPrefrenceActivity.this).getString("name", "UNKNOWN USER!!!!");


        Toast.makeText(this, userName, Toast.LENGTH_SHORT).show();
    }
}
