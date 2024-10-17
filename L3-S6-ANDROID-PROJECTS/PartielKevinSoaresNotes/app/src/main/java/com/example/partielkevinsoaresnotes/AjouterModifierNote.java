package com.example.partielkevinsoaresnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AjouterModifierNote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_modifier_note);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("noteId")) {
            int noteId = intent.getIntExtra("noteId", -1);
            if (noteId != -1) {

                Cursor cursor = MainActivity.Notes.rawQuery("SELECT titre FROM notes WHERE id = " + noteId, null);
                if (cursor.moveToFirst()) {
                    String titre = cursor.getString(cursor.getColumnIndex("titre"));

                    EditText titreET = (EditText) findViewById(R.id.titre);
                    titreET.setText(titre);
                }
                cursor.close();

                Cursor cursor2 = MainActivity.Notes.rawQuery("SELECT contenu FROM Notes WHERE id = " + noteId, null);
                if(cursor2.moveToFirst()) {
                    String contenu = cursor2.getString(cursor2.getColumnIndex("contenu"));

                    EditText contenuET = (EditText) findViewById(R.id.contenu);
                    contenuET.setText(contenu);
                }
            }
        }
    }

    public void sauvegarder(View v) {
        try {
            SQLiteDatabase notes = MainActivity.Notes;
            EditText titreET = (EditText) findViewById(R.id.titre);
            String titre = titreET.getText().toString();

            EditText contenuET = (EditText) findViewById(R.id.contenu);
            String contenu = contenuET.getText().toString();


            if(titre.equals(""))  throw new Exception();

            notes.execSQL("INSERT INTO notes (titre, contenu) VALUES ('" + titre + "', '" + contenu + "')");

            Toast.makeText(this, "Note sauvegardée avec succès", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "Echec de sauvagarde de la note", Toast.LENGTH_SHORT).show();
        }
    }

    public void annuler(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}