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
        myDataSet.add(new Places("Celini","Italian Restaurant","https://mumbai.grand.hyatt.com/en/hotel/dining/Celini.html",
                                 "BKC Vicinity, Off Western Express Highway, Santacruz East, Mumbai, Maharashtra 400055",
                                 getResources().getDrawable(R.drawable.celini_restaurant_mumbai), 4.4F,"022 6676 1149"));
        myDataSet.add(new Places("ITC Maratha, Pan Asian","Asian Restaurant","https://www.itchotels.in/hotels/mumbai/itcmaratha/dining/pan-asian.html?utm_source=google&utm_medium=organic%20Search&utm_term=itcmaratha%20Restaurants&utm_campaign=listing",
                                 " Sahar Airport Road, Near International Airport, Andheri (East), Mumbai, Maharashtra 400099",
                                  getResources().getDrawable(R.drawable.pan_asian_restaurant_mumbai), 4.3f,"022 2830 3030"));
        myDataSet.add(new Places("ITC Maratha, Dum Pukht","Indian Restaurant","https://www.itchotels.in/hotels/mumbai/itcmaratha/dining/dum-pukht.html?utm_source=google&utm_medium=organic%20Search&utm_term=itcmaratha%20Restaurants&utm_campaign=listing",
                                 "Lobby Level, ITC Maratha, Sahar Airport Road, Near International Airport, Andheri East, Mumbai, Maharashtra 400099",
                                  getResources().getDrawable(R.drawable.dum_pukht_restaurant_mumbai), 4.1f,"022 2830 3030"));
        myDataSet.add(new Places("Trishna","Seafood Restaurant","http://trishna.co.in",
                                 "7, Saibaba Rd, Kala Ghoda, Fort, Mumbai, Maharashtra 400001",
                                  getResources().getDrawable(R.drawable.trishna_restaurant_mumbai), 4.5f,"022 2270 3213"));
        myDataSet.add(new Places("Mirchi & Mime","Indian Restaurant","http://mirchiandmime.com/home/",
                                 "Trans Ocean House, Hiranandani Gardens, MHADA Colony 19, Powai, Mumbai, Maharashtra 400076",
                                  getResources().getDrawable(R.drawable.mirchi_n_mime_restaurant_mumbai), 4.5f,"022 4141 5151"));
    }
}
