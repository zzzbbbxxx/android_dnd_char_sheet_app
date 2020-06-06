package com.example.app_module_with_room_and_recyclerview_v0.ui.fragments.fragmentviewpager;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.app_module_with_room_and_recyclerview_v0.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCharInfoCard extends androidx.fragment.app.Fragment {

    private Unbinder unbinder;

    @BindView(R.id.spinner_race)
    Spinner dropdown_races;

    @BindView(R.id.spinner_class)
    Spinner dropdown_classes;

    @BindView(R.id.textview_char_name)
    TextView textView_char_name;

    Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_character_info_card, container, false);
        context = container.getContext();
        unbinder = ButterKnife.bind(this, rootView);


        initspinnerfooter();

        return rootView;
    }


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
