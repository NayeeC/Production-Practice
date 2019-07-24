package com.example.production_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ZhuyiliActivity extends AppCompatActivity {

    private Button mShu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuyili);
        mShu = findViewById(R.id.shuerte);
        mShu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ZhuyiliActivity.this,GameViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
