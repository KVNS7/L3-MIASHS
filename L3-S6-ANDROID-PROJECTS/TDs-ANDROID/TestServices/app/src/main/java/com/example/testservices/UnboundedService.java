package com.example.testservices;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class UnboundedService extends Service {

    MediaPlayer mp;

    public void onCreate() {
        mp = MediaPlayer.create(this, R.raw.doorbell);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy(){
        mp.stop();
    }

    public int onStartCommand(Intent in, int f, int startID){
        mp.start();
        return START_STICKY;
    }
}