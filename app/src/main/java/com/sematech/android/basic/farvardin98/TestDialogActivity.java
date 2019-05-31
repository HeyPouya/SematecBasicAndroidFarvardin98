package com.sematech.android.basic.farvardin98;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_dialog);

        Button btnOk = findViewById(R.id.btnOk);
        final EditText edtAge = findViewById(R.id.edtAge);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = edtAge.getText().toString();
                Toast.makeText(TestDialogActivity.this, "You age is " + age, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
