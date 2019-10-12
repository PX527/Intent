package com.example.week4tut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private Button btnStartAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartAct=findViewById(R.id.btnStartAct);
    }

    public void StartMain2Activity(View v){
        Intent i=new Intent(this, ListViewActivity.class);
        startActivity(i);

    }
}
