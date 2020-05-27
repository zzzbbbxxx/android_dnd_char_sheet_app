package com.example.app_lesson_0;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.app.Fragment;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import static android.content.Context.MODE_PRIVATE;
import static com.example.app_lesson_0.UsersWorkWithDataClass.getValueFromSharedPref;


/**
 * A simple {@link Fragment} subclass.
 */
public class UsersAFragmentCharSkill extends androidx.fragment.app.Fragment {


    private Button abilityButtonPlus ;
    private Button abilityButtonMinus ;
    private Button bonusButtonPlus ;
    private Button bonusButtonMinus ;


    private static final String MY_SETTINGS = "my_settings";

    private TextView str_st_value;
    private TextView str_athl_value;

    private TextView dex_st_value;
    private TextView dex_acr_value;
    private TextView dex_sl_hands_value;
    private TextView dex_stealth_value;

    private TextView con_st_value;

    private TextView int_st_value;
    private TextView int_arcan_value;
    private TextView int_invest_value;
    private TextView int_rel_value;
    private TextView int_nature_value;
    private TextView int_hist_value;

    private TextView wis_st_value;
    private TextView wis_surv_value;
    private TextView wis_med_value;
    private TextView wis_animal_value;
    private TextView wis_perseption_value;
    private TextView wis_insigh_value;


    private TextView cha_st_value;
    private TextView cha_deception_value;
    private TextView cha_intimidation_value;
    private TextView cha_perfomance_value;
    private TextView cha_persuasion_value;

    private TextView str_text;
    private TextView str_mod_text;

    private TextView dex_text;
    private TextView dex_mod_text;

    private TextView con_text;
    private TextView con_mod_text;

    private TextView int_text;
    private TextView int_mod_text;

    private TextView wis_text;
    private TextView wis_mod_text;

    private TextView cha_text;
    private TextView cha_mod_text;

    SharedPreferences sPref;

    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_character_skill, container, false);
        context = container.getContext();

        sPref = getActivity().getSharedPreferences(MY_SETTINGS,
                Context.MODE_PRIVATE);

        init(rootView);

        return rootView;

    };

    public View init(View rootView){

        // --

        LinearLayout str_lay = rootView.findViewById(R.id.strength_value_lay);
        str_text = rootView.findViewById(R.id.strength_value);
        str_mod_text = rootView.findViewById(R.id.strength_mod_value);

        str_st_value = rootView.findViewById(R.id.str_athl_value);
        str_athl_value = rootView.findViewById(R.id.str_st_value);

        // --

        LinearLayout dex_lay = rootView.findViewById(R.id.dex_value_lay);
        dex_text = rootView.findViewById(R.id.dexterity_value);
        dex_mod_text = rootView.findViewById(R.id.dexterity_mod_value);

        dex_st_value = rootView.findViewById(R.id.dex_st_value);
        dex_acr_value = rootView.findViewById(R.id.dex_acr_value);
        dex_sl_hands_value = rootView.findViewById(R.id.dex_sl_hand_value);
        dex_stealth_value = rootView.findViewById(R.id.dex_stealth_value);

        // --

        LinearLayout con_lay = rootView.findViewById(R.id.con_value_lay);
        con_text = rootView.findViewById(R.id.const_value);
        con_mod_text = rootView.findViewById(R.id.const_mod_value);

        con_st_value = rootView.findViewById(R.id.con_st_value);

        // --

        LinearLayout int_lay = rootView.findViewById(R.id.int_value_lay);
        int_text = rootView.findViewById(R.id.intelligence_value);
        int_mod_text = rootView.findViewById(R.id.intelligence_mod_value);

        int_st_value = rootView.findViewById(R.id.int_st_value);
        int_arcan_value = rootView.findViewById(R.id.int_arcana_value);
        int_invest_value = rootView.findViewById(R.id.int_invest_value);
        int_rel_value = rootView.findViewById(R.id.int_rel_value);
        int_nature_value = rootView.findViewById(R.id.int_nature_value);
        int_hist_value = rootView.findViewById(R.id.int_hist_value);

        // --

        LinearLayout wis_lay = rootView.findViewById(R.id.wisdom_value_lay);
        wis_text = rootView.findViewById(R.id.editText_wisdom);
        wis_mod_text = rootView.findViewById(R.id.editText_wisdom_mod);

        wis_st_value = rootView.findViewById(R.id.wis_st_value);
        wis_surv_value = rootView.findViewById(R.id.wis_surv_value);
        wis_med_value = rootView.findViewById(R.id.wis_med_value);
        wis_animal_value = rootView.findViewById(R.id.wis_animal_value);
        wis_perseption_value = rootView.findViewById(R.id.wis_pers_value);
        wis_insigh_value = rootView.findViewById(R.id.wis_insigth_value);

        // --

        LinearLayout cha_lay = rootView.findViewById(R.id.cha_value_lay);
        cha_text = rootView.findViewById(R.id.cha_field);
        cha_mod_text = rootView.findViewById(R.id.cha_mod_field);

        cha_st_value = rootView.findViewById(R.id.cha_st_value);
        cha_deception_value = rootView.findViewById(R.id.cha_deception_value);
        cha_intimidation_value = rootView.findViewById(R.id.cha_intimid_value);
        cha_perfomance_value = rootView.findViewById(R.id.cha_perfomance_value);
        cha_persuasion_value = rootView.findViewById(R.id.cha_pers_value);


        loadDataFromSharedPreferences();

        str_lay.setOnClickListener(
                new CharacterSkillLayOnListener(str_text, str_mod_text,
                "ability_str_value", "ability_str_mod_value", "ability_str_bonus_value"));

        dex_lay.setOnClickListener(
                new CharacterSkillLayOnListener(dex_text, dex_mod_text,
                "ability_dex_value", "ability_dex_mod_value","ability_dex_bonus_value"));

        con_lay.setOnClickListener(
                new CharacterSkillLayOnListener(con_text, con_mod_text,
                "ability_con_value", "ability_con_mod_value","ability_con_bonus_value"));

        int_lay.setOnClickListener(
                new CharacterSkillLayOnListener(int_text, int_mod_text,
                "ability_int_value", "ability_int_mod_value", "ability_int_bonus_value"));

        wis_lay.setOnClickListener(
                new CharacterSkillLayOnListener(wis_text, wis_mod_text,
                "ability_wis_value", "ability_wis_mod_value","ability_wis_bonus_value"));

        cha_lay.setOnClickListener(
                new CharacterSkillLayOnListener(cha_text, cha_mod_text,
                "ability_cha_value", "ability_cha_mod_value","ability_str_bonus_value"));


        //


        sPref.registerOnSharedPreferenceChangeListener(listener);


        return rootView;
    }



    // обновляю значение в textView после изменений в shared_pref
    SharedPreferences.OnSharedPreferenceChangeListener listener = new SharedPreferences.OnSharedPreferenceChangeListener() {
        public void onSharedPreferenceChanged(SharedPreferences prefs, String key) {

            switch (key) {
                case "ability_str_value":
                    str_text.setText(String.valueOf(prefs.getInt("ability_str_value", 10)));
                    break;
                case "ability_dex_value":
                    dex_text.setText(String.valueOf(prefs.getInt("ability_dex_value", 10)));
                    break;
                case "ability_con_value":
                    con_text.setText(String.valueOf(prefs.getInt("ability_con_value", 10)));
                    break;
                case "ability_int_value":
                    int_text.setText(String.valueOf(prefs.getInt("ability_int_value", 10)));
                    break;
                case "ability_wis_value":
                    wis_text.setText(String.valueOf(prefs.getInt("ability_wis_value", 10)));
                    break;
                case "ability_cha_value":
                    cha_text.setText(String.valueOf(prefs.getInt("ability_cha_value", 10)));
                    break;
            }
        }
    };


    public int getModificator(int temp){


        return temp;
    }

        // по клику на textView/Layout вызыва диалог.
        // в диалоге ввожу новые значения и сохраняю их в shared_pref
        public class CharacterSkillLayOnListener implements View.OnClickListener {

            private View view;

            private TextView abilityValueTextView;
            private TextView modificatorValueTextView;
            private TextView bonusValueTextView;

            private String abilityName;
            private String modName;
            private String bonusName;

            SharedPreferences sPref;

            CharacterSkillLayOnListener(TextView myAbilityValue, TextView myModificatorValue,
                                        String myAbilityName, String myModName, String myBonusName) {

                abilityName = myAbilityName;
                modName = myModName;
                bonusName = myBonusName;

                abilityValueTextView = myAbilityValue;
                modificatorValueTextView = myModificatorValue;


                sPref = getActivity().getSharedPreferences(MY_SETTINGS,
                        Context.MODE_PRIVATE);
            }


            @Override
            public void onClick(View v) {

                LayoutInflater li = LayoutInflater.from(context);
                View dialogView = li.inflate(R.layout.dialog_ability_scores, null);
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context);
                mDialogBuilder.setView(dialogView);


                TextInputEditText userInputBonus;
                TextInputEditText userInputTotal;
                final TextInputEditText userInputModificator;
                final TextInputEditText userInputAbility;

                final int abilValue = getValueFromSharedPref(sPref,abilityName);
                int bonusValue = getValueFromSharedPref(sPref,bonusName);
                final int modValue = getValueFromSharedPref(sPref,modName);

                abilityButtonPlus = (Button) dialogView.findViewById(R.id.ability_button_plus);
                abilityButtonMinus = (Button) dialogView.findViewById(R.id.ability_button_minus);
                bonusButtonPlus = (Button) dialogView.findViewById(R.id.bonus_button_plus);
                bonusButtonMinus = (Button) dialogView.findViewById(R.id.bonus_button_minus);

                userInputAbility = (TextInputEditText) dialogView.findViewById(R.id.ability_value);
                userInputAbility.setText(Integer.toString(abilValue));

                userInputBonus = (TextInputEditText) dialogView.findViewById(R.id.bonus_value);
                userInputBonus.setText(Integer.toString(bonusValue));

                userInputTotal = (TextInputEditText) dialogView.findViewById(R.id.total_value);
                userInputTotal.setText(Integer.toString(abilValue + bonusValue));

                userInputModificator = (TextInputEditText) dialogView.findViewById(R.id.mod_value);
                userInputModificator.setText("+ "+Integer.toString(modValue));


                ButtonOnClickListener _lis =
                        new ButtonOnClickListener(userInputAbility, userInputBonus, abilValue, bonusValue, userInputTotal, userInputModificator);

                abilityButtonPlus.setOnClickListener(_lis);
                abilityButtonMinus.setOnClickListener(_lis);

                bonusButtonPlus.setOnClickListener(_lis);
                bonusButtonMinus.setOnClickListener(_lis);




                userInputAbility.setFilters(new InputFilter[]{new InputFilterAbilityValue(1, 20)});

                //Настраиваем сообщение в диалоговом окне:

                mDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        //Вводим текст и отображаем в строке ввода на основном экране:

                                        sPref = getActivity().getSharedPreferences(MY_SETTINGS,
                                                MODE_PRIVATE);
                                        SharedPreferences.Editor ed = sPref.edit();

                                        final int finalAbilValue = Integer.parseInt(String.valueOf(userInputAbility.getText()));
                                        final int finalModValue = Integer.parseInt(String.valueOf(userInputModificator.getText()));


                                        ed.putInt(abilityName, finalAbilValue);
                                        ed.putInt(modName, finalModValue);

                                        ed.commit();
                                    }
                                })
                        .setNegativeButton("Отмена",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });

                //Создаем AlertDialog:
                AlertDialog alertDialog = mDialogBuilder.create();

                //и отображаем его:
                alertDialog.show();
            }
        }


        public class ButtonOnClickListener implements View.OnClickListener {

            Button button;

            int abilValue;
            int bonusValue;
            int modValue;

            TextInputEditText abilityTextView;
            TextInputEditText bonusTextView;

            TextInputEditText totalTextView;
            TextInputEditText modTextView;



            public ButtonOnClickListener(TextInputEditText userInputAbility,
                                         TextInputEditText userInputBonus,
                                         int mainValue,
                                         int subValue,
                                         TextInputEditText userInputTotal,
                                         TextInputEditText userInputMod) {

                abilityTextView = (TextInputEditText) userInputAbility;
                bonusTextView = (TextInputEditText) userInputBonus;

                abilValue = mainValue;
                bonusValue = subValue;

                totalTextView = (TextInputEditText) userInputTotal;
                modTextView = (TextInputEditText) userInputMod;

            }

            @Override
            public void onClick(View v) {

                button = (Button) v;
                Log.d("TAG - start", "value:" + Integer.toString(abilValue));


                if (v.getId() == R.id.ability_button_minus || v.getId() == R.id.ability_button_plus) {

                    switch (v.getId()) {

                        case R.id.ability_button_plus:
                            abilValue += 1;
                            break;
                        case R.id.ability_button_minus:
                            abilValue -= 1;
                            break;

                    }

                    abilityTextView.setText(new SpannableStringBuilder(Integer.toString(abilValue)));

                    if (abilValue == 1) abilityButtonMinus.setEnabled(false);
                    if (abilValue>1) abilityButtonMinus.setEnabled(true);

                    if (abilValue == 20) abilityButtonPlus.setEnabled(false);
                    if (abilValue<20) abilityButtonPlus.setEnabled(true);

                }

                if (v.getId() == R.id.bonus_button_plus || v.getId() == R.id.bonus_button_minus) {

                    switch (v.getId()) {

                        case R.id.bonus_button_plus:
                            bonusValue += 1;
                            break;
                        case R.id.bonus_button_minus:
                            bonusValue -= 1;
                            break;

                    }

                    bonusTextView.setText(new SpannableStringBuilder(Integer.toString(bonusValue)));

                    if (bonusValue == 1) bonusButtonMinus.setEnabled(false);
                    if (bonusValue>1) bonusButtonPlus.setEnabled(true);

                    if (bonusValue == 10) bonusButtonPlus.setEnabled(false);
                    if (bonusValue<10) bonusButtonMinus.setEnabled(true);

                }


                totalTextView.setText(new SpannableStringBuilder(Integer.toString(abilValue+bonusValue)));


                switch (Integer.parseInt(String.valueOf(totalTextView.getText()))) {

                    case 1 :
                        modValue = -5;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;
                    case 2 :
                    case 3 :
                        modValue = 4;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;
                    case 4 :
                    case 5 :
                        modValue = -3;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;
                    case 6 :
                    case 7 :
                        modValue = -2;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;
                    case 8 :
                    case 9 :
                        modValue = -1;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;
                    case 10 :
                    case 11 :
                        modValue = +0;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;
                    case 12 :
                    case 13 :
                        modValue = +1;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;
                    case 14 :
                    case 15 :
                        modValue = +2;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;
                    case 16 :
                    case 17 :
                        modValue = +3;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;
                    case 18 :
                    case 19 :
                        modValue = +4;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;
                    case 20 :
                    case 21 :
                        modValue = +5;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;
                    case 22 :
                    case 23 :
                        modValue = +6;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;
                    case 24 :
                    case 25 :
                        modValue = +7;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;
                    case 26 :
                    case 27 :
                        modValue = +8;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;
                    case 28 :
                    case 29 :
                        modValue = +9;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;
                    case 30 :
                        modValue = 10;
                        modTextView.setText(new SpannableStringBuilder(Integer.toString(modValue)));
                        break;

                }






                Log.d("TAG - end ", "abilValue:" + Integer.toString(abilValue));
            }
        }


        // загружаю данные из файла в TextView при открытии
        public void loadDataFromSharedPreferences() {
            SharedPreferences sPref;
            sPref = this.getActivity().getSharedPreferences(MY_SETTINGS, Context.MODE_PRIVATE);


            UsersWorkWithDataClass.setValueToTextView(sPref, str_text, "ability_str_value");
            UsersWorkWithDataClass.setValueToTextView(sPref, dex_text, "ability_dex_value");
            UsersWorkWithDataClass.setValueToTextView(sPref, con_text, "ability_con_value");
            UsersWorkWithDataClass.setValueToTextView(sPref, int_text, "ability_int_value");
            UsersWorkWithDataClass.setValueToTextView(sPref, wis_text, "ability_wis_value");
            UsersWorkWithDataClass.setValueToTextView(sPref, cha_text, "ability_cha_value");

            UsersWorkWithDataClass.setValueToTextView(sPref, str_mod_text, "ability_str_mod_value");
            UsersWorkWithDataClass.setValueToTextView(sPref, dex_mod_text, "ability_dex_mod_value");
            UsersWorkWithDataClass.setValueToTextView(sPref, con_mod_text, "ability_con_mod_value");
            UsersWorkWithDataClass.setValueToTextView(sPref, int_mod_text, "ability_str_mod_value");
            UsersWorkWithDataClass.setValueToTextView(sPref, wis_mod_text, "ability_wis_mod_value");
            UsersWorkWithDataClass.setValueToTextView(sPref, cha_mod_text, "ability_cha_mod_value");

            UsersWorkWithDataClass.setValueToTextView(sPref, str_st_value, "skill_str_athletics");
            UsersWorkWithDataClass.setValueToTextView(sPref, str_athl_value, "skill_str_athletics");

            UsersWorkWithDataClass.setValueToTextView(sPref, con_st_value, "skill_con_st");

            UsersWorkWithDataClass.setValueToTextView(sPref, dex_st_value, "skill_dex_st");
            UsersWorkWithDataClass.setValueToTextView(sPref, dex_acr_value, "skill_dex_acrobatics");
            UsersWorkWithDataClass.setValueToTextView(sPref, dex_sl_hands_value, "skill_dex_sleigth_of_hands");
            UsersWorkWithDataClass.setValueToTextView(sPref, dex_stealth_value, "skill_dex_stealth");

            UsersWorkWithDataClass.setValueToTextView(sPref, int_st_value, "skill_int_st");
            UsersWorkWithDataClass.setValueToTextView(sPref, int_rel_value, "skill_int_religion");
            UsersWorkWithDataClass.setValueToTextView(sPref, int_nature_value, "skill_int_nature");
            UsersWorkWithDataClass.setValueToTextView(sPref, int_invest_value, "skill_int_investigation");
            UsersWorkWithDataClass.setValueToTextView(sPref, int_hist_value, "skill_int_history");
            UsersWorkWithDataClass.setValueToTextView(sPref, int_arcan_value, "skill_int_arcana_magic");

            UsersWorkWithDataClass.setValueToTextView(sPref, wis_st_value, "skill_wis_st");
            UsersWorkWithDataClass.setValueToTextView(sPref, wis_surv_value, "skill_wis_survival");
            UsersWorkWithDataClass.setValueToTextView(sPref, wis_perseption_value, "skill_wis_perception");
            UsersWorkWithDataClass.setValueToTextView(sPref, wis_med_value, "skill_wis_medicine");
            UsersWorkWithDataClass.setValueToTextView(sPref, wis_insigh_value, "skill_wis_insight");
            UsersWorkWithDataClass.setValueToTextView(sPref, wis_animal_value, "skill_wis_animal_handling");

            UsersWorkWithDataClass.setValueToTextView(sPref, cha_st_value, "skill_cha_st");
            UsersWorkWithDataClass.setValueToTextView(sPref, cha_deception_value, "skill_cha_deception");
            UsersWorkWithDataClass.setValueToTextView(sPref, cha_intimidation_value, "skill_cha_intimidation");
            UsersWorkWithDataClass.setValueToTextView(sPref, cha_perfomance_value, "skill_cha_perfomance");
            UsersWorkWithDataClass.setValueToTextView(sPref, cha_persuasion_value, "skill_cha_persuasion");

        }

    }
