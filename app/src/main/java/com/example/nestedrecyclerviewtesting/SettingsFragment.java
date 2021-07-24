package com.example.nestedrecyclerviewtesting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.adapter.GroupAdapter;
import com.adapter.GroupSettingsAdapter;
import com.adapter.ImageGVAdapter;
import com.adapter.RecommendItemsAdapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.model.Group;
import com.model.Plant;

import java.util.ArrayList;
import java.util.List;


public class SettingsFragment extends Fragment {

    GridView simpleGrid;
    ImageView IVProfilePic;
    Button userLogout;

    TextView displayName;

    LinearLayout LLPayments;

    FirebaseFirestore db;
    FirebaseUser firebaseUser;
    FirebaseAuth firebaseAuth;

    String userID;


    public SettingsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        IVProfilePic = view.findViewById(R.id.imgUser);
        userLogout = view.findViewById(R.id.btnLogout);
        LLPayments = view.findViewById(R.id.Payments);

        firebaseAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        displayName = view.findViewById(R.id.tv_name);

        userID = firebaseAuth.getCurrentUser().getUid();

        DocumentReference documentReference = db.collection("users").document(userID);
        documentReference.addSnapshotListener(this.getActivity(), new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable  DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                displayName.setText(value.getString("Username"));
            }
        });

        LLPayments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SettingsFragment.this.getActivity(),PaymentOptionsPage.class);
                startActivity(i);
            }
        });

        IVProfilePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SettingsFragment.this.getActivity(),ProfileActivity.class);
                startActivity(i);
            }
        });

        userLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(SettingsFragment.this.getActivity(),ActivityLogin.class));
            }
        });

        return view;
    }





}