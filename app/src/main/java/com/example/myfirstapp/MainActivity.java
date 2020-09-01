package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(getApplicationContext(),ActivityWeb.class);
        startActivity(intent);


        ListView lb = (ListView) findViewById(R.id.my_lv);

        ArrayList<String> my_arr = new ArrayList<>();
        my_arr.add("Hello");
        my_arr.add("01");
        my_arr.add("Hola");
        my_arr.add("hallo");

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1,my_arr);

        lb.setAdapter(aa);
    }
}