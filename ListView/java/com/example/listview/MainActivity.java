package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.theList);

        ArrayList<String> names = new ArrayList<>();
        names.add("google");
        names.add("facebook");
        names.add("twitter");
        names.add("whatsapp");

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.list_item_layout,names);//use any layout file
        list.setAdapter(adapter);
    }
}
