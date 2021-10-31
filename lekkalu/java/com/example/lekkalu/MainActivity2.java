package com.example.lekkalu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class MainActivity2 extends AppCompatActivity {
    TextView n,b,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String Name = getIntent().getStringExtra("name");
        n = findViewById(R.id.name);
        n.setText(Name);

        Bundle extras = getIntent().getExtras();
        int[] allvall = extras.getIntArray("allval");
        float bags=allvall[0],quintas,price=allvall[3],weight=allvall[1],kgs=allvall[2],extra=allvall[5],cc=allvall[4],hamali=allvall[6];
        float acc,accamount,totalhamali,finalamount;
        quintas = ((bags*weight)+kgs)/100;
        accamount = quintas*price;
        acc = (float) ((quintas*price)*(cc*0.01));
        if(kgs >= 25)
        totalhamali = (bags+1)*hamali;
        else
            totalhamali = (bags)*hamali;

        finalamount = accamount - acc - extra - totalhamali;

        String print1,print2;
        print1 = " Bags : "+bags+"\t\t"+" Kgs : "+kgs+"\t\t\t"+" Q : "+quintas+"\t\t\t"+" price : "+price;
        b = findViewById(R.id.b);
        b.setText(print1);

        print2 = accamount+"\n\n"+acc+"\t"+"(-cc)"+"\n\n"+totalhamali+"\t"+"(-hamali)"+"\n\n"+extra
                +"\t"+"(-extra)"+"\n\n\n"+finalamount+"\t"+"(amount)";
        d = findViewById(R.id.d);
        d.setText(print2);


    }

}