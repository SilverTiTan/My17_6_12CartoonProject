package com.jiyun.my17_6_12cartoonproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ContentActivity extends AppCompatActivity {

    @BindView(R.id.iv_sys)
    ImageView ivSys;
    @BindView(R.id.et_sousuo)
    EditText etSousuo;
    @BindView(R.id.iv_chazhao)
    ImageView ivChazhao;
    @BindView(R.id.iv_bianqian)
    ImageView ivBianqian;
    @BindView(R.id.tb_tool)
    Toolbar tbTool;
    @BindView(R.id.rl)
    RelativeLayout rl;
    @BindView(R.id.ll_movie)
    LinearLayout llMovie;
    @BindView(R.id.ll_shucheng)
    LinearLayout llShucheng;
    @BindView(R.id.ll_home)
    LinearLayout llHome;
    @BindView(R.id.ll_jiejie)
    LinearLayout llJiejie;
    @BindView(R.id.ll_maimai)
    LinearLayout llMaimai;
    @BindView(R.id.ll_myis)
    LinearLayout llMyis;
    @BindView(R.id.lll)
    LinearLayout lll;
    @BindView(R.id.vp_view)
    ViewPager vpView;
    private ArrayList<Fragment> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        ButterKnife.bind(this);
        array = new ArrayList<>();
        array.add(new MovieFragment());
        array.add(new BookShopFragment());
        array.add(new HomeFragment());
        array.add(new JieJieFragment());
        array.add(new MaiMaiFragment());
        array.add(new MyIsFragment());
        MyFragmentAdapter mfa = new MyFragmentAdapter(getSupportFragmentManager(), array);
        vpView.setAdapter(mfa);

    }

    @OnClick({R.id.iv_sys, R.id.iv_chazhao, R.id.iv_bianqian,
            R.id.tb_tool, R.id.ll_movie, R.id.ll_shucheng, R.id.ll_home,
            R.id.ll_jiejie, R.id.ll_maimai, R.id.ll_myis, R.id.vp_view})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_sys:
                break;
            case R.id.iv_chazhao:
                break;
            case R.id.iv_bianqian:
                break;
            case R.id.tb_tool:
                break;
            case R.id.ll_movie:
                vpView.setCurrentItem(0);
                break;
            case R.id.ll_shucheng:
                vpView.setCurrentItem(1);
                break;
            case R.id.ll_home:
                vpView.setCurrentItem(2);
                break;
            case R.id.ll_jiejie:
                vpView.setCurrentItem(3);
                break;
            case R.id.ll_maimai:
                vpView.setCurrentItem(4);
                break;
            case R.id.ll_myis:
                vpView.setCurrentItem(5);
                break;
            case R.id.vp_view:
                break;
        }
    }
}
