package com.example.production_practice.MusicActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.production_practice.R;

public class Music3Activity extends Activity {
    private Button stop;
    private Button start;
    private Button pause;
    MediaPlayer mMediaPlayer;
    private boolean bIsPlaying = false;
    private boolean bIsReleased = true;
    private SeekBar mSb;
    private TextView mTv;

    Handler handler = new Handler();
    Runnable updateThread = new Runnable() {
        @Override
        public void run() {
            mSb.setProgress(mMediaPlayer.getCurrentPosition());
            handler.postDelayed(updateThread, 100);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music3);
        mMediaPlayer = new MediaPlayer();
        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);
        pause = (Button) findViewById(R.id.pause);
        /*mProgressTV = findViewById(R.id.jingdu);*/
        mSb = findViewById(R.id.seekbar);
        mTv = findViewById(R.id.tv);
        mTv.setSelected(true);
        mMediaPlayer = MediaPlayer.create(Music3Activity.this, R.raw.fu);
        mSb.setMax(mMediaPlayer.getDuration());
        mMediaPlayer.setLooping(true);
        mMediaPlayer.start();
        handler.post(updateThread);
        setListener();
    }

    private void setListener() {
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaPlayer.stop();
                Intent intent = new Intent(Music3Activity.this, MusicActivity.class);
                startActivity(intent);
                finish();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaPlayer.stop();
                Intent intent = new Intent(Music3Activity.this, Music2Activity.class);
                startActivity(intent);
                finish();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mMediaPlayer.isPlaying()) {
                    mMediaPlayer.pause();
                    Toast.makeText(Music3Activity.this,"暂停",Toast.LENGTH_SHORT).show();
                } else {
                    mMediaPlayer.start();
                    Toast.makeText(Music3Activity.this,"播放",Toast.LENGTH_SHORT).show();
                }
            }
        });
        mSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (b == true) {
                    mMediaPlayer.seekTo(i);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if (keyCode == KeyEvent.KEYCODE_BACK){
            android.os.Process.killProcess(android.os.Process.myPid());
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}

