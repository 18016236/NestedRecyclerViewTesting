package com.KampongChickenWingBuyAndAddToCartDetails;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.KampongChickenThighBuyAndAddToCartDetails.KampongChickenThighBuyDetails;
import com.example.nestedrecyclerviewtesting.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class KampongChickenWingBuyDetails extends AppCompatActivity {
    Button btnBuy,btnAddToCart,btn;
    ImageView imgArrowBack;
    TextView tv300g,tv400g,tv500g,tv600g,tv700g,tv800g,tv900g,tv1kg;

    private FirebaseFirestore db;
    private CollectionReference colRef;
    private DocumentReference docRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kampong_chicken_wing_buy_details);
        imgArrowBack = findViewById(R.id.backarrow);

        btnBuy = findViewById(R.id.BtnBuy);
        btnAddToCart = findViewById(R.id.BtnAddToCart);

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
                int selectedButtonId = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(R.id.selected);
                Toast.makeText(KampongChickenWingBuyDetails.this,rb.getText(),Toast.LENGTH_LONG).show();
            }
        });


        imgArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tv300g = findViewById(R.id.KampongChickenWings300g);
        tv400g = findViewById(R.id.KampongChickenWings400g);
        tv500g = findViewById(R.id.KampongChickenWings500g);
        tv600g = findViewById(R.id.KampongChickenWings600g);
        tv700g = findViewById(R.id.KampongChickenWings700g);
        tv800g = findViewById(R.id.KampongChickenWings800g);
        tv900g = findViewById(R.id.KampongChickenWings900g);
        tv1kg = findViewById(R.id.KampongChickenWings1kg);

        db = FirebaseFirestore.getInstance();

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        DatabaseReference databaseReference = firebaseDatabase.getReference();


        colRef = db.collection("kampongchickenwings");
        docRef = colRef.document("kampongchickenwings300gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenwings300gprice");
                    tv300g.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenwings");
        docRef = colRef.document("kampongchickenwings400gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenwings400gprice");
                    tv400g.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenwings");
        docRef = colRef.document("kampongchickenwings500gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenwings500gprice");
                    tv500g.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenwings");
        docRef = colRef.document("kampongchickenwings600gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenwings600gprice");
                    tv600g.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenwings");
        docRef = colRef.document("kampongchickenwings700gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenwings700gprice");
                    tv700g.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenwings");
        docRef = colRef.document("kampongchickenwings800gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenwings800gprice");
                    tv800g.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenwings");
        docRef = colRef.document("kampongchickenwings900gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenwings900gprice");
                    tv900g.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenwings");
        docRef = colRef.document("kampongchickenwings1kgprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenwings1kgprice");
                    tv1kg.setText(text);
                }
            }
        });
    }
}

