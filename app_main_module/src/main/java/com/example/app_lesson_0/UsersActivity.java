package com.example.app_lesson_0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import com.google.android.material.tabs.TabLayout;

public class UsersActivity extends AppCompatActivity {

    private static final String MY_SETTINGS = "my_settings";

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        SharedPreferences sp = getSharedPreferences(MY_SETTINGS, Context.MODE_PRIVATE);

        new UsersWorkWithDataClass(sp);


        // UsersData usersData = new UsersData(sp);


    }

    private void setupViewPager(ViewPager viewPager) {

        UsersAPagerAdapter adapter = new UsersAPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new UsersAFragmentCharInfoCard(), getResources().getString(R.string.tab1));
        adapter.addFragment(new UsersAFragmentCharSkill(), getResources().getString(R.string.tab2));
        viewPager.setAdapter(adapter);
    }



 //dddd

}