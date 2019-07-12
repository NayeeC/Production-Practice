package com.example.production_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Day2Activity extends AppCompatActivity {
    private Button mMON,mWED,mTHU,mFRI,mSAT,mSUN,mBtn1,mBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2);
        mMON=(Button)findViewById(R.id.day2_1);
        mMON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Day2Activity.this,Day1Activity.class);
                startActivity(intent);
            }
        });

        mWED=(Button)findViewById(R.id.day2_2);
        mWED.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Day2Activity.this,Day3Activity.class);
                startActivity(intent);
            }
        });

        mTHU=(Button)findViewById(R.id.day2_3);
        mTHU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Day2Activity.this,Day4Activity.class);
                startActivity(intent);
            }
        });

        mFRI=(Button)findViewById(R.id.day2_4);
        mFRI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Day2Activity.this,Day5Activity.class);
                startActivity(intent);
            }
        });

        mSAT=(Button)findViewById(R.id.day2_5);
        mSAT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Day2Activity.this,Day6Activity.class);
                startActivity(intent);
            }
        });

        mSUN=(Button)findViewById(R.id.day2_6);
        mSUN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Day2Activity.this,Day7Activity.class);
                startActivity(intent);
            }
        });
        mBtn1 = findViewById(R.id.shijian_1);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Day2Activity.this,JiyiliActivity.class);
                startActivity(intent);
            }
        });
        mBtn2 = findViewById(R.id.shijian_2);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Day2Activity.this, BianbieliActivity.class);
                startActivity(intent); }
            });
    }
}
