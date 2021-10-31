package com.example.switchscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void clicked(View v)
    {
        Intent i = new Intent(MainActivity.this,MainActivity2.class);//or  new Intent(this,MainActivity2.class)
        EditText n = findViewById(R.id.Name);
        String name = n.getText().toString();
        i.putExtra("s",name);
        startActivity(i);

    }
}