package com.example.week4tut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button btnFinActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnFinActivity=findViewById(R.id.btnFinAct);

        btnFinActivity.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               finish();

           }


        });
    }
}
