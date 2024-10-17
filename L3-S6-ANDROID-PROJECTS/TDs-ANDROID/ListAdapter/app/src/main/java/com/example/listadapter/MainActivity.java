package com.example.listadapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
    MyArrayAdapter adapter;
    String[] values = {
                        "Rambo I", "Rambo II", "Rambo III", "Rambo V",
                        "Die Hard I", "Die Hard 2", "Die Hard 3",
                        "Die Hard 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. creation de l'adaptateur
        adapter = new MyArrayAdapter(getApplicationContext(), values);

        //2. recuperer une ref sur une listeView
        ListView l = (ListView) findViewById(R.id.listview);

        //3. Association de la listeview avec l'adaptateur
        l.setAdapter(adapter);

        //4. Optionnel : Creation du listner sur un long lick
    }
}
