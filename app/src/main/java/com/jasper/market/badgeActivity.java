package com.jasper.market;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class badgeActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = badgeActivity.class.getSimpleName();
//---------1.設定TEXTVIEW、INT------------


    TextView badge32_3_dinosaur;
    TextView badge32_3_face;
    TextView badge32_3_hello;
    TextView badge32_bulan_pig;
    TextView badge32__dinosaur_blue;

    TextView badge32__dogass;
    TextView badge32__friedshrimp;
    TextView badge32_game_white;
    TextView badge32_guineapig;
    TextView badge32_guineapig_3;

    TextView badge32_mountain_blue;
    TextView badge32_penguin_pig;
    TextView badge32_pig;
    TextView badge32_planet_blue;
    TextView badge32_planet_pink;

    TextView badge32_rice;
    TextView badge32_switch;
    TextView badge32_toastegg;
    TextView badge32_tomato;
    TextView badge32_whitebear_guineapig;

    int badge32_3_dinosaur_counter;
    int badge32_3_face_counter;
    int badge32_3_hello_counter;
    int badge32_bulan_pig_counter;
    int badge32__dinosaur_blue_counter;

    int badge32__dogass_counter;
    int badge32__friedshrimp_counter;
    int badge32_game_white_counter;
    int badge32_guineapig_counter;
    int badge32_guineapig_3_counter;

    int badge32_mountain_blue_counter;
    int badge32_penguin_pig_counter;
    int badge32_pig_counter;
    int badge32_planet_blue_counter;
    int badge32_planet_pink_counter;

    int badge32_rice_counter;
    int badge32_switch_counter;
    int badge32_toastegg_counter;
    int badge32_tomato_counter;
    int badge32_whitebear_guineapig_counter;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference mRef = database.getReference("badge");

    String size = "32MM";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badge);
        mRef.addValueEventListener(new ValueEventListener() {
            public void onDataChange(DataSnapshot dataSnapshot) {
//----------2.取得資料庫---------------
                Log.d(TAG, String.valueOf(mRef));
                badge32_3_dinosaur_counter = Integer.parseInt(dataSnapshot.child(size).child("3_dinosaur").getValue() + "");
                badge32_3_face_counter = Integer.parseInt(dataSnapshot.child(size).child("3_face").getValue() + "");
                badge32_3_hello_counter = Integer.parseInt(dataSnapshot.child(size).child("3_hello").getValue() + "");
                badge32_bulan_pig_counter = Integer.parseInt(dataSnapshot.child(size).child("bulan_pig").getValue() + "");
                badge32__dinosaur_blue_counter = Integer.parseInt(dataSnapshot.child(size).child("dinosaur_blue").getValue() + "");

                badge32__dogass_counter = Integer.parseInt(dataSnapshot.child(size).child("dogass").getValue() + "");
                badge32__friedshrimp_counter = Integer.parseInt(dataSnapshot.child(size).child("friedshrimp").getValue() + "");
                badge32_game_white_counter = Integer.parseInt(dataSnapshot.child(size).child("game_white").getValue() + "");
                badge32_guineapig_counter = Integer.parseInt(dataSnapshot.child(size).child("guineapig").getValue() + "");
                badge32_guineapig_3_counter = Integer.parseInt(dataSnapshot.child(size).child("guineapig_3").getValue() + "");

                badge32_mountain_blue_counter = Integer.parseInt(dataSnapshot.child(size).child("mountain_blue").getValue() + "");
                badge32_penguin_pig_counter = Integer.parseInt(dataSnapshot.child(size).child("penguin_pig").getValue() + "");
                badge32_pig_counter = Integer.parseInt(dataSnapshot.child(size).child("pig").getValue() + "");
                badge32_planet_blue_counter = Integer.parseInt(dataSnapshot.child(size).child("planet_blue").getValue() + "");
                badge32_planet_pink_counter = Integer.parseInt(dataSnapshot.child(size).child("planet_pink").getValue() + "");

                badge32_rice_counter = Integer.parseInt(dataSnapshot.child(size).child("rice").getValue() + "");
                badge32_switch_counter = Integer.parseInt(dataSnapshot.child(size).child("switch").getValue() + "");
                badge32_toastegg_counter = Integer.parseInt(dataSnapshot.child(size).child("toastegg").getValue() + "");
                badge32_tomato_counter = Integer.parseInt(dataSnapshot.child(size).child("tomato").getValue() + "");
                badge32_whitebear_guineapig_counter = Integer.parseInt(dataSnapshot.child(size).child("whitebear_guineapig").getValue() + "");
                settext();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
//-------3.設定變數和按鈕----------

        badge32_3_dinosaur = findViewById(R.id.badge32_3_dinosaur_counter);
        badge32_3_face = findViewById(R.id.badge32_3_face_counter);
        badge32_3_hello = findViewById(R.id.badge32_3_hello_counter);
        badge32_bulan_pig = findViewById(R.id.badge32_bulan_pig_counter);
        badge32__dinosaur_blue = findViewById(R.id.badge32__dinosaur_blue_counter);

        badge32__dogass = findViewById(R.id.badge32__dogass_counter);
        badge32__friedshrimp = findViewById(R.id.badge32__friedshrimp_counter);
        badge32_game_white = findViewById(R.id.badge32_game_white_counter);
        badge32_guineapig = findViewById(R.id.badge32_guineapig_counter);
        badge32_guineapig_3 = findViewById(R.id.badge32_guineapig_3_counter);

        badge32_mountain_blue = findViewById(R.id.badge32_mountain_blue_counter);
        badge32_penguin_pig = findViewById(R.id.badge32_penguin_pig_counter);
        badge32_pig = findViewById(R.id.badge32_pig_counter);
        badge32_planet_blue = findViewById(R.id.badge32_planet_blue_counter);
        badge32_planet_pink = findViewById(R.id.badge32_planet_pink_counter);

        badge32_rice = findViewById(R.id.badge32_rice_counter);
        badge32_switch = findViewById(R.id.badge32_switch_counter);
        badge32_toastegg = findViewById(R.id.badge32_toastegg_counter);
        badge32_tomato = findViewById(R.id.badge32_tomato_counter);
        badge32_whitebear_guineapig = findViewById(R.id.badge32_whitebear_guineapig_counter);


        findViewById(R.id.badge32_3_dinosaur_bt).setOnClickListener(this);
        findViewById(R.id.badge32_3_face_bt).setOnClickListener(this);
        findViewById(R.id.badge32_3_hello_bt).setOnClickListener(this);
        findViewById(R.id.badge32_bulan_pig_bt).setOnClickListener(this);
        findViewById(R.id.badge32__dinosaur_blue_bt).setOnClickListener(this);

        findViewById(R.id.badge32__dogass_bt).setOnClickListener(this);
        findViewById(R.id.badge32__friedshrimp_bt).setOnClickListener(this);
        findViewById(R.id.badge32_game_white_bt).setOnClickListener(this);
        findViewById(R.id.badge32_guineapig_bt).setOnClickListener(this);
        findViewById(R.id.badge32_guineapig_3_bt).setOnClickListener(this);

        findViewById(R.id.badge32_mountain_blue_bt).setOnClickListener(this);
        findViewById(R.id.badge32_penguin_pig_bt).setOnClickListener(this);
        findViewById(R.id.badge32_pig_bt).setOnClickListener(this);
        findViewById(R.id.badge32_planet_blue_bt).setOnClickListener(this);
        findViewById(R.id.badge32_planet_pink_bt).setOnClickListener(this);

        findViewById(R.id.badge32_rice_bt).setOnClickListener(this);
        findViewById(R.id.badge32_switch_bt).setOnClickListener(this);
        findViewById(R.id.badge32_toastegg_bt).setOnClickListener(this);
        findViewById(R.id.badge32_tomato_bt).setOnClickListener(this);
        findViewById(R.id.badge32_whitebear_guineapig_bt).setOnClickListener(this);

    }

    public  void settext(){
//------4.顯示數量--------
        badge32_3_dinosaur.setText("總數 : " + badge32_3_dinosaur_counter);
        badge32_3_face.setText("總數 : " + badge32_3_face_counter);
        badge32_3_hello.setText("總數 : " + badge32_3_hello_counter);
        badge32_bulan_pig.setText("總數 : " + badge32_bulan_pig_counter);
        badge32__dinosaur_blue.setText("總數 : " + badge32__dinosaur_blue_counter);

        badge32__dogass.setText("總數 : " + badge32__dogass_counter);
        badge32__friedshrimp.setText("總數 : " + badge32__friedshrimp_counter);
        badge32_game_white.setText("總數 : " + badge32_game_white_counter);
        badge32_guineapig.setText("總數 : " + badge32_guineapig_counter);
        badge32_guineapig_3.setText("總數 : " + badge32_guineapig_3_counter);

        badge32_mountain_blue.setText("總數 : " + badge32_mountain_blue_counter);
        badge32_penguin_pig.setText("總數 : " + badge32_penguin_pig_counter);
        badge32_pig.setText("總數 : " + badge32_pig_counter);
        badge32_planet_blue.setText("總數 : " + badge32_planet_blue_counter);
        badge32_planet_pink.setText("總數 : " + badge32_planet_pink_counter);

        badge32_rice.setText("總數 : " + badge32_rice_counter);
        badge32_switch.setText("總數 : " + badge32_switch_counter);
        badge32_toastegg.setText("總數 : " + badge32_toastegg_counter);
        badge32_tomato.setText("總數 : " + badge32_tomato_counter);
        badge32_whitebear_guineapig.setText("總數 : " + badge32_whitebear_guineapig_counter);
    }
    public void reset(View view){
        new AlertDialog.Builder(this)
                .setTitle("警告!!!")
                .setMessage("確定要重新計算?")
                .setNegativeButton("取消",null)
                .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        int reset = -1;
                        setvalue(reset,"3_dinosaur", badge32_3_dinosaur);
                        setvalue(reset,"3_face", badge32_3_face);
                        setvalue(reset,"3_hello", badge32_3_hello);
                        setvalue(reset, "bulan_pig", badge32_bulan_pig);
                        setvalue(reset,"dinosaur_blue",badge32__dinosaur_blue);
                        setvalue(reset,"dogass", badge32__dogass);
                        setvalue(reset,"friedshrimp", badge32__friedshrimp);
                        setvalue(reset,"game_white",badge32_game_white);
                        setvalue(reset,"guineapig", badge32_guineapig);
                        setvalue(reset, "guineapig_3", badge32_guineapig_3);
                        setvalue(reset,"mountain_blue",badge32_mountain_blue);
                        setvalue(reset,"penguin_pig",badge32_penguin_pig);
                        setvalue(reset,"pig", badge32_pig);
                        setvalue(reset, "planet_blue", badge32_planet_blue);
                        setvalue(reset,"planet_pink",badge32_planet_pink);
                        setvalue(reset,"rice", badge32_rice);
                        setvalue(reset,"switch", badge32_switch);
                        setvalue(reset,"toastegg", badge32_toastegg);
                        setvalue(reset,"tomato", badge32_tomato);
                        setvalue(reset,"whitebear_guineapig", badge32_whitebear_guineapig);
                    }
                })
                .show();
//        badge32_switch.setText("總數 : " + 0);
//        badge32_3_dinosaur.setText("總數 : " + 0);
//        badge32_3_face.setText("總數 : " + 0);
//        badge32_3_hello.setText("總數 : " + 0);
//        badge32_bulan_pig.setText("總數 : " + 0);
    }

    public  void setvalue(int c, final String s, final TextView t) {
                c++;
                t.setText("總數 : " + c);
                mRef.child(size).child(s).setValue(c);
    }
    @Override
    public void onClick(View v) {
//----------5.設定按下後的動作----------------
        switch (v.getId()){
            case R.id.badge32_3_dinosaur_bt:
                setvalue(badge32_3_dinosaur_counter,"3_dinosaur", badge32_3_dinosaur);
                break;
            case R.id.badge32_3_face_bt:
                setvalue(badge32_3_face_counter,"3_face", badge32_3_face);
                break;
            case R.id.badge32_3_hello_bt:
                setvalue(badge32_3_hello_counter,"3_hello", badge32_3_hello);
                break;
            case R.id.badge32_bulan_pig_bt:
                setvalue(badge32_bulan_pig_counter, "bulan_pig", badge32_bulan_pig);
                break;
            case R.id.badge32__dinosaur_blue_bt:
                setvalue(badge32__dinosaur_blue_counter,"dinosaur_blue",badge32__dinosaur_blue);
                break;
            case R.id.badge32__dogass_bt:
                setvalue(badge32__dogass_counter,"dogass", badge32__dogass);
                break;
            case R.id.badge32__friedshrimp_bt:
                setvalue(badge32__friedshrimp_counter,"friedshrimp", badge32__friedshrimp);
                break;
            case R.id.badge32_game_white_bt:
                setvalue(badge32_game_white_counter,"game_white",badge32_game_white);
                break;
            case R.id.badge32_guineapig_bt:
                setvalue(badge32_guineapig_counter,"guineapig", badge32_guineapig);
                break;
            case R.id.badge32_guineapig_3_bt:
                setvalue(badge32_guineapig_3_counter, "guineapig_3", badge32_guineapig_3);
                break;
            case R.id.badge32_mountain_blue_bt:
                setvalue(badge32_mountain_blue_counter,"mountain_blue",badge32_mountain_blue);
                break;
            case R.id.badge32_penguin_pig_bt:
                setvalue(badge32_penguin_pig_counter,"penguin_pig",badge32_penguin_pig);
                break;
            case R.id.badge32_pig_bt:
                setvalue(badge32_pig_counter,"pig", badge32_pig);
                break;
            case R.id.badge32_planet_blue_bt:
                setvalue(badge32_planet_blue_counter, "planet_blue", badge32_planet_blue);
                break;
            case R.id.badge32_planet_pink_bt:
                setvalue(badge32_planet_pink_counter,"planet_pink",badge32_planet_pink);
                break;
            case R.id.badge32_rice_bt:
                setvalue(badge32_rice_counter,"rice", badge32_rice);
                break;
            case R.id.badge32_switch_bt:
                setvalue(badge32_switch_counter,"switch", badge32_switch);
                break;
            case R.id.badge32_toastegg_bt:
                setvalue(badge32_toastegg_counter,"toastegg", badge32_toastegg);
                break;
            case R.id.badge32_tomato_bt:
                setvalue(badge32_tomato_counter,"tomato", badge32_tomato);
                break;
            case R.id.badge32_whitebear_guineapig_bt:
                setvalue(badge32_whitebear_guineapig_counter,"whitebear_guineapig", badge32_whitebear_guineapig);
                break;
        }
    }
}
