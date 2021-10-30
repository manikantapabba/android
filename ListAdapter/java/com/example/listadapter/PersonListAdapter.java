package com.example.listadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonListAdapter extends ArrayAdapter<person> {

    private Context mContext;
    int mResource;

    public PersonListAdapter(Context context, int resource, ArrayList<person> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the person info
        String name = getItem(position).getName();
        String birthday = getItem(position).getBirthday();
        String sex = getItem(position).getSex();

        //create the person object with the info
        //person Person = new person(name,birthday,sex);

        LayoutInflater inflator = LayoutInflater.from(mContext);
        convertView = inflator.inflate(mResource,parent,false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);
        TextView tvBirthday = (TextView) convertView.findViewById(R.id.textView2);
        TextView tvSex = (TextView) convertView.findViewById(R.id.textView3);

        tvName.setText(name);
        tvBirthday.setText(birthday);
        tvSex.setText(sex);

        return convertView;

    }
}

