package com.example.nh.seasson12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView text1= (TextView) findViewById(R.id.textView);


        String s= getIntent().getStringExtra("month");
        text1.setText(s);


    }
}
