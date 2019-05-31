package com.sematech.android.basic.farvardin98;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestSQLiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_sqlite);

        TestDbHelper helper = new TestDbHelper(TestSQLiteActivity.this, "sematec", null, 1);

        helper.insertData("Tehran", 20);
        helper.insertData("Qom", 30);
        helper.insertData("Yazd", 30);
        helper.insertData("Sari", 15);
        helper.insertData("Kish", 35);


        String cities = helper.getCities();

        Toast.makeText(this, cities, Toast.LENGTH_LONG).show();

    }
}
