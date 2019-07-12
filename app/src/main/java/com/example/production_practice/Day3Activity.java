package com.example.production_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Day3Activity extends AppCompatActivity {
    private Button mMON,mTUE,mTHU,mFRI,mSAT,mSUN,mBtn1,mBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day3);
        mMON=(Button)findViewById(R.id.day3_1);
        mMON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (Day3Activity.this,Day1Activity.class);
                startActivity(intent);
            }
        });

        mTUE=(Button)findViewById(R.id.day3_2);
        mTUE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (Day3Activity.this,Day2Activity.class);
                startActivity(intent);
            }
        });

        mTHU=(Button)findViewById(R.id.day3_3);
        mTHU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (Day3Activity.this,Day4Activity.class);
                startActivity(intent);
            }
        });

        mFRI=(Button)findViewById(R.id.day3_4);
        mFRI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (Day3Activity.this,Day5Activity.class);
                startActivity(intent);
            }
        });

        mSAT=(Button)findViewById(R.id.day3_5);
        mSAT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (Day3Activity.this,Day6Activity.class);
                startActivity(intent);
            }
        });

        mSUN=(Button)findViewById(R.id.day3_6);
        mSUN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (Day3Activity.this,Day7Activity.class);
                startActivity(intent);
            }
        });
        mBtn1 = findViewById(R.id.shijian_1);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Day3Activity.this,ZhuyiliActivity.class);
                startActivity(intent);
            }
        });
        mBtn2 = findViewById(R.id.shijian_2);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Day3Activity.this,ShijueActivity.class);
                startActivity(intent);
            }
        });

    }
}