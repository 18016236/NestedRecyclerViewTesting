package com.example.nestedrecyclerviewtesting;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.Categories.Vegetables;
import com.LimeBuyAndAddToCartDetails.LimeBuyDetails;
import com.VegetablesDetails.ArrowRootDetails;
import com.VegetablesDetails.AustraliaBroccoliDetails;
import com.VegetablesDetails.AustraliaPotatoDetails;
import com.VegetablesDetails.BabyChaiSimDetails;
import com.VegetablesDetails.BabyFrenchBeanDetails;
import com.VegetablesDetails.BabyKailanDetails;
import com.VegetablesDetails.BabyKailansDetails;
import com.VegetablesDetails.BabyPakChoyDetails;
import com.VegetablesDetails.BabyShanghaiGreenDetails;
import com.VegetablesDetails.BigVegetbalesDetails;
import com.VegetablesDetails.BrinjalDetails;
import com.VegetablesDetails.BrownOnionDetails;
import com.VegetablesDetails.BrownShimeijiMushroomDetails;
import com.VegetablesDetails.CarrotDetails;
import com.VegetablesDetails.CauliFlowerDetails;
import com.VegetablesDetails.CeleryDetails;
import com.VegetablesDetails.CherryPlumDetails;
import com.VegetablesDetails.CherryTomatoesDetails;
import com.VegetablesDetails.ChestnutsDetails;
import com.VegetablesDetails.ChilliPadiDetails;
import com.VegetablesDetails.ChineseCabbagesDetails;
import com.VegetablesDetails.ChineseCeleryDetails;
import com.VegetablesDetails.ChineseLeekDetails;
import com.VegetablesDetails.ChyeSimFlowerDetails;
import com.VegetablesDetails.CorianderDetails;
import com.VegetablesDetails.EryngiimuhsroomDetails;
import com.VegetablesDetails.GarlicDetails;
import com.VegetablesDetails.GingkoNutsDetails;
import com.VegetablesDetails.GreenBellPepperDetails;
import com.VegetablesDetails.GreenRadishDetails;
import com.VegetablesDetails.HollandPotatoDetails;
import com.VegetablesDetails.IcebergLettuceDetails;
import com.VegetablesDetails.JapaneseCucumberDetails;
import com.VegetablesDetails.KailanDetails;
import com.VegetablesDetails.KauKeeDetails;
import com.VegetablesDetails.LadyFingerDetails;
import com.VegetablesDetails.LimeDetails;
import com.VegetablesDetails.LocalCucumberDetails;
import com.VegetablesDetails.LocalEndivesDetails;
import com.VegetablesDetails.LocalKangKongDetails;
import com.VegetablesDetails.LocalRedSpinachDetails;
import com.VegetablesDetails.LocalSharpLeavesSpinachDetails;
import com.VegetablesDetails.LongbeanDetails;
import com.VegetablesDetails.LotusRootDetails;
import com.VegetablesDetails.LotusSeedDetails;
import com.VegetablesDetails.MiniSweetPeppersDetails;
import com.VegetablesDetails.NapaCabbageDetails;
import com.VegetablesDetails.OldYellowCucumberDetails;
import com.VegetablesDetails.OrganicDouMiaoDetails;
import com.VegetablesDetails.PearlBeansDetails;
import com.VegetablesDetails.PearlSweetCornBiColourDetails;
import com.VegetablesDetails.PearlSweetCornDetails;
import com.VegetablesDetails.PetaiDetails;
import com.VegetablesDetails.PoachedBambooShootDetails;
import com.VegetablesDetails.QingLongCaiDetails;
import com.VegetablesDetails.RedBellPepperDetails;
import com.VegetablesDetails.RedOnionDetails;
import com.VegetablesDetails.ShallotDetails;
import com.VegetablesDetails.ShangHaiGreenDetails;
import com.VegetablesDetails.ShitakeMushroomsDetails;
import com.VegetablesDetails.SnowPeaDetails;
import com.VegetablesDetails.SpinachDetails;
import com.VegetablesDetails.SpringOnionDetails;
import com.VegetablesDetails.SweetPeaDetails;
import com.VegetablesDetails.SweetcornDetails;
import com.VegetablesDetails.TangOhDetails;
import com.VegetablesDetails.TomatoesDetails;
import com.VegetablesDetails.WaterChestnutsDetails;
import com.VegetablesDetails.WhiteRadishDetails;
import com.VegetablesDetails.WhiteShimeijiMushroomDetails;
import com.VegetablesDetails.WhitecrabmuhsroomDetails;
import com.VegetablesDetails.WinterMelonDetails;
import com.VegetablesDetails.YaconDetails;
import com.VegetablesDetails.YellowBellPepperDetails;
import com.VegetablesDetails.YoumaiDetails;
import com.VegetablesDetails.enokimushroomDetails;
import com.VegetablesDetails.pumpkinDetails;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class MoreActivities extends AppCompatActivity {
    CardView cv1,cv2,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv10,cv11,cv12,cv13,cv14,cv15,cv16,cv17,cv18,cv19,cv20,cv21,cv22,cv23,cv24,cv25,cv26;
    ImageView arrowBack;
    TextView tvMessage1,tvMessage2,tvMessage3,tvMessage4,tvMessage5,tvMessage6,tvMessage7,tvMessage8,tvMessage9,tvMessage10,tvMessage11,tvMessage12,tvMessage13,tvMessage14,tvMessage15,tvMessage16,tvMessage17,tvMessage18,tvMessage19,tvMessage20,tvMessage21,tvMessage22,tvMessage23,tvMessage24,tvMessage25,tvMessage26;

    private FirebaseFirestore db;
    private CollectionReference colRef;
    private DocumentReference docRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_activities2);

        cv1 = findViewById(R.id.cLChilliPadi);

        cv2 = findViewById(R.id.cLLime);

        cv3 = findViewById(R.id.cLCarrot);

        cv4 = findViewById(R.id.cLCherryPlumTomatoes);

        cv5 = findViewById(R.id.cLCherryTomatoes);

        cv6 = findViewById(R.id.cLGreenRadish);

        cv7 = findViewById(R.id.cLAustraliaBroccoli);

        cv8 = findViewById(R.id.cLYacon);

        cv9 = findViewById(R.id.cLWinterMelon);

        cv10 = findViewById(R.id.cLWaterChestnuts);

        cv11 = findViewById(R.id.cLLotusRoot);

        cv12 = findViewById(R.id.cLPearlSweetCorn);

        cv13 = findViewById(R.id.cLShitakeMushroom);

        cv14 = findViewById(R.id.cLArrowRoot);

        cv15 = findViewById(R.id.cLCauliFlower);

        cv16 = findViewById(R.id.cLNappaCabbage);

        cv17 = findViewById(R.id.cLCelery);

        cv18 = findViewById(R.id.cLIcebergLettuce);

        cv19 = findViewById(R.id.cLSweetPea);

        cv20 = findViewById(R.id.cLSnowPea);

        cv21 = findViewById(R.id.cLChineseLeek);

        cv22 = findViewById(R.id.cLLocalChyeSimFlower);

        cv23 = findViewById(R.id.cLKailan);

        cv24 = findViewById(R.id.cLShanghaiGreen);



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
                Intent i = new Intent(MoreActivities.this,ChilliPadiDetails.class);
                startActivity(i);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this, LimeDetails.class);
                startActivity(i);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this,CarrotDetails.class);
                startActivity(i);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this, CherryPlumDetails.class);
                startActivity(i);
            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this,CherryTomatoesDetails.class);
                startActivity(i);
            }
        });

        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this, GreenRadishDetails.class);
                startActivity(i);
            }
        });

        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this,AustraliaBroccoliDetails.class);
                startActivity(i);
            }
        });

        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this, YaconDetails.class);
                startActivity(i);
            }
        });

        cv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this,WinterMelonDetails.class);
                startActivity(i);
            }
        });

        cv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this, WaterChestnutsDetails.class);
                startActivity(i);
            }
        });

        cv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this,LotusRootDetails.class);
                startActivity(i);
            }
        });

        cv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this, PearlSweetCornDetails.class);
                startActivity(i);
            }
        });

        cv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this,ShitakeMushroomsDetails.class);
                startActivity(i);
            }
        });

        cv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this, ArrowRootDetails.class);
                startActivity(i);
            }
        });

        cv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this,CauliFlowerDetails.class);
                startActivity(i);
            }
        });

        cv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this, NapaCabbageDetails.class);
                startActivity(i);
            }
        });

        cv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this, CeleryDetails.class);
                startActivity(i);
            }
        });

        cv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this,IcebergLettuceDetails.class);
                startActivity(i);
            }
        });

        cv19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this, SweetPeaDetails.class);
                startActivity(i);
            }
        });

        cv20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MoreActivities.this,SnowPeaDetails.class);
                startActivity(i);
            }
        });






        colRef = db.collection("ChilliPadi");
        docRef = colRef.document("ChilliPadi");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("ChilliPadi");
                    tvMessage1.setText(text);
                }
            }
        });


        colRef = db.collection("Lime");
        docRef = colRef.document("Lime");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("Lime");
                    tvMessage2.setText(text);
                }
            }
        });

        colRef = db.collection("Carrot");
        docRef = colRef.document("Carrot");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("Carrot");
                    tvMessage3.setText(text);
                }
            }
        });

        colRef = db.collection("CherryPlumTomatoes");
        docRef = colRef.document("CherryPlumTomatoes");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("CherryPlumTomatoes");
                    tvMessage4.setText(text);
                }
            }
        });

        colRef = db.collection("CherryTomatoes");
        docRef = colRef.document("CherryTomatoes");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("CherryTomatoes");
                    tvMessage5.setText(text);
                }
            }
        });

        colRef = db.collection("GreenRadish");
        docRef = colRef.document("GreenRadish");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("GreenRadish");
                    tvMessage6.setText(text);
                }
            }
        });

        colRef = db.collection("AustraliaBroccoli");
        docRef = colRef.document("AustraliaBroccoli");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("AustraliaBroccoli");
                    tvMessage7.setText(text);
                }
            }
        });

        colRef = db.collection("Yacon");
        docRef = colRef.document("Yacon");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("Yacon");
                    tvMessage8.setText(text);
                }
            }
        });

        colRef = db.collection("WinterMelon");
        docRef = colRef.document("WinterMelon");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("WinterMelon");
                    tvMessage9.setText(text);
                }
            }
        });

        colRef = db.collection("WaterChestnuts");
        docRef = colRef.document("WaterChestnuts");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("WaterChestnuts");
                    tvMessage10.setText(text);
                }
            }
        });

        colRef = db.collection("LotusRoot");
        docRef = colRef.document("LotusRoot");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("LotusRoot");
                    tvMessage11.setText(text);
                }
            }
        });

        colRef = db.collection("PearlSweetCorn");
        docRef = colRef.document("PearlSweetCorn");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("PearlSweetCorn");
                    tvMessage12.setText(text);
                }
            }
        });

        colRef = db.collection("ShitakeMushrooms");
        docRef = colRef.document("ShitakeMushrooms");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("ShitakeMushrooms");
                    tvMessage13.setText(text);
                }
            }
        });

        colRef = db.collection("ArrowRoot");
        docRef = colRef.document("ArrowRoot");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("ArrowRoot");
                    tvMessage14.setText(text);
                }
            }
        });

        colRef = db.collection("CauliFlower");
        docRef = colRef.document("CauliFlower");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("CauliFlower");
                    tvMessage15.setText(text);
                }
            }
        });

        colRef = db.collection("NapaCabbage");
        docRef = colRef.document("NapaCabbage");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("NapaCabbage");
                    tvMessage16.setText(text);
                }
            }
        });

        colRef = db.collection("Celery");
        docRef = colRef.document("Celery");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("Celery");
                    tvMessage17.setText(text);
                }
            }
        });

        colRef = db.collection("IcebergLettuce");
        docRef = colRef.document("IcebergLettuce");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("IcebergLettuce");
                    tvMessage18.setText(text);
                }
            }
        });

        colRef = db.collection("SweetPea");
        docRef = colRef.document("SweetPea");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("SweetPea");
                    tvMessage19.setText(text);
                }
            }
        });

        colRef = db.collection("SnowPea");
        docRef = colRef.document("SnowPea");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("SnowPea");
                    tvMessage20.setText(text);
                }
            }
        });







        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        DatabaseReference databaseReference = firebaseDatabase.getReference();





    }
}