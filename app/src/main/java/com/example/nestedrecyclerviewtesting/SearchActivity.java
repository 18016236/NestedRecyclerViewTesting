package com.example.nestedrecyclerviewtesting;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.ExampleAdapter;
import com.example.ExampleItem;
import com.example.Products;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.WriteBatch;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchActivity extends AppCompatActivity {

    private EditText etSearchField;
    private ImageButton SearchButton;
    ArrayList<String>names;
    private ArrayList<ExampleItem>mExampleList;

    private RecyclerView ResultsList;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private FirebaseFirestore db;
    private FirebaseAuth mAuth;
    private DatabaseReference mUserDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        
        createExampleList();
        buildRecyclerView();

        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();



        etSearchField = findViewById(R.id.search_field2);


        etSearchField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });


    }

    private void filter(String text) {
        ArrayList<ExampleItem>filteredList = new ArrayList<>();

        for (ExampleItem item : mExampleList){
            if (item.getmText1().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }

    private void buildRecyclerView() {
        ResultsList = findViewById(R.id.searchDetails2);
        ResultsList.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList);

        ResultsList.setLayoutManager(mLayoutManager);
        ResultsList.setAdapter(mAdapter);
    }

    private void createExampleList() {
        mExampleList = new ArrayList<>();
        mExampleList.add(new ExampleItem(R.drawable.kamheongpaste,"Kam Heong Paste","$3.50"));
        mExampleList.add(new ExampleItem(R.drawable.marmitesauce,"Marmite Sauce","$3.50"));
        mExampleList.add(new ExampleItem(R.drawable.anchovysambal,"Anchovy Sambal","$3.50"));
        mExampleList.add(new ExampleItem(R.drawable.tomyumpaste,"Tom Yum  Paste","$3.80"));
        mExampleList.add(new ExampleItem(R.drawable.singaporelaskapaste,"Singapore Laksa Paste","$4.00"));
        mExampleList.add(new ExampleItem(R.drawable.currylontongvegetablepaste,"Curry Lontong Vegetable Paste","$4.00"));
        mExampleList.add(new ExampleItem(R.drawable.rendangpaste,"Rendang Paste","$4.00"));
        mExampleList.add(new ExampleItem(R.drawable.singaporecurrychickenpaste,"Singapore Curry Chicken Paste","$4.00"));
        mExampleList.add(new ExampleItem(R.drawable.nissinyuzukoshoajikaraagekojapanesefriedchickenpowder100g,"Nissin Yuzu Kosho Aji Karaage ko Japanese Fried Chicken Powder 100g  ","$3.45"));
        mExampleList.add(new ExampleItem(R.drawable.sesameoil,"Sesame Oil","$12.50"));
        mExampleList.add(new ExampleItem(R.drawable.blackvinegar750ml,"Black Vinegar 750ml","$7.50"));
        mExampleList.add(new ExampleItem(R.drawable.blackvinegar350ml,"Black Vinegar 350ml","$4.50"));
        mExampleList.add(new ExampleItem(R.drawable.darksoysauce750ml,"Dark Soy Sauce 750ml","$10.50"));
        mExampleList.add(new ExampleItem(R.drawable.darksoysauce350ml,"Dark Soy Sauce 350ml","$6.50"));
        mExampleList.add(new ExampleItem(R.drawable.soysauce,"Soy Sauce","$9.50"));
        mExampleList.add(new ExampleItem(R.drawable.mizkangomashabusesamehotpotdippingsauce250ml,"Mizkan Goma Shabu Sesame Hotpot Dipping Sauce 250ml  ","$7.00"));
        mExampleList.add(new ExampleItem(R.drawable.tonkotsuporkramensoupstock500ml,"Tonkotsu Pork Ramen Soup Stock 500ml  ","$6.50"));
        mExampleList.add(new ExampleItem(R.drawable.kara500ml,"Kara 500ml","$2.00"));
        mExampleList.add(new ExampleItem(R.drawable.kara200ml,"Kara 200ml","$1.00"));
        mExampleList.add(new ExampleItem(R.drawable.currylontongvegetablepaste,"Chili Padi 小红辣椒","$0.90"));

    }
}