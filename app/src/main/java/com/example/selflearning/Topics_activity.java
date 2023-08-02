package com.example.selflearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topics_activity extends AppCompatActivity {

//    String topics[]
//            = { "introducation", "enviroment setup",
//            "first program concept", "kotlin variable",
//            "kotlin data type", "kotlin type conversion",
//            "kotlin operator", "kotlin input/output",
//            "kotlin comments","kotlin if expression", "kotlin for loop expression",
//            "Kotlin while loop expression","kotlin do while loop expression","kotlin switch expression" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        int id = intent.getIntExtra("id",0);


        RecyclerView recyclerView = findViewById(R.id.recyclerviewTopics);
//
//        TopicsAdapter adapter = new TopicsAdapter(  topics,this);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
//        recyclerView.setAdapter(adapter);

    }
}