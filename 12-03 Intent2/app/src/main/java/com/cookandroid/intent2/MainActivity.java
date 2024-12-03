package com.cookandroid.intent2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button call, sns, picture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        call = findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:010-3333-2222");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);

                sns = findViewById(R.id.sns);
                sns.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        intent.putExtra("sms_body", "DDDD");
                        intent.setData(Uri.parse("smsto"+Uri.encode("010-222-2222")));
                        startActivity(intent);
                    }
                });

                picture = findViewById(R.id.picture);
                picture.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                        startActivity(intent);
                    }
                });
            }
        });
    }
}