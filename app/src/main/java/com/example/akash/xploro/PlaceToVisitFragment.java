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
        myDataSet.add(new Places("Gateway of India","Historical place","Gateway of India",
                                 "Apollo Bandar, Colaba, Mumbai, Maharashtra 400001",
                                  getResources().getDrawable(R.drawable.gateway), 4.6F,null));
        myDataSet.add(new Places("Chhatrapati Shivaji Maharaj Vastu Sangrahalaya","Museum","http://www.csmvs.in",
                                 "159-161, Mahatma Gandhi Road, Kala Ghoda, Fort, Mumbai, Maharashtra 400023",
                                  getResources().getDrawable(R.drawable.mumbai_chhatrapati_shivaji_maharaj_vastu_sangralaya), 4.5f,"022 2284 4484"));
        myDataSet.add(new Places("Haji Ali Dargah","Mosque","http://www.hajialidargah.in",
                                 "Dargah Rd, Haji Ali, Mumbai, Maharashtra",
                                  getResources().getDrawable(R.drawable.haji_ali_mumbai), 4.4f,"022 2352 9082"));
        myDataSet.add(new Places("EsselWorld","Amusement park","http://www.esselworld.in/travel/home",
                                 "Global Pagoda Road, Essel world Amusement Park, Borivali West, Mumbai, Maharashtra 400091",
                                  getResources().getDrawable(R.drawable.esselworld_mumbai), 4.4f,"022 2845 2222"));
        myDataSet.add(new Places("Jehangir Art Gallery","Art Gallery","https://jehangirartgallery.com",
                                 "161B, Mahatma Gandhi Road, Kala Ghoda, Fort, Mumbai, Maharashtra 400001",
                                  getResources().getDrawable(R.drawable.jehanigair_mumbai), 4.5f,"022 2284 3989"));
    }
}
