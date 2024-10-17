package com.example.listadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyArrayAdapter extends ArrayAdapter<Object> {

    String[] data;

    public MyArrayAdapter(Context context, String[] data){super(context, -1, data);}


    @Override
    @NonNull
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) getContext().
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View cell = inflater.inflate(R.layout.cell_layout, parent, false);
        TextView film = (TextView) cell.findViewById(R.id.textView);
        ImageView image = (ImageView) cell.findViewById(R.id.imageView);
        film.setText(data[position]);
        image.setImageResource(R.drawable.ball);
        return cell;
    }
}
