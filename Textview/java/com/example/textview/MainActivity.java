package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";//enter logt

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView  theTextView= (TextView) findViewById(R.id.textView);//findview used to find location stored in memory
        theTextView.setText("this is first text");

        //extracting info from text view
        String stringFromTextView = theTextView.getText().toString();
        Log.d(TAG, "onCreate: " + stringFromTextView);//like print fun...just enter logd

    }
}
