package com.example.loginusingbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText mail,password1,password2,username;
    Button signup;
    DBhandler DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        username = findViewById(R.id.username);
        mail = findViewById(R.id.mail);
        password1 = findViewById(R.id.password1);
        password2 = findViewById(R.id.password2);
        signup = findViewById(R.id.signupbtn);

        DB = new DBhandler(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass1 = password1.getText().toString();
                String pass2 = password2.getText().toString();
                String name = username.getText().toString();
                String email = mail.getText().toString();
                if(pass1.equals(pass2))
                {
                    String check = DB.insertuserdata(email,name,pass1);
                    Toast.makeText(MainActivity2.this, check, Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity2.this, "Please Re-enter Correct password", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}