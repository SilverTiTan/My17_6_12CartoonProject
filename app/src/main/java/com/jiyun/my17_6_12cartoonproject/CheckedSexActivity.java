package com.jiyun.my17_6_12cartoonproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CheckedSexActivity extends AppCompatActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.linearLayout3)
    LinearLayout linearLayout3;
    @BindView(R.id.iv_touxiangy)
    ImageView ivTouxiangy;
    @BindView(R.id.ll_sex_men)
    LinearLayout llSexMen;
    @BindView(R.id.ll_sex_women)
    LinearLayout llSexWomen;
    @BindView(R.id.bt_newregist)
    Button btNewregist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checked_sex);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iv_back, R.id.ll_sex_men, R.id.ll_sex_women, R.id.bt_newregist})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                break;
            case R.id.ll_sex_men:
                break;
            case R.id.ll_sex_women:
                break;
            case R.id.bt_newregist:
                Intent intent = new Intent(CheckedSexActivity.this,ContentActivity.class);
                startActivity(intent);
                break;
        }
    }
}
