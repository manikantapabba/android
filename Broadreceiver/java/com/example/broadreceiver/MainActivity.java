package com.example.broadreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MyReceiver my = new MyReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter f = new IntentFilter(Intent.ACTION_DATE_CHANGED);
        registerReceiver(my, f);
    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        IntentFilter f = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
//        registerReceiver(my,f);
//    }
//

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(my);
    }
}