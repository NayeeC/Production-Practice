package com.example.production_practice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    private static String mWay;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.main_menu_item1:
                Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                mWay = String.valueOf(calendar.get(Calendar.DAY_OF_WEEK));
                if("1".equals(mWay)){
                    Intent intent = new Intent(MainActivity.this, Day7Activity.class);
                    startActivity(intent);
                }else if("2".equals(mWay)){
                    Intent intent = new Intent(MainActivity.this, Day1Activity.class);
                    startActivity(intent);
                }else if("3".equals(mWay)){
                    Intent intent = new Intent(MainActivity.this, Day2Activity.class);
                    startActivity(intent);
                }else if("4".equals(mWay)){
                    Intent intent = new Intent(MainActivity.this, Day3Activity.class);
                    startActivity(intent);
                }else if("5".equals(mWay)){
                    Intent intent = new Intent(MainActivity.this, Day4Activity.class);
                    startActivity(intent);
                }else if("6".equals(mWay)){
                    Intent intent = new Intent(MainActivity.this, Day5Activity.class);
                    startActivity(intent);
                }else if("7".equals(mWay)){
                    Intent intent = new Intent(MainActivity.this, Day6Activity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
