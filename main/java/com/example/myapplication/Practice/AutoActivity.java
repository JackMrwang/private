package com.example.myapplication.Practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.myapplication.R;

public class AutoActivity extends AppCompatActivity {
    private ImageView img1;
    private ImageView img2;
      int[] imageTds=new int[]{
        R.drawable.bb,R.drawable.cc,R.drawable.ff
      };
      private AdapterViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        flipper=(AdapterViewFlipper) findViewById(R.id.flipper);
        BaseAdapter adapter=new BaseAdapter() {
            @Override
            public int getCount() {
                return imageTds.length;
            }

            @Override
            public Object getItem(int position) {
                return position;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View view, ViewGroup viewGroup) {
                    ImageView imageView=new ImageView(AutoActivity.this);
                    ImageView imageView1=new ImageView(AutoActivity.this);
                     imageView1.setImageResource(imageTds[position+1]);
                     imageView1.setScaleType(ImageView.ScaleType.FIT_XY);



                    imageView.setImageResource(imageTds[position]);

                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

                return imageView;
            }
        };
        flipper.setAdapter(adapter);
    }

    public void prev(View view) {
        flipper.showPrevious();
        flipper.stopFlipping();
    }

    public void next(View view) {
        flipper.showNext();
        flipper.stopFlipping();
    }

    public void auto(View view) {
        flipper.startFlipping();
    }
}
