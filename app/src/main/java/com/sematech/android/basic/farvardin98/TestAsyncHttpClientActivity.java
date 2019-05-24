package com.sematech.android.basic.farvardin98;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.sematech.android.basic.farvardin98.praymodel.PrayTimesClass;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class TestAsyncHttpClientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_async_http_client);


        AsyncHttpClient client = new AsyncHttpClient();

        //Tehran

        String userInput = "Tehran";

        String url = "https://api.aladhan.com/v1/timingsByCity?city=" + userInput + "&country=Iran&method=8";
        client.get(url, new JsonHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);

                Gson gson = new Gson();
                PrayTimesClass ptc = gson.fromJson(response.toString(), PrayTimesClass.class);
                String maqrib = ptc.getData().getTimings().getMaghrib();

                Toast.makeText(TestAsyncHttpClientActivity.this, maqrib, Toast.LENGTH_SHORT).show();

            }


            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);

            }
        });
    }
}
