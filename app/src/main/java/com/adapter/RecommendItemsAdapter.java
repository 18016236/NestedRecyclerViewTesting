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

public class RecommendItemsAdapter extends RecyclerView.Adapter<RecommendItemsAdapter.ViewHolder> {

    private Context context;
    private List<Plant> recommendList;

    public RecommendItemsAdapter(Context context, List<Plant> recommendList) {
        this.context = context;
        this.recommendList = recommendList;
    }

    @NonNull
    @Override
    public RecommendItemsAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recommend_items,parent,false);
        return new RecommendItemsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( RecommendItemsAdapter.ViewHolder holder, int position) {
        holder.itemsImage.setImageResource(recommendList.get(position).getPlantImage());
        holder.itemName.setText(recommendList.get(position).getPlantName());
        holder.ItemPrice.setText(recommendList.get(position).getPlantPrice());
        holder.itemCountry.setText(recommendList.get(position).getPlantCountry());
    }

    @Override
    public int getItemCount() {
        return recommendList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView itemsImage;
        private TextView itemName,ItemPrice,itemCountry;

        public ViewHolder( View itemView) {
            super(itemView);
            itemsImage = itemView.findViewById(R.id.recommend_items_picture);
            itemName = itemView.findViewById(R.id.recommend_items_title);
            ItemPrice = itemView.findViewById(R.id.recommend_items_price);
            itemCountry = itemView.findViewById(R.id.recommend_items_country);
        }
    }
}
