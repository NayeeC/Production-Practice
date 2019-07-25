package com.example.production_practice;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private long clickTime = 0;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.main_menu_item1:
                Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
                break;
            case R.id.main_menu_item2:
                Intent intent2 = new Intent(MainActivity.this, GuanyuActivity.class);
                startActivity(intent2);
                break;
            case R.id.main_menu_item3:
                Intent intent3 = new Intent(MainActivity.this, YinsiActivity.class);
                startActivity(intent3);
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
		Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
		button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ToDoListActivity.class);
                startActivity(intent);
            }
        });

		button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(intent);*/
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("提示").setMessage("正性音乐\n" +
                        "这种音乐节奏明显速度快、多断音和切分音，属于刺激型音乐。 听了这类音乐之后会使人感到兴奋，情绪高涨。根据同质性治疗原则，它适用于情绪激昂、烦躁不安的多动症、自闭症等特殊儿童的初期治疗，可以对其过激的情绪起到疏导作用。      \n" +
                        "负性音乐\n" +
                        "这种音乐节奏相对不太明显，速度比较缓慢，多延长音，属于松弛型音乐。听了这类音乐之后会使人感到伤感、回忆它适用于情绪低落、忧郁和对过去充满留恋的特殊儿童，能起到精神慰籍的作用。\n" +
                        "中性音乐\n" +
                        "这种音乐旋律流畅节奏平稳，速度适中，它介于上述两种音乐性质之间属于过渡型音乐，听了这类音乐会使人感到舒畅、平静。它适用于情绪上即没有过激的行为反应，也没有过于忧郁、伤感表现的特殊儿童。它是正、负性音乐的过渡，起到桥梁和纽带的作用。可以带来转换情绪、净化心灵的效果。\n")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(MainActivity.this, MusicListActivity.class);
                                startActivity(intent);
                            }
                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).show();
            }
        });
        
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
            }
        });
		button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, anmoActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void exit() {
        if ((System.currentTimeMillis() - clickTime) > 2000) {
            Toast.makeText(getApplicationContext(), "再按一次返回键退出应用",
                    Toast.LENGTH_SHORT).show();
            clickTime = System.currentTimeMillis();
        } else {
            Log.e(TAG, "exit application");
            this.finish();
            //          System.exit(0);
        }
    }

}

