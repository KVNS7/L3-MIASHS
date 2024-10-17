package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void addContact(View v){
         Intent intent = new Intent(this, add.class);
         startActivity(intent);
    }

    public void searchContact(View v){
        Intent intent = new Intent(this, search.class);
        startActivity(intent);
    }

    public void deleteContacts(View v){
        Contact.deleteAll(Contact.class);
    }

}
