package com.example.exam2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.orm.query.Condition;
import com.orm.query.Select;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class search extends AppCompatActivity {

    // TODO: Déclarer les éléments de l'interface utilisateur nécessaires pour la recherche
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // TODO: Initialiser les éléments de l'interface utilisateur et configurer la logique de recherche
    }
    public void searchContacts(View view) {
        TextView rechercheTV = (TextView) findViewById(R.id.slname);
        String recherche = "%" + rechercheTV.getText().toString() + "%";

        List<Contact> resultat = Contact.findWithQuery(Contact.class,
                "SELECT * FROM Contact WHERE last_Name LIKE ? OR first_Name LIKE ? OR tel LIKE ?",
                recherche, recherche, recherche);

        if(resultat.isEmpty()){
            Toast.makeText(getApplicationContext(),"Aucun contact trouvé", Toast.LENGTH_LONG).show();
        }else{

            list = (ListView) findViewById(R.id.myListView);
            list.setAdapter(new ArrayAdapter<Contact>(this, android.R.layout.simple_list_item_1, resultat));

            /* affiche les contacts dans les logs
            for (Contact contact : resultat) Log.d("Contact", "Nom : " + contact.getNom() + ", Prénom : " + contact.getPrenom() + ", Téléphone : " + contact.getTel());
            }*/

        }
    }
}
