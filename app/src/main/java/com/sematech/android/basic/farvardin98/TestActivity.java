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

public class TestActivity extends AppCompatActivity {

     EditText edtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        edtName = findViewById(R.id.edtName);
        Button btnShowMainActivity = findViewById(R.id.btnShowMainActivity);

        btnShowMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String result = edtName.getText().toString();
                Intent intent = new Intent(TestActivity.this, ThirdActivity.class);
                intent.putExtra("name", result);
                startActivityForResult(intent, 329);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 329) {
            if (resultCode == Activity.RESULT_OK) {
                String fullName = data.getStringExtra("fullName");
                Toast.makeText(TestActivity.this, fullName, Toast.LENGTH_SHORT).show();
                edtName.setText("");
            }
        }
    }

}
