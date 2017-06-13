package com.jiyun.my17_6_12cartoonproject;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * @author Created by silveryTiTan on 2017/6/13.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> array;

    public MyFragmentAdapter(FragmentManager fm,ArrayList<Fragment> array) {
        super(fm);
        this.array=array;
    }


    @Override
    public Fragment getItem(int position) {
        return array.get(position);
    }

    @Override
    public int getCount() {
        return array.size();
    }


}
