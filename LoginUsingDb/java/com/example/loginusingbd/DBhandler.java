package com.example.loginusingbd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DBhandler extends SQLiteOpenHelper {
    public DBhandler(Context context) {
        super(context, "Userdata.db", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create Table Userdetails(email TEXT primary key,name TEXT,password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("drop Table if exists Userdetails");
    }

    public String insertuserdata(String email, String name, String password) {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("email", email);
        cv.put("name", name);
        cv.put("password", password);

        Cursor cursor = DB.rawQuery("Select * from Userdetails where email = ?", new String[]{email});
        if (cursor.getCount() > 0) {
            return "You have already registered with this mail id";
        } else {
            long result = DB.insert("Userdetails", null, cv);
            if (result == -1) {
                return "Not Registered";
            } else {
                return "Successfully Registered";
            }
        }
    }

    public Cursor getdata ()
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from Userdetails", null);
        return cursor;

    }
}
