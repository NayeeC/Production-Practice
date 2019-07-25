package com.example.production_practice;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

/**
 * Author: yangxu
 * Time:  2019/7/20   15:54
 * Description: This is  ${Name}
 */
public class EditAccountMessageActivity extends Activity {
    private EditText etAge;
    private RadioGroup radgroup, radgroupFamily;
    private String strAge, strSix, strFamily;
    private Button btnSave;
    private ImageView ivBack;
    private TextView tvText;
    private SharedPreferences mSP;
    private SharedPreferences.Editor mEditor;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_account_message);
        etAge = findViewById(R.id.et_age);
        radgroup = findViewById(R.id.radioGroup);
        radgroupFamily = findViewById(R.id.radioGroupFamily);
        btnSave = findViewById(R.id.btn_save);
        ivBack = findViewById(R.id.iv_setting_back);
        tvText = findViewById(R.id.tv_text);

        mSP = getSharedPreferences("data",MODE_PRIVATE);
        mEditor = mSP.edit();
        etAge.setText(mSP.getString("nianling",""));

        TextWatcher watcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d(TAG, "beforeTextChanged: s = " + s + ", start = " + start +
                        ", count = " + count + ", after = " + after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d(TAG, "onTextChanged: s = " + s + ", start = " + start +
                        ", before = " + before + ", count = " + count);
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d(TAG, "afterTextChanged: " + s);
                strAge = s.toString();
                isChangeOk();
            }
        };
        etAge.addTextChangedListener(watcher);
        initAction();
    }

    private void initAction() {
        radgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radbtn = (RadioButton) findViewById(checkedId);
                strSix = radbtn.getText().toString();
                isChangeOk();
            }
        });
        radgroupFamily.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radbtn = (RadioButton) findViewById(checkedId);
                strFamily = radbtn.getText().toString();
                isChangeOk();
            }
        });
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "恭喜你保存成功", Toast.LENGTH_LONG).show();
                mEditor.putString("nianling",etAge.getText().toString());
                mEditor.commit();
                etAge.setText(mSP.getString("nianling",""));
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
                Intent intent = new Intent(EditAccountMessageActivity.this, TextActivity.class);
                startActivity(intent);
            }
        });
    }

    private void isChangeOk() {
        if (!StringUtil.isEmpty(strAge) && !StringUtil.isEmpty(strSix) && !StringUtil.isEmpty(strFamily)) {
            btnSave.setEnabled(true);
        } else {
            btnSave.setEnabled(false);
        }
    }
}
