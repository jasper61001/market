package com.jasper.market;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
public static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.badge32_bt).setOnClickListener(this);
        findViewById(R.id.badge44_bt).setOnClickListener(this);

    }
    public void calculate(View view){
        Intent calculate = new Intent(this, calculateActivity.class);
        startActivity(calculate);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.badge32_bt:
                Intent badge = new Intent(this, badgeActivity.class);
                startActivity(badge);
                break;
            case R.id.badge44_bt:
                Log.d(TAG, "44");
                Intent badge44 = new Intent(this, badge44Activity.class);
                startActivity(badge44);
                break;
        }
    }
}
