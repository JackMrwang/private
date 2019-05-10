package com.example.myapplication.Seventhquestion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.example.myapplication.R;

public class RealizeActivity extends AppCompatActivity {
     private Switch switch1;
     private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realize);
        switch1=findViewById(R.id.switch1);
        textView=findViewById(R.id.textee);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    //Todo
                    textView.setText("开");
                }else {
                    //Todo
                    textView.setText("关");
                }
            }
        });

    }
}
