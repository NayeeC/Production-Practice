package com.example.production_practice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Author: yangxu
 * Time:  2019/7/21   22:41
 * Description: This is  ${Name}
 */
public class FeedBackActivity extends Activity {
    private ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        ivBack = findViewById(R.id.iv_setting_back);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
