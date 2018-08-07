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
public class HotelsFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Places> myDataSet;

    public HotelsFragment() {
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
        myDataSet.add(new Places(getResources().getStringArray(R.array.Sahara_Hotel)[0],
                getResources().getStringArray(R.array.Sahara_Hotel)[1],
                getResources().getStringArray(R.array.Sahara_Hotel)[2],
                getResources().getDrawable(R.drawable.sahara_star_hotel_mumbai), 4.4F,
                getResources().getStringArray(R.array.Sahara_Hotel)[3]));
        myDataSet.add(new Places(getResources().getStringArray(R.array.Orchid_Hotel)[0],
                getResources().getStringArray(R.array.Orchid_Hotel)[1],
                getResources().getStringArray(R.array.Orchid_Hotel)[2],
                getResources().getDrawable(R.drawable.orchid_hotel_mumbai), 4.2f,
                getResources().getStringArray(R.array.Orchid_Hotel)[3]));
        myDataSet.add(new Places(getResources().getStringArray(R.array.Oberoi_Hotel)[0],
                getResources().getStringArray(R.array.Oberoi_Hotel)[1],
                getResources().getStringArray(R.array.Oberoi_Hotel)[2],
                getResources().getDrawable(R.drawable.the_oberoi_hotel_mumbai),
                4.6f, getResources().getStringArray(R.array.Oberoi_Hotel)[3]));
        myDataSet.add(new Places(getResources().getStringArray(R.array.Hyatt_Hotel)[0],
                getResources().getStringArray(R.array.Hyatt_Hotel)[1],
                getResources().getStringArray(R.array.Hyatt_Hotel)[2],
                getResources().getDrawable(R.drawable.grand_hyatt_hotel_mumbai), 4.5f,
                getResources().getStringArray(R.array.Hyatt_Hotel)[3]));
        myDataSet.add(new Places(getResources().getStringArray(R.array.Sofitel_Hotel)[0],
                getResources().getStringArray(R.array.Sofitel_Hotel)[1],
                getResources().getStringArray(R.array.Sofitel_Hotel)[2],
                getResources().getDrawable(R.drawable.sofitel_hotel_mumbai),
                4.5f, getResources().getStringArray(R.array.Sofitel_Hotel)[3]));
    }
}
