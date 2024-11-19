package com.cookandroid.menu3_dialog2;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edtname, edthp;
//    Button click;
    TextView tvname, tvhp;

    Button click, input;
    View dialog1, toast1; //대화상자뷰

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvname = findViewById(R.id.tvname);
        tvhp = findViewById(R.id.tvhp);

        input = findViewById(R.id.input);

//        click = findViewById(R.id.click);

        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //대화상자뷰
                dialog1 = View.inflate(MainActivity.this, R.layout.dialog1, null);

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("대화상자로 사용자입력창");
                dlg.setView(dialog1);
                dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edtname = dialog1.findViewById(R.id.edtname);
                        edthp = dialog1.findViewById(R.id.edthp);

                        tvname.setText(edtname.getText().toString());
                        tvname.setTextColor(Color.LTGRAY);

                        tvhp.setText(edthp.getText().toString());
                        tvhp.setBackgroundColor(Color.CYAN);
                    }
                });
                dlg.setNegativeButton("cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast toast = new Toast(getApplicationContext());

                        toast1 = View.inflate(MainActivity.this, R.layout.toast1, null);

                        toast.setView(toast1);
                        toast.show();

                    }
                });
                dlg.show();
            }
        });
    }
}