package com.example.akash.xploro;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Places> myDataSet;


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View itemView = inflater.inflate(R.layout.category_item_list, container, false);

        myDataSet = new ArrayList<>();
        recyclerView = itemView.findViewById(R.id.main_category_recycler_view);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        initializeData();
        adapter = new CategoryAdapter(myDataSet);
        recyclerView.setAdapter(adapter);

        return itemView;

    }

    private void initializeData() {
        myDataSet.add(new Places("Celini", getResources().getDrawable(R.drawable.celini_restaurant_mumbai), 4.4F));
        myDataSet.add(new Places("ITC Maratha, Pan Asian", getResources().getDrawable(R.drawable.pan_asian_restaurant_mumbai), 4.3f));
        myDataSet.add(new Places("ITC Maratha, Dum Pukht", getResources().getDrawable(R.drawable.dum_pukht_restaurant_mumbai), 4.1f));
        myDataSet.add(new Places("Trishna", getResources().getDrawable(R.drawable.trishna_restaurant_mumbai), 4.5f));
        myDataSet.add(new Places("Mirchi & Mime", getResources().getDrawable(R.drawable.mirchi_n_mime_restaurant_mumbai), 4.5f));
    }
}
