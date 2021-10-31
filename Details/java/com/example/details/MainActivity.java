
package com.example.details;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText Uname,Upassword,Uaddress;
    Button submit;
    Spinner sp;
    RadioGroup rg;
    private DatePickerDialog datePickerDialog;
    private Button dateButton;

    String state = " ",date= " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uname = findViewById(R.id.Uname);
        Upassword = findViewById(R.id.Upassword);
        Uaddress = findViewById(R.id.Uaddress);
        submit = findViewById(R.id.button);
        rg = findViewById(R.id.radioGroup);
        sp = findViewById(R.id.spinner);
        initDatePicker();
        dateButton = findViewById(R.id.datePickerButton);
        dateButton.setText(getTodaysDate());
        String date = getTodaysDate();

        String states[] = {"Select state","Telangana", "AP"};
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,states);
        sp.setAdapter(ad);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                state = sp.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, state, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

//        dt.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
//            @Override
//            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
//                month = month+1;
//                date = year + "-" + month + "-" + day;
//
//            }
//        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = Uname.getText().toString();
                String pass = Upassword.getText().toString();
                String address = Uaddress.getText().toString();
                String gender="";
                int checked_id = rg.getCheckedRadioButtonId();
                if(checked_id == R.id.Male){
                    gender = "MALE";
                }
                else if(checked_id == R.id.Female){
                    gender = "Female";
                }
                Toast.makeText(MainActivity.this,name+"\n"+pass+"\n"+address+"\n"+gender+"\n"+state+"\n"+date, Toast.LENGTH_LONG).show();
            }
        });

    }
    private String getTodaysDate()
    {

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month = month + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString(day, month, year);
    }
    private void initDatePicker()
    {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener()
        {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day)
            {
                month = month + 1;
                String date = makeDateString(day, month, year);
                dateButton.setText(date);
            }
        };

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;

        datePickerDialog = new DatePickerDialog(this, style, dateSetListener, year, month, day);
        //datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());

    }
    private String makeDateString(int day, int month, int year)
    {
        return month+ " " + day + " " + year;
    }
    public void openDatePicker(View view)
    {
        datePickerDialog.show();
    }
    
}