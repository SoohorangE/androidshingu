package com.cookandroid.dialog1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);

                dlg.setTitle("다이로그창");
                dlg.setMessage("테스트 메세지 입니다");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "확인완료", Toast.LENGTH_LONG).show();
                    }
                });//이벤트처리
                dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "취소를 눌렀습니다", Toast.LENGTH_LONG).show();
                    }
                });//이벤트처리
                dlg.show();
//                Toast.makeText(getApplicationContext(), "눌럿냐", Toast.LENGTH_LONG).show();

            }
        });
    }
}