package com.example.testfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Boolean etat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment ff = new FirstFragment();
        SecondFragment sf = new SecondFragment();

        FragmentManager fm  = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.container, ff);
        etat = false;
        ft.addToBackStack(null);

        ft.commit();

        Button bt = (Button) findViewById(R.id.fragButton);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction ft2 = fm.beginTransaction();
                if(etat) {
                    ft2.replace(R.id.container, ff);
                    etat = false;
                }else{
                    ft2.replace(R.id.container, sf);
                    etat = true;
                }
                ft2.addToBackStack(null);
                ft2.commit();
            }
        });

;    }
}