package com.example.myapplication.Eighthquestion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.myapplication.R;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ImageView spaceshipImage = (ImageView) findViewById(R.id.imageqq);
        spaceshipImage.setBackgroundResource(R.drawable.animation);
//        Animation animation= AnimationUtils.loadAnimation(this,R.anim.hyperspace_jump);
//        spaceshipImage.startAnimation(animation);
    }
}
