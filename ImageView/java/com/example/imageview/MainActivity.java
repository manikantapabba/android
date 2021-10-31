package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: image");

        ImageView firstImage = (ImageView) findViewById(R.id.firstImage);

        int ImageResource = getResources().getIdentifier("@drawable/eye",null,this.getPackageName());
        firstImage.setImageResource(ImageResource);
    }
}
