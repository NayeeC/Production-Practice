package com.example.production_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.production_practice.MusicActivity.Music2Activity;
import com.example.production_practice.MusicActivity.Music3Activity;
import com.example.production_practice.MusicActivity.MusicActivity;

public class MusicListActivity extends AppCompatActivity {

    private Button mBtn1,mBtn2,mBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);
        mBtn1 = findViewById(R.id.gequyi);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicListActivity.this, MusicActivity.class);
                startActivity(intent);
            }
        });
        mBtn2 = findViewById(R.id.gequer);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicListActivity.this, Music2Activity.class);
                startActivity(intent);
            }
        });
        mBtn3 = findViewById(R.id.gequsan);
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicListActivity.this, Music3Activity.class);
                startActivity(intent);
            }
        });
    }
}
