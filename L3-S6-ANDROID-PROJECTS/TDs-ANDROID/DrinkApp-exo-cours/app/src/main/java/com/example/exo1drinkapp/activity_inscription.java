package com.example.exo1drinkapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_inscription extends AppCompatActivity {
    Button buttonSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(savedInstanceState != null)
            Log.i("inscription", savedInstanceState.toString());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        buttonSubmit = (Button) findViewById(R.id.button_submit);
        buttonSubmit.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), result.class);
                TextView pwd = (TextView) findViewById(R.id.text_pwd);
                intent.putExtra("pwd", pwd.getText().toString());
                startActivity(intent);
            }
        });

    }

    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("Activity_Ins", 1);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("inscription", "Destroyed");
    }
}
