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

public class xuewei8Activity extends AppCompatActivity {
    private ImageButton mBtnnext8,mBtnleft8;
    private int seconds=0;
    private boolean running;
    private ProgressBar mPb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xuewei8);
        mBtnnext8=(ImageButton)findViewById(R.id.xiayishou8);
        mBtnnext8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(xuewei8Activity.this,xuewei9Activity.class);
                startActivity(intent);
                finish();
            }
        });
        mBtnleft8=(ImageButton)findViewById(R.id.shangyishou8);
        mBtnleft8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(xuewei8Activity.this,xuewei7Activity.class);
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
        AlertDialog.Builder dialog=new AlertDialog.Builder(xuewei8Activity.this );
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
                if(seconds==450){
                    running=false;
                }
                handler.postDelayed(this,1000);
            }
        });
    }



}
