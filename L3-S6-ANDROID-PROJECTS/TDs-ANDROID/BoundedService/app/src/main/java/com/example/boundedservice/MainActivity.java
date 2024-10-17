package com.example.boundedservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    BoundedService myService;
    ServiceConnection myConn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder iBinder) {
            myService = ((BoundedService.IDBinder) iBinder).getService();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindService(new Intent(getApplicationContext(), BoundedService.class),myConn, BIND_AUTO_CREATE);

        Button cn = (Button) findViewById(R.id.count);
        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer i = myService.getNewID();
                TextView tv = (TextView) findViewById(R.id.counter);
                tv.setText(i.toString());
            }
        });
    }
}













