package com.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedrecyclerviewtesting.R;
import com.model.Plant;

import java.util.List;

public class FeaturedItemsAdapters extends RecyclerView.Adapter<FeaturedItemsAdapters.ViewHolder> {

    private Context context;
    private List<Plant>featuredList;

    public FeaturedItemsAdapters(Context context, List<Plant> featuredList) {
        this.context = context;
        this.featuredList = featuredList;
    }

    @NonNull
    @Override
    public FeaturedItemsAdapters.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.featured_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedItemsAdapters.ViewHolder holder, int position) {

        holder.itemsImage.setImageResource(featuredList.get(position).getPlantImage());
        holder.itemName.setText(featuredList.get(position).getPlantName());
        holder.ItemPrice.setText(featuredList.get(position).getPlantPrice());
        holder.itemCountry.setText(featuredList.get(position).getPlantCountry());
    }

    @Override
    public int getItemCount() {
        return featuredList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView itemsImage;
        private TextView itemName,ItemPrice,itemCountry;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);

            itemsImage = itemView.findViewById(R.id.featured_items_picture);
            itemName = itemView.findViewById(R.id.featured_items_title);
            ItemPrice = itemView.findViewById(R.id.featured_items_price);
            itemCountry = itemView.findViewById(R.id.featured_items_country);
        }
    }
}
