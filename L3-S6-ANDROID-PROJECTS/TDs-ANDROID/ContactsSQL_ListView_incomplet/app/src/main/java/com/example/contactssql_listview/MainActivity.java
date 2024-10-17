package com.example.contactssql_listview;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static SQLiteDatabase Contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Contacts =this.openOrCreateDatabase("Contacts",MODE_PRIVATE,null);

        // Faire la requette de creation de la table qui  contient :
        // un numéro de tel, un nom et un prénom
        Contacts.execSQL("CREATE TABLE IF NOT EXISTS contacts(  numero INT PRIMARY KEY," +
                                                                "nom TEXT NOT NULL," +
                                                                "prenom TEXT NOT NULL)");

        Button add = (Button) findViewById(R.id.ADD);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, add.class);
                startActivity(intent);
            }
        });

        Button search = (Button) findViewById(R.id.Search);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, search.class);
                startActivity(intent);
            }
        });

        //Compléter le code ici pour répondere aux éveènements sur les bonton
        // d'ajout de recherche

    }

}
