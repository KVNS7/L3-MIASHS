package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button br = (Button) findViewById(R.id.button_register);
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Register Button", "Vous avez cliqué sur le bouton");

                Intent intent_login = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent_login);
            }
        });
    }
}