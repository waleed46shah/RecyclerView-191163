package com.example.lab_assignment_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<Names> studentsList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);


        studentsList.add(new Names("Waleed Hassan",R.drawable.waleed_hassan));
        studentsList.add(new Names("Faiq Ahmed",R.drawable.faiq_ahmed));
        studentsList.add(new Names("Billu",R.drawable.billu));
        studentsList.add(new Names("Alyan Quddoos",R.drawable.alyan_quddoos));
        studentsList.add(new Names("Fahad Sarwar",R.drawable.fahad_sarwar));
        studentsList.add(new Names("Fahad Mehmood",R.drawable.fahad_mehmood));
        studentsList.add(new Names("Abdul Sammad",R.drawable.ab_sammad));
        studentsList.add(new Names("Noman Tasif",R.drawable.noman_tasif));

        recyclerViewAdapter  = new RecyclerViewAdapter(MainActivity.this,studentsList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);
    }


}