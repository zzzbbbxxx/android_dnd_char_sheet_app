package com.example.app_lesson_0;

import android.content.SharedPreferences;
import android.util.Log;
import android.widget.TextView;

public class UsersWorkWithDataClass {

    SharedPreferences sharPref;

    UsersWorkWithDataClass(SharedPreferences mySharPref){

        sharPref = mySharPref;

        init();
    }


    private void init(){

        boolean hasVisited = sharPref.getBoolean("hasVisited", false);
        if (!hasVisited) {
            SharedPreferences.Editor e = sharPref.edit();
            e.putBoolean("hasVisited", true);
            e.apply();
            setupDataForSharedPreferences();
        }
    }


    public static void setValueToTextView(SharedPreferences sPref, TextView textView, String key) {

        int value = getValueFromSharedPref(sPref,key);

        String tmp = String.valueOf(sPref.getInt(key, value));

        textView.setText(tmp);

    }


    public static int getValueFromSharedPref(SharedPreferences sPref, String key) {

        return sPref.getInt(key,0 );



    }


    private void setupDataForSharedPreferences()  {

        SharedPreferences.Editor editor = sharPref.edit();

        editor.putInt("ability_str_value", 10);
        editor.putInt("ability_dex_value", 10);
        editor.putInt("ability_con_value", 10);
        editor.putInt("ability_int_value", 10);
        editor.putInt("ability_wis_value", 10);
        editor.putInt("ability_cha_value", 10);

        editor.putInt("ability_str_bonus_value", 0);
        editor.putInt("ability_dex_bonus_value", 0);
        editor.putInt("ability_con_bonus_value", 0);
        editor.putInt("ability_int_bonus_value", 0);
        editor.putInt("ability_wis_bonus_value", 0);
        editor.putInt("ability_cha_bonus_value", 0);

        editor.putInt("ability_str_mod_value", 0);
        editor.putInt("ability_dex_mod_value", 0);
        editor.putInt("ability_con_mod_value", 0);
        editor.putInt("ability_int_mod_value", 0);
        editor.putInt("ability_wis_mod_value", 0);
        editor.putInt("ability_cha_mod_value", 0);

        editor.putInt("skill_str_st", 0);
        editor.putInt("skill_str_athletics", 0);

        editor.putInt("skill_con_st", 0);

        editor.putInt("skill_dex_st", 0);
        editor.putInt("skill_dex_acrobatics", 0);
        editor.putInt("skill_dex_sleigth_of_hands", 0);
        editor.putInt("skill_dex_stealth", 0);

        editor.putInt("skill_int_st", 0);
        editor.putInt("skill_int_arcana_magic", 0);
        editor.putInt("skill_int_religion", 0);
        editor.putInt("skill_int_nature", 0);
        editor.putInt("skill_int_investigation", 0);
        editor.putInt("skill_int_history", 0);

        editor.putInt("skill_wis_st", 0);
        editor.putInt("skill_wis_survival", 0);
        editor.putInt("skill_wis_perception", 0);
        editor.putInt("skill_wis_medicine", 0);
        editor.putInt("skill_wis_insight", 0);
        editor.putInt("skill_wis_animal_handling", 0);

        editor.putInt("skill_cha_st", 0);
        editor.putInt("skill_cha_deception", 0);
        editor.putInt("skill_cha_intimidation", 0);
        editor.putInt("skill_cha_perfomance", 0);
        editor.putInt("skill_cha_persuasion", 0);

        // Save.
        editor.apply();
    }



}
