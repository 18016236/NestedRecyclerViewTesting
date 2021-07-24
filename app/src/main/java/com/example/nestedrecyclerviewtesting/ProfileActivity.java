package com.example.nestedrecyclerviewtesting;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity {


    TextView TvUserName,TvPassword,TvEmail,TVHomeAddress;
    FirebaseFirestore db;
    FirebaseAuth mAuth;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);



        db = FirebaseFirestore.getInstance();
        mAuth = FirebaseAuth.getInstance();

        userID = mAuth.getCurrentUser().getUid();

        TvEmail = findViewById(R.id.TvEmail);
        TvPassword = findViewById(R.id.TvPassword);
        TvUserName = findViewById(R.id.TvUserName);
        TVHomeAddress = findViewById(R.id.TvHomeAddress);

        DocumentReference documentReference = db.collection("users").document(userID);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                TvEmail.setText(value.getString("Email"));
                TvUserName.setText(value.getString("Username"));
                TvPassword.setText(value.getString("Password"));
                TVHomeAddress.setText(value.getString("Home Address"));
            }
        });


    }
}