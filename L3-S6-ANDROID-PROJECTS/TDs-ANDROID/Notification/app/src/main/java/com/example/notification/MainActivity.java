package com.example.notification;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button notif_button = (Button) findViewById(R.id.notification);
        notif_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bravo ça marche !", Toast.LENGTH_LONG).show();
            }
        });

        Button dialog_button = (Button) findViewById(R.id.dialog);
        dialog_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // id de la notification
                int mNotificationId = 1;

                // id du canal de notification
                String Notification_CHANNEL_ID = "1";

                // construction de la notification
                NotificationCompat.Builder mBuilder =
                        new NotificationCompat.Builder(getBaseContext(), Notification_CHANNEL_ID)
                                .setSmallIcon(android.R.drawable.star_big_off)
                                .setContentTitle("Ma première notification")
                                .setContentText("Notif 1")
                                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

                // creation du canal de notification
                NotificationChannel notificationChannel =
                    new NotificationChannel(Notification_CHANNEL_ID,
                                        "Channel 1",
                                            NotificationManager.IMPORTANCE_HIGH);

                // recuperation du gestionnaire de notifications
                NotificationManager mNotifyMgr = (NotificationManager)
                            getSystemService(NotificationManager.class);
                mNotifyMgr.createNotificationChannel(notificationChannel);

                // publication de la notification
                mNotifyMgr.notify(mNotificationId, mBuilder.build());
            }
        });
        dialog_button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                // id de la notification
                int mNotificationId = 2;

                // id du canal de notification
                String Notification_CHANNEL_ID = "1";

                // construction de la notification
                NotificationCompat.Builder mBuilder =
                        new NotificationCompat.Builder(getBaseContext(), Notification_CHANNEL_ID)
                                .setSmallIcon(android.R.drawable.star_big_off)
                                .setContentTitle("Ma deuxième notification")
                                .setContentText("Notif 2")
                                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

                // creation du canal de notification
                NotificationChannel notificationChannel =
                        new NotificationChannel(Notification_CHANNEL_ID,
                                "Channel 1",
                                NotificationManager.IMPORTANCE_DEFAULT);
                mBuilder.setChannelId(Notification_CHANNEL_ID);

                // recuperation du gestionnaire de notifications
                NotificationManager mNotifyMgr = (NotificationManager)
                        getSystemService(NotificationManager.class);
                mNotifyMgr.createNotificationChannel(notificationChannel);

                // publication de la notification
                mNotifyMgr.notify(mNotificationId, mBuilder.build());

                return false;
            }
        });

        Button statusbar_button = (Button) findViewById(R.id.statusbar);
        statusbar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Attention, c'est un AlertDialog !!!!")
                        .setMessage("Fermer la notification ?")
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        /*.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })*/
                        .show();
            }
        });
    }
}