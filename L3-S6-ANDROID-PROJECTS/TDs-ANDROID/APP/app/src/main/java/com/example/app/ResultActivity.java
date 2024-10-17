package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        String pwd = getIntent().getStringExtra("pwd");
        TextView display = (TextView)  findViewById(R.id.textView2);
        if(pwd.equals("admin")){
            display.setText("allowed");
        }else display.setText("not allowed");
    }
}