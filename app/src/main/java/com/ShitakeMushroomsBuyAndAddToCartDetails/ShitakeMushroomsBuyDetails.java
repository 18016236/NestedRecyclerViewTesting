package com.ShitakeMushroomsBuyAndAddToCartDetails;

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

import com.ChilliPadiBuyAndAddToCartDetails.ChilliPadiBuyDetails;
import com.example.nestedrecyclerviewtesting.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class ShitakeMushroomsBuyDetails extends AppCompatActivity {
    Button btnBuy,btnAddToCart,btn;
    ImageView imgArrowBack;
    TextView tv300g,tv400g,tv500g,tv600g,tv700g,tv800g,tv900g,tv1kg;

    private FirebaseFirestore db;
    private CollectionReference colRef;
    private DocumentReference docRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shitake_mushrooms_buy_details);
        imgArrowBack = findViewById(R.id.backarrow);

        btnBuy = findViewById(R.id.BtnBuy);
        btnAddToCart = findViewById(R.id.BtnAddToCart);

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
                int selectedButtonId = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(R.id.selected);
                Toast.makeText(ShitakeMushroomsBuyDetails.this,rb.getText(),Toast.LENGTH_LONG).show();
            }
        });


        imgArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tv300g = findViewById(R.id.ShitakeMushroom300g);
        tv400g = findViewById(R.id.ShitakeMushroom400g);
        tv500g = findViewById(R.id.ShitakeMushroom500g);
        tv600g = findViewById(R.id.ShitakeMushroom600g);
        tv700g = findViewById(R.id.ShitakeMushroom700g);
        tv800g = findViewById(R.id.ShitakeMushroom800g);
        tv900g = findViewById(R.id.ShitakeMushroom900g);
        tv1kg = findViewById(R.id.ShitakeMushroom1kg);

        db = FirebaseFirestore.getInstance();

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        DatabaseReference databaseReference = firebaseDatabase.getReference();

        colRef = db.collection("ShitakeMushrooms");
        docRef = colRef.document("ShitakeMushroom300gPrice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("ShitakeMushroom300gPrice");
                    tv300g.setText(text);
                }
            }
        });

        colRef = db.collection("ShitakeMushrooms");
        docRef = colRef.document("ShitakeMushroom400gPrice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("ShitakeMushroom400gPrice");
                    tv400g.setText(text);
                }
            }
        });

        colRef = db.collection("ShitakeMushrooms");
        docRef = colRef.document("ShitakeMushroom500gPrice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("ShitakeMushroom500gPrice");
                    tv500g.setText(text);
                }
            }
        });

        colRef = db.collection("ShitakeMushrooms");
        docRef = colRef.document("ShitakeMushroom600gPrice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("ShitakeMushroom600gPrice");
                    tv600g.setText(text);
                }
            }
        });

        colRef = db.collection("ShitakeMushrooms");
        docRef = colRef.document("ShitakeMushroom700gPrice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("ShitakeMushroom700gPrice");
                    tv700g.setText(text);
                }
            }
        });

        colRef = db.collection("ShitakeMushrooms");
        docRef = colRef.document("ShitakeMushroom800gPrice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("ShitakeMushroom800gPrice");
                    tv800g.setText(text);
                }
            }
        });

        colRef = db.collection("ShitakeMushrooms");
        docRef = colRef.document("ShitakeMushroom900gPrice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("ShitakeMushroom900gPrice");
                    tv900g.setText(text);
                }
            }
        });

        colRef = db.collection("ShitakeMushrooms");
        docRef = colRef.document("ShitakeMushroom1kgPrice");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("ShitakeMushroom1kgPrice");
                    tv1kg.setText(text);
                }
            }
        });

    }
}