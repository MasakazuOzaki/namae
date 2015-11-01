package com.example.masakazuozaki.namae;

import android.app.Fragment;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.astuetz.PagerSlidingTabStrip;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    ViewPager pager;
    MyPageAdapter adapter;
    PagerSlidingTabStrip tabs;
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager) findViewById(R.id.pager);
        adapter = new MyPageAdapter(getSupportFragmentManager());
        tabs = (PagerSlidingTabStrip)findViewById(R.id.tabs);
        toolbar=(Toolbar)findViewById(R.id.toolbar);


        pager.setAdapter(adapter);
        tabs.setViewPager(pager);

        toolbar.setTitle("namae");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));


        List<Word> objects = new ArrayList<Word>();

        objects.add(new Word("てすと"));




    }

}
