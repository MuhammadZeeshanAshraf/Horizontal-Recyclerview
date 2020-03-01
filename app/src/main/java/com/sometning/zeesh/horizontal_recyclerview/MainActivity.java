package com.sometning.zeesh.horizontal_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<MainModel> mainModel;
    MainAdpater mainAdpater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        Integer[] logo = {R.drawable.c,R.drawable.java, R.drawable.php , R.drawable.python,
                R.drawable.ruby , R.drawable.sql , R.drawable.swift ,R.drawable.js};

        String[] name = {"C Language" , "Java" , "PHP" , "python" , "Ruby" , "SQL", "Swift" , "JavaScript"};

        mainModel = new ArrayList<>();

        for (int i = 0 ; i<logo.length ; i++)
        {
            MainModel model = new MainModel(logo[i] , name[i]);
            mainModel.add(model);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this , LinearLayoutManager.HORIZONTAL , false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mainAdpater = new MainAdpater(MainActivity.this , mainModel);

        recyclerView.setAdapter(mainAdpater);
    }
}
