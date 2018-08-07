package com.example.akash.xploro;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private ArrayList<Places> data;
    private static int selected_position;
    private static int previous_position;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView textView, ratingValue;
        public ImageView imageView;
        public RatingBar ratingBar;
        public Button buttonMore, buttonWeb, buttonDirection, buttonPhone;
        public RelativeLayout hiddenLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.category_name_text_view);
            imageView = itemView.findViewById(R.id.itemsThumbnail);
            ratingBar = itemView.findViewById(R.id.rating);
            ratingValue = itemView.findViewById(R.id.rating_value_text_view);
            buttonMore = itemView.findViewById(R.id.button_more);
            hiddenLayout = itemView.findViewById(R.id.hidden_layout);
            buttonWeb = itemView.findViewById(R.id.button_web);
            buttonDirection = itemView.findViewById(R.id.button_direction);
            buttonPhone = itemView.findViewById(R.id.button_phone);

            buttonMore.setOnClickListener(this);
            buttonWeb.setOnClickListener(this);
            buttonPhone.setOnClickListener(this);
            buttonDirection.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == buttonMore.getId()) {
                if (getAdapterPosition() == RecyclerView.NO_POSITION) {
                    return;
                }

                if (!data.get(getAdapterPosition()).isSelected()) {
                    previous_position = selected_position;
                    selected_position = getAdapterPosition();

                    data.get(previous_position).setSelected(false);
                    data.get(selected_position).setSelected(true);

                    notifyItemChanged(previous_position);
                    notifyItemChanged(selected_position);

                } else {
                    data.get(selected_position).setSelected(false);
                    notifyItemChanged(selected_position);
                }
            }

            if (v.getId() == buttonWeb.getId()) {
                Uri webpage = Uri.parse(data.get(getAdapterPosition()).getWebAddress());
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(v.getContext().getPackageManager()) != null) {
                    v.getContext().startActivity(intent);
                }
            }

            if (v.getId() == buttonDirection.getId()) {
                Uri gmmIntentUri = Uri.parse(v.getContext().getResources().getString(R.string.geo_data) + data.get(getAdapterPosition()).getPhysicalAddress());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                if (mapIntent.resolveActivity(v.getContext().getPackageManager()) != null) {
                    mapIntent.setPackage(v.getContext().getResources().getString(R.string.package_name));
                    v.getContext().startActivity(mapIntent);
                } else {
                    Toast toast = Toast.makeText(v.getContext(), R.string.warning_msg, Toast.LENGTH_SHORT);
                    toast.show();
                }

            }

            if (v.getId() == buttonPhone.getId()) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(v.getContext().getResources().getString(R.string.phone_prefix) + data.get(getAdapterPosition()).getPhone()));
                if (intent.resolveActivity(v.getContext().getPackageManager()) != null) {
                    v.getContext().startActivity(intent);
                }
            }
        }
    }

    public CategoryAdapter(ArrayList<Places> data) {
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
        Places hotels = data.get(position);
        holder.textView.setText(hotels.getPlaceName());
        holder.imageView.setImageDrawable(hotels.getPlacePic());
        holder.ratingBar.setRating(hotels.getRatings());
        holder.ratingValue.setText("(" + hotels.getRatings() + ")");

        if (hotels.isSelected()) {
            holder.hiddenLayout.setVisibility(View.VISIBLE);
        } else {
            holder.hiddenLayout.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
