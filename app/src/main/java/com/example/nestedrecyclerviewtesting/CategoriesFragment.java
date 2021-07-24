package com.example.nestedrecyclerviewtesting;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.gridlayout.widget.GridLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.Categories.Chicken;
import com.Categories.FishAndSeaFood;
import com.Categories.Fruit;
import com.Categories.Noodles;
import com.Categories.Pork;
import com.Categories.SauceAndPaste;
import com.Categories.Vegetables;
import com.Categories.YongTaoFoo;
import com.example.nestedrecyclerviewtesting.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class CategoriesFragment extends Fragment {

    CardView cvSauceAndPaste,cvVegetables,cvChicken,cvFishAndSeafood,cvYongTaoFoo,cvFruit,cvNoodles,cvPork;
   Spinner spnButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_categories, container, false);

        cvSauceAndPaste = view.findViewById(R.id.cLSauceAndPaste);
       cvVegetables = view.findViewById(R.id.cLVegetables);
        cvChicken = view.findViewById(R.id.cLChicken);
        cvFishAndSeafood = view.findViewById(R.id.cLFishAndSeafood);
        cvYongTaoFoo = view.findViewById(R.id.cLYongTaoFoo);
        cvFruit = view.findViewById(R.id.cLFruit);
        cvNoodles = view.findViewById(R.id.cLNoodles);
        cvPork = view.findViewById(R.id.cLPork);

        cvSauceAndPaste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoriesFragment.this.getActivity(),SauceAndPaste.class);
                startActivity(i);
            }
        });

        cvVegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoriesFragment.this.getActivity(), Vegetables.class);
                startActivity(i);
            }
        });

        cvChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoriesFragment.this.getActivity(), Chicken.class);
                startActivity(i);
            }
        });

        cvFishAndSeafood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoriesFragment.this.getActivity(), FishAndSeaFood.class);
                startActivity(i);
            }
        });

        cvYongTaoFoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoriesFragment.this.getActivity(), YongTaoFoo.class);
                startActivity(i);
            }
        });


        cvFruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoriesFragment.this.getActivity(), Fruit.class);
                startActivity(i);
            }
        });


        cvNoodles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoriesFragment.this.getActivity(), Noodles.class);
                startActivity(i);
            }
        });


        cvPork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoriesFragment.this.getActivity(), Pork.class);
                startActivity(i);
            }
        });


        return view;
    }



}