package com.example.fragements;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity implements
        filmsListFragment.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onRssItemSelected(String link) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        filmsListFragment flf = new filmsListFragment();
        ft.add(R.id.list, flf);
        ft.addToBackStack(null);
        ft.commit();

        // Si l'orientation est en paysage
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {

            detailsFragment dF = new detailsFragment();

            ft.add(R.id.viewer, dF);
            ft.addToBackStack(null);
            ft.commit();
        } else {
            Intent intent = new Intent(MainActivity.this, detailsActivity.class);
            intent.putExtra("link", link);
            startActivity(intent);
        }
    }
}
