package com.example.notifications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String NotifChan = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button notif = (Button) findViewById(R.id.button_notif);
        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bravo, ça marche !", Toast.LENGTH_LONG).show();
            }
        });

        Button status = (Button) findViewById(R.id.button_status);
        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mNotificationID = 1;

                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getBaseContext(), NotifChan)
                        .setSmallIcon(android.R.drawable.star_big_off)
                        .setContentTitle("Ma première notification !")
                        .setContentText("Ceci est ma première notification")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);

                NotificationChannel notificationChannel = new NotificationChannel(NotifChan, "Notifs", NotificationManager.IMPORTANCE_DEFAULT);
                mBuilder.setChannelId(NotifChan);

                NotificationManager mNotifyMgr = (NotificationManager) getSystemService(NotificationManager.class);
                mNotifyMgr.createNotificationChannel(notificationChannel);

                mNotifyMgr.notify(mNotificationID, mBuilder.build());
            }
        });

        status.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                int mNotificationID = 2;

                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getBaseContext(), NotifChan)
                        .setSmallIcon(android.R.drawable.star_big_on)
                        .setContentTitle("Ma deuxième notification")
                        .setContentText("Ceci est ma deuxième notification")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);

                NotificationChannel notificationChannel = new NotificationChannel(NotifChan, "Notifs", NotificationManager.IMPORTANCE_DEFAULT);
                mBuilder.setChannelId(NotifChan);

                NotificationManager mNotifyMgr = (NotificationManager) getSystemService(NotificationManager.class);
                mNotifyMgr.createNotificationChannel(notificationChannel);

                mNotifyMgr.notify(mNotificationID, mBuilder.build());

                return false;
            }
        });

        Button dialog = (Button) findViewById(R.id.button_dialog);
        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Alert dialog")
                        .setMessage("Attention, c'est un AlertDialog !!!!")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).show();
            }
        });
    }
}