package com.chenbin.simpletest;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.chenbin.simpletest.server.ServerActivity;
import com.chenbin.simpletest.server.TestServer;

public class MainActivity extends AppCompatActivity {
    private static String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void serverTest(View v){
        Intent intent = new Intent();
        intent.setClass(this, ServerActivity.class);
        startActivity(intent);
    }



}
