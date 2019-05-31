package com.sematech.android.basic.farvardin98;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class TestWebViewActivity extends AppCompatActivity {

    AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_web_view);

        WebView web = findViewById(R.id.web);

        dialog = new AlertDialog.Builder(this).create();

        dialog.setTitle("Loading...");
        dialog.setMessage("Please wait");


        web.setWebViewClient(new MyCustomWebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("https://heydarii.ir");
    }


    class MyCustomWebViewClient extends WebViewClient {


        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            dialog.show();
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);

            dialog.dismiss();
        }
    }
}
