package com.cookandroid.menucontext;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;
    LinearLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        linear = findViewById(R.id.linear);
        
        registerForContextMenu(btn1); //상받음 표시
        registerForContextMenu(btn2);


    } // onCreate

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();

        if(v==btn1){
            inflater.inflate(R.menu.menu1, menu);
        }
        if(v==btn2)
        {
            inflater.inflate(R.menu.menu2, menu);
        }
    } //onCreateContextMenu


    //선택시 동작프로그램
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        super.onContextItemSelected(item);

        if(item.getItemId() == R.id.red)
        {
            linear.setBackgroundColor(Color.RED);
            return true;
        } else if(item.getItemId() == R.id.green) {
            linear.setBackgroundColor(Color.GREEN);
            return true;
        } else if(item.getItemId() == R.id.blue) {
            linear.setBackgroundColor(Color.BLUE);
            return true;
        } else if(item.getItemId() == R.id.rotate) {
            btn1.setRotationX(30);
            return true;
        } else if(item.getItemId() == R.id.size) {
            btn1.setScaleX(2);
            return true;
        }
        return false;
    }
} // class