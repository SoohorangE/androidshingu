package com.cookandroid.autocomplete2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView singleauto;

    MultiAutoCompleteTextView multiauto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singleauto = findViewById(R.id.autosingle);
        multiauto = findViewById(R.id.multiauto);
        // 문자열배열

        String[] str = new String[]{"shingu-professional", "shingu_student", "shingu-매점",
            "friday", "friend", "alpha", "ufc"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_dropdown_item_1line, str);
        singleauto.setAdapter(adapter);

        MultiAutoCompleteTextView.CommaTokenizer token = new MultiAutoCompleteTextView.CommaTokenizer();
        multiauto.setTokenizer(token);
        multiauto.setAdapter(adapter);
    }
}