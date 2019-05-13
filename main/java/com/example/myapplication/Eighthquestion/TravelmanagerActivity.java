package com.example.myapplication.Eighthquestion;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.myapplication.R;

import java.util.Timer;
import java.util.TimerTask;

public class TravelmanagerActivity extends AppCompatActivity {
    private LinearLayout linearlayout;

    private ImageView main_imageview;

    private int i = 0;

    Timer timer = new Timer();

    private Handler handler = new Handler()
    {
        @Override
        public void handleMessage(Message msg)
        {
            Log.e("@@@", i + "");
            //index=msg.what;
            if (i > 3)
            {
                i = 0;
            }
            else
            {
                switch (i)
                {
                    case 1:
                        main_imageview.setImageResource(R.drawable.bb);
                        break;
                    case 2:
                        main_imageview.setImageResource(R.drawable.cc);
                        break;
                    case 3:
                        main_imageview.setImageResource(R.drawable.ff);
                        break;
                    default:
                        break;
                }
                linearlayout.invalidate();
            }
            super.handleMessage(msg);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travelmanager);
        initView();
    }

    private void initView() {
        linearlayout = (LinearLayout) findViewById(R.id.layout9);
        main_imageview = (ImageView) findViewById(R.id.image9);

        timer.scheduleAtFixedRate(new TimerTask()
        {
            @Override
            public void run()
            {
                // TODO Auto-generated method stub
                i++;
                Message mesasge = new Message();
                mesasge.what = i;
                handler.sendMessage(mesasge);
            }
        }, 0, 500);
    }
}
