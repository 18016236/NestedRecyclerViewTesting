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

public class Vegetables extends AppCompatActivity {

    CardView cv1,cv2,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv10,cv11,cv12,cv13,cv14,cv15,cv16,cv17,cv18,cv19,cv20,cv21,cv22,cv23,cv24,cv25,cv26,cv27,cv28,cv29,cv30,cv31,cv32,cv33,cv34,cv35,cv36,cv37,cv38,cv39,cv40,cv41,cv42,cv43,cv44,cv45,cv46,cv47,cv48,cv49,cv50,cv51,cv52,cv53,cv54,cv55,cv56,cv57,cv58,cv59,cv60,cv61,cv62,cv63,cv64,cv65,cv66,cv67,cv68,cv69,cv70,cv71,cv72,cv73,cv74,cv75,cv76,cv77;
    ImageView arrowBack;
    TextView tvMessage1,tvMessage2,tvMessage3,tvMessage4,tvMessage5,tvMessage6,tvMessage7,tvMessage8,tvMessage9,tvMessage10,tvMessage11,tvMessage12,tvMessage13,tvMessage14,tvMessage15,tvMessage16,tvMessage17,tvMessage18,tvMessage19,tvMessage20,tvMessage21,tvMessage22,tvMessage23,tvMessage24,tvMessage25,tvMessage26,tvMessage27,tvMessage28,tvMessage29,tvMessage30,tvMessage31,tvMessage32,tvMessage33,tvMessage34,tvMessage35,tvMessage36,tvMessage37,tvMessage38,tvMessage39,tvMessage40,tvMessage41,tvMessage42,tvMessage43,tvMessage44,tvMessage45,tvMessage46,tvMessage47,tvMessage48,tvMessage49,tvMessage50,tvMessage51,tvMessage52,tvMessage53,tvMessage54,tvMessage55,tvMessage56,tvMessage57,tvMessage58,tvMessage59,tvMessage60,tvMessage61,tvMessage62,tvMessage63,tvMessage64,tvMessage65,tvMessage66,tvMessage67,tvMessage68,tvMessage69,tvMessage70,tvMessage71,tvMessage72,tvMessage73,tvMessage74,tvMessage75,tvMessage76,tvMessage77;

    private FirebaseFirestore db;
    private CollectionReference colRef;
    private DocumentReference docRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

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

        cv25 = findViewById(R.id.cLYouMai);

        cv26 = findViewById(R.id.cLSpinach);

        cv27 = findViewById(R.id.cLBabypakChoy);

        cv28 = findViewById(R.id.cLBabyShanghaiGreen);

        cv29 = findViewById(R.id.cLBabyChyeSim);

        cv30 = findViewById(R.id.cLBabyKailan);

        cv31 = findViewById(R.id.cLBrownShimejiMushrooms);

        cv32 = findViewById(R.id.cLWhiteShimeijiMushrooms);

        cv33 = findViewById(R.id.cLenokimushroom);

        cv34 = findViewById(R.id.cLPumpkin);

        cv35 = findViewById(R.id.cLChestnuts);

        cv36 = findViewById(R.id.cLGreenBellPepper);

        cv37 = findViewById(R.id.cLRedBellPepper);

        cv38 = findViewById(R.id.cLYellowBellPepper);

        cv39 = findViewById(R.id.cLBigVegetable);

        cv40 = findViewById(R.id.cLTangoh);

        cv41 = findViewById(R.id.cLLocalEndives);

        cv42 = findViewById(R.id.cLBrinjal);

        cv43 = findViewById(R.id.cLLadyfinger);

        cv44 = findViewById(R.id.cLBabyFrenchBean);

        cv45 = findViewById(R.id.cLBabyKailans);

        cv46 = findViewById(R.id.cLWhiteRadish);

        cv47 = findViewById(R.id.cLShallots);

        cv48 = findViewById(R.id.cLTomatoes);

        cv49 = findViewById(R.id.cLKauKee);

        cv50 = findViewById(R.id.cLChineseCabbage);

        cv51 = findViewById(R.id.cLMiniSweetPeppers);

        cv52 = findViewById(R.id.cLOldYellowCucumber);

        cv53 = findViewById(R.id.cLLocalKangKong);

        cv54 = findViewById(R.id.cLLocalRedSpinach);

        cv55 = findViewById(R.id.cLLocalSharpLeavesSpinach);

        cv56 = findViewById(R.id.cLPetai);

        cv57 = findViewById(R.id.cLOrganicDouMiao);

        cv58 = findViewById(R.id.cLHollandPotato);

        cv59 = findViewById(R.id.cLAustraliaPotato);

        cv60 = findViewById(R.id.cLWhitecrabmuhsroom);

        cv61 = findViewById(R.id.cLEryngiimuhsroom);

        cv62 = findViewById(R.id.cLPoachedbambooshoot);

        cv63 = findViewById(R.id.cLLotusSeed);

        cv64 = findViewById(R.id.cLLotusSeed);

        cv65 = findViewById(R.id.cLJapaneseCucumber);

        cv66 = findViewById(R.id.cLLongBean);

        cv67 = findViewById(R.id.clLocalCucumber);

        cv68 = findViewById(R.id.cLQingLongCai);

        cv69 = findViewById(R.id.clGarlic);

        cv70 = findViewById(R.id.cLRedOnion);

        cv71 = findViewById(R.id.cLBrownOnion);

        cv72 = findViewById(R.id.cLPearlSweetCornBiColor);

        cv73 = findViewById(R.id.clSweetcorn);

        cv74 = findViewById(R.id.clSpringOnion);

        cv75 = findViewById(R.id.cLCoriander);

        cv76 = findViewById(R.id.cLChineseCelery);

        cv77 = findViewById(R.id.cLPearlBeans);

        tvMessage1 = findViewById(R.id.ChilliPadiTitle);

        tvMessage2 = findViewById(R.id.LimeTitle);

        tvMessage3 = findViewById(R.id.TitleCarrot);

        tvMessage4 = findViewById(R.id.CherryPlumTomatoesTitle);

        tvMessage5 = findViewById(R.id.CherryTomatoesTitle);

        tvMessage6 = findViewById(R.id.GreenRadish);

        tvMessage7 = findViewById(R.id.AustraliaBroccoliTitle);

        tvMessage8 = findViewById(R.id.YaconTitle);

        tvMessage9 = findViewById(R.id.WinterMelonTitle);

        tvMessage10 = findViewById(R.id.WaterChestnutsTitle);

        tvMessage11 = findViewById(R.id.LotusRootTitle);

        tvMessage12 = findViewById(R.id.PearlSweetCornTitle);

        tvMessage13 = findViewById(R.id.ShitakeMushroomTitle);

        tvMessage14 = findViewById(R.id.ArrowRootTitle);

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

        tvMessage42 = findViewById(R.id.Title42);

        tvMessage43 = findViewById(R.id.Title43);

        tvMessage44 = findViewById(R.id.Title44);

        tvMessage45 = findViewById(R.id.Title45);

        tvMessage46 = findViewById(R.id.Title46);

        tvMessage47 = findViewById(R.id.Title47);

        tvMessage48 = findViewById(R.id.Title48);

        tvMessage49 = findViewById(R.id.Title49);

        tvMessage50 = findViewById(R.id.Title50);

        tvMessage51 = findViewById(R.id.Title51);

        tvMessage52 = findViewById(R.id.Title52);

        tvMessage53 = findViewById(R.id.Title53);

        tvMessage54 = findViewById(R.id.Title54);

        tvMessage55 = findViewById(R.id.Title55);

        tvMessage56 = findViewById(R.id.Title56);

        tvMessage57 = findViewById(R.id.Title57);

        tvMessage58 = findViewById(R.id.Title58);

        tvMessage59 = findViewById(R.id.Title59);

        tvMessage60 = findViewById(R.id.Title60);

        tvMessage61 = findViewById(R.id.Title61);

        tvMessage62 = findViewById(R.id.Title62);

        tvMessage63 = findViewById(R.id.Title63);

        tvMessage64 = findViewById(R.id.Title64);

        tvMessage65 = findViewById(R.id.Title65);

        tvMessage66 = findViewById(R.id.Title66);

        tvMessage67 = findViewById(R.id.Title67);

        tvMessage68 = findViewById(R.id.Title68);

        tvMessage69 = findViewById(R.id.Title69);

        tvMessage70 = findViewById(R.id.Title70);

        tvMessage71 = findViewById(R.id.Title71);

        tvMessage72 = findViewById(R.id.Title72);

        tvMessage73 = findViewById(R.id.Title73);

        tvMessage74 = findViewById(R.id.Title74);

        tvMessage75 = findViewById(R.id.Title75);

        tvMessage76 = findViewById(R.id.Title76);

        tvMessage77 = findViewById(R.id.Title77);

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
                Intent i = new Intent(Vegetables.this, ChilliPadiDetails.class);
                startActivity(i);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, LimeDetails.class);
                startActivity(i);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, CarrotDetails.class);
                startActivity(i);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, CherryPlumDetails.class);
                startActivity(i);
            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, CherryTomatoesDetails.class);
                startActivity(i);
            }
        });

        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, GreenRadishDetails.class);
                startActivity(i);
            }
        });


        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, AustraliaBroccoliDetails.class);
                startActivity(i);
            }
        });

        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, YaconDetails.class);
                startActivity(i);
            }
        });

        cv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, WinterMelonDetails.class);
                startActivity(i);
            }
        });

        cv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, WaterChestnutsDetails.class);
                startActivity(i);
            }
        });

        cv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, LotusRootDetails.class);
                startActivity(i);
            }
        });

        cv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, PearlSweetCornDetails.class);
                startActivity(i);
            }
        });

        cv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, ShitakeMushroomsDetails.class);
                startActivity(i);
            }
        });

        cv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, ArrowRootDetails.class);
                startActivity(i);
            }
        });

        cv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, CauliFlowerDetails.class);
                startActivity(i);
            }
        });

        cv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, NapaCabbageDetails.class);
                startActivity(i);
            }
        });

        cv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, CeleryDetails.class);
                startActivity(i);
            }
        });

        cv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, IcebergLettuceDetails.class);
                startActivity(i);
            }
        });

        cv19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, SweetPeaDetails.class);
                startActivity(i);
            }
        });

        cv20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, SnowPeaDetails.class);
                startActivity(i);
            }
        });

        cv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, ChineseLeekDetails.class);
                startActivity(i);
            }
        });

        cv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, ChyeSimFlowerDetails.class);
                startActivity(i);
            }
        });

        cv23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, KailanDetails.class);
                startActivity(i);
            }
        });

        cv24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, ShangHaiGreenDetails.class);
                startActivity(i);
            }
        });

        cv25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, YoumaiDetails.class);
                startActivity(i);
            }
        });

        cv26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, SpinachDetails.class);
                startActivity(i);
            }
        });

        cv27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, BabyPakChoyDetails.class);
                startActivity(i);
            }
        });

        cv28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, BabyShanghaiGreenDetails.class);
                startActivity(i);
            }
        });

        cv29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, BabyChaiSimDetails.class);
                startActivity(i);
            }
        });

        cv30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, BabyKailanDetails.class);
                startActivity(i);
            }
        });

        cv31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, BrownShimeijiMushroomDetails.class);
                startActivity(i);
            }
        });

        cv32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, WhiteShimeijiMushroomDetails.class);
                startActivity(i);
            }
        });

        cv33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, enokimushroomDetails.class);
                startActivity(i);
            }
        });

        cv34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, pumpkinDetails.class);
                startActivity(i);
            }
        });

        cv35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, ChestnutsDetails.class);
                startActivity(i);
            }
        });

        cv36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, GreenBellPepperDetails.class);
                startActivity(i);
            }
        });

        cv37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, RedBellPepperDetails.class);
                startActivity(i);
            }
        });

        cv38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, YellowBellPepperDetails.class);
                startActivity(i);
            }
        });

        cv39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, BigVegetbalesDetails.class);
                startActivity(i);
            }
        });

        cv40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, TangOhDetails.class);
                startActivity(i);
            }
        });

        cv41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, LocalEndivesDetails.class);
                startActivity(i);
            }
        });

        cv42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, BrinjalDetails.class);
                startActivity(i);
            }
        });

        cv43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, LadyFingerDetails.class);
                startActivity(i);
            }
        });

        cv44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, BabyFrenchBeanDetails.class);
                startActivity(i);
            }
        });

        cv45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, BabyKailansDetails.class);
                startActivity(i);
            }
        });

        cv46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, WhiteRadishDetails.class);
                startActivity(i);
            }
        });

        cv47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, ShallotDetails.class);
                startActivity(i);
            }
        });

        cv48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, TomatoesDetails.class);
                startActivity(i);
            }
        });

        cv49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, KauKeeDetails.class);
                startActivity(i);
            }
        });

        cv50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, ChineseCabbagesDetails.class);
                startActivity(i);
            }
        });

        cv51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, MiniSweetPeppersDetails.class);
                startActivity(i);
            }
        });

        cv52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, OldYellowCucumberDetails.class);
                startActivity(i);
            }
        });

        cv53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, LocalKangKongDetails.class);
                startActivity(i);
            }
        });

        cv54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, LocalRedSpinachDetails.class);
                startActivity(i);
            }
        });

        cv55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, LocalSharpLeavesSpinachDetails.class);
                startActivity(i);
            }
        });

        cv56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, PetaiDetails.class);
                startActivity(i);
            }
        });

        cv57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, OrganicDouMiaoDetails.class);
                startActivity(i);
            }
        });

        cv58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, HollandPotatoDetails.class);
                startActivity(i);
            }
        });

        cv59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, AustraliaPotatoDetails.class);
                startActivity(i);
            }
        });

        cv60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, WhitecrabmuhsroomDetails.class);
                startActivity(i);
            }
        });

        cv61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, EryngiimuhsroomDetails.class);
                startActivity(i);
            }
        });

        cv62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, PoachedBambooShootDetails.class);
                startActivity(i);
            }
        });

        cv63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, LotusSeedDetails.class);
                startActivity(i);
            }
        });

        cv64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, GingkoNutsDetails.class);
                startActivity(i);
            }
        });

        cv65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, JapaneseCucumberDetails.class);
                startActivity(i);
            }
        });

        cv66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, LongbeanDetails.class);
                startActivity(i);
            }
        });

        cv67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, LocalCucumberDetails.class);
                startActivity(i);
            }
        });

        cv68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, QingLongCaiDetails.class);
                startActivity(i);
            }
        });

        cv69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, GarlicDetails.class);
                startActivity(i);
            }
        });

        cv70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, RedOnionDetails.class);
                startActivity(i);
            }
        });

        cv71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, BrownOnionDetails.class);
                startActivity(i);
            }
        });

        cv72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, PearlSweetCornBiColourDetails.class);
                startActivity(i);
            }
        });

        cv73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, SweetcornDetails.class);
                startActivity(i);
            }
        });

        cv74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, SpringOnionDetails.class);
                startActivity(i);
            }
        });

        cv75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, CorianderDetails.class);
                startActivity(i);
            }
        });

        cv76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, ChineseCeleryDetails.class);
                startActivity(i);
            }
        });

        cv77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vegetables.this, PearlBeansDetails.class);
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

        colRef = db.collection("ChineseLeek");
        docRef = colRef.document("ChineseLeek");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("ChineseLeek");
                    tvMessage21.setText(text);
                }
            }
        });

        colRef = db.collection("ChyeSimFlower");
        docRef = colRef.document("ChyeSimFlower");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("ChyeSimFlower");
                    tvMessage22.setText(text);
                }
            }
        });


        colRef = db.collection("Kailan");
        docRef = colRef.document("Kailan");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("Kailan");
                    tvMessage23.setText(text);
                }
            }
        });

        colRef = db.collection("ShanghaiGreen");
        docRef = colRef.document("ShanghaiGreen");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("ShanghaiGreen");
                    tvMessage24.setText(text);
                }
            }
        });

        colRef = db.collection("youmai");
        docRef = colRef.document("youmai");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("youmai");
                    tvMessage25.setText(text);
                }
            }
        });

        colRef = db.collection("spinach");
        docRef = colRef.document("spinach");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("spinach");
                    tvMessage26.setText(text);
                }
            }
        });

        colRef = db.collection("babypakchoy");
        docRef = colRef.document("babypakchoy");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("babypakchoy");
                    tvMessage27.setText(text);
                }
            }
        });

        colRef = db.collection("babyshanghaigreen");
        docRef = colRef.document("babyshanghaigreen");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("babyshanghaigreen");
                    tvMessage28.setText(text);
                }
            }
        });

        colRef = db.collection("babychyesim");
        docRef = colRef.document("babychyesim");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("babychyesim");
                    tvMessage29.setText(text);
                }
            }
        });

        colRef = db.collection("babykailan");
        docRef = colRef.document("babykailan");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("babykailan");
                    tvMessage30.setText(text);
                }
            }
        });

        colRef = db.collection("brownshimeijimushroom");
        docRef = colRef.document("brownshimeijimushroom");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("brownshimeijimushroom");
                    tvMessage31.setText(text);
                }
            }
        });

        colRef = db.collection("whiteshimeijimushroom");
        docRef = colRef.document("whiteshimeijimushroom");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("whiteshimeijimushroom");
                    tvMessage32.setText(text);
                }
            }
        });

        colRef = db.collection("enokimushroom");
        docRef = colRef.document("enokimushroom");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("enokimushroom");
                    tvMessage33.setText(text);
                }
            }
        });

        colRef = db.collection("pumpkin");
        docRef = colRef.document("pumpkin");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("pumpkin");
                    tvMessage34.setText(text);
                }
            }
        });

        colRef = db.collection("chestnuts");
        docRef = colRef.document("chestnuts");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chestnuts");
                    tvMessage35.setText(text);
                }
            }
        });

        colRef = db.collection("greenbellpepper");
        docRef = colRef.document("greenbellpepper");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("greenbellpepper");
                    tvMessage36.setText(text);
                }
            }
        });

        colRef = db.collection("redbellpepper");
        docRef = colRef.document("redbellpepper");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("redbellpepper");
                    tvMessage37.setText(text);
                }
            }
        });

        colRef = db.collection("yellowbellpepper");
        docRef = colRef.document("yellowbellpepper");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("yellowbellpepper");
                    tvMessage38.setText(text);
                }
            }
        });

        colRef = db.collection("大菜心");
        docRef = colRef.document("大菜心");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("大菜心");
                    tvMessage39.setText(text);
                }
            }
        });

        colRef = db.collection("TangOh");
        docRef = colRef.document("TangOh");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("TangOh");
                    tvMessage40.setText(text);
                }
            }
        });

        colRef = db.collection("localendives");
        docRef = colRef.document("localendives");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("localendives");
                    tvMessage41.setText(text);
                }
            }
        });

        colRef = db.collection("brinjal");
        docRef = colRef.document("brinjal");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("brinjal");
                    tvMessage42.setText(text);
                }
            }
        });

        colRef = db.collection("ladyfinger");
        docRef = colRef.document("ladyfinger");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("ladyfinger");
                    tvMessage43.setText(text);
                }
            }
        });

        colRef = db.collection("babyfrenchbean");
        docRef = colRef.document("babyfrenchbean");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("babyfrenchbean");
                    tvMessage44.setText(text);
                }
            }
        });

        colRef = db.collection("babykailans");
        docRef = colRef.document("babykailans");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("babykailans");
                    tvMessage45.setText(text);
                }
            }
        });

        colRef = db.collection("whiteradish");
        docRef = colRef.document("whiteradish");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("whiteradish");
                    tvMessage46.setText(text);
                }
            }
        });

        colRef = db.collection("shallots");
        docRef = colRef.document("shallots");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("shallots");
                    tvMessage47.setText(text);
                }
            }
        });

        colRef = db.collection("Tomatoes");
        docRef = colRef.document("Tomatoes");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("Tomatoes");
                    tvMessage48.setText(text);
                }
            }
        });

        colRef = db.collection("kaukee");
        docRef = colRef.document("kaukee");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("kaukee");
                    tvMessage49.setText(text);
                }
            }
        });

        colRef = db.collection("chinesecabbage");
        docRef = colRef.document("chinesecabbage");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chinesecabbage");
                    tvMessage50.setText(text);
                }
            }
        });

        colRef = db.collection("minisweetpeppers");
        docRef = colRef.document("minisweetpeppers");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("minisweetpeppers");
                    tvMessage51.setText(text);
                }
            }
        });

        colRef = db.collection("oldyellowcucmber");
        docRef = colRef.document("oldyellowcucmber");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("oldyellowcucmber");
                    tvMessage52.setText(text);
                }
            }
        });

        colRef = db.collection("localkangkong");
        docRef = colRef.document("localkangkong");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("localkangkong");
                    tvMessage53.setText(text);
                }
            }
        });

        colRef = db.collection("localredspinach");
        docRef = colRef.document("localredspinach");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("localredspinach");
                    tvMessage54.setText(text);
                }
            }
        });

        colRef = db.collection("localsharpleavesspinach");
        docRef = colRef.document("localsharpleavesspinach");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("localsharpleavesspinach");
                    tvMessage55.setText(text);
                }
            }
        });

        colRef = db.collection("petai");
        docRef = colRef.document("petai");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("petai");
                    tvMessage56.setText(text);
                }
            }
        });

        colRef = db.collection("organicdoumiao");
        docRef = colRef.document("organicdoumiao");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("organicdoumiao");
                    tvMessage57.setText(text);
                }
            }
        });


        colRef = db.collection("hollandpotato");
        docRef = colRef.document("hollandpotato");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("hollandpotato");
                    tvMessage58.setText(text);
                }
            }
        });

        colRef = db.collection("australiapotato");
        docRef = colRef.document("australiapotato");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("australiapotato");
                    tvMessage59.setText(text);
                }
            }
        });

        colRef = db.collection("whitecrabmushroom");
        docRef = colRef.document("whitecrabmushroom");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("whitecrabmushroom");
                    tvMessage60.setText(text);
                }
            }
        });

        colRef = db.collection("eryngiimushroom");
        docRef = colRef.document("eryngiimushroom");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("eryngiimushroom");
                    tvMessage61.setText(text);
                }
            }
        });

        colRef = db.collection("poachedbambooshoot");
        docRef = colRef.document("poachedbambooshoot");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("poachedbambooshoot");
                    tvMessage62.setText(text);
                }
            }
        });

        colRef = db.collection("lotusseed100g");
        docRef = colRef.document("lotusseed100g");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("lotusseed100g");
                    tvMessage63.setText(text);
                }
            }
        });

        colRef = db.collection("gingkonuts80g");
        docRef = colRef.document("gingkonuts80g");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("gingkonuts80g");
                    tvMessage64.setText(text);
                }
            }
        });

        colRef = db.collection("JapaneseCucumber500g");
        docRef = colRef.document("JapaneseCucumber500g");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("JapaneseCucumber500g");
                    tvMessage65.setText(text);
                }
            }
        });

        colRef = db.collection("longbean400g");
        docRef = colRef.document("longbean400g");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("longbean400g");
                    tvMessage66.setText(text);
                }
            }
        });

        colRef = db.collection("localcucumber");
        docRef = colRef.document("localcucumber");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("localcucumber");
                    tvMessage67.setText(text);
                }
            }
        });

        colRef = db.collection("qinglongcai");
        docRef = colRef.document("qinglongcai");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("qinglongcai");
                    tvMessage68.setText(text);
                }
            }
        });

        colRef = db.collection("garlic");
        docRef = colRef.document("garlic");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("garlic");
                    tvMessage69.setText(text);
                }
            }
        });


        colRef = db.collection("redonion");
        docRef = colRef.document("redonion");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("redonion");
                    tvMessage70.setText(text);
                }
            }
        });

        colRef = db.collection("brownonion");
        docRef = colRef.document("brownonion");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("brownonion");
                    tvMessage71.setText(text);
                }
            }
        });

        colRef = db.collection("pearlsweetcornbicolour");
        docRef = colRef.document("pearlsweetcornbicolour");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("pearlsweetcornbicolour");
                    tvMessage72.setText(text);
                }
            }
        });

        colRef = db.collection("sweetcorn");
        docRef = colRef.document("sweetcorn");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("sweetcorn");
                    tvMessage73.setText(text);
                }
            }
        });

        colRef = db.collection("springonion");
        docRef = colRef.document("springonion");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("springonion");
                    tvMessage74.setText(text);
                }
            }
        });


        colRef = db.collection("coriander");
        docRef = colRef.document("coriander");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("coriander");
                    tvMessage75.setText(text);
                }
            }
        });


        colRef = db.collection("chinesecelery");
        docRef = colRef.document("chinesecelery");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("chinesecelery");
                    tvMessage76.setText(text);
                }
            }
        });

        colRef = db.collection("pearlbeans");
        docRef = colRef.document("pearlbeans");
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error !=null){
                    return;
                }
                if (value !=null && value.exists()){
                    String text = (String) value.get("pearlbeans");
                    tvMessage77.setText(text);
                }
            }
        });


        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        DatabaseReference databaseReference = firebaseDatabase.getReference();





    }
}