package com.example.nh.seasson12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list= (ListView) findViewById(R.id.listView);
        final String[]months={"january","february","march","april","june","july","august","september","october","november","december"};

        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,months);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("month",months[position]);
                startActivity(i);
            }
        });
    }
}
