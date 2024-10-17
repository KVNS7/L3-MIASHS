package com.example.partielkevinsoaresnotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static SQLiteDatabase Notes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Notes = this.openOrCreateDatabase("Notes", MODE_PRIVATE,null);

        Notes.execSQL("CREATE TABLE IF NOT EXISTS notes(  id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "titre TEXT NOT NULL," +
                "contenu TEXT," +
                "creation DATETIME DEFAULT CURRENT_TIMESTAMP)");


        /*
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        NotesListFragment nlf = new NotesListFragment();
        ft.add(R.id.list, nlf);
        ft.addToBackStack(null);
        ft.commit();
        */
    }

    public void ajouter(View v){
        Intent intent = new Intent(this, AjouterModifierNote.class);
        startActivity(intent);
    }

    public void modifier(View v, int idNote){
        Intent intent = new Intent(this, AjouterModifierNote.class);
        intent.putExtra("idNote", idNote);
        startActivity(intent);
    }
}