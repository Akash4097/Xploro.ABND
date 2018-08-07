package com.example.akash.xploro;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private ArrayList<City> mDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // each data item is just a string in this case
        public TextView textView;
        public ImageView imageView;

        public ViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.thumbnailTextView);
            imageView = v.findViewById(R.id.mainThumbnail);
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), TabLayoutActivity.class);
            intent.putExtra(v.getContext().getResources().getString(R.string.title), textView.getText());
            v.getContext().startActivity(intent);
        }
    }

    public MainAdapter(ArrayList<City> myDataSet) {
        mDataSet = myDataSet;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        City city = mDataSet.get(position);
        holder.textView.setText(city.getName());
        holder.imageView.setImageDrawable(city.getThumbnail());
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
