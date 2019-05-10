package com.example.myapplication.Catch;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.myapplication.R;
import com.example.myapplication.Thirtyquestion.MainActivity;
import com.example.myapplication.Thirtytwiquestion.Main4Activity;

import java.util.ArrayList;
import java.util.List;

public class CatchresultActivity extends AppCompatActivity {
    List<Drawable> drawableList = new ArrayList<Drawable>();//存放图片
    List<Drawable> drawableList1=new ArrayList<Drawable>();
    TextView arrowLeftTextView;//左箭头
    TextView arrowRightTextView;//右箭头
    private ImageSwitcher imageSwitcher1;
    private ImageSwitcher imageSwitcher2;
    private TextView textView1;
    private TextView textView2;
    private int index=0;//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catchresult);
        drawableList.add(getResources().getDrawable(R.drawable.tt));//图片01
        drawableList.add(getResources().getDrawable(R.drawable.ww));//图片02
        drawableList1.add(getResources().getDrawable(R.drawable.cc));//图片03
        drawableList1.add(getResources().getDrawable(R.drawable.xx));//图片04
        imageSwitcher1=findViewById(R.id.imageSwitcher_is);
        imageSwitcher2=findViewById(R.id.imageSwitcher_is2);
        arrowLeftTextView = findViewById(R.id.arrow_left_iv);
        arrowRightTextView = findViewById(R.id.arrow_right_iv);
        textView1=findViewById(R.id.text1);
        textView2=findViewById(R.id.textqq);

        imageSwitcher1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CatchresultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        imageSwitcher2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CatchresultActivity.this, Main4Activity.class);
                startActivity(intent);
            }
        });

        imageSwitcher1.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                return new ImageView(CatchresultActivity.this);
            }
        });
        imageSwitcher2.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                return new ImageView(CatchresultActivity.this);
            }
        });

        imageSwitcher1.setImageDrawable(drawableList.get(index++));//初始化显示第一张图片
        imageSwitcher2.setImageDrawable(drawableList1.get(index++));
        arrowLeftTextView.setOnClickListener(new View.OnClickListener(){//左箭头单击事件
            @Override
            public void onClick(View view)
            {
                textView1.setText("金融路");
                textView2.setText("闯红灯，如下图所示:");
//                imageSwitcher1.setImageDrawable(drawableList.get(index--));
//                imageSwitcher2.setImageDrawable(drawableList.get(index--));
//                if(index<0)//如果到达了图片的开始，则直接显示最后一张图片
//                {
//                    index = drawableList.size()-1;
//                    index = drawableList1.size()-1;
//                }
            }
        });

        arrowRightTextView.setOnClickListener(new View.OnClickListener(){//右箭头单击事件
            @Override
            public void onClick(View view)
            {
                textView1.setText("燕尾路");
                textView2.setText("追尾，如下图所示:");
//                imageSwitcher1.setImageDrawable(drawableList.get(index++));
//                imageSwitcher2.setImageDrawable(drawableList.get(index++));
//                if(index>=drawableList.size()&&index>=drawableList1.size())//如果点击到达图片的末尾，则回到第一张图片
//                {
//                    index = 0;
//                }
            }
        });
    }
}
