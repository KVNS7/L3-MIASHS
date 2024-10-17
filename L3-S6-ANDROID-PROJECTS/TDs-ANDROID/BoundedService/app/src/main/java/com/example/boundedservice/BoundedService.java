package com.example.boundedservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;


public class BoundedService extends Service {

    private int pseudoRnd = 0;
    IDBinder myIDBinder = new IDBinder();

    public class IDBinder extends Binder {
        BoundedService getService(){
            return BoundedService.this;
        }
    }


    public BoundedService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        return myIDBinder;
    }

    public int getNewID(){
        pseudoRnd = (int) (Math.random() * 10000);
        return pseudoRnd;
    }
}










