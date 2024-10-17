package com.example.exo1drinkapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState != null)
            Log.i("result", savedInstanceState.toString());

        setContentView(R.layout.activity_result);
        String pwd = getIntent().getStringExtra("pwd");
        TextView display = (TextView) findViewById(R.id.text_display);
        if (!pwd.equalsIgnoreCase("toto"))
            display.setText(R.string.koConnect);
        else
            display.setText(R.string.okConnect);

    }

    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("Activity_res", 1);
        Log.i("result", "on save instance");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("result", "is stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("result", "is destroyed");

    }
}
