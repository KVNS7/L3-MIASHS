package com.example.listadapter;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

public class myListListner implements AdapterView.OnItemLongClickListener{

    public myListListner(){

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent,
                                   View view, int position, long id) {
        Log.v("MainActivity Appui long", parent.getItemAtPosition(position).toString());
       // Log.v("MainActivity Appui long", values[position]);
        //Log.e("MainActivity Appui long", "Values.....");
        return true;
    }
}

