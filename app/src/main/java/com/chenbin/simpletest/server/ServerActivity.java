package com.chenbin.simpletest.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.chenbin.simpletest.R;

public class ServerActivity extends AppCompatActivity {
    private static String TAG = ServerActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);
    }

    TestServer ts = new TestServer();

    public void startServer(View v){
        Intent intent = new Intent();
        intent.setClass(this, TestServer.class);
        startService(intent);
    }

    public void stopServer(View v){
        Intent intent = new Intent();
        intent.setClass(this, TestServer.class);
        stopService(intent);
    }

    public void bindServer(View v){
        Intent intent = new Intent();
        intent.setClass(this, TestServer.class);
        bindService(intent,sc, Context.BIND_AUTO_CREATE);
    }

    private ServiceConnection sc = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d(TAG, "onServiceConnected: ");
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(TAG, "onServiceDisconnected: ");
        }
    };

    public void unbindServer(View v){
        unbindService(sc);
    }

}
