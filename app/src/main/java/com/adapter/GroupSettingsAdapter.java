package com.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedrecyclerviewtesting.R;
import com.model.Group;
import com.model.Plant;

import java.util.List;

public class GroupSettingsAdapter extends RecyclerView.Adapter<GroupSettingsAdapter.ViewHolder> {
    private Context context;
    private List<Group> groupList;
    private List<Plant>recommendList;

    public GroupSettingsAdapter(Context context, List<Group> groupList, List<Plant> recommendList) {
        this.context = context;
        this.groupList = groupList;
        this.recommendList = recommendList;
    }

    @NonNull

    @Override
    public GroupSettingsAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.group_item,parent,false);
        return new GroupSettingsAdapter.ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView groupTitle;
        private AppCompatButton groupButton;
        private RecyclerView recyclerView;

        public ViewHolder( View itemView) {
            super(itemView);
            groupTitle = itemView.findViewById(R.id.group_title);
            groupButton = itemView.findViewById(R.id.group_button);
            recyclerView = itemView.findViewById(R.id.group_RV);
        }
        public void setList(RecyclerView recyclerView , int position){
            switch (position){
                case 0:
                    setRecommendList(recyclerView);
                    break;

            }
        }
    }

    @Override
    public void onBindViewHolder(GroupSettingsAdapter.ViewHolder holder, int position) {
        holder.groupTitle.setText(groupList.get(position).getGroupTitle());
        holder.groupButton.setText(groupList.get(position).getGroupButtonTitle());
        holder.setList(holder.recyclerView,position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private void setRecommendList(RecyclerView recyclerView) {
        RecommendItemsAdapter adapter = new RecommendItemsAdapter(context,recommendList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(true);
    }
}
