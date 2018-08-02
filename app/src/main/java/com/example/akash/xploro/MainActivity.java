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
        myDataSet.add(new City("Mumbai",getResources().getDrawable(R.drawable.gateway)));
        myDataSet.add(new City("Delhi",getResources().getDrawable(R.drawable.india_gate)));
        myDataSet.add(new City("Bangalore",getResources().getDrawable(R.drawable.bangalore)));
        myDataSet.add(new City("Kolkata",getResources().getDrawable(R.drawable.kolkata_victoria)));
        myDataSet.add(new City("Chennai",getResources().getDrawable(R.drawable.chennai)));
        myDataSet.add(new City("Agra",getResources().getDrawable(R.drawable.agra)));
        myDataSet.add(new City("Ahmedabad",getResources().getDrawable(R.drawable.ahemdabad)));
        myDataSet.add(new City("Hyderabad",getResources().getDrawable(R.drawable.hyderabad)));
        myDataSet.add(new City("Surat",getResources().getDrawable(R.drawable.surat)));
        myDataSet.add(new City("Pune",getResources().getDrawable(R.drawable.pune)));
        myDataSet.add(new City("Bhopal",getResources().getDrawable(R.drawable.bhopal)));

    }
}
