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
    private ArrayList<Places> myDataSet;

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
        myDataSet.add(new Places(getResources().getStringArray(R.array.Gateway_of_India)[0],
                getResources().getStringArray(R.array.Gateway_of_India)[1],
                getResources().getStringArray(R.array.Gateway_of_India)[2],
                getResources().getDrawable(R.drawable.gateway),
                4.6F, getResources().getStringArray(R.array.Gateway_of_India)[3]));
        myDataSet.add(new Places(getResources().getStringArray(R.array.Chhatrapati)[0],
                getResources().getStringArray(R.array.Chhatrapati)[1],
                getResources().getStringArray(R.array.Chhatrapati)[2],
                getResources().getDrawable(R.drawable.mumbai_chhatrapati_shivaji_maharaj_vastu_sangralaya),
                4.5f,getResources().getStringArray(R.array.Chhatrapati)[3]));
        myDataSet.add(new Places(getResources().getStringArray(R.array.Haji_Ali_Dargah)[0],
                getResources().getStringArray(R.array.Haji_Ali_Dargah)[1],
                getResources().getStringArray(R.array.Haji_Ali_Dargah)[2],
                getResources().getDrawable(R.drawable.haji_ali_mumbai),
                4.4f,getResources().getStringArray(R.array.Haji_Ali_Dargah)[3]));
        myDataSet.add(new Places(getResources().getStringArray(R.array.EsselWorld)[0],
                getResources().getStringArray(R.array.EsselWorld)[1],
                getResources().getStringArray(R.array.EsselWorld)[2],
                getResources().getDrawable(R.drawable.esselworld_mumbai),
                4.4f,getResources().getStringArray(R.array.EsselWorld)[3]));
        myDataSet.add(new Places(getResources().getStringArray(R.array.Jehangir_Art_Gallery)[0],
                getResources().getStringArray(R.array.Jehangir_Art_Gallery)[1],
                getResources().getStringArray(R.array.Jehangir_Art_Gallery)[2],
                getResources().getDrawable(R.drawable.jehanigair_mumbai),
                4.5f,getResources().getStringArray(R.array.Jehangir_Art_Gallery)[3]));
    }
}
