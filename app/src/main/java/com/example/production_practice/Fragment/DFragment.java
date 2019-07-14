package com.example.production_practice.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.production_practice.BianbieliActivity;
import com.example.production_practice.JiyiliActivity;
import com.example.production_practice.R;

public class DFragment extends Fragment {

    private TextView mTv;
    private Button mBtn1,mBtn2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_d,container,false);
        mBtn1 = view.findViewById(R.id.zhuyili);
        mBtn2 = view.findViewById(R.id.shijue);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), JiyiliActivity.class);
                startActivity(intent);
            }
        });
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), BianbieliActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTv = view.findViewById(R.id.tv);
        mBtn1 = view.findViewById(R.id.button1);
        mBtn2 = view.findViewById(R.id.button2);
    }
}
