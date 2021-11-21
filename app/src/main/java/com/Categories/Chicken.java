package com.Categories;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ChickenDetails.BlackChickenDetails;
import com.ChickenDetails.BonelessChickenBreastDetails;
import com.ChickenDetails.BonelessChickenThighDetails;
import com.ChickenDetails.ChickenBreastBoneDetails;
import com.ChickenDetails.ChickenDrumletDetails;
import com.ChickenDetails.ChickenFeetDetails;
import com.ChickenDetails.ChickenFilletDetails;
import com.ChickenDetails.ChickenGizzardDetails;
import com.ChickenDetails.ChickenHeartDetails;
import com.ChickenDetails.ChickenKaraageDetails;
import com.ChickenDetails.ChickenLiverDetails;
import com.ChickenDetails.ChickenThighBoneDetails;
import com.ChickenDetails.ChickenVegetableGyozaDetails;
import com.ChickenDetails.ChickenWingWithSesameDetails;
import com.ChickenDetails.ChickendrumstickDetails;
import com.ChickenDetails.CollagenBrothDetails;
import com.ChickenDetails.CrabShumaiDetails;
import com.ChickenDetails.CrispyFriedChickenDetails;
import com.ChickenDetails.KampongChickenBoneDetails;
import com.ChickenDetails.KampongChickenBreastDetails;
import com.ChickenDetails.KampongChickenFeetDetails;
import com.ChickenDetails.KampongChickenThighDetails;
import com.ChickenDetails.KampongChickenWingDetails;
import com.ChickenDetails.LocalFriedLargeChickenFeetDetails;
import com.ChickenDetails.MiddleWingsDetails;
import com.ChickenDetails.MotherHenBrothDetails;
import com.ChickenDetails.OldHenChickenDetails;
import com.ChickenDetails.RendangPastePasteOnlyDetails;
import com.ChickenDetails.SakuraChickenDetails;
import com.ChickenDetails.ShrimpGyozaPackDetails;
import com.ChickenDetails.ShrimpGyozaPartyPackDetails;
import com.ChickenDetails.ShrimpShumaiDetails;
import com.ChickenDetails.VegetableGyozaDetails;
import com.ChickenDetails.WakadoriDetails;
import com.ChickenDetails.WholeChickenBreastDetails;
import com.ChickenDetails.WholeChickenDetails;
import com.ChickenDetails.WholeChickenThighDetails;
import com.ChickenDetails.WholeChickenWingDetails;
import com.ChickenDetails.WholeKampongChickenDetails;
import com.ChickenDetails.YakitoriMasterKMomonikuDetails;
import com.ChickenDetails.YakitoriMasterKushiDetails;
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

public class Chicken extends AppCompatActivity {

    Button btnBack;
    CardView cv1,cv2,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv10,cv11,cv12,cv13,cv14,cv15,cv16,cv17,cv18,cv19,cv20,cv21,cv22,cv23,cv24,cv25,cv26,cv27,cv28,cv29,cv30,cv31,cv32,cv33,cv34,cv35,cv36,cv37,cv38,cv39,cv40,cv41;
    ImageView arrowBack;
    TextView tvMessage1,tvMessage2,tvMessage3,tvMessage4,tvMessage5,tvMessage6,tvMessage7,tvMessage8,tvMessage9,tvMessage10,tvMessage11,tvMessage12,tvMessage13,tvMessage14,tvMessage15,tvMessage16,tvMessage17,tvMessage18,tvMessage19,tvMessage20,tvMessage21,tvMessage22,tvMessage23,tvMessage24,tvMessage25,tvMessage26,tvMessage27,tvMessage28,tvMessage29,tvMessage30,tvMessage31,tvMessage32,tvMessage33,tvMessage34,tvMessage35,tvMessage36,tvMessage37,tvMessage38,tvMessage39,tvMessage40,tvMessage41;

    private FirebaseFirestore db;
    private CollectionReference colRef;
    private DocumentReference docRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);

        cv1 = findViewById(R.id.cLBlackChciken);

        cv2 = findViewById(R.id.cLBonelessChickenBreast);

        cv3 = findViewById(R.id.cLBonelessChickenThigh);

        cv4 = findViewById(R.id.cLChickenBreastBone);

        cv5 = findViewById(R.id.cLChickenfeet);

        cv6 = findViewById(R.id.cLChickenFillet);

        cv7 = findViewById(R.id.cLChickenGizzard);

        cv8 = findViewById(R.id.cLChickenHeart);

        cv9 = findViewById(R.id.cLChickenKarrageRaw);

        cv10 = findViewById(R.id.cLChickenLiver);

        cv11 = findViewById(R.id.cLChickenThighBone);

        cv12 = findViewById(R.id.cLCollagenbroth);

        cv13 = findViewById(R.id.cLChickenDrumlets);

        cv14 = findViewById(R.id.cLChickenDrumstickOnePiece);

        cv15 = findViewById(R.id.cLKampongChickenBones);

        cv16 = findViewById(R.id.cLKampongChickenBreast);

        cv17 = findViewById(R.id.cLKampongChickenFeet);

        cv18 = findViewById(R.id.cLKampongChickenThigh);

        cv19 = findViewById(R.id.cLKampongChickenWings);

        cv20 = findViewById(R.id.cLLocalFriedLargeChickenFeet);

        cv21 = findViewById(R.id.cLMiddleWings);

        cv22 = findViewById(R.id.cLMotherHenBroth);

        cv23 = findViewById(R.id.cLOldHenChicken);

        cv24 = findViewById(R.id.cLRendangPastePasteOnly);

        cv25 = findViewById(R.id.cLSakuraChicken);

        cv26 = findViewById(R.id.cLWholeChickenBreast);

        cv27 = findViewById(R.id.cLWholeChickenThigh);

        cv28 = findViewById(R.id.cLWholeChickenWing);

        cv29 = findViewById(R.id.cLWholeChicken);

        cv30 = findViewById(R.id.cLWholekampongchicken);

        cv31 = findViewById(R.id.cLYakitoriMasterKMomoniku);

        cv32 = findViewById(R.id.cLYakitoriMasterKToriKawaKushi);

        cv33 = findViewById(R.id.cLChickenVegetableGyoza);

        cv34 = findViewById(R.id.cLVegetableGyoza);

        cv35 = findViewById(R.id.cLWakadoriKaraageJapaneseTenderFiredChicken);

        cv36 = findViewById(R.id.cLCrispyFriedChickenKaraage);

        cv37 = findViewById(R.id.cLCrabShumai);

        cv38 = findViewById(R.id.cLShrimpShumai);

        cv39 = findViewById(R.id.cLShrimpGyozaStandardPack);

        cv40 = findViewById(R.id.cLChickenWingWithSesame);

        cv41 = findViewById(R.id.cLShrimpGyozaPartyPack);






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

        tvMessage20 = findViewById(R.id.Title20);

        tvMessage21 = findViewById(R.id.Title21);

        tvMessage22 = findViewById(R.id.Title22);

        tvMessage23 = findViewById(R.id.Title23);

        tvMessage24 = findViewById(R.id.Title24);

        tvMessage25 = findViewById(R.id.Title25);

        tvMessage26 = findViewById(R.id.Title26);

        tvMessage27 = findViewById(R.id.Title27);

        tvMessage28 = findViewById(R.id.Title28);

        tvMessage29 = findViewById(R.id.Title29);

        tvMessage30 = findViewById(R.id.Title30);

        tvMessage31 = findViewById(R.id.Title31);

        tvMessage32 = findViewById(R.id.Title32);

        tvMessage33 = findViewById(R.id.Title33);

        tvMessage34 = findViewById(R.id.Title34);

        tvMessage35 = findViewById(R.id.Title35);

        tvMessage36 = findViewById(R.id.Title36);

        tvMessage37 = findViewById(R.id.Title37);

        tvMessage38 = findViewById(R.id.Title38);

        tvMessage39 = findViewById(R.id.Title39);

        tvMessage40 = findViewById(R.id.Title40);

        tvMessage41 = findViewById(R.id.Title41);




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
                Intent i = new Intent(Chicken.this, BlackChickenDetails.class);
                startActivity(i);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, BonelessChickenBreastDetails.class);
                startActivity(i);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, BonelessChickenThighDetails.class);
                startActivity(i);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, ChickenBreastBoneDetails.class);
                startActivity(i);
            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, ChickenFeetDetails.class);
                startActivity(i);
            }
        });

        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, ChickenFilletDetails.class);
                startActivity(i);
            }
        });

        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, ChickenGizzardDetails.class);
                startActivity(i);
            }
        });

        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, ChickenHeartDetails.class);
                startActivity(i);
            }
        });

        cv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, ChickenKaraageDetails.class);
                startActivity(i);
            }
        });

        cv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, ChickenLiverDetails.class);
                startActivity(i);
            }
        });

        cv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, ChickenThighBoneDetails.class);
                startActivity(i);
            }
        });

        cv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, CollagenBrothDetails.class);
                startActivity(i);
            }
        });

        cv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, ChickenDrumletDetails.class);
                startActivity(i);
            }
        });

        cv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, ChickendrumstickDetails.class);
                startActivity(i);
            }
        });

        cv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, KampongChickenBoneDetails.class);
                startActivity(i);
            }
        });

        cv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, KampongChickenBreastDetails.class);
                startActivity(i);
            }
        });

        cv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, KampongChickenFeetDetails.class);
                startActivity(i);
            }
        });

        cv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, KampongChickenThighDetails.class);
                startActivity(i);
            }
        });

        cv19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, KampongChickenWingDetails.class);
                startActivity(i);
            }
        });

        cv20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, LocalFriedLargeChickenFeetDetails.class);
                startActivity(i);
            }
        });

        cv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, MiddleWingsDetails.class);
                startActivity(i);
            }
        });

        cv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, MotherHenBrothDetails.class);
                startActivity(i);
            }
        });

        cv23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, OldHenChickenDetails.class);
                startActivity(i);
            }
        });

        cv24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, RendangPastePasteOnlyDetails.class);
                startActivity(i);
            }
        });

        cv25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, SakuraChickenDetails.class);
                startActivity(i);
            }
        });

        cv26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, WholeChickenBreastDetails.class);
                startActivity(i);
            }
        });

        cv27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, WholeChickenThighDetails.class);
                startActivity(i);
            }
        });

        cv28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, WholeChickenWingDetails.class);
                startActivity(i);
            }
        });

        cv29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, WholeChickenDetails.class);
                startActivity(i);
            }
        });

        cv30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, WholeKampongChickenDetails.class);
                startActivity(i);
            }
        });

        cv31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, YakitoriMasterKMomonikuDetails.class);
                startActivity(i);
            }
        });

        cv32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, YakitoriMasterKushiDetails.class);
                startActivity(i);
            }
        });

        cv33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, ChickenVegetableGyozaDetails.class);
                startActivity(i);
            }
        });

        cv34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, VegetableGyozaDetails.class);
                startActivity(i);
            }
        });

        cv35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, WakadoriDetails.class);
                startActivity(i);
            }
        });

        cv36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, CrispyFriedChickenDetails.class);
                startActivity(i);
            }
        });

        cv37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, CrabShumaiDetails.class);
                startActivity(i);
            }
        });

        cv38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, ShrimpShumaiDetails.class);
                startActivity(i);
            }
        });

        cv39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, ShrimpGyozaPackDetails.class);
                startActivity(i);
            }
        });

        cv40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, ChickenWingWithSesameDetails.class);
                startActivity(i);
            }
        });

        cv41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chicken.this, ShrimpGyozaPartyPackDetails.class);
                startActivity(i);
            }
        });






        colRef = db.collection("blackchicken");
        docRef = colRef.document("blackchicken");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("blackchicken");
                    tvMessage1.setText(text);
                }
            }
        });

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        DatabaseReference databaseReference = firebaseDatabase.getReference();

        colRef = db.collection("bonelesschickenbreast");
        docRef = colRef.document("bonelesschickenbreast");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("bonelesschickenbreast");
                    tvMessage2.setText(text);
                }
            }
        });

        colRef = db.collection("bonelesschickenthigh");
        docRef = colRef.document("bonelesschickenthigh");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("bonelesschickenthigh");
                    tvMessage3.setText(text);
                }
            }
        });

        colRef = db.collection("chickenbreastbone");
        docRef = colRef.document("chickenbreastbone");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenbreastbone");
                    tvMessage4.setText(text);
                }
            }
        });

        colRef = db.collection("chickenfeet");
        docRef = colRef.document("chickenfeet");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenfeet");
                    tvMessage5.setText(text);
                }
            }
        });

        colRef = db.collection("chickenfillet");
        docRef = colRef.document("chickenfillet");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenfillet");
                    tvMessage6.setText(text);
                }
            }
        });

        colRef = db.collection("chickengizzard");
        docRef = colRef.document("chickengizzard");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickengizzard");
                    tvMessage7.setText(text);
                }
            }
        });

        colRef = db.collection("chickenheart");
        docRef = colRef.document("chickenheart");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenheart");
                    tvMessage8.setText(text);
                }
            }
        });

        colRef = db.collection("chickenkaraage");
        docRef = colRef.document("chickenkaraage");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenkaraage");
                    tvMessage9.setText(text);
                }
            }
        });

        colRef = db.collection("chickenliver");
        docRef = colRef.document("chickenliver");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenliver");
                    tvMessage10.setText(text);
                }
            }
        });

        colRef = db.collection("chickenthighbone");
        docRef = colRef.document("chickenthighbone");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenthighbone");
                    tvMessage11.setText(text);
                }
            }
        });

        colRef = db.collection("collagenbroth");
        docRef = colRef.document("collagenbroth");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("collagenbroth");
                    tvMessage12.setText(text);
                }
            }
        });

        colRef = db.collection("chickendrumlets");
        docRef = colRef.document("chickendrumlets");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickendrumlets");
                    tvMessage13.setText(text);
                }
            }
        });

        colRef = db.collection("chickendrumstick1piece");
        docRef = colRef.document("chickendrumstick1piece");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickendrumstick1piece");
                    tvMessage14.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenbones");
        docRef = colRef.document("kampongchickenbones");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenbones");
                    tvMessage15.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenbreast");
        docRef = colRef.document("kampongchickenbreast");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenbreast");
                    tvMessage16.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenfeet");
        docRef = colRef.document("kampongchickenfeet");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenfeet");
                    tvMessage17.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenthigh");
        docRef = colRef.document("kampongchickenthigh");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenthigh");
                    tvMessage18.setText(text);
                }
            }
        });

        colRef = db.collection("kampongchickenwings");
        docRef = colRef.document("kampongchickenwings");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kampongchickenwings");
                    tvMessage19.setText(text);
                }
            }
        });


        colRef = db.collection("localfriedlargechickenfeet");
        docRef = colRef.document("localfriedlargechickenfeet");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("localfriedlargechickenfeet");
                    tvMessage20.setText(text);
                }
            }
        });


        colRef = db.collection("middlewings");
        docRef = colRef.document("middlewings");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("middlewings");
                    tvMessage21.setText(text);
                }
            }
        });

        colRef = db.collection("motherhenbroth");
        docRef = colRef.document("motherhenbroth");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("motherhenbroth");
                    tvMessage22.setText(text);
                }
            }
        });

        colRef = db.collection("oldhenchicken");
        docRef = colRef.document("oldhenchicken");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("oldhenchicken");
                    tvMessage23.setText(text);
                }
            }
        });

        colRef = db.collection("rendangpastepasteonly");
        docRef = colRef.document("rendangpastepasteonly");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("rendangpastepasteonly");
                    tvMessage24.setText(text);
                }
            }
        });

        colRef = db.collection("sakurachicken");
        docRef = colRef.document("sakurachicken");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("sakurachicken");
                    tvMessage25.setText(text);
                }
            }
        });

        colRef = db.collection("wholechickenbreast");
        docRef = colRef.document("wholechickenbreast");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wholechickenbreast");
                    tvMessage26.setText(text);
                }
            }
        });

        colRef = db.collection("wholechickenthigh");
        docRef = colRef.document("wholechickenthigh");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wholechickenthigh");
                    tvMessage27.setText(text);
                }
            }
        });

        colRef = db.collection("wholechickenwing");
        docRef = colRef.document("wholechickenwing");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wholechickenwing");
                    tvMessage28.setText(text);
                }
            }
        });

        colRef = db.collection("wholechicken");
        docRef = colRef.document("wholechicken");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wholechicken");
                    tvMessage29.setText(text);
                }
            }
        });

        colRef = db.collection("wholekampongchicken");
        docRef = colRef.document("wholekampongchicken");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wholekampongchicken");
                    tvMessage30.setText(text);
                }
            }
        });

        colRef = db.collection("YakitoriMasterKMomoniku");
        docRef = colRef.document("YakitoriMasterKMomoniku");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("YakitoriMasterKMomoniku");
                    tvMessage31.setText(text);
                }
            }
        });

        colRef = db.collection("YakitoriMasterKushi");
        docRef = colRef.document("YakitoriMasterKushi");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("YakitoriMasterKushi");
                    tvMessage32.setText(text);
                }
            }
        });

        colRef = db.collection("chickenvegetablegyoza");
        docRef = colRef.document("chickenvegetablegyoza");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenvegetablegyoza");
                    tvMessage33.setText(text);
                }
            }
        });

        colRef = db.collection("vegetablegyoza");
        docRef = colRef.document("vegetablegyoza");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("vegetablegyoza");
                    tvMessage34.setText(text);
                }
            }
        });

        colRef = db.collection("wakadori");
        docRef = colRef.document("wakadori");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("wakadori");
                    tvMessage35.setText(text);
                }
            }
        });

        colRef = db.collection("crispyfriedchicken");
        docRef = colRef.document("crispyfriedchicken");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("crispyfriedchicken");
                    tvMessage36.setText(text);
                }
            }
        });

        colRef = db.collection("crabshumai");
        docRef = colRef.document("crabshumai");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("crabshumai");
                    tvMessage37.setText(text);
                }
            }
        });

        colRef = db.collection("shrimpshumai");
        docRef = colRef.document("shrimpshumai");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("shrimpshumai");
                    tvMessage38.setText(text);
                }
            }
        });

        colRef = db.collection("shrimpgyozapack");
        docRef = colRef.document("shrimpgyozapack");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("shrimpgyozapack");
                    tvMessage39.setText(text);
                }
            }
        });

        colRef = db.collection("chickenwingsesame");
        docRef = colRef.document("chickenwingsesame");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chickenwingsesame");
                    tvMessage40.setText(text);
                }
            }
        });

        colRef = db.collection("shrimpgyozapartypack");
        docRef = colRef.document("shrimpgyozapartypack");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("shrimpgyozapartypack");
                    tvMessage41.setText(text);
                }
            }
        });


    }
}