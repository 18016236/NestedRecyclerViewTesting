package com.WholeChickenWingBuyAndAddToCartDetails;

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

import com.WholeChickenBreastBuyAndAddToCartDetails.WholeChickenBreastBuyDetails;
import com.example.nestedrecyclerviewtesting.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class WholeChickenWingBuyDetails extends AppCompatActivity {
    Button btnBuy,btnAddToCart,btn;
    ImageView imgArrowBack;
    TextView tv100g,tv200g,tv300g,tv400g,tv500g,tv600g,tv700g,tv800g,tv900g,tv1kg;

    private FirebaseFirestore db;
    private CollectionReference colRef;
    private DocumentReference docRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whole_chicken_wing_buy_details);
        imgArrowBack = findViewById(R.id.backarrow);

        btnBuy = findViewById(R.id.BtnBuy);
        btnAddToCart = findViewById(R.id.BtnAddToCart);

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
                int selectedButtonId = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(R.id.selected);
                Toast.makeText(WholeChickenWingBuyDetails.this,rb.getText(),Toast.LENGTH_LONG).show();
            }
        });


        imgArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tv100g = findViewById(R.id.wholechickenwing100g);
        tv200g = findViewById(R.id.wholechickenwing200g);
        tv300g = findViewById(R.id.wholechickenwing300g);
        tv400g = findViewById(R.id.wholechickenwing400g);
        tv500g = findViewById(R.id.wholechickenwing500g);
        tv600g = findViewById(R.id.wholechickenwing600g);
        tv700g = findViewById(R.id.wholechickenwing700g);
        tv800g = findViewById(R.id.wholechickenwing800g);
        tv900g = findViewById(R.id.wholechickenwing900g);
        tv1kg = findViewById(R.id.wholechickenwing1kg);

        db = FirebaseFirestore.getInstance();

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        DatabaseReference databaseReference = firebaseDatabase.getReference();


        colRef = db.collection("wholechickenwing");
        docRef = colRef.document("wholechickenwing100gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wholechickenwing100gprice");
                    tv100g.setText(text);
                }
            }
        });

        colRef = db.collection("wholechickenwing");
        docRef = colRef.document("wholechickenwing200gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wholechickenwing200gprice");
                    tv200g.setText(text);
                }
            }
        });
        colRef = db.collection("wholechickenwing");
        docRef = colRef.document("wholechickenwing300gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wholechickenwing300gprice");
                    tv300g.setText(text);
                }
            }
        });

        colRef = db.collection("wholechickenwing");
        docRef = colRef.document("wholechickenwing400gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wholechickenwing400gprice");
                    tv400g.setText(text);
                }
            }
        });
        colRef = db.collection("wholechickenwing");
        docRef = colRef.document("wholechickenwing500gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wholechickenwing500gprice");
                    tv500g.setText(text);
                }
            }
        });

        colRef = db.collection("wholechickenwing");
        docRef = colRef.document("wholechickenwing600gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wholechickenwing600gprice");
                    tv600g.setText(text);
                }
            }
        });
        colRef = db.collection("wholechickenwing");
        docRef = colRef.document("wholechickenwing700gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wholechickenwing700gprice");
                    tv700g.setText(text);
                }
            }
        });

        colRef = db.collection("wholechickenwing");
        docRef = colRef.document("wholechickenwing800gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wholechickenwing800gprice");
                    tv800g.setText(text);
                }
            }
        });
        colRef = db.collection("wholechickenwing");
        docRef = colRef.document("wholechickenwing900gprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wholechickenwing900gprice");
                    tv900g.setText(text);
                }
            }
        });

        colRef = db.collection("wholechickenwing");
        docRef = colRef.document("wholechickenwing1kgprice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wholechickenwing1kgprice");
                    tv1kg.setText(text);
                }
            }
        });
    }
}

