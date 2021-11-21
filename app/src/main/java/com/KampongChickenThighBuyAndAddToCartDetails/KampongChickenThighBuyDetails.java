package com.KampongChickenThighBuyAndAddToCartDetails;

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

import com.KampongChickenFeetBuyAndAddToCartDetails.KampongChickenFeetBuyDetails;
import com.example.nestedrecyclerviewtesting.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class KampongChickenThighBuyDetails extends AppCompatActivity {
    Button btnBuy,btnAddToCart,btn;
    ImageView imgArrowBack;
    TextView tv300g,tv400g,tv500g,tv600g,tv700g,tv800g,tv900g,tv1kg;

    private FirebaseFirestore db;
    private CollectionReference colRef;
    private DocumentReference docRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kampong_chicken_thigh_buy_details);
        imgArrowBack = findViewById(R.id.backarrow);

        btnBuy = findViewById(R.id.BtnBuy);
        btnAddToCart = findViewById(R.id.BtnAddToCart);

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
                int selectedButtonId = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(R.id.selected);
                Toast.makeText(KampongChickenThighBuyDetails.this,rb.getText(),Toast.LENGTH_LONG).show();
            }
        });


        imgArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tv300g = findViewById(R.id.KampongChickenThigh300g);
        tv400g = findViewById(R.id.KampongChickenThigh400g);
        tv500g = findViewById(R.id.KampongChickenThigh500g);
        tv600g = findViewById(R.id.KampongChickenThigh600g);
        tv700g = findViewById(R.id.KampongChickenThigh700g);
        tv800g = findViewById(R.id.KampongChickenThigh800g);
        tv900g = findViewById(R.id.KampongChickenThigh900g);
        tv1kg = findViewById(R.id.KampongChickenThigh1kg);

        db = FirebaseFirestore.getInstance();

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        DatabaseReference databaseReference = firebaseDatabase.getReference();


        colRef = db.collection("kampongchickenthigh");
        docRef = colRef.document("kampongchickenthigh300gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenthigh300gprice");
                    tv300g.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenthigh");
        docRef = colRef.document("kampongchickenthigh400gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenthigh400gprice");
                    tv400g.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenthigh");
        docRef = colRef.document("kampongchickenthigh500gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenthigh500gprice");
                    tv500g.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenthigh");
        docRef = colRef.document("kampongchickenthigh600gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenthigh600gprice");
                    tv600g.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenthigh");
        docRef = colRef.document("kampongchickenthigh700gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenthigh700gprice");
                    tv700g.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenthigh");
        docRef = colRef.document("kampongchickenthigh800gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenthigh800gprice");
                    tv800g.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenthigh");
        docRef = colRef.document("kampongchickenthigh900gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenthigh900gprice");
                    tv900g.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenthigh");
        docRef = colRef.document("kampongchickenthigh1kgprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenthigh1kgprice");
                    tv1kg.setText(text);
                }
            }
        });
    }
}

