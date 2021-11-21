package com.ChickenFeetBuyAndAddToCartDetails;

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

import com.ChickenBreastBoneBuyAndAddToCartDetails.ChickenBreastBoneBuyDetails;
import com.example.nestedrecyclerviewtesting.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class ChickenFeetBuyDetails extends AppCompatActivity {
    Button btnBuy,btnAddToCart,btn;
    ImageView imgArrowBack;
    TextView tv100g,tv200g,tv300g,tv400g,tv500g,tv600g,tv700g,tv800g,tv900g,tv1kg;

    private FirebaseFirestore db;
    private CollectionReference colRef;
    private DocumentReference docRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken_feet_buy_details);

        imgArrowBack = findViewById(R.id.backarrow);

        btnBuy = findViewById(R.id.BtnBuy);
        btnAddToCart = findViewById(R.id.BtnAddToCart);

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
                int selectedButtonId = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(R.id.selected);
                Toast.makeText(ChickenFeetBuyDetails.this,rb.getText(),Toast.LENGTH_LONG).show();
            }
        });


        imgArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tv100g = findViewById(R.id.ChickenFeet100g);
        tv200g = findViewById(R.id.ChickenFeet200g);
        tv300g = findViewById(R.id.ChickenFeet300g);
        tv400g = findViewById(R.id.ChickenFeet400g);
        tv500g = findViewById(R.id.ChickenFeet500g);
        tv600g = findViewById(R.id.ChickenFeet600g);
        tv700g = findViewById(R.id.ChickenFeet700g);
        tv800g = findViewById(R.id.ChickenFeet800g);
        tv900g = findViewById(R.id.ChickenFeet900g);
        tv1kg = findViewById(R.id.ChickenFeet1kg);

        db = FirebaseFirestore.getInstance();

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        DatabaseReference databaseReference = firebaseDatabase.getReference();

        colRef = db.collection("chickenfeet");
        docRef = colRef.document("chickenfeet100gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenfeet100gprice");
                    tv100g.setText(text);
                }
            }
        });

        colRef = db.collection("chickenfeet");
        docRef = colRef.document("chickenfeet200gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenfeet200gprice");
                    tv200g.setText(text);
                }
            }
        });

        colRef = db.collection("chickenfeet");
        docRef = colRef.document("chickenfeet300gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenfeet300gprice");
                    tv300g.setText(text);
                }
            }
        });

        colRef = db.collection("chickenfeet");
        docRef = colRef.document("chickenfeet400gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenfeet400gprice");
                    tv400g.setText(text);
                }
            }
        });

        colRef = db.collection("chickenfeet");
        docRef = colRef.document("chickenfeet500gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenfeet500gprice");
                    tv500g.setText(text);
                }
            }
        });

        colRef = db.collection("chickenfeet");
        docRef = colRef.document("chickenfeet600gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenfeet600gprice");
                    tv600g.setText(text);
                }
            }
        });

        colRef = db.collection("chickenfeet");
        docRef = colRef.document("chickenfeet700gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenfeet700gprice");
                    tv700g.setText(text);
                }
            }
        });

        colRef = db.collection("chickenfeet");
        docRef = colRef.document("chickenfeet800gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenfeet800gprice");
                    tv800g.setText(text);
                }
            }
        });

        colRef = db.collection("chickenfeet");
        docRef = colRef.document("chickenfeet900gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenfeet900gprice");
                    tv900g.setText(text);
                }
            }
        });

        colRef = db.collection("chickenfeet");
        docRef = colRef.document("chickenfeet1kgprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenfeet1kgprice");
                    tv1kg.setText(text);
                }
            }
        });
    }
}
