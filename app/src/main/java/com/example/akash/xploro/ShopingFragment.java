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
        myDataSet.add(new Places("Inorbit Mall Vashi",null,"https://www.inorbit.in",
                                 "Plot No 39/1, Sector 30A, Vashi, Opp Vashi Railway Station, Navi Mumbai, Maharashtra 400705",
                                  getResources().getDrawable(R.drawable.inorbit_mall_mumbai), 4.3F,"022 6777 7666"));
        myDataSet.add(new Places("High Street Phoenix",null,"http://www.highstreetphoenix.com",
                                 "462, Senapati Bapat Marg, Lower Parel, Mumbai, Maharashtra 400013",
                                  getResources().getDrawable(R.drawable.high_street_phoenix_market_mumbai), 4.5f,"022 4333 9994"));
        myDataSet.add(new Places("R City Mall",null,"http://www.rcity.co.in",
                                 " Lal Bahadur Shastri Road, Amrut Nagar, Ghatkopar West, Mumbai, Maharashtra 400086",
                                  getResources().getDrawable(R.drawable.r_city_mall_mumbai), 4.5f,"022 6775 5833"));
        myDataSet.add(new Places("Infiniti Mall",null,"http://www.infinitimall.com",
                                 "New Link Road, Oshiwara, Andheri West, Mumbai, Maharashtra 400053",
                                  getResources().getDrawable(R.drawable.infiniti_mall_mumbai), 4.2f,"022 4244 0000"));
        myDataSet.add(new Places("Oberoi Mall",null,"https://www.oberoimall.com",
                                 "Oberoi Garden City, Western Express Hwy, Yashodham, Goregaon East, Mumbai, Maharashtra 400063",
                                  getResources().getDrawable(R.drawable.oberoi_mall_mumbai), 4.4f,"022 4099 0888"));
    }
}
