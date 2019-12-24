package com.jasper.market;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class calculateActivity extends AppCompatActivity {
    public static final String TAG = calculateActivity.class.getSimpleName();

    TextView price;
    int priceTmp = 0;
    int totalPrice = 0;
//    int ColorValue = Color.GRAY;
//    int resetColor = Color.WHITE;
    Button postcard_1;
    Button postcard_4;
    Button postcard_10;
    Button sticker50_1;
    Button sticker50_4;
    Button badge_1;
    Button badge_4;
    Button badge_10;
    Button socks_1;
    Button socks_2;
    Button hotBadge_1;
    Button hotBadge_2;
    Button drinkBag;
    Button socksHotbadge;
    Button postcardBadge100;
    Button postcardBadge200;
    Button pencilcase;
    Button calendar;


    Button tatoo;

    String goods = "";
    String totalgoods = "";

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference mRef = database.getReference("earn");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        Log.d(TAG, "database");
        mRef.addValueEventListener(new ValueEventListener() {
            public void onDataChange(DataSnapshot dataSnapshot) {

                totalPrice = Integer.parseInt(dataSnapshot.child("price").getValue() + "");
                totalgoods = dataSnapshot.child("detail").getValue() + "";
                price.setText(totalPrice + "");
                Log.d(TAG, totalPrice + "");
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        price = findViewById(R.id.price);
        postcard_1 = findViewById(R.id.postcard_1_bt);
        postcard_4 = findViewById(R.id.postcard_4_bt);
        postcard_10 = findViewById(R.id.postcard_10_bt);
        sticker50_1 = findViewById(R.id.sticker50_1_bt);
        sticker50_4 = findViewById(R.id.sticker50_4_bt);
        badge_1 = findViewById(R.id.badge_1_bt);
        badge_4 = findViewById(R.id.badge_4_bt);
        badge_10 = findViewById(R.id.badge_10_bt);
        socks_1 = findViewById(R.id.socks_1_bt);
        socks_2 = findViewById(R.id.socks_2_bt);
        hotBadge_1 = findViewById(R.id.hotBadge_1_bt);
        hotBadge_2 = findViewById(R.id.hotBadge_2_bt);
        drinkBag = findViewById(R.id.drinkBag_bt);
        socksHotbadge = findViewById(R.id.socksHotbadge_bt);
        postcardBadge100 = findViewById(R.id.postcardBadge100_bt);
        postcardBadge200 = findViewById(R.id.postcardBadge200_bt);
        pencilcase = findViewById(R.id.pencilcase_bt);
        calendar = findViewById(R.id.calendar_bt);
        tatoo = findViewById(R.id.tatoo_bt);
    }
    public void postcard_1(View view){
        postcard_1.setEnabled(false);
        priceTmp += 30;
        goods += "一張明信片 ";
    }
    public void postcard_4(View view){
        postcard_4.setEnabled(false);
        priceTmp += 100;
        goods += "四張明信片 ";
    }
    public void postcard_10(View view){
        postcard_10.setEnabled(false);
        priceTmp += 200;
        goods += "十張明信片 ";
    }
    public void sticker50_1(View view){
        sticker50_1.setEnabled(false);
        priceTmp += 50;
        goods += "一張50元貼紙 ";
    }
    public void sticker50_4(View view){
        sticker50_4.setEnabled(false);
        priceTmp += 150;
        goods += "3+1張50元貼紙 ";
    }
    public void badge_1(View view){
        badge_1.setEnabled(false);
        priceTmp += 30;
        goods += "一個胸章 ";
    }
    public void badge_4(View view){
        badge_4.setEnabled(false);
        priceTmp += 100;
        goods += "四個胸章 ";
    }
    public void badge_10(View view){
        badge_10.setEnabled(false);
        priceTmp += 200;
        goods += "十個胸章 ";
    }
    public void socks_1(View view){
        socks_1.setEnabled(false);
        priceTmp += 120;
        goods += "一雙襪子 ";
    }
    public void socks_2(View view){
        socks_2.setEnabled(false);
        priceTmp += 200;
        goods += "兩雙襪子 ";
    }
    public void hotBadge_1(View view){
        hotBadge_1.setEnabled(false);
        priceTmp += 120;
        goods += "一個燙布胸針 ";
    }
    public void hotBadge_2(View view){
        hotBadge_2.setEnabled(false);
        priceTmp += 200;
        goods += "兩個燙布胸針 ";
    }
    public void drinkBag(View view){
        drinkBag.setEnabled(false);
        priceTmp += 200;
        goods += "一個飲料提袋 ";
    }
    public void socksHotbadge(View view){
        socksHotbadge.setEnabled(false);
        priceTmp += 200;
        goods += "一個襪子一個燙布胸針 ";
    }
    public void postcardBadge100(View view){
        postcardBadge100.setEnabled(false);
        priceTmp += 100;
        goods += "明信片+胸章100 ";
    }
    public void postcardBadge200(View view){
        postcardBadge200.setEnabled(false);
        priceTmp += 200;
        goods += "明信片+胸章200 ";
    }
    public void pencilcase(View view){
        pencilcase.setEnabled(false);
        priceTmp += 150;
        goods += "一個鉛筆盒 ";
    }
    public void calendar(View view){
        calendar.setEnabled(false);
        priceTmp += 200;
        goods += "一本桌曆 ";
    }
    public void tatoo(View view){
        tatoo.setEnabled(false);
        priceTmp += 30;
        goods += "一張紋身貼紙 ";
    }
    public void calculate(View view){

        new AlertDialog.Builder(calculateActivity.this)
                .setTitle("商品確認")
                .setMessage(goods)
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        reset();
                    }
                })
                .setPositiveButton("確認", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        totalPrice += priceTmp;
                        price.setText(totalPrice + "");
                        totalgoods += goods + ": " + priceTmp +  "\n";
                        mRef.child("price").setValue(totalPrice + "");
                        mRef.child("detail").setValue(totalgoods + "");

                        reset();
                    }
                })
                .show();

    }
    public void reset(){
        priceTmp = 0;
        postcard_1.setEnabled(true);
        postcard_4.setEnabled(true);
        postcard_10.setEnabled(true);
        sticker50_1.setEnabled(true);
        sticker50_4.setEnabled(true);
        badge_1.setEnabled(true);
        badge_4.setEnabled(true);
        badge_10.setEnabled(true);
        socks_1.setEnabled(true);
        socks_2.setEnabled(true);
        hotBadge_1.setEnabled(true);
        hotBadge_2.setEnabled(true);
        drinkBag.setEnabled(true);
        socksHotbadge.setEnabled(true);
        postcardBadge100.setEnabled(true);
        postcardBadge200.setEnabled(true);
        pencilcase.setEnabled(true);
        calendar.setEnabled(true);
        tatoo.setEnabled(true);
        goods = "";
    }

    public void totalgoods(View view){
        new AlertDialog.Builder(this)
                .setTitle("明細")
                .setMessage(totalgoods)
                .setPositiveButton("OK",null)
                .show();
    }

    public void databaseReset(View view){
        new AlertDialog.Builder(this)
                .setTitle("資料庫清除")
                .setMessage("確定要清除資料庫")
                .setNegativeButton("取消", null)
                .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mRef.child("price").setValue(0 + "");
                        mRef.child("detail").setValue("");
                    }
                })
                .show();

    }

}
