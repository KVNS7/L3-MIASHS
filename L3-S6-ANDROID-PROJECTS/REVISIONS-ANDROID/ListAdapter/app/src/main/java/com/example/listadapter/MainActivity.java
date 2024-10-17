package com.example.listadapter;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    ArrayAdapter<String> adapter;
    String[] values = {
                        "Rambo I", "Rambo II", "Rambo III", "Rambo V",
                        "Die Hard I", "Die Hard 2", "Die Hard 3",
                        "Die Hard 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new ArrayAdapter<String>(this,
                                            android.R.layout.simple_list_item_1,
                                            values);
        ListView l = (ListView) findViewById(R.id.listView);
        l.setAdapter(adapter);

    }
    
}
