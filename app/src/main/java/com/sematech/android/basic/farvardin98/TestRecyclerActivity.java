package com.sematech.android.basic.farvardin98;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TestRecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler);


        ArrayList<String> list = new ArrayList<>();
        list.add("Pouya Heydari");
        list.add("Majid Bagheri");
        list.add("Zakaria Tajik");
        list.add("Mohammad Jafari");
        list.add("Farshad Danaee");
        list.add("Mohammadreza Farahani");
        list.add("Mohammadreza Monsef");
        list.add("Mehrshad Mollaafzal");
        list.add("Reza Sadeghi");
        list.add("Mohsen KarimNezhad");
        list.add("Mohsen KarimNezhad");
        list.add("Mohsen KarimNezhad");
        list.add("Mohsen KarimNezhad");
        list.add("Mohsen KarimNezhad");
        list.add("Mohsen KarimNezhad");
        list.add("Mohsen KarimNezhad");
        list.add("Mohsen KarimNezhad");
        list.add("Mohsen KarimNezhad");


        RecyclerView recycler = findViewById(R.id.recycler);

        TestAdapter adapter = new TestAdapter(list);


        recycler.setAdapter(adapter);

        recycler.setLayoutManager(new LinearLayoutManager(TestRecyclerActivity.this, RecyclerView.VERTICAL, false));


    }
}
