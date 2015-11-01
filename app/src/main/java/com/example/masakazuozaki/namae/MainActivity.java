package com.example.masakazuozaki.namae;

import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.astuetz.PagerSlidingTabStrip;

public class MainActivity extends FragmentActivity {

    ViewPager pager;
    MyPageAdapter adapter;
    PagerSlidingTabStrip tabs;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager) findViewById(R.id.pager);
        adapter = new MyPageAdapter(getSupportFragmentManager());
        tabs = (PagerSlidingTabStrip)findViewById(R.id.tabs);

        pager.setAdapter(adapter);

        tabs.setViewPager(pager);




    }

}
