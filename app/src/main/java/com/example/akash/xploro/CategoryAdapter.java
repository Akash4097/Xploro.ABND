package com.example.akash.xploro;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private ArrayList<Hotels> data;
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView,ratingValue;
        public ImageView imageView;
        public RatingBar ratingBar;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.category_name_text_view);
            imageView = itemView.findViewById(R.id.itemsThumbnail);
            ratingBar = itemView.findViewById(R.id.rating);
            ratingValue = itemView.findViewById(R.id.rating_value_text_view);
        }
    }

    public CategoryAdapter(ArrayList<Hotels> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_list_item_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Hotels hotels = data.get(position);
        holder.textView.setText(hotels.getHotelName());
        holder.imageView.setImageDrawable(hotels.getHotelPic());
        holder.ratingBar.setRating(hotels.getRatings());
        holder.ratingValue.setText("(" + hotels.getRatings() + ")");
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
