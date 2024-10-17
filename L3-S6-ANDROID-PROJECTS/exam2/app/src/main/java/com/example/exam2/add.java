package com.example.exam2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class add extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }

    public void valider(View v) {
        try {
            EditText nomET = (EditText) findViewById(R.id.lname);
            String nom = nomET.getText().toString();

            EditText prenomET = (EditText) findViewById(R.id.fname);
            String prenom = prenomET.getText().toString();

            EditText telET = (EditText) findViewById(R.id.Tel);
            String tel = telET.getText().toString();

            if(prenom.equals("") || nom.equals("") ||  tel.equals("")) throw new Exception();

            Contact c = new Contact(nom, prenom, tel);
            c.save();

            Toast.makeText(this, "Contact ajouté avec succès", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "Echec de l'ajout du contact", Toast.LENGTH_SHORT).show();
        }
    }
}
