package com.example.production_practice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Author: lsx
 * Time:  2019/7/11   15:07
 * Description: This is LLS
 */
public class MySettingActivity extends Activity implements View.OnClickListener {
    private LinearLayout ll_change_my_account, ll_help, ll_feedback, ll_declare, ll_about_us;
    private TextView tvDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置布局
        setContentView(R.layout.activity_my_setting);
        //绑定布局ID
        ll_change_my_account = findViewById(R.id.ll_change_my_account);
        ll_help = findViewById(R.id.ll_help);
        ll_feedback = findViewById(R.id.ll_feedback);
        ll_declare = findViewById(R.id.ll_declare);
        ll_about_us = findViewById(R.id.ll_about_us);
        tvDes = findViewById(R.id.tvDes);
        //绑定点击事件
        ll_change_my_account.setOnClickListener(this);
        ll_help.setOnClickListener(this);
        ll_feedback.setOnClickListener(this);
        ll_declare.setOnClickListener(this);
        ll_about_us.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //点击事件在这写
        switch (v.getId()) {
            //设置信息
            case R.id.ll_change_my_account:
                break;
            //帮助
            case R.id.ll_help:
                break;
            //反馈意见
            case R.id.ll_feedback:
                break;
            //声明
            case R.id.ll_declare:
                break;
            //关于我们
            case R.id.ll_about_us:
                break;
        }

    }
}
