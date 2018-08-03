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
public class PlaceToVisitFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Hotels> myDataSet;

    public PlaceToVisitFragment() {
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
        myDataSet.add(new Hotels("Gateway of India", getResources().getDrawable(R.drawable.gateway), 4.6F));
        myDataSet.add(new Hotels("Chhatrapati Shivaji Maharaj Vastu Sangrahalaya", getResources().getDrawable(R.drawable.mumbai_chhatrapati_shivaji_maharaj_vastu_sangralaya), 4.5f));
        myDataSet.add(new Hotels("Haji Ali Dargah", getResources().getDrawable(R.drawable.haji_ali_mumbai), 4.4f));
        myDataSet.add(new Hotels("EsselWorld", getResources().getDrawable(R.drawable.esselworld_mumbai), 4.4f));
        myDataSet.add(new Hotels("Jehangir Art Gallery", getResources().getDrawable(R.drawable.jehanigair_mumbai), 4.5f));
    }
}
