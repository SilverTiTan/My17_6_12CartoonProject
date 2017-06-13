package com.jiyun.my17_6_12cartoonproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Regist2Activity extends AppCompatActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.linearLayout3)
    LinearLayout linearLayout3;
    @BindView(R.id.iv_touxiangy)
    ImageView ivTouxiangy;
    @BindView(R.id.et_usersname)
    EditText etUsersname;
    @BindView(R.id.et_userspass)
    EditText etUserspass;
    @BindView(R.id.et_enterpass)
    EditText etEnterpass;
    @BindView(R.id.bt_newregist)
    Button btNewregist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist2);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iv_back, R.id.iv_touxiangy, R.id.bt_newregist})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                break;
            case R.id.iv_touxiangy:
                break;
            case R.id.bt_newregist:
                Intent intent = new Intent(Regist2Activity.this,CheckedSexActivity.class);
                startActivity(intent);

                break;
        }
    }
}
