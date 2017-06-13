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

public class RegistActivity extends AppCompatActivity {


    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.linearLayout2)
    LinearLayout linearLayout2;
    @BindView(R.id.iv_touxiangy)
    ImageView ivTouxiangy;
    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.et_yanzheng)
    EditText etYanzheng;
    @BindView(R.id.bt_sendyz)
    Button btSendyz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iv_back, R.id.iv_touxiangy, R.id.bt_sendyz})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                break;
            case R.id.iv_touxiangy:
                break;
            case R.id.bt_sendyz:
                Intent intent = new Intent(RegistActivity.this, Regist2Activity.class);
                startActivity(intent);
                break;
        }
    }
}
