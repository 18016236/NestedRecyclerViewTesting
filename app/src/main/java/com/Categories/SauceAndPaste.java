package com.Categories;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
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
import com.itemDetails.AnchovySambalDetails;
import com.itemDetails.Blackvinegar350mlDetails;
import com.itemDetails.Blackvinegar750mlDetails;
import com.itemDetails.CurryLongtongVegetablePasteDetails;
import com.itemDetails.DarkSoySauce350mlDetails;
import com.itemDetails.Darksoysauce750ml;
import com.itemDetails.JapaneseFriedChickenDetails;
import com.itemDetails.KamHeongPasteDetails;
import com.itemDetails.Kara200mlDetails;
import com.itemDetails.Kara500mlDetails;
import com.itemDetails.MarmiteSauceDetails;
import com.itemDetails.RendangPasteDetails;
import com.itemDetails.SesameHotpotDetails;
import com.itemDetails.SesameOilDetails;
import com.itemDetails.SingaporeCurryChickenPasteDetails;
import com.itemDetails.SingaporeLaksaPasteDetails;
import com.itemDetails.SoysauceDetails;
import com.itemDetails.TomYumPasteDetails;
import com.itemDetails.TonkotsuPorkRamenSoupStock500mlDetails;

public class SauceAndPaste extends AppCompatActivity {

    CardView cv1,cv2,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv10,cv11,cv12,cv13,cv14,cv15,cv16,cv17,cv18,cv19;
    ImageView arrowBack;
    TextView tvMessage1,tvMessage2,tvMessage3,tvMessage4,tvMessage5,tvMessage6,tvMessage7,tvMessage8,tvMessage9,tvMessage10,tvMessage11,tvMessage12,tvMessage13,tvMessage14,tvMessage15,tvMessage16,tvMessage17,tvMessage18,tvMessage19;

    private FirebaseFirestore db;
    private CollectionReference colRef;
    private DocumentReference docRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sauce_and_paste);

      cv1 = findViewById(R.id.cLKamHeong);

      cv2 = findViewById(R.id.cLMarmite);

      cv3 = findViewById(R.id.cLAnchovyAndSambal);

        cv4 = findViewById(R.id.cLTomYumPaste);

        cv5 = findViewById(R.id.clSingaporeLaksaPaste);

        cv6 = findViewById(R.id.cLCurryLontongVegetablePaste);

        cv7 = findViewById(R.id.cLRendangPaste);

        cv8 = findViewById(R.id.cLSingaporeCurryChickenPaste);

        cv9 = findViewById(R.id.cLNissinYuzuKoshoAjiKaraagekoJapaneseFriedChickenPowder100g);

        cv10 = findViewById(R.id.cLSesameOil);

        cv11 = findViewById(R.id.cLBlackVinegar750ml);

        cv12 = findViewById(R.id.cLBlackVinegar350ml);

        cv13 = findViewById(R.id.cLDarksoysauce750ml);

        cv14 = findViewById(R.id.cLDarksoysauce350ml);

        cv15 = findViewById(R.id.cLSoysauce);

        cv16 = findViewById(R.id.cLMizkanGomaShabuSesameHotpotDippingSauce250ml);

        cv17 = findViewById(R.id.cLTonkotsuPorkRamenSoupStock500ml);

        cv18 = findViewById(R.id.cLKara500ml);

        cv19 = findViewById(R.id.cLKara200ml);

        tvMessage1 = findViewById(R.id.Title1);

        tvMessage2 = findViewById(R.id.Title2);

        tvMessage3 = findViewById(R.id.Title3);

        tvMessage4 = findViewById(R.id.Title4);

        tvMessage5 = findViewById(R.id.Title5);

        tvMessage6 = findViewById(R.id.Title6);

        tvMessage7 = findViewById(R.id.Title7);

        tvMessage8 = findViewById(R.id.Title8);

        tvMessage9 = findViewById(R.id.Title9);

        tvMessage10 = findViewById(R.id.Title10);

        tvMessage11 = findViewById(R.id.Title11);

        tvMessage12 = findViewById(R.id.Title12);

        tvMessage13 = findViewById(R.id.Title13);

        tvMessage14 = findViewById(R.id.Title14);

        tvMessage15 = findViewById(R.id.Title15);

        tvMessage16 = findViewById(R.id.Title16);

        tvMessage17 = findViewById(R.id.Title17);

        tvMessage18 = findViewById(R.id.Title18);

        tvMessage19 = findViewById(R.id.Title19);

        db = FirebaseFirestore.getInstance();

        arrowBack = findViewById(R.id.arrowback);

        arrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, KamHeongPasteDetails.class);
                startActivity(i);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, MarmiteSauceDetails.class);
                startActivity(i);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, AnchovySambalDetails.class);
                startActivity(i);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, TomYumPasteDetails.class);
                startActivity(i);
            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, SingaporeLaksaPasteDetails.class);
                startActivity(i);
            }
        });

        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, CurryLongtongVegetablePasteDetails.class);
                startActivity(i);
            }
        });

        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, RendangPasteDetails.class);
                startActivity(i);
            }
        });

        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, SingaporeCurryChickenPasteDetails.class);
                startActivity(i);
            }
        });

        cv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, JapaneseFriedChickenDetails.class);
                startActivity(i);
            }
        });

        cv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, SesameOilDetails.class);
                startActivity(i);
            }
        });

        cv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, Blackvinegar750mlDetails.class);
                startActivity(i);
            }
        });

        cv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, Blackvinegar350mlDetails.class);
                startActivity(i);
            }
        });

        cv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, Darksoysauce750ml.class);
                startActivity(i);
            }
        });

        cv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, DarkSoySauce350mlDetails.class);
                startActivity(i);
            }
        });

        cv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, SoysauceDetails.class);
                startActivity(i);
            }
        });

        cv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, SesameHotpotDetails.class);
                startActivity(i);
            }
        });

        cv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, TonkotsuPorkRamenSoupStock500mlDetails.class);
                startActivity(i);
            }
        });

        cv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, Kara500mlDetails.class);
                startActivity(i);
            }
        });

        cv19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SauceAndPaste.this, Kara200mlDetails.class);
                startActivity(i);
            }
        });


        colRef = db.collection("messages");
        docRef = colRef.document("messages");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("text");
                    tvMessage1.setText(text);
                }
            }
        });

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        DatabaseReference databaseReference = firebaseDatabase.getReference();

        colRef = db.collection("marmiteSauce");
        docRef = colRef.document("marmitesauce");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("MarmiteSauce");
                    tvMessage2.setText(text);
                }
            }
        });

        colRef = db.collection("anchovysambal");
        docRef = colRef.document("anchovysambal");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("anchovysambal");
                    tvMessage3.setText(text);
                }
            }
        });

        colRef = db.collection("tomyumpaste");
        docRef = colRef.document("tomyumpaste");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("tomyumpaste");
                    tvMessage4.setText(text);
                }
            }
        });

        colRef = db.collection("singaporelaksapaste");
        docRef = colRef.document("singaporelaksapaste");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("singaporelaksapaste");
                    tvMessage5.setText(text);
                }
            }
        });

        colRef = db.collection("currylongtongvegetablepaste");
        docRef = colRef.document("currylongtongvegetablepaste");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("currylongtongvegetablepaste");
                    tvMessage6.setText(text);
                }
            }
        });

        colRef = db.collection("rendangpaste");
        docRef = colRef.document("rendangpaste");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("rendangpaste");
                    tvMessage7.setText(text);
                }
            }
        });

        colRef = db.collection("singaporecurrychickenpaste");
        docRef = colRef.document("singaporecurrychickenpaste");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("singaporecurrychickenpaste");
                    tvMessage8.setText(text);
                }
            }
        });

        colRef = db.collection("nissinyuzukoshoajikaraagekojapanesefriedchickenpowder100g");
        docRef = colRef.document("nissinyuzukoshoajikaraagekojapanesefriedchickenpowder100g");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("nissinyuzukoshoajikaraagekojapanesefriedchickenpowder100g");
                    tvMessage9.setText(text);
                }
            }
        });

        colRef = db.collection("sesameoil");
        docRef = colRef.document("sesameoil");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("sesameoil");
                    tvMessage10.setText(text);
                }
            }
        });

        colRef = db.collection("blackvinegar750ml");
        docRef = colRef.document("blackvinegar750ml");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("blackvinegar750ml");
                    tvMessage11.setText(text);
                }
            }
        });

        colRef = db.collection("blackvinegar350ml");
        docRef = colRef.document("blackvinegar350ml");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("blackvinegar350ml");
                    tvMessage12.setText(text);
                }
            }
        });

        colRef = db.collection("darksoysauce750ml");
        docRef = colRef.document("darksoysauce750ml");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("darksoysauce750ml");
                    tvMessage13.setText(text);
                }
            }
        });

        colRef = db.collection("darksoysauce350ml");
        docRef = colRef.document("darksoysauce350ml");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("darksoysauce350ml");
                    tvMessage14.setText(text);
                }
            }
        });

        colRef = db.collection("soysauce");
        docRef = colRef.document("soysauce");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("soysauce");
                    tvMessage15.setText(text);
                }
            }
        });

        colRef = db.collection("mizkanGomaShabuSesameHotpotDippingSauce250ml");
        docRef = colRef.document("mizkanGomaShabuSesameHotpotDippingSauce250ml");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("mizkanGomaShabuSesameHotpotDippingSauce250ml");
                    tvMessage16.setText(text);
                }
            }
        });

        colRef = db.collection("Tonkotsu Pork Ramen Soup Stock 500ml");
        docRef = colRef.document("Tonkotsu Pork Ramen Soup Stock 500ml");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("Tonkotsu Pork Ramen Soup Stock 500ml");
                    tvMessage17.setText(text);
                }
            }
        });

        colRef = db.collection("Kara 500ml");
        docRef = colRef.document("Kara 500ml");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("Kara 500ml");
                    tvMessage18.setText(text);
                }
            }
        });

        colRef = db.collection("Kara 200ml");
        docRef = colRef.document("Kara 200ml");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("Kara 200ml");
                    tvMessage19.setText(text);
                }
            }
        });




    }
}