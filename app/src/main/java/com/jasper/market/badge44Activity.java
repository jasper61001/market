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

public class badge44Activity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = badge44Activity.class.getSimpleName();
    TextView badge44_3_cook;
    TextView badge44_3_fly;
    TextView badge44_3_naturl;
    TextView badge44_3_night;
    TextView badge44_3_shape;

//    TextView badge32__dogass;
//    TextView badge32__friedshrimp;
//    TextView badge32_game_white;
//    TextView badge32_guineapig;
//    TextView badge32_guineapig_3;

    int badge44_3_cook_counter;
    int badge44_3_fly_counter;
    int badge44_3_naturl_counter;
    int badge44_3_night_counter;
    int badge44_3_shape_counter;

//    int badge32__dogass_counter;
//    int badge32__friedshrimp_counter;
//    int badge32_game_white_counter;
//    int badge32_guineapig_counter;
//    int badge32_guineapig_3_counter;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference mRef = database.getReference("badge");

    String size = "44MM";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badge44);
        mRef.addValueEventListener(new ValueEventListener() {
            public void onDataChange(DataSnapshot dataSnapshot) {
//----------2.取得資料庫---------------

                badge44_3_cook_counter = Integer.parseInt(dataSnapshot.child(size).child("3_cook").getValue() + "");
                badge44_3_fly_counter = Integer.parseInt(dataSnapshot.child(size).child("3_fly").getValue() + "");
                badge44_3_naturl_counter = Integer.parseInt(dataSnapshot.child(size).child("3_naturl").getValue() + "");
                badge44_3_night_counter = Integer.parseInt(dataSnapshot.child(size).child("3_night").getValue() + "");
                badge44_3_shape_counter = Integer.parseInt(dataSnapshot.child(size).child("3_shape").getValue() + "");

//                badge32__dogass_counter = Integer.parseInt(dataSnapshot.child(size).child("dogass").getValue() + "");
//                badge32__friedshrimp_counter = Integer.parseInt(dataSnapshot.child(size).child("friedshrimp").getValue() + "");
//                badge32_game_white_counter = Integer.parseInt(dataSnapshot.child(size).child("game_white").getValue() + "");
//                badge32_guineapig_counter = Integer.parseInt(dataSnapshot.child(size).child("guineapig").getValue() + "");
//                badge32_guineapig_3_counter = Integer.parseInt(dataSnapshot.child(size).child("guineapig_3").getValue() + "");
                settext();

            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        badge44_3_cook = findViewById(R.id.badge44_3_cook_counter);
        badge44_3_fly = findViewById(R.id.badge44_3_fly_counter);
        badge44_3_naturl = findViewById(R.id.badge44_3_naturl_counter);
        badge44_3_night = findViewById(R.id.badge44_3_night_counter);
        badge44_3_shape = findViewById(R.id.badge44_3_shape_counter);
//
//        badge32__dogass = findViewById(R.id.badge32__dogass_counter);
//        badge32__friedshrimp = findViewById(R.id.badge32__friedshrimp_counter);
//        badge32_game_white = findViewById(R.id.badge32_game_white_counter);
//        badge32_guineapig = findViewById(R.id.badge32_guineapig_counter);
//        badge32_guineapig_3 = findViewById(R.id.badge32_guineapig_3_counter);

        findViewById(R.id.badge44_3_cook_bt).setOnClickListener(this);
        findViewById(R.id.badge44_3_fly_bt).setOnClickListener(this);
        findViewById(R.id.badge44_3_naturl_bt).setOnClickListener(this);
        findViewById(R.id.badge44_3_night_bt).setOnClickListener(this);
        findViewById(R.id.badge44_3_shape_bt).setOnClickListener(this);

//        findViewById(R.id.badge32__dogass_bt).setOnClickListener(this);
//        findViewById(R.id.badge32__friedshrimp_bt).setOnClickListener(this);
//        findViewById(R.id.badge32_game_white_bt).setOnClickListener(this);
//        findViewById(R.id.badge32_guineapig_bt).setOnClickListener(this);
//        findViewById(R.id.badge32_guineapig_3_bt).setOnClickListener(this);

    }

    public  void settext(){
//------4.顯示數量--------

        badge44_3_cook.setText("總數 : " + badge44_3_cook_counter);
        badge44_3_fly.setText("總數 : " + badge44_3_fly_counter);
        badge44_3_naturl.setText("總數 : " + badge44_3_naturl_counter);
        badge44_3_night.setText("總數 : " + badge44_3_night_counter);
        badge44_3_shape.setText("總數 : " + badge44_3_shape_counter);

//        badge32__dogass.setText("總數 : " + badge32__dogass_counter);
//        badge32__friedshrimp.setText("總數 : " + badge32__friedshrimp_counter);
//        badge32_game_white.setText("總數 : " + badge32_game_white_counter);
//        badge32_guineapig.setText("總數 : " + badge32_guineapig_counter);
//        badge32_guineapig_3.setText("總數 : " + badge32_guineapig_3_counter);


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
                        setvalue(reset,"3_cook", badge44_3_cook);
                        setvalue(reset,"3_fly", badge44_3_fly);
                        setvalue(reset,"3_naturl", badge44_3_naturl);
                        setvalue(reset, "3_night", badge44_3_night);
                        setvalue(reset,"3_shape",badge44_3_shape);

                    }
                })
                .show();
    }



    public  void setvalue(int c, final String s, final TextView t) {
        c++;
        t.setText("總數 : " + c);
        mRef.child(size).child(s).setValue(c);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.badge44_3_cook_bt:
                setvalue(badge44_3_cook_counter,"3_cook", badge44_3_cook);
                break;
            case R.id.badge44_3_fly_bt:
                setvalue(badge44_3_fly_counter,"3_fly", badge44_3_fly);
                break;
            case R.id.badge44_3_naturl_bt:
                setvalue(badge44_3_naturl_counter,"3_naturl", badge44_3_naturl);
                break;
            case R.id.badge44_3_night_bt:
                setvalue(badge44_3_night_counter, "3_night", badge44_3_night);
                break;
            case R.id.badge44_3_shape_bt:
                setvalue(badge44_3_shape_counter,"3_shape",badge44_3_shape);
                break;
//            case R.id.badge32__dogass_bt:
//                setvalue(badge32__dogass_counter,"dogass", badge32__dogass);
//                break;
//            case R.id.badge32__friedshrimp_bt:
//                setvalue(badge32__friedshrimp_counter,"friedshrimp", badge32__friedshrimp);
//                break;
//            case R.id.badge32_game_white_bt:
//                setvalue(badge32_game_white_counter,"game_white",badge32_game_white);
//                break;
//            case R.id.badge32_guineapig_bt:
//                setvalue(badge32_guineapig_counter,"guineapig", badge32_guineapig);
//                break;
//            case R.id.badge32_guineapig_3_bt:
//                setvalue(badge32_guineapig_3_counter, "guineapig_3", badge32_guineapig_3);
//                break;
        }
    }
}
