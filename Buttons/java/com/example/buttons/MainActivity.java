package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");
        Button firstButton = (Button) findViewById(R.id.btnOne);
        Button secondButton = (Button) findViewById(R.id.btnTwo);

        firstButton.setOnClickListener(new View.OnClickListener() {  //use new O to get view.onClick..
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked ButtonOne");
                toastMessage("Clicked Button One");//Toast.makeText(MainActivity.this,"It's Button One",Toast.LENGTH_SHORT).show();
            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMessage("Clicked Button two");
            }
        });
    }
    private void toastMessage(String message){
        Toast.makeText(MainActivity.this,message,Toast.LENGTH_SHORT).show();
    }
}
