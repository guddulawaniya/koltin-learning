package com.example.selflearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;


import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        ArrayList<cardModule> list = new ArrayList<>();

        //Arraylist to send Adapter

        ArrayList imageslist = new ArrayList(Arrays.asList(R.drawable.basiccodingimage,"Basic Tutorial",R.drawable.adimage,"Advance Tutorial",
                R.drawable.practice,"Practice",R.drawable.answer_question,"Ques & Ans", R.drawable.onlineclass,"Online Class"));

        ArrayList topicslist = new ArrayList(Arrays.asList("introducation", "enviroment setup",
                "first program concept", "kotlin variable",
                "kotlin data type", "kotlin type conversion",
                "kotlin operator", "kotlin input/output",
                "kotlin comments","kotlin if expression", "kotlin for loop expression",
                "Kotlin while loop expression","kotlin do while loop expression","kotlin switch expression"));

        ArrayList titlelist = new ArrayList(Arrays.asList("Basic Tutorial","Advance Tutorial","Practice","Ques & Ans","Online Class"));




        RecyclerView recycler = findViewById(R.id.cardrecyclerview);

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        ImageView menu = findViewById(R.id.menubutton);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);


            }
        });


        list.add(new cardModule(R.drawable.basiccodingimage,1,"Basic Tutorial","Fundamental,loops,data types,Function"));
        list.add(new cardModule(R.drawable.adimage,2,"Advance Tutorial","Fundamental,loops,data types,Function"));
        list.add(new cardModule(R.drawable.practice,3,"Practice ","Fundamental,loops,data types,Function"));
        list.add(new cardModule(R.drawable.answer_question,4,"Ques & Ans","Question & Answer"));
        list.add(new cardModule(R.drawable.onlineclass,5,"Online Class","online class"));

        Adaptercards adapter = new Adaptercards(list,this);


        recycler.setLayoutManager(new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false));
        recycler.setAdapter(adapter);












    }
}