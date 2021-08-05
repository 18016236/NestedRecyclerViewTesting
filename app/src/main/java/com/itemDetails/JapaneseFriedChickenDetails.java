package com.itemDetails;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

public class JapaneseFriedChickenDetails extends AppCompatActivity {
    ImageView ivback;

    TextView tvnissinyuzukoshoajikaraagekojapanesefriedchickenpowder100gPrice;

    private FirebaseFirestore db;
    private CollectionReference colRef;
    private DocumentReference docRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanese_fried_chicken_details);
        ivback = findViewById(R.id.backarrow);

        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tvnissinyuzukoshoajikaraagekojapanesefriedchickenpowder100gPrice = findViewById(R.id.nissinyuzukoshoajikaraagekojapanesefriedchickenpowder100gPrice);

        db = FirebaseFirestore.getInstance();

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        DatabaseReference databaseReference = firebaseDatabase.getReference();

        colRef = db.collection("nissinyuzukoshoajikaraagekojapanesefriedchickenpowder100g");
        docRef = colRef.document("nissinyuzukoshoajikaraagekojapanesefriedchickenpowder100gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("nissinyuzukoshoajikaraagekojapanesefriedchickenpowder100gprice");
                    tvnissinyuzukoshoajikaraagekojapanesefriedchickenpowder100gPrice.setText(text);
                }
            }
        });
    }
    }
