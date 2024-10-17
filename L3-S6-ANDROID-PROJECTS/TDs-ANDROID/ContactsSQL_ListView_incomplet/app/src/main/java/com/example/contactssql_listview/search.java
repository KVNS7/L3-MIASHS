package com.example.contactssql_listview;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import androidx.appcompat.app.AppCompatActivity;

public class search extends AppCompatActivity {
    SQLiteDatabase Contacts;
    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Contacts = MainActivity.Contacts;
        myListView = (ListView) findViewById(R.id.myListView);

        Button aff = (Button) findViewById(R.id.afficher);

        TextView recherche = (TextView) findViewById(R.id.text_search);


        aff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    // Récupérer le texte de la zone de recherche
                    String searchText = recherche.getText().toString().trim();

                    // Échapper les apostrophes dans le texte de recherche pour éviter les injections SQL
                    searchText = searchText.replace("'", "''");

                    // Exécuter la requête SQL pour rechercher les contacts correspondant aux critères
                    Cursor cursor = Contacts.rawQuery("SELECT * FROM contacts WHERE nom LIKE '%" + searchText + "%' OR prenom LIKE '%" + searchText + "%' OR numero LIKE '%" + searchText + "%'", null);

                    // Créer une ArrayList pour stocker les résultats de la recherche
                    ArrayList<HashMap<String, String>> contactList = new ArrayList<>();

                    // Parcourir le curseur pour extraire les résultats de la requête
                    if (cursor != null && cursor.getCount() > 0) {
                        while (cursor.moveToNext()) {
                            // Extraire les données de chaque ligne du résultat de la requête
                            String nom = cursor.getString(cursor.getColumnIndex("nom"));
                            String prenom = cursor.getString(cursor.getColumnIndex("prenom"));
                            String numero = cursor.getString(cursor.getColumnIndex("numero"));

                            // Créer une HashMap pour stocker les données de chaque contact
                            HashMap<String, String> contact = new HashMap<>();
                            contact.put("nom", nom);
                            contact.put("prenom", prenom);
                            contact.put("numero", numero);

                            // Ajouter la HashMap à la liste des contacts
                            contactList.add(contact);
                        }
                        // Fermer le curseur après avoir fini de l'utiliser
                        cursor.close();

                        // Créer un SimpleAdapter pour lier les données à la ListView
                        SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(), contactList, R.layout.item,
                                new String[]{"nom", "prenom"},
                                new int[]{R.id.textView_name, R.id.textView_firstname});

                        // Appliquer l'adaptateur à la ListView
                        myListView.setAdapter(adapter);

                        // Afficher un message indiquant que la recherche a été effectuée
                        Toast.makeText(getApplicationContext(),
                                "Recherche effectuée",
                                Toast.LENGTH_LONG).show();
                    } else {
                        // Afficher un message indiquant qu'aucun résultat n'a été trouvé
                        Toast.makeText(getApplicationContext(),
                                "Aucun résultat trouvé",
                                Toast.LENGTH_LONG).show();
                    }
                } catch (Exception e) {
                    // Afficher une erreur en cas d'exception
                    Log.e("Main : ", e.toString());
                    Toast.makeText(getApplicationContext(),
                            "Une erreur s'est produite lors de la recherche",
                            Toast.LENGTH_LONG).show();
                }

            }
        });

    }

}

