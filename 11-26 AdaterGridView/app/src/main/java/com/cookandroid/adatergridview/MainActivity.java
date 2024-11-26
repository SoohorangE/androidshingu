package com.cookandroid.adatergridview;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


// 이문제 기말 시험 나옴 거의 백퍼 getitem postid.length 중요
public class MainActivity extends AppCompatActivity {
    GridView grid;
    View dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = findViewById(R.id.grid);
        // 격자그리드뷰 사진 놓을 방식
        // 아기ㅡ클래스 객체 생성
        GridAdapter adapter = new GridAdapter(MainActivity.this);
        grid.setAdapter(adapter);

    }
    class GridAdapter extends BaseAdapter
    {
        //맴버 변수
        Context context;
        Integer postid[]={
                R.drawable.mov01,R.drawable.mov02,R.drawable.mov03,R.drawable.mov04,R.drawable.mov05,R.drawable.mov06,R.drawable.mov07,R.drawable.mov08,R.drawable.mov09,R.drawable.mov10,
                R.drawable.mov11,R.drawable.mov12,R.drawable.mov13,R.drawable.mov14,R.drawable.mov15,R.drawable.mov16,R.drawable.mov17,R.drawable.mov18,R.drawable.mov19,R.drawable.mov20,
                R.drawable.mov21,R.drawable.mov22,R.drawable.mov23,R.drawable.mov24};

        // 생성자
        public GridAdapter(Context context)
        {
            this.context = context;
        }

        //멤버 메소드

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView img = new ImageView(context);
            img.setLayoutParams(new ViewGroup.LayoutParams(150, 200));
            img.setPadding(5,5,5,5);
            img.setImageResource(postid[position]);
            final int index = position;
            //이벤트처리
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog = View.inflate(MainActivity.this, R.layout.dialog, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                    // 레이아웃이 다르면 앞에 레이아웃.findViewById()
                    ImageView ivPoster = dialog.findViewById(R.id.ivPoster);
                    dlg.setView(dialog);
                    dlg.setTitle("big image");
                    dlg.setIcon(R.drawable.movie_icon);

                    ivPoster.setImageResource(postid[position]);
                    dlg.setPositiveButton("closed", null);
                    // 이것도 까먹는다고 시험낼 확률 높음
                    dlg.show();
                }
            });

            return img;
        }
        @Override
        public int getCount() {
            return postid.length;
        }

        @Override
        public Object getItem(int position) { return null; }
        @Override
        public long getItemId(int position) { return 0; }
    } //내부 클래스
}// 부모 클래스