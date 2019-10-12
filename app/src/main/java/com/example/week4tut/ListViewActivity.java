package com.example.week4tut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ListView lv;
    private ArrayList<String> names=new ArrayList<>();//data source
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lv=findViewById(R.id.lv);

        names.add("John");
        names.add("Joe");
        names.add("Amy");
        names.add("Chigga");
        names.add("Avicii");
        names.add("Avicii");
        names.add("Avicii");
        names.add("Avicii");
        names.add("Avicii");
        names.add("Avicii");
        names.add("Avicii");
        names.add("Avicii");
        names.add("Avicii");
        names.add("Avicii");
        names.add("Avicii");
        names.add("Avicii");
        names.add("Avicii");
        names.add("Avicii");
        names.add("Avicii");
        names.add("Avicii");


        ArrayAdapter<String> nameAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        lv.setAdapter(nameAdapter);
    }


}
