package com.example.app_module_with_room_and_recyclerview_v0.ui.fragments.recyclerview;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.app_module_with_room_and_recyclerview_v0.R;
import com.example.app_module_with_room_and_recyclerview_v0.db.DatabaseHelper;
import com.example.app_module_with_room_and_recyclerview_v0.ui.main.adapter.SomeDataRecyclerAdapter;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

import static androidx.recyclerview.widget.LinearLayoutManager.*;

public class FragmentWithRecyclerView extends androidx.fragment.app.Fragment {

    private DatabaseHelper databaseHelper;

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    private Unbinder unbinder;

    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_with_recyclerview, container, false);
        context = container.getContext();
        unbinder = ButterKnife.bind(this, rootView);


        return rootView;
    }






}
