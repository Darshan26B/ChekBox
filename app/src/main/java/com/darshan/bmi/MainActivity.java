package com.darshan.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    CheckBox C, lan, java, lan2, php;
    Button btn;
    TextView Result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Binding();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "";
                if (C.isChecked()) {
                    s += "c, \t";
                }
                if (lan.isChecked()) {
                    s += "c++, ";
                }
                if (java.isChecked()) {
                    s += "java,";
                }
                if (lan2.isChecked()) {
                    s += "c#,";
                }
                if (php.isChecked()) {
                    s += "php,";
                }
                Result.setText("Language ="+s);
            }
        });

    }

    private void Binding() {
        C = findViewById(R.id.C);
        lan = findViewById(R.id.lan);
         java = findViewById(R.id.Java);
         lan2 = findViewById(R.id.lan2);
         php = findViewById(R.id.PHP);
         btn = findViewById(R.id.btn);
        Result = findViewById(R.id.result);
    }
}