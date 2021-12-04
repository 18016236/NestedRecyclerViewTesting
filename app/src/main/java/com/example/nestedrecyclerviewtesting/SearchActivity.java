package com.example.nestedrecyclerviewtesting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.Products;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class SearchActivity extends AppCompatActivity {

    private EditText etSearchField;
    private ImageButton SearchButton;

    private RecyclerView ResultsList;

    private DatabaseReference mUserDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mUserDatabase = FirebaseDatabase.getInstance().getReference("Items");

        etSearchField = (EditText) findViewById(R.id.search_field2);
        SearchButton = (ImageButton) findViewById(R.id.search_btn2);

        ResultsList = (RecyclerView) findViewById(R.id.searchDetails2);
        ResultsList.setHasFixedSize(true);
        ResultsList.setLayoutManager(new LinearLayoutManager(this));

        SearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchText = etSearchField.getText().toString();

                FirebaseUserSearch(searchText);
            }
        });

    }

    private void FirebaseUserSearch(String searchText){
        Toast.makeText(SearchActivity.this,"Started Search",Toast.LENGTH_LONG).show();

        Query firebaseSearchQuery = mUserDatabase.orderByChild("name").startAt(searchText).endAt(searchText + "\uf8ff");

        FirebaseRecyclerAdapter<Products,UsersViewHolder>firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Products, UsersViewHolder>(
                Products.class,
                R.layout.list_layout,
                UsersViewHolder.class,
                mUserDatabase

        ) {
            @Override
            protected void populateViewHolder(UsersViewHolder usersViewHolder, Products products, int i) {
                usersViewHolder.SetDetails(getApplicationContext(),products.getName(),products.getStatus(),products.getImage());
            }
        };
        ResultsList.setAdapter(firebaseRecyclerAdapter);
    }

    public static class UsersViewHolder extends RecyclerView.ViewHolder{
        View mView;
        public UsersViewHolder( View itemView) {
            super(itemView);

            mView = itemView;
        }
        public  void SetDetails(Context ctx, String productName, String productDetails, String productImage){
            TextView product_name = (TextView)mView.findViewById(R.id.product_name);
            TextView product_Details = (TextView)mView.findViewById(R.id.product_details);
            ImageView product_image = (ImageView)mView.findViewById(R.id.profile_image);

            product_name.setText(productName);
            product_Details.setText(productDetails);

            Glide.with(ctx).load(productImage).into(product_image);
        }
    }
}