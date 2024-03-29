package com.example.production_practice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class xuewei2Activity extends AppCompatActivity {
    private ImageButton mBtnnext2,mBtnleft2;
    private int seconds=0;
    private boolean running;
    private ProgressBar mPb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xuewei2);
        mBtnnext2=(ImageButton)findViewById(R.id.xiayishou2);
        mBtnnext2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(xuewei2Activity.this,xuewei3Activity.class);
                startActivity(intent);
                finish();
            }
        });
        mBtnleft2=(ImageButton)findViewById(R.id.shangyishou2);
        mBtnleft2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(xuewei2Activity.this,xuewei1Activity.class);
                startActivity(intent);
                finish();
            }
        });

        runTimer();
    }

    public void onClickStart(View view){
        running = true;
        seconds=0;
    }
    public void onClickStop(View view){
        running = false;
        AlertDialog.Builder dialog=new AlertDialog.Builder(xuewei2Activity.this );
        dialog.setTitle("本次按摩时长");
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int secs = seconds%60;
        dialog.setMessage(String.format("%d:%02d:%02d",hours,minutes,secs));
        dialog.setCancelable(false);
        dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        dialog.show();}


    private void runTimer(){
        final TextView timeView = (TextView)findViewById(R.id.tv_2);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;
                String time = String.format("%d:%02d:%02d",hours,minutes,secs);
                timeView.setText(time);
                if(running){
                    seconds++;
                    mPb=(ProgressBar) findViewById(R.id.sb_1);
                    mPb.post(new Runnable() {
                        @Override
                        public void run() {
                            mPb.setProgress(seconds);
                        }
                    });
                }
                if(seconds==180){
                    running=false;
                }
                handler.postDelayed(this,1000);
            }
        });
    }



}