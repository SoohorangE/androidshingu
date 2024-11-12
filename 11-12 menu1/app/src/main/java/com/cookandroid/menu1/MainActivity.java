package com.cookandroid.menu1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout linear;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear = findViewById(R.id.linear);
        button = findViewById(R.id.button);

    } //onCreate method
    // 추가메소드 옵션 메뉴 나타내기

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu); //아버지 생성자를 불러서 아버지에 있는 생선자메소드 이를 처리함

        MenuInflater minflater = getMenuInflater();
        minflater.inflate(R.menu.menu1, menu);
        return true;
    }

    // 추가메소드 옵션기능 실행할 소스
} // close