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
    private ArrayList<Places> myDataSet;

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
        myDataSet.add(new Places(getResources().getStringArray(R.array.Inorbit_Mall)[0],
                getResources().getStringArray(R.array.Inorbit_Mall)[1],
                getResources().getStringArray(R.array.Inorbit_Mall)[2],
                getResources().getDrawable(R.drawable.inorbit_mall_mumbai),
                4.3F, getResources().getStringArray(R.array.Inorbit_Mall)[3]));
        myDataSet.add(new Places(getResources().getStringArray(R.array.Phoenix_Mall)[0],
                getResources().getStringArray(R.array.Phoenix_Mall)[1],
                getResources().getStringArray(R.array.Phoenix_Mall)[2],
                getResources().getDrawable(R.drawable.high_street_phoenix_market_mumbai),
                4.5f,getResources().getStringArray(R.array.Phoenix_Mall)[3]));
        myDataSet.add(new Places(getResources().getStringArray(R.array.City_Mall)[0],
                getResources().getStringArray(R.array.City_Mall)[1],
                getResources().getStringArray(R.array.City_Mall)[2],
                getResources().getDrawable(R.drawable.r_city_mall_mumbai),
                4.5f, getResources().getStringArray(R.array.City_Mall)[3]));
        myDataSet.add(new Places(getResources().getStringArray(R.array.Infiniti_Mall)[0],
                getResources().getStringArray(R.array.Infiniti_Mall)[1],
                getResources().getStringArray(R.array.Infiniti_Mall)[2],
                getResources().getDrawable(R.drawable.infiniti_mall_mumbai),
                4.2f, getResources().getStringArray(R.array.Infiniti_Mall)[3]));
        myDataSet.add(new Places(getResources().getStringArray(R.array.Oberoi_Mall)[0],
                getResources().getStringArray(R.array.Infiniti_Mall)[1],
                getResources().getStringArray(R.array.Infiniti_Mall)[2],
                getResources().getDrawable(R.drawable.oberoi_mall_mumbai),
                4.4f, getResources().getStringArray(R.array.Infiniti_Mall)[3]));
    }
}
