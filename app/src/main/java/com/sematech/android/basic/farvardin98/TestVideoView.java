package com.sematech.android.basic.farvardin98;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TestVideoView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_video_view);

        VideoView vv = findViewById(R.id.vv);

        vv.setMediaController(new MediaController(TestVideoView.this));

        vv.setVideoURI(Uri.parse("https://hw13.cdn.asset.aparat.com/aparat-video/72e099ab3552153508a04efb4bef89d714853513-144p__36499.mp4"));


        vv.start();
    }
}
