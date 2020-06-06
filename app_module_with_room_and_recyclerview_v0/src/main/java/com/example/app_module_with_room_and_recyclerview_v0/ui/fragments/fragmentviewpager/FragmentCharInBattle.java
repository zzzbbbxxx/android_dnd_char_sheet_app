package com.example.app_module_with_room_and_recyclerview_v0.ui.fragments.fragmentviewpager;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.app_module_with_room_and_recyclerview_v0.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class FragmentCharInBattle extends Fragment {

    private Unbinder unbinder;

    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_character_in_battle, container, false);
        context = container.getContext();
        unbinder = ButterKnife.bind(this, rootView);



        return rootView;
    }


}
