package com.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.nestedrecyclerviewtesting.R;
import com.model.Plant;

import java.util.ArrayList;

public class ImageGVAdapter extends ArrayAdapter<Plant> {

    public ImageGVAdapter(@NonNull Context context, ArrayList<Plant>optionsModelArrayList) {
        super(context, 0,optionsModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;
        if (listitemView == null) {
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_gridview, parent, false);
        }
        Plant optionsModel = getItem(position);
        TextView Name = listitemView.findViewById(R.id.recommend_items_title);
        TextView country = listitemView.findViewById(R.id.recommend_items_country);
        TextView price = listitemView.findViewById(R.id.recommend_items_price);
        ImageView optionsIV = listitemView.findViewById(R.id.recommend_items_picture);

        Name.setText(optionsModel.getPlantName());
        country.setText(optionsModel.getPlantCountry());
        price.setText(optionsModel.getPlantPrice());
        optionsIV.setImageResource(optionsModel.getPlantImage());
        return listitemView;


    }
}
