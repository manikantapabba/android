package com.example.switchscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t;
        //String st = getIntent().getStringExtra("s");
        String st = getIntent().getExtras().getString("s");//getStringExtra("s");
        t = findViewById(R.id.txt);
        t.setText(st);
    }
}