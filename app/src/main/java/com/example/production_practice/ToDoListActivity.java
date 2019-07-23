package com.example.production_practice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.production_practice.Fragment.AFragment;
import com.example.production_practice.Fragment.BFragment;
import com.example.production_practice.Fragment.CFragment;
import com.example.production_practice.Fragment.DFragment;
import com.example.production_practice.Fragment.EFragment;
import com.example.production_practice.Fragment.FFragment;
import com.example.production_practice.Fragment.GFragment;

import java.util.Calendar;

public class ToDoListActivity extends AppCompatActivity {

    private AFragment aFragment;
    private BFragment bFragment;
    private CFragment cFragment;
    private DFragment dFragment;
    private EFragment eFragment;
    private FFragment fFragment;
    private GFragment gFragment;
    private Button mBtn1, mBtn2, mBtn3, mBtn4, mBtn5, mBtn6, mBtn7;
    private static String mWay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todolist_layout);
        mBtn1 = findViewById(R.id.btn_1);
        mBtn2 = findViewById(R.id.btn_2);
        mBtn3 = findViewById(R.id.btn_3);
        mBtn4 = findViewById(R.id.btn_4);
        mBtn5 = findViewById(R.id.btn_5);
        mBtn6 = findViewById(R.id.btn_6);
        mBtn7 = findViewById(R.id.btn_7);
        Calendar calendar = Calendar.getInstance();
        mWay = String.valueOf(calendar.get(Calendar.DAY_OF_WEEK));
        if("1".equals(mWay)){
            aFragment = new AFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fl, aFragment).commitAllowingStateLoss();
            mBtn1.setBackgroundResource(R.drawable.buttonshape2);
        }else if("2".equals(mWay)){
            bFragment = new BFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fl, bFragment).commitAllowingStateLoss();
            mBtn2.setBackgroundResource(R.drawable.buttonshape2);
        }else if("3".equals(mWay)){
            cFragment = new CFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fl, cFragment).commitAllowingStateLoss();
            mBtn3.setBackgroundResource(R.drawable.buttonshape2);
        }else if("4".equals(mWay)){
            dFragment = new DFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fl, dFragment).commitAllowingStateLoss();
            mBtn4.setBackgroundResource(R.drawable.buttonshape2);
        }else if("5".equals(mWay)){
            eFragment = new EFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fl, eFragment).commitAllowingStateLoss();
            mBtn5.setBackgroundResource(R.drawable.buttonshape2);
        }else if("6".equals(mWay)){
            fFragment = new FFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fl, fFragment).commitAllowingStateLoss();
            mBtn6.setBackgroundResource(R.drawable.buttonshape2);
        }else if("7".equals(mWay)){
            gFragment = new GFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fl, gFragment).commitAllowingStateLoss();
            mBtn7.setBackgroundResource(R.drawable.buttonshape2);
        }
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (aFragment == null) {
                    aFragment = new AFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl, aFragment).commitAllowingStateLoss();
            }
        });
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bFragment == null) {
                    bFragment = new BFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl, bFragment).commitAllowingStateLoss();
            }
        });
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cFragment == null) {
                    cFragment = new CFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl, cFragment).commitAllowingStateLoss();
            }
        });
        mBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dFragment == null) {
                    dFragment = new DFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl, dFragment).commitAllowingStateLoss();
            }
        });
        mBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(eFragment==null){
                    eFragment=new EFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl,eFragment).commitAllowingStateLoss();
            }
        });
        mBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fFragment==null){
                    fFragment=new FFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl,fFragment).commitAllowingStateLoss();
            }
        });
        mBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gFragment==null){
                    gFragment=new GFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl,gFragment).commitAllowingStateLoss();
            }
        });
    }
}
