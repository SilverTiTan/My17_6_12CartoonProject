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

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.linearLayout)
    LinearLayout linearLayout;
    @BindView(R.id.iv_touxiang)
    ImageView ivTouxiang;
    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_userpass)
    EditText etUserpass;
    @BindView(R.id.iv_wenhao)
    ImageView ivWenhao;
    @BindView(R.id.bt_login)
    Button btLogin;
    @BindView(R.id.bt_regist)
    Button btRegiest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iv_back, R.id.iv_touxiang, R.id.iv_wenhao, R.id.bt_login, R.id.bt_regist})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                break;
            case R.id.iv_touxiang:
                break;
            case R.id.iv_wenhao:
                break;
            case R.id.bt_login:
                break;
            case R.id.bt_regist:
                Intent intent = new Intent(LoginActivity.this,RegistActivity.class);
                startActivity(intent);
                break;
        }
    }
}
