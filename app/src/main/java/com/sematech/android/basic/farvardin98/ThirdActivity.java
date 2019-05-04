package com.sematech.android.basic.farvardin98;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        final EditText edtFamily = findViewById(R.id.edtFamily);
        Button btnOk = findViewById(R.id.btnOk);


        Intent intent = getIntent();
        final String userName = intent.getStringExtra("name");

        Toast.makeText(ThirdActivity.this, userName, Toast.LENGTH_SHORT).show();


        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String family = edtFamily.getText().toString();
                String fullName = userName + " " + family;

                Intent i = new Intent();
                i.putExtra("fullName", fullName);
                setResult(Activity.RESULT_OK, i);
                finish();

            }
        });

    }

}
