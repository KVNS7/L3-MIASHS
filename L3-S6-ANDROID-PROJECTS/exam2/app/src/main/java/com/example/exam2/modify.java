package com.example.exam2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

public class modify extends AppCompatActivity {

    TextView nom;
    TextView prenom;
    TextView tel;
    Contact c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify);

        // TODO: Initialiser les TextViews pour nom, prenom, et tel

        // TODO: Récupérer l'instance de Contact à modifier

        // TODO: Mettre à jour l'affichage des informations du contact
    }

    // TODO: Définir une méthode pour sauvegarder les modifications du contact
    // public void saveContact(View view) {
        // TODO: Récupérer les nouvelles valeurs pour nom, prenom, et tel
        
        // TODO: Mettre à jour le contact et sauvegarder les changements
    // }
}
