package com.sematech.android.basic.farvardin98;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TestHTMLActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_html);

        TextView txtHtml = findViewById(R.id.txtHtml);

        String html = "<h2>Title</h2><br><p>Description here</p>";


        txtHtml.setText(Html.fromHtml(html));
    }
}
