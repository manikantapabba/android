package com.example.loginusingbd;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mail,password;
    Button signin,signup;
    DBhandler DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mail = findViewById(R.id.mail);
        password = findViewById(R.id.password);
        signin = findViewById(R.id.signinbtn);
        signup = findViewById(R.id.signupbtn);

        DB = new DBhandler(this);


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass = password.getText().toString();
                String email = mail.getText().toString();
                Cursor res = DB.getdata();

                if(res.getCount()==0){
                    Toast.makeText(MainActivity.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                int flag=0;
                while(res.moveToNext()){
                    if( res.getString(0).equals(email) ){
                        flag=1;
                        if(res.getString(2).equals(pass)  ) {
                            buffer.append("mail :" + res.getString(0) + "\n");
                            buffer.append("name :" + res.getString(1) + "\n");
                            //buffer.append("password :" + res.getString(2) + "\n\n");
                            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                            builder.setCancelable(true);
                            builder.setTitle("User Entries");
                            builder.setMessage(buffer.toString());
                            builder.show();
                            break;
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                            break;
                        }
                    }
                }
                if(flag==0){
                    Toast.makeText(MainActivity.this, "Please Register", Toast.LENGTH_SHORT).show();
                }
            }
        });




        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}