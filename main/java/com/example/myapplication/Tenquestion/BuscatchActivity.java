package com.example.myapplication.Tenquestion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myapplication.R;

public class BuscatchActivity extends AppCompatActivity {
    private ImageView imageView1;
    private ImageView imageView2;
    private LinearLayout linearLayout1;
    private LinearLayout linearLayout2;
    private LinearLayout linearLayout3;
    private LinearLayout linearLayout4;
    private TextView textView;
    private int m = 0, m1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscatch);
        imageView1 = findViewById(R.id.iv1);
        imageView2 = findViewById(R.id.iv2);
        linearLayout1 = findViewById(R.id.layout1);
        linearLayout2 = findViewById(R.id.layout2);
        linearLayout3=findViewById(R.id.layout3);
        linearLayout4=findViewById(R.id.layout4);
        textView=findViewById(R.id.busdata);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BuscatchActivity.this,statisticalActivity.class);
                startActivity(intent);
            }
        });
    }

    public void image1(View view) {
        if (m == 0) {
            linearLayout1.setVisibility(View.VISIBLE);
            linearLayout3.setVisibility(View.VISIBLE);
            imageView1.setRotation(90);//旋转
            m = 1;
        } else {
            linearLayout1.setVisibility(View.GONE);
            linearLayout3.setVisibility(View.GONE);
            imageView1.setRotation(0);
            m = 0;
        }


    }

    public void image2(View view) {
        if (m1 == 0) {
            linearLayout2.setVisibility(View.VISIBLE);
            linearLayout4.setVisibility(View.VISIBLE);
            imageView2.setRotation(90);
            m1 = 1;
        } else {
            linearLayout2.setVisibility(View.GONE);
            linearLayout4.setVisibility(View.GONE);
            imageView2.setRotation(0);
            m1 = 0;
        }

    }
}
