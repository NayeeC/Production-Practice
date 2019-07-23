package com.example.production_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class anmoActivity extends AppCompatActivity {
    private Button mCz,mxw1,mxw2,mxw3,mxw4,mxw5,mxw6,mxw7,mxw8,mxw9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anmo);
        mCz=(Button)findViewById(R.id.shoufa);
        mCz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(anmoActivity.this,caozuoActivity.class);
                startActivity(intent);
            }
        });
        mxw1=(Button)findViewById(R.id.xue_1);
        mxw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(anmoActivity.this,xuewei1Activity.class);
                startActivity(intent);
            }
        });
        mxw2=(Button)findViewById(R.id.xue_2);
        mxw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(anmoActivity.this,xuewei2Activity.class);
                startActivity(intent);
            }
        });
        mxw3=(Button)findViewById(R.id.xue_3);
        mxw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(anmoActivity.this,xuewei3Activity.class);
                startActivity(intent);
            }
    });
        mxw4=(Button)findViewById(R.id.xue_4);
        mxw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(anmoActivity.this,xuewei4Activity.class);
                startActivity(intent);
            }
        });
        mxw5=(Button)findViewById(R.id.xue_5);
        mxw5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(anmoActivity.this,xuewei5Activity.class);
                startActivity(intent);
            }
        });
        mxw6=(Button)findViewById(R.id.xue_6);
        mxw6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(anmoActivity.this,xuewei6Activity.class);
                startActivity(intent);
            }
        });
        mxw7=(Button)findViewById(R.id.xue_7);
        mxw7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(anmoActivity.this,xuewei7Activity.class);
                startActivity(intent);
            }
        });
        mxw8=(Button)findViewById(R.id.xue_8);
        mxw8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(anmoActivity.this,xuewei8Activity.class);
                startActivity(intent);
            }
        });
        mxw9=(Button)findViewById(R.id.xue_9);
        mxw9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(anmoActivity.this,xuewei9Activity.class);
                startActivity(intent);
            }
        });
    }
}
