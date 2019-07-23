package com.example.production_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SettingActivity extends Activity implements View.OnClickListener {
    private ImageView ivBack;
    private LinearLayout llPatientText, lleditAccountMessagel, llHelp, llFedBack, llDeclare, llAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 取消标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.setting_layout);
        ivBack = findViewById(R.id.iv_setting_back);
        llPatientText = findViewById(R.id.ll_patient_text);
        lleditAccountMessagel = findViewById(R.id.ll_change_my_account);
        llFedBack = findViewById(R.id.ll_feedback);
        llDeclare = findViewById(R.id.ll_declare);
        llAboutUs = findViewById(R.id.ll_about_us);
        llHelp = findViewById(R.id.ll_help);
        ivBack.setOnClickListener(this);
        llPatientText.setOnClickListener(this);
        lleditAccountMessagel.setOnClickListener(this);
        llHelp.setOnClickListener(this);
        llFedBack.setOnClickListener(this);
        llDeclare.setOnClickListener(this);
        llAboutUs.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_setting_back:
                finish();
                break;
            case R.id.ll_patient_text:
                Intent intent6 = new Intent(this, PatientTextActivity.class);
                startActivity(intent6);
                break;
            case R.id.ll_change_my_account:
                Intent intent = new Intent(this, EditAccountMessageActivity.class);
                startActivity(intent);
                break;
            case R.id.ll_help:
                Intent intent1 = new Intent(this, TextActivity.class);
                startActivity(intent1);
                break;
            case R.id.ll_feedback:
                Intent intent2 = new Intent(this, FeedBackActivity.class);
                startActivity(intent2);
                break;
            case R.id.ll_declare:
                Intent intent3 = new Intent(this, TextActivity.class);
                startActivity(intent3);
                break;
            case R.id.ll_about_us:
                Intent intent4 = new Intent(this, TextActivity.class);
                startActivity(intent4);
                break;
        }
    }
}
