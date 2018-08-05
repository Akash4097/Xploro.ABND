package com.example.akash.xploro;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentAdapter extends FragmentPagerAdapter {

    private Context context;
    public SimpleFragmentAdapter(Context context,FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new HotelsFragment();
        }else if(position == 1){
            return new RestaurantFragment();
        }else if(position == 2){
            return new ShopingFragment();
        }
        else{
            return new PlaceToVisitFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
//        if(position == 0){
//            return "Places";
//        }else if(position == 1){
//            return "Restaurant";
//        }else if(position == 2){
//            return "Shopping";
//        }
//        else{
//            return "PlaceToVisit";
//        }

        return null;
    }
}
