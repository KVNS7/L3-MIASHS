package com.example.fragements;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class detailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            String url = getIntent().getStringExtra("link");

            detailsFragment dF = detailsFragment.newInstance(url);


            // TODO: Extraire les extras de l'intention et les passer à detailsFragment
            // TODO: Ajouter detailsFragment à l'activité en utilisant une transaction de fragment
        }
    }
}
