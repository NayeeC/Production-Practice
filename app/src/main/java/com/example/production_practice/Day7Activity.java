package com.example.production_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Day7Activity extends AppCompatActivity {
    private Button mMON,mTUE,mWED,mTHU,mFRI,mSAT,mBtn1,mBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day7);
        mMON=(Button)findViewById(R.id.day7_1);
        mMON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent (Day7Activity.this,Day1Activity.class);
                startActivity(intent);
            }
        });

        mTUE=(Button)findViewById(R.id.day7_2);
        mTUE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent (Day7Activity.this,Day2Activity.class);
                startActivity(intent);
            }
        });

        mWED=(Button)findViewById(R.id.day7_3);
        mWED.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent (Day7Activity.this,Day3Activity.class);
                startActivity(intent);
            }
        });

        mTHU=(Button)findViewById(R.id.day7_4);
        mTHU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent (Day7Activity.this,Day4Activity.class);
                startActivity(intent);
            }
        });

        mFRI=(Button)findViewById(R.id.day7_5);
        mFRI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent (Day7Activity.this,Day5Activity.class);
                startActivity(intent);
            }
        });

        mSAT=(Button)findViewById(R.id.day7_6);
        mSAT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent (Day7Activity.this,Day6Activity.class);
                startActivity(intent);
            }
        });
        mBtn1 = findViewById(R.id.shijian_1);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Day7Activity.this,ZhuyiliActivity.class);
                startActivity(intent);
            }
        });
        mBtn2 = findViewById(R.id.shijian_2);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Day7Activity.this,ShijueActivity.class);
                startActivity(intent);
            }
        });
    }
}
