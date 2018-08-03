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
public class ShopingFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Hotels> myDataSet;

    public ShopingFragment() {
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
        myDataSet.add(new Hotels("Inorbit Mall Vashi", getResources().getDrawable(R.drawable.inorbit_mall_mumbai), 4.3F));
        myDataSet.add(new Hotels("High Street Phoenix", getResources().getDrawable(R.drawable.high_street_phoenix_market_mumbai), 4.5f));
        myDataSet.add(new Hotels("R City Mall", getResources().getDrawable(R.drawable.r_city_mall_mumbai), 4.5f));
        myDataSet.add(new Hotels("Infiniti Mall", getResources().getDrawable(R.drawable.infiniti_mall_mumbai), 4.2f));
        myDataSet.add(new Hotels("Oberoi Mall", getResources().getDrawable(R.drawable.oberoi_mall_mumbai), 4.4f));
    }
}
