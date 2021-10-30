package com.example.listadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mlistView = (ListView) findViewById(R.id.listView);

        person mani = new person("mani","20-11-1999","male");
        person suresh =  new person("suresh","20-11-1999","male");
        person honey =  new person("honey","20-11-1999","female");
        person john =  new person("john","20-11-1999","male");
        person can =  new person("can","20-11-1999","male");
        person pan =  new person("pan","20-11-1999","female");
        person van =  new person("van","20-11-1999","male");
        person dan =  new person("dan","20-11-1999","female");
        person khan =  new person("khan","20-11-1999","male");
        person jhan =  new person("jhan","20-11-1999","male");
        person lan =  new person("lan","20-11-1999","male");
        person yan =  new person("yan","20-11-1999","male");
        person  puppy=  new person("puppy","20-11-1999","female");
        person lucky =  new person("lucky","20-11-1999","female");
        person cheeky =  new person("cheeky","20-11-1999","male");
        person lust = new person("lust","20-11-1999","male");
        person rip=  new person("rip","20-11-1999","female");
        person born =  new person("born","20-1-1999","male");
        person day=  new person("day","20-11-1990","male");

        ArrayList<person> peopleList = new ArrayList<person>();
        peopleList.add(mani);
        peopleList.add(suresh);
        peopleList.add(honey);
        peopleList.add(john);
        peopleList.add(can);
        peopleList.add(pan);
        peopleList.add(van);
        peopleList.add(dan);
        peopleList.add(khan);
        peopleList.add(jhan);
        peopleList.add(lan);
        peopleList.add(yan);
        peopleList.add(puppy);
        peopleList.add(lucky);
        peopleList.add(cheeky);
        peopleList.add(lust);
        peopleList.add(rip);
        peopleList.add(born);
        peopleList.add(day);

       PersonListAdapter adapter = new PersonListAdapter(this,R.layout.adapter_view_layout,peopleList);
       mlistView.setAdapter(adapter);
    }
}
