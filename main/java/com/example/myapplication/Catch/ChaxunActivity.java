package com.example.myapplication.Catch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

public class ChaxunActivity extends AppCompatActivity {
   private Button button;
   private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaxun);
        button=findViewById(R.id.buttonall);
        editText=findViewById(R.id.edit_padd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m=editText.getText().toString();
                if (m.equals("B10001")){
                    Intent intent=new Intent(ChaxunActivity.this, CatchresultActivity.class);
                    startActivity(intent);
                }else if(m.equals("B10002")){
                    Intent intent=new Intent(ChaxunActivity.this, CatchresultActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(ChaxunActivity.this,"没有查询到"+m+"数据",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
