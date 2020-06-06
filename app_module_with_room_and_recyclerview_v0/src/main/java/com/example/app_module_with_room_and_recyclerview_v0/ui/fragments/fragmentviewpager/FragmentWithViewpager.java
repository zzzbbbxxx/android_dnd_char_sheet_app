package com.example.app_module_with_room_and_recyclerview_v0.ui.fragments.fragmentviewpager;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.viewpager.widget.ViewPager;

import com.example.app_module_with_room_and_recyclerview_v0.R;
import com.example.app_module_with_room_and_recyclerview_v0.ui.fragments.adapter.FragmentAdapter;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class FragmentWithViewpager extends androidx.fragment.app.Fragment {

    private Unbinder unbinder;


    @BindView(R.id.tabs)
    public TabLayout tabLayout;

    @BindView(R.id.viewpager)
    public ViewPager viewPager;


    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_with_viewpager, container, false);
        context = container.getContext();
        unbinder = ButterKnife.bind(this, rootView);

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        return rootView;
    }


    private void setupViewPager(ViewPager viewPager) {

        FragmentAdapter adapter = new FragmentAdapter(getActivity().getSupportFragmentManager());
        adapter.addFragment(new FragmentCharInfoCard(), getResources().getString(R.string.tab1));
        adapter.addFragment(new FragmentCharSkill(), getResources().getString(R.string.tab2));
        adapter.addFragment(new FragmentCharInBattle(), getResources().getString(R.string.tab3));

        viewPager.setAdapter(adapter);
    }



}
