package com.example.contactssql_listview;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class add extends AppCompatActivity {
    SQLiteDatabase Contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Contacts = MainActivity.Contacts;

        EditText numero = (EditText) findViewById(R.id.Tel);
        TextView nom = (TextView) findViewById(R.id.text_nom);
        TextView prenom = (TextView) findViewById(R.id.text_prenom);

        Button add = (Button) findViewById(R.id.ajouter);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //Code permettant de rejouter une personne dans la base
                    //et d'afficher un toast indiquant que le travail à bien été fait
                    Contacts.execSQL("INSERT INTO contacts VALUES ('" + numero.getText() + "', '" + nom.getText().toString() + "', '" + prenom.getText().toString() + "')");

                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(),
                            "le Contact n'a pas pu être inséré",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
