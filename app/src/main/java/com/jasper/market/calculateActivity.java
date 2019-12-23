package com.jasper.market;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
    Button tatoo;

    String goods = "";
    String totalgoods = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        price = findViewById(R.id.price);
        postcard_1 = findViewById(R.id.postcard_1_bt);
        postcard_4 = findViewById(R.id.postcard_4_bt);
        postcard_10 = findViewById(R.id.postcard_10_bt);
        sticker50_1 = findViewById(R.id.sticker50_1_bt);
        sticker50_4 = findViewById(R.id.sticker50_4_bt);
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
    public void tatoo(View view){
        tatoo.setEnabled(false);
        priceTmp += 30;
        goods += "一張紋身貼紙 ";
    }
    public void calculate(View view){
        Log.d(TAG, "calculate: ");
        new AlertDialog.Builder(calculateActivity.this)
                .setTitle("商品確認")
                .setMessage(goods)
                .setNegativeButton("取消",null)
                .setPositiveButton("確認", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        totalPrice += priceTmp;
                        price.setText(totalPrice + "");
                        totalgoods += goods + ": " + priceTmp +  "\n";
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

}
