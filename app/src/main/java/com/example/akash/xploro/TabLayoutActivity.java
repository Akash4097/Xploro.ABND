package com.example.akash.xploro;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class TabLayoutActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        Intent intent = getIntent();

        ViewPager viewPager = findViewById(R.id.viewPage);
        SimpleFragmentAdapter adapter = new SimpleFragmentAdapter(this,getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.hotel);
        tabLayout.getTabAt(1).setIcon(R.drawable.restaurant);
        tabLayout.getTabAt(2).setIcon(R.drawable.shopping_mall);
        tabLayout.getTabAt(3).setIcon(R.drawable.others_places);
        this.setTitle(intent.getStringExtra("title"));

    }


}
