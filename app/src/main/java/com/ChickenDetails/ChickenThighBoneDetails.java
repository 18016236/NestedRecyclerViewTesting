package com.ChickenDetails;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ChickenFilletBuyAndAddToCartDetails.ChickenFilletBuyDetails;
import com.ChickenThighBoneBuyAndAddToCartDetails.ChickenThighBoneBuyDetails;
import com.example.nestedrecyclerviewtesting.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class ChickenThighBoneDetails extends AppCompatActivity {
    ImageView ivArrowBack;

    TextView tvchickenthighboneprice;

    Button btnBuy, btnAddToCart;

    private FirebaseFirestore db;
    private CollectionReference colRef;
    private DocumentReference docRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken_thigh_bone_details);

        ivArrowBack = findViewById(R.id.backarrow);

        btnAddToCart = findViewById(R.id.BtnAddToCart);

        btnBuy = findViewById(R.id.BtnBuy);

        ivArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        tvchickenthighboneprice = findViewById(R.id.chickenthighboneprice);

        db = FirebaseFirestore.getInstance();

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        DatabaseReference databaseReference = firebaseDatabase.getReference();

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ChickenThighBoneDetails.this, ChickenThighBoneBuyDetails.class);
                startActivity(i);
            }
        });

        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ChickenThighBoneDetails.this, ChickenThighBoneBuyDetails.class);
                startActivity(i);
            }
        });

        colRef = db.collection("chickenthighbone");
        docRef = colRef.document("chickenthighboneprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error != null) {
                    return;
                }
                if (value != null && value.exists()) {
                    String text = (String) value.get("chickenthighboneprice");
                    tvchickenthighboneprice.setText(text);
                }
            }
        });
    }

}

