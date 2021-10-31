
package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText Et1,Et2,Et3;
    Button Bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Et1 = findViewById(R.id.num1);
        Et2 = findViewById(R.id.num2);
        Et3 = findViewById(R.id.result);
        Bt1 = findViewById(R.id.Add);

        Bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                   int num1 = Integer.parseInt(Et1.getText().toString());
                   int num2 = Integer.parseInt(Et2.getText().toString());
                   int sum = num1 + num2;

                   Et3.setText(Integer.toString(sum));
            }
        });

    }
}