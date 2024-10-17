package com.example.exo1drinkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btGotoInscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(savedInstanceState != null)
            Log.i("Main", savedInstanceState.toString());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mxain);

        btGotoInscription = (Button) findViewById(R.id.button_register);
        btGotoInscription.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_inscription.class);
                startActivity(intent);
            }
        });
    }


    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("NB_CLICK", 1);
    }
}
