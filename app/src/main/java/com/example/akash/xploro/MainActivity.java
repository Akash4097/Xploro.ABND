package com.example.akash.xploro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<City> myDataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDataSet = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler_view);
        layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        initializeData();
        adapter = new MainAdapter(myDataSet);
        recyclerView.setAdapter(adapter);
    }

    private void initializeData() {
        myDataSet.add(new City(getResources().getStringArray(R.array.cities)[0],getResources().getDrawable(R.drawable.gateway)));
        myDataSet.add(new City(getResources().getStringArray(R.array.cities)[1],getResources().getDrawable(R.drawable.india_gate)));
        myDataSet.add(new City(getResources().getStringArray(R.array.cities)[2],getResources().getDrawable(R.drawable.bangalore)));
        myDataSet.add(new City(getResources().getStringArray(R.array.cities)[3],getResources().getDrawable(R.drawable.kolkata_victoria)));
        myDataSet.add(new City(getResources().getStringArray(R.array.cities)[4],getResources().getDrawable(R.drawable.chennai)));
        myDataSet.add(new City(getResources().getStringArray(R.array.cities)[5],getResources().getDrawable(R.drawable.agra)));
        myDataSet.add(new City(getResources().getStringArray(R.array.cities)[6],getResources().getDrawable(R.drawable.ahemdabad)));
        myDataSet.add(new City(getResources().getStringArray(R.array.cities)[7],getResources().getDrawable(R.drawable.hyderabad)));
        myDataSet.add(new City(getResources().getStringArray(R.array.cities)[8],getResources().getDrawable(R.drawable.surat)));
        myDataSet.add(new City(getResources().getStringArray(R.array.cities)[9],getResources().getDrawable(R.drawable.pune)));
        myDataSet.add(new City(getResources().getStringArray(R.array.cities)[10],getResources().getDrawable(R.drawable.bhopal)));
    }
}
