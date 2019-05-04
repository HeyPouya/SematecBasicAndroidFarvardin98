package com.sematech.android.basic.farvardin98;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        TextView txtSalute = findViewById(R.id.txtSalute);
        txtSalute.setText("Byeeeeeeee");

        Button btnOk = findViewById(R.id.btnOk);
        btnOk.setText("Nokay");

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "btnOk Clicked!", Toast.LENGTH_LONG).show();
            }
        });


        txtSalute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "txtSalute Clicked!", Toast.LENGTH_SHORT).show();
            }
        });


    }


}
