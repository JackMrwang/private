package com.example.myapplication.Thirtyquestion;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    private com.example.myapplication.Thirtyquestion.fullScreen fullScreen;
    private MediaController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fullScreen=findViewById(R.id.video);

        controller=new MediaController(this);
        fullScreen.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.w));
        fullScreen.setMediaController(controller);
        controller.setMediaPlayer(fullScreen);
//        fullScreen.requestFocus();
        fullScreen.start();
        fullScreen.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
        {
            @Override
            public void onCompletion(MediaPlayer mp)
            {
                finish();
            }
        });
    }
    
}
