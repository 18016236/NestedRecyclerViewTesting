package com.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedrecyclerviewtesting.MoreActivities;
import com.example.nestedrecyclerviewtesting.R;
import com.model.Group;
import com.model.Plant;

import java.util.List;

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.ViewHolder> {
    private Context context;
    private List<Group>groupList;
    private List<Plant>featuredList;
    private List<Plant>recommendList;
    private Button btnMore;

    public GroupAdapter(Context context, List<Group> groupList, List<Plant> featuredList, List<Plant> recommendList) {
        this.context = context;
        this.groupList = groupList;
        this.featuredList = featuredList;
        this.recommendList = recommendList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.group_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  GroupAdapter.ViewHolder holder, int position) {
        holder.groupTitle.setText(groupList.get(position).getGroupTitle());
        holder.groupButton.setText(groupList.get(position).getGroupButtonTitle());
        holder.setList(holder.recyclerView,position);
    }

    @Override
    public int getItemCount() {
        return groupList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView groupTitle;
        private AppCompatButton groupButton;
        private RecyclerView recyclerView;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);

            groupTitle = itemView.findViewById(R.id.group_title);
            groupButton = itemView.findViewById(R.id.group_button);
            recyclerView = itemView.findViewById(R.id.group_RV);

            groupButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(context, MoreActivities.class);
                    context.startActivity(i);
                }
            });
        }

        public void setList(RecyclerView recyclerView , int position){
            switch (position){
                case 0:
                    setRecommendList(recyclerView);
                    break;
                case 1:
                    setFeaturedList(recyclerView);
                    break;
            }
        }
    }

    private void setFeaturedList(RecyclerView recyclerView) {
    RecommendItemsAdapter adapter = new RecommendItemsAdapter(context,recommendList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(true);
    }

    private void setRecommendList(RecyclerView recyclerView) {
        FeaturedItemsAdapters adapter = new FeaturedItemsAdapters(context,featuredList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(true);
    }
}
