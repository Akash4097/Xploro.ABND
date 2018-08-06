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
        myDataSet.add(new Places("Sahara Start Hotel",
                                 "5 Star", "http://www.saharastar.com",
                                 " Opp Domestic Airport, Mumbai, Maharashtra 400099",
                                  getResources().getDrawable(R.drawable.sahara_stat_hotel_mumbai),4.4F, "022 3980 7444"));
        myDataSet.add(new Places("The Orchid Hotel Mumbai Vile Parle","5 Start","http://www.orchidhotel.com/mumbai-vile-parle/",
                                  "70-C, Nehru Road, Near Mumbai Domestic Airport, Vile Parle (E), Mumbai, Maharashtra 400099",
                                  getResources().getDrawable(R.drawable.orchid_hotel_mumbai),4.2f,"022 2616 4000"));
        myDataSet.add(new Places("The Oberoi, Mumbai","5 Star","https://www.oberoihotels.com/hotels-in-mumbai/?utm_source=GMBlisting&utm_medium=organic",
                                  "Nariman Point, Mumbai, Maharashtra 400021",getResources().getDrawable(R.drawable.the_oberoi_hotel_mumbai),
                                 4.6f,"022 6632 5757"));
        myDataSet.add(new Places("Grand Hyatt Mumbai","5 Star","https://mumbai.grand.hyatt.com/en/hotel/home.html",
                                 " Bandra Kurla Complex Vicinity, Off Western Express Highway, Santacruz East, Mumbai, Maharashtra 400055",
                                  getResources().getDrawable(R.drawable.grand_hyatt_hotel_mumbai),4.5f,"022 6676 1234"));
        myDataSet.add(new Places("Sofitel Mumbai BKC","5 Star","http://www.sofitel-mumbai-bkc.com",
                                 "C 57, BKC Rd, Bandra Kurla Complex, Bandra East, Mumbai, Maharashtra 400051",
                                  getResources().getDrawable(R.drawable.sofitel_hotel_mumbai),4.5f,"022 6117 5000"));
    }
}
