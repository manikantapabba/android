package com.example.lekkalu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText vals[] = new EditText[8];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.result);
        vals[0] = findViewById(R.id.name);
        vals[1] = findViewById(R.id.bval);
        vals[2] = findViewById(R.id.wval);
        vals[3] = findViewById(R.id.kgsval);
        vals[4]  = findViewById(R.id.pval);
        vals[5]  = findViewById(R.id.ccval);
        vals[6]  = findViewById(R.id.eval);
        vals[7]  = findViewById(R.id.hval);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = vals[0].getText().toString();
                int val[] = new int[7];
                for(int i=1;i<vals.length;i++)
                {
                    val[i-1] = Integer.parseInt(vals[i].getText().toString());
                }
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",name);
                intent.putExtra("allval",val);
                startActivity(intent);
            }
        });

    }
}