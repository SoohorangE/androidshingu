package com.cookandroid.intentdata;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Second extends AppCompatActivity {
    Button btnsecond;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnsecond = findViewById(R.id.btnsecond);
        text = findViewById(R.id.text);

//       시험 받아올놈 잇으면 getIntent() 로 받아옴
        Intent secondIntent = getIntent();

        String readname = secondIntent.getStringExtra("name");
        int year = secondIntent.getIntExtra("birth", 0);

        year=2024-year+1;

        text.setText("name: "+readname+"year:"+year);
        
//        작동안됨 버그
    }
}