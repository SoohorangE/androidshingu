package com.cookandroid.adapterspinner;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    TextView title;
    ImageView ivposter;

    Integer postid[]={
            R.drawable.mov01,R.drawable.mov02,R.drawable.mov03,R.drawable.mov04,R.drawable.mov05,R.drawable.mov06,R.drawable.mov07,R.drawable.mov08,R.drawable.mov09,R.drawable.mov10,
            R.drawable.mov11,R.drawable.mov12,R.drawable.mov13,R.drawable.mov14,R.drawable.mov15,R.drawable.mov16,R.drawable.mov17,R.drawable.mov18,R.drawable.mov19,R.drawable.mov20,
            R.drawable.mov21,R.drawable.mov22,R.drawable.mov23,R.drawable.mov24};

    String[] posterTitle = { "토이스토리4", "호빗3", "제이슨 본", "반지의 제왕 3",
            "정직한 후보", "나쁜 녀석들", "겨울왕국 ", "알라딘","극한직업", "스파이더맨",
            "레옹", "주먹왕랄프2","타짜","걸캅스","도굴","어벤져스",
            "엑시트","캡틴마블","봉오동전투","분노의 전투",
            "대부","국가대표","토이3","마당에 나온 암닭"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        title = findViewById(R.id.title);
        ivposter = findViewById(R.id.ivposter);

        //다리놓기
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_spinner_dropdown_item,
                posterTitle
        );
        spinner.setAdapter(adapter);

        //스피너를 꽉 눌렀을때
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    title.setText(posterTitle[position]);
                    title.setTextColor(Color.RED);
                    ivposter.setImageResource(postid[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}