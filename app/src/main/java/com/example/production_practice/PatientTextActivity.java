package com.example.production_practice;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Author: yangxu
 * Time:  2019/7/21   15:43
 * Description: This is  ${Name}
 */
public class PatientTextActivity extends Activity {
    private TextView tvPower, tvFenXi, tvYiJian;
    private LinearLayout llBootom;
    private TextView tvText;
    private ImageView ivBack;
    private String[] provinces = new String[]{"较轻", "明显", "严重"};
    private String[] des = new String[]{"学习无困难，但有多动行为，思想不很集中或冲动任性，扰乱课堂秩序。", "多动表现不突出，但思想很难集中，学习困难严重，成绩很差或逐渐下降。", "多动、注意力不集中、学习行为障碍、任性冲动。"};
    private String[] answer = new String[]{"可先进行心理指导和行为训练。", "宜试用药物治疗，观察效果。", "经脑诱发电位及心理测试确诊后应立即开始药物治疗。"};
    private Button mCeshi;

    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_text);
        tvPower = findViewById(R.id.tv_power_message);
        llBootom = findViewById(R.id.ll_bootom);
        ivBack = findViewById(R.id.iv_setting_back);
        tvText = findViewById(R.id.tv_text);
        tvFenXi = findViewById(R.id.tv_fenxi);
        tvYiJian = findViewById(R.id.tv_yijian);
        tvPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(PatientTextActivity.this).setTitle("选择病情程度")
                        .setSingleChoiceItems(provinces, -1, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //index是一个int类型的类变量，保存当前选中的列表项索引
                                index = which;
                            }
                        }).setPositiveButton("保存", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        llBootom.setVisibility(View.VISIBLE);
                        tvFenXi.setText(des[index]);
                        tvYiJian.setText(answer[index]);
                        tvPower.setText(provinces[index]);
                    }
                }).show();
            }
        });
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        tvText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PatientTextActivity.this, TextActivity.class);
                startActivity(intent);
            }
        });
        mCeshi = findViewById(R.id.ceshi);
        mCeshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PatientTextActivity.this,WenjuanActivity.class);
                startActivity(intent);
            }
        });
    }
}
