package com.example.app_lesson_0;

import android.graphics.Color;
import android.os.Bundle;

import android.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class UsersAFragmentCharInfoCard extends androidx.fragment.app.Fragment {

    Spinner dropdown_races;
    Spinner dropdown_classes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_character_info_card, container, false);

        dropdown_races = rootView.findViewById(R.id.spinner_race);
        dropdown_classes = rootView.findViewById(R.id.spinner_class);
        initspinnerfooter();

        return rootView;
    }

  /////

    ///

    private void initspinnerfooter() {

       ArrayAdapter<?> adapter1 =
               ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.classes_names_list, android.R.layout.simple_spinner_item);
       adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown_classes.setAdapter(adapter1);

        //

       ArrayAdapter<?> adapter2 =
               ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.races_names_list, android.R.layout.simple_spinner_item);
       adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown_races.setAdapter(adapter2);
    }
}
