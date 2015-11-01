package com.example.masakazuozaki.namae;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by MasakazuOzaki on 2015/11/01.
 */
public class MyPageAdapter extends FragmentPagerAdapter {

    final String[] TITLES = {"ホーム","連絡","テスト範囲"};
    public MyPageAdapter (FragmentManager fm)  { super(fm); }

    @Override
    public CharSequence getPageTitle(int position){ return TITLES[position];}

    @Override
    public int getCount(){return TITLES.length;}

    @Override
    public Fragment getItem(int position){

        switch (position){
            case 0:
                return HomeFragment.newInstance(position);
            case 1:
                return RenrakuFragment.newInstance(position);
            case 2:
                return TestFragment.newInstance(position);
            default:
                return TestFragment.newInstance(position);

        }
    }
}

