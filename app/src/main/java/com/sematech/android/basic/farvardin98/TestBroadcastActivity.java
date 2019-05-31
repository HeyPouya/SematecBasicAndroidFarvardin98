package com.sematech.android.basic.farvardin98;

import android.content.IntentFilter;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class TestBroadcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terst_broadcast);


        IntentFilter filter = new IntentFilter();
        filter.addAction("android.intent.action.AIRPLANE_MODE");

        TestBroadcastReceiver receiver = new TestBroadcastReceiver();

        registerReceiver(receiver, filter);


    }
}
