package com.example.production_practice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class WenjuanActivity extends AppCompatActivity {

    private Button mTijiao;
    private RadioGroup mRG1;
    private RadioGroup mRG2;
    private RadioGroup mRG3;
    private RadioGroup mRG4;
    private RadioGroup mRG5;
    private RadioGroup mRG6;
    private RadioGroup mRG7;
    private RadioGroup mRG8;
    private RadioGroup mRG9;
    private RadioGroup mRG10;
    private RadioGroup mRG11;
    private RadioGroup mRG12;
    private RadioGroup mRG13;
    private RadioGroup mRG14;
    private RadioGroup mRG15;
    private RadioGroup mRG16;
    public static int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wenjuan);
        mTijiao = findViewById(R.id.tijiao);
        mRG1 = findViewById(R.id.rg_1);
        mRG2 = findViewById(R.id.rg_2);
        mRG3 = findViewById(R.id.rg_3);
        mRG4 = findViewById(R.id.rg_4);
        mRG5 = findViewById(R.id.rg_5);
        mRG6 = findViewById(R.id.rg_6);
        mRG7 = findViewById(R.id.rg_7);
        mRG8 = findViewById(R.id.rg_8);
        mRG9 = findViewById(R.id.rg_9);
        mRG10 = findViewById(R.id.rg_10);
        mRG11 = findViewById(R.id.rg_11);
        mRG12 = findViewById(R.id.rg_12);
        mRG13 = findViewById(R.id.rg_13);
        mRG14 = findViewById(R.id.rg_14);
        mRG15 = findViewById(R.id.rg_15);
        mRG16 = findViewById(R.id.rg_16);
        mTijiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int a = 0; a < mRG1.getChildCount(); a++){
                    RadioButton radioButton = (RadioButton) mRG1.getChildAt(a);
                    if (radioButton.isChecked()){
                        count=a;
                        break;
                    }
                }
                for (int b = 0; b< mRG2.getChildCount(); b++){
                    RadioButton radioButton = (RadioButton) mRG2.getChildAt(b);
                    if (radioButton.isChecked()){
                        count=count+b;
                        break;
                    }
                }
                for (int c = 0; c< mRG3.getChildCount(); c++){
                    RadioButton radioButton = (RadioButton) mRG3.getChildAt(c);
                    if (radioButton.isChecked()){
                        count=count+c;
                        break;
                    }
                }
                for (int d = 0; d< mRG4.getChildCount(); d++){
                    RadioButton radioButton = (RadioButton) mRG4.getChildAt(d);
                    if (radioButton.isChecked()){
                        count=count+d;
                        break;
                    }
                }
                for (int e = 0; e< mRG5.getChildCount(); e++){
                    RadioButton radioButton = (RadioButton) mRG5.getChildAt(e);
                    if (radioButton.isChecked()){
                        count=count+e;
                        break;
                    }
                }
                for (int f = 0; f< mRG6.getChildCount(); f++){
                    RadioButton radioButton = (RadioButton) mRG6.getChildAt(f);
                    if (radioButton.isChecked()){
                        count=count+f;
                        break;
                    }
                }
                for (int g = 0; g< mRG7.getChildCount(); g++){
                    RadioButton radioButton = (RadioButton) mRG7.getChildAt(g);
                    if (radioButton.isChecked()){
                        count=count+g;
                        break;
                    }
                }
                for (int h = 0; h< mRG8.getChildCount(); h++){
                    RadioButton radioButton = (RadioButton) mRG8.getChildAt(h);
                    if (radioButton.isChecked()){
                        count=count+h;
                        break;
                    }
                }
                for (int i = 0; i< mRG9.getChildCount(); i++){
                    RadioButton radioButton = (RadioButton) mRG9.getChildAt(i);
                    if (radioButton.isChecked()){
                        count=count+i;
                        break;
                    }
                }
                for (int j = 0; j< mRG10.getChildCount(); j++){
                    RadioButton radioButton = (RadioButton) mRG10.getChildAt(j);
                    if (radioButton.isChecked()){
                        count=count+j;
                        break;
                    }
                }
                for (int k = 0; k< mRG11.getChildCount(); k++){
                    RadioButton radioButton = (RadioButton) mRG11.getChildAt(k);
                    if (radioButton.isChecked()){
                        count=count+k;
                        break;
                    }
                }
                for (int l = 0; l< mRG12.getChildCount(); l++){
                    RadioButton radioButton = (RadioButton) mRG12.getChildAt(l);
                    if (radioButton.isChecked()){
                        count=count+l;
                        break;
                    }
                }
                for (int m = 0; m< mRG13.getChildCount(); m++){
                    RadioButton radioButton = (RadioButton) mRG13.getChildAt(m);
                    if (radioButton.isChecked()){
                        count=count+m;
                        break;
                    }
                }
                for (int n = 0; n< mRG14.getChildCount(); n++){
                    RadioButton radioButton = (RadioButton) mRG14.getChildAt(n);
                    if (radioButton.isChecked()){
                        count=count+n;
                        break;
                    }
                }
                for (int o = 0; o< mRG15.getChildCount(); o++){
                    RadioButton radioButton = (RadioButton) mRG15.getChildAt(o);
                    if (radioButton.isChecked()){
                        count=count+o;
                        break;
                    }
                }
                for (int p = 0; p< mRG16.getChildCount(); p++){
                    RadioButton radioButton = (RadioButton) mRG16.getChildAt(p);
                    if (radioButton.isChecked()){
                        count=count+p;
                        break;
                    }
                }
                if(count<5){
                    AlertDialog.Builder builder = new AlertDialog.Builder(WenjuanActivity.this);
                    builder.setTitle("结果").setMessage("基本可排除多动症")
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Intent intent = new Intent(WenjuanActivity.this, PatientTextActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            }).show();
                }else if (count<16){
                    AlertDialog.Builder builder = new AlertDialog.Builder(WenjuanActivity.this);
                    builder.setTitle("结果").setMessage("有较轻的多动倾向")
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Intent intent = new Intent(WenjuanActivity.this, PatientTextActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            }).show();
                }else if (count<31){
                    AlertDialog.Builder builder = new AlertDialog.Builder(WenjuanActivity.this);
                    builder.setTitle("结果").setMessage("有明显的多动症")
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Intent intent = new Intent(WenjuanActivity.this, PatientTextActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            }).show();
                }else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(WenjuanActivity.this);
                    builder.setTitle("结果").setMessage("有严重的多动症")
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Intent intent = new Intent(WenjuanActivity.this, PatientTextActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            }).show();
                }
            }
        });
    }
}
