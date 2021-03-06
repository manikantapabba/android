package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         switch (item.getItemId()){
             case R.id.item1:
                 Toast.makeText(this, "Item 1", Toast.LENGTH_SHORT).show();
                  return true;
             case R.id.itema:
                 Toast.makeText(this, "Item 2(a)", Toast.LENGTH_SHORT).show();
                 return true;
             case R.id.itemb:
                 Toast.makeText(this, "Item 2(b)", Toast.LENGTH_SHORT).show();
                 return true;
             case R.id.item3:
                 Toast.makeText(this, "Item 3", Toast.LENGTH_SHORT).show();
                 return true;
         }
         return super.onOptionsItemSelected(item);
    }
}