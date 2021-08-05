package com.VegetablesDetails;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nestedrecyclerviewtesting.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class WhiteShimeijiMushroomDetails extends AppCompatActivity {
    ImageView ivArrowBack;

    TextView tvWhiteShimeijimushroomsprice;

    Button btnBuy, btnAddToCart;

    private FirebaseFirestore db;
    private CollectionReference colRef;
    private DocumentReference docRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_white_shimeiji_mushroom_details);
        ivArrowBack = findViewById(R.id.backarrow);

        btnAddToCart = findViewById(R.id.BtnAddToCart);

        btnBuy = findViewById(R.id.BtnBuy);

        ivArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        tvWhiteShimeijimushroomsprice = findViewById(R.id.WhiteShimeijiMushroomsPrice);

        db = FirebaseFirestore.getInstance();

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        DatabaseReference databaseReference = firebaseDatabase.getReference();


        colRef = db.collection("whiteshimeijimushroom");
        docRef = colRef.document("whiteshimeijimushroomprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error != null) {
                    return;
                }
                if (value != null && value.exists()) {
                    String text = (String) value.get("whiteshimeijimushroomprice");
                    tvWhiteShimeijimushroomsprice.setText(text);
                }
            }
        });
    }



}