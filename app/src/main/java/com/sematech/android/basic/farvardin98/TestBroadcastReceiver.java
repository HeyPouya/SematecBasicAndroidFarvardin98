package com.sematech.android.basic.farvardin98;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestBroadcastReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "AirPlane Mode Changed!", Toast.LENGTH_SHORT).show();
    }
}
