package com.example.production_practice;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Author: yangxu
 * Time:  2019/7/20   15:54
 * Description: This is  ${Name}
 */
public class EditAccountMessageActivity extends Activity {
    private EditText etAge,etAge2,etAge3,etAge4;
    private Button btnSave;
    private ImageView mIv;
    private SharedPreferences mSP,mSP2,mSP3,mSP4;
    private SharedPreferences.Editor mEditor,mEditor2,mEditor3,mEditor4;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_account_message);
        etAge = findViewById(R.id.et_age);
        etAge2 = findViewById(R.id.et_age2);
        etAge3 = findViewById(R.id.et_age3);
        etAge4 = findViewById(R.id.et_age4);
        btnSave = findViewById(R.id.btn_save);
        mIv = findViewById(R.id.iv_setting_back);

        mSP = getSharedPreferences("data",MODE_PRIVATE);
        mEditor = mSP.edit();
        mSP2 = getSharedPreferences("data2",MODE_PRIVATE);
        mEditor2 = mSP2.edit();
        mSP3 = getSharedPreferences("data3",MODE_PRIVATE);
        mEditor3 = mSP3.edit();
        mSP4 = getSharedPreferences("data4",MODE_PRIVATE);
        mEditor4 = mSP4.edit();

        etAge.setText(mSP.getString("nianling",""));
        etAge2.setText(mSP2.getString("xingbie","2"));
        etAge3.setText(mSP3.getString("guanxi","3"));
        etAge4.setText(mSP4.getString("youxiang","4"));

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "恭喜你保存成功", Toast.LENGTH_LONG).show();
                mEditor.putString("nianling",etAge.getText().toString());
                mEditor.commit();
                etAge.setText(mSP.getString("nianling","1"));
                mEditor2.putString("xingbie",etAge2.getText().toString());
                mEditor2.commit();
                etAge2.setText(mSP2.getString("xingbie","2"));
                mEditor3.putString("guanxi",etAge3.getText().toString());
                mEditor3.commit();
                etAge3.setText(mSP3.getString("guanxi","3"));
                mEditor4.putString("youxiang",etAge4.getText().toString());
                mEditor4.commit();
                etAge4.setText(mSP4.getString("youxiang","4"));
            }
        });

        mIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
