package com.example.exam2;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.orm.SugarRecord;

/**
 * Created by souheib on 15/12/2016.
 */

public class Contact extends SugarRecord {
    String lastName;
    String firstName;
    String tel;

    public Contact(){}

    public Contact(String nom, String prenom, String tel){
        // TODO: Initialiser les attributs de l'instance
        this.lastName = nom;
        this.firstName = prenom;
        this.tel = tel;
    }

    public String getNom(){return lastName;}
    public String getPrenom(){return firstName;}
    public String getTel(){return tel;}

    @Override
    @NonNull
    public String toString(){return getNom() + " " + getPrenom() + " : " + getTel();}
}
