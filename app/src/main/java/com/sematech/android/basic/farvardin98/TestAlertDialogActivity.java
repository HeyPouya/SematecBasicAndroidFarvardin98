package com.sematech.android.basic.farvardin98;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class TestAlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_alert_dialog);

        Button btnAlert = findViewById(R.id.btnAlertDialog);
        Button btnDialogActivity = findViewById(R.id.btnDialogActivity);


        btnDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestAlertDialogActivity.this, TestDialogActivity.class);
                startActivity(intent);
            }
        });

        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert();
            }
        });
    }


    public void showAlert() {
        AlertDialog dialog = new AlertDialog.Builder(TestAlertDialogActivity.this).create();
        dialog.setTitle("Attention!");
        dialog.setMessage("Are you sure you want to clear all your data?");
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(TestAlertDialogActivity.this, "You cleared all the data", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(TestAlertDialogActivity.this, "You canceled the operation", Toast.LENGTH_SHORT).show();

            }
        });
        dialog.setButton(AlertDialog.BUTTON_NEUTRAL, "don't know", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(TestAlertDialogActivity.this, "You didn't do anything!!!", Toast.LENGTH_SHORT).show();

            }
        });


        dialog.show();
    }
}
