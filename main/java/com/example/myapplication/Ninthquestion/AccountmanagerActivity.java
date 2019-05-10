package com.example.myapplication.Ninthquestion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class AccountmanagerActivity extends AppCompatActivity {
    private ListView lv;
    private CarpAdapter carpAdapter;
    private List<Carp> carps = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountmanager);
        lv = findViewById(R.id.lv);
        carps.add(new Carp(1, R.drawable.ll, "辽A:10001", "谭大波", 0));
        carps.add(new Carp(2, R.drawable.ff, "辽A：88888", "神盾局", 10));
        carps.add(new Carp(3, R.drawable.bb, "津A：66666", "储备金", 50));
        carps.add(new Carp(4, R.drawable.kk, "北翼：cdcsc", "烧赤壁", 49));
        carpAdapter = new CarpAdapter(AccountmanagerActivity.this, R.layout.account_item, carps);
        lv.setAdapter(carpAdapter);
    }
}
