package com.example.app_module_with_room_and_recyclerview_v0.db.model;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class DataModel {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    public int index;


    // info

    private String character_name;
    private String character_race;
    private String character_class;
    private int level;


    // fight

    private int profiency_bonus;

    private int armor_class;

    private int max_hit_points;
    private int temp_hit_points;
    private int current_hit_points;

    private int speed;

    private int initiative;

    private int passive_perseption;

    // ability value and skill value

    private int abil_str_value;
    private int abil_dex_value;
    private int abil_con_value;
    private int abil_int_value;
    private int abil_wis_value;
    private int abil_cha_value;

    private int abil_str_bonus_value;
    private int abil_dex_bonus_value;
    private int abil_con_bonus_value;
    private int abil_int_bonus_value;
    private int abil_wis_bonus_value;
    private int abil_cha_bonus_value;

    private int abil_str_mod_value;
    private int abil_dex_mod_value;
    private int abil_con_mod_value;
    private int abil_int_mod_value;
    private int abil_wis_mod_value;
    private int abil_cha_mod_value;

    // st is saving throw

    private int skill_str_st;
    private int skill_str_athletics;

    private int skill_con_st;

    private int skill_dex_st;
    private int skill_dex_acrobatics;
    private int skill_dex_sleigth_of_hands;
    private int skill_dex_stealth;

    private int skill_int_st;
    private int skill_int_arcana_magic;
    private int skill_int_religion;
    private int skill_int_nature;
    private int skill_int_investigation;
    private int skill_int_history;

    private int skill_wis_st;
    private int skill_wis_survival;
    private int skill_wis_perception;
    private int skill_wis_medicine;
    private int skill_wis_insight;
    private int skill_wis_animal_handling;

    private int skill_cha_st;
    private int skill_cha_deception;
    private int skill_cha_intimidation;
    private int skill_cha_perfomance;
    private int skill_cha_persuasion;

    // ability value and skill value

    private String description;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    @NonNull
    public int getIndex() { return index; }
    public void setIndex(@NonNull int index) {
        this.index = index;
    }

    @NonNull
    public String getCharacter_name() { return character_name; }
    public void setCharacter_name(@NonNull String character_name) {
        this.character_name = character_name;
    }

    @NonNull
    public String getCharacter_race() { return character_race; }
    public void setCharacter_race(@NonNull String character_race) {
        this.character_race = character_race;
    }

    @NonNull
    public String getCharacter_class() { return character_class; }
    public void setCharacter_class(@NonNull String character_class) {
        this.character_class = character_class;
    }

    @NonNull
    public int getCharacter_level() { return level; }
    public void setCharacter_level(@NonNull int level) {
        this.level = level;
    }

    @NonNull
    public int getProfiency_bonus() { return profiency_bonus; }
    public void setProfiency_bonus(@NonNull int profiency_bonus) {
        this.profiency_bonus = profiency_bonus;
    }

    @NonNull
    public int getArmor_class() { return armor_class; }
    public void setArmor_class(@NonNull int armor_class) {
        this.armor_class = armor_class;
    }

    @NonNull
    public int getMax_hit_points() { return max_hit_points; }
    public void setMax_hit_points(@NonNull int max_hit_points) {
        this.max_hit_points = max_hit_points;
    }

    @NonNull
    public int getTemp_hit_points() { return temp_hit_points; }
    public void setTemp_hit_points(@NonNull int temp_hit_points) {
        this.temp_hit_points = temp_hit_points;
    }

    @NonNull
    public int getCurrent_hit_points() { return current_hit_points; }
    public void setCurrent_hit_points(@NonNull int current_hit_points) {
        this.current_hit_points = current_hit_points;
    }

    @NonNull
    public int getLevel() { return level; }
    public void setLevel(@NonNull int level) {
        this.level = level;
    }

    @NonNull
    public int getSpeed() { return speed; }
    public void setSpeed(@NonNull int speed) {
        this.speed = speed;
    }

    @NonNull
    public int getInitiative() { return initiative; }
    public void setInitiative(@NonNull int initiative) {
        this.initiative = initiative;
    }

    @NonNull
    public int getPassive_perseption() { return passive_perseption; }
    public void setPassive_perseption(@NonNull int passive_perseption) {
        this.passive_perseption = passive_perseption;
    }

    @NonNull
    public int getAbil_str_value() { return abil_str_value; }
    public void setAbil_str_value(@NonNull int abil_str_value) {
        this.abil_str_value = abil_str_value;
    }

    @NonNull
    public int getAbil_dex_value() { return abil_dex_value; }
    public void setAbil_dex_value(@NonNull int abil_dex_value) {
        this.abil_dex_value = abil_dex_value;
    }

    @NonNull
    public int getAbil_con_value() { return abil_con_value; }
    public void setAbil_con_value(@NonNull int abil_con_value) {
        this.abil_con_value = abil_con_value;
    }

    @NonNull
    public int getAbil_int_value() { return abil_int_value; }
    public void setAbil_int_value (@NonNull int abil_int_value) {
        this.abil_int_value = abil_int_value;
    }

    @NonNull
    public int getAbil_wis_value() { return abil_wis_value; }
    public void setAbil_wis_value(@NonNull int abil_wis_value) {
        this.abil_wis_value = abil_wis_value;
    }

    @NonNull
    public int getAbil_cha_value() { return abil_cha_value; }
    public void setAbil_cha_value(@NonNull int abil_cha_value) {
        this.abil_cha_value = abil_cha_value;
    }

    @NonNull
    public int getAbil_str_bonus_value() { return abil_str_bonus_value; }
    public void setAbil_str_bonus_value(@NonNull int abil_str_bonus_value) {
        this.abil_str_bonus_value = abil_str_bonus_value;
    }

    @NonNull
    public int getAbil_dex_bonus_value() { return abil_dex_bonus_value; }
    public void setAbil_dex_bonus_value(@NonNull int abil_dex_bonus_value) {
        this.abil_dex_bonus_value = abil_dex_bonus_value;
    }

    @NonNull
    public int getAbil_con_bonus_value() { return abil_con_bonus_value; }
    public void setAbil_con_bonus_value(@NonNull int abil_con_bonus_value) {
        this.abil_con_bonus_value = abil_con_bonus_value;
    }

    @NonNull
    public int getAbil_int_bonus_value() { return abil_int_bonus_value; }
    public void setAbil_int_bonus_value(@NonNull int abil_int_bonus_value) {
        this.abil_int_bonus_value = abil_int_bonus_value;
    }

    @NonNull
    public int getAbil_wis_bonus_value() { return abil_wis_bonus_value; }
    public void setAbil_wis_bonus_value(@NonNull int abil_wis_bonus_value) {
        this.abil_wis_bonus_value = abil_wis_bonus_value;
    }

    @NonNull
    public int getAbil_cha_bonus_value() { return abil_cha_bonus_value; }
    public void setAbil_cha_bonus_value(@NonNull int abil_cha_bonus_value) {
        this.abil_cha_bonus_value = abil_cha_bonus_value;
    }

    @NonNull
    public int getAbil_str_mod_value() { return abil_str_mod_value; }
    public void setAbil_str_mod_value(@NonNull int abil_str_mod_value) {
        this.abil_str_mod_value = abil_str_mod_value;
    }

    @NonNull
    public int getAbil_dex_mod_value() { return abil_dex_mod_value; }
    public void setAbil_dex_mod_value(@NonNull int abil_dex_mod_value) {
        this.abil_dex_mod_value = abil_dex_mod_value;
    }

    @NonNull
    public int getAbil_con_mod_value() { return abil_con_mod_value; }
    public void setAbil_con_mod_value(@NonNull int abil_con_mod_value) {
        this.abil_con_mod_value = abil_con_mod_value;
    }

    @NonNull
    public int getAbil_int_mod_value() { return abil_int_mod_value; }
    public void setAbil_int_mod_value(@NonNull int abil_int_mod_value) {
        this.abil_int_mod_value = abil_int_mod_value;
    }

    @NonNull
    public int getAbil_wis_mod_value() { return abil_wis_mod_value; }
    public void setAbil_wis_mod_value(@NonNull int abil_wis_mod_value) {
        this.abil_wis_mod_value = abil_wis_mod_value;
    }

    @NonNull
    public int getAbil_cha_mod_value() { return abil_cha_mod_value; }
    public void setAbil_cha_mod_value(@NonNull int abil_cha_mod_value) {
        this.abil_cha_mod_value = abil_cha_mod_value;
    }

    ////////////////////// skills

    @NonNull
    public int getSkill_str_st() { return skill_str_st; }
    public void setSkill_str_st(@NonNull int skill_str_st ) {
        this.skill_str_st = skill_str_st ;
    }

    @NonNull
    public int getSkill_str_athletics() { return skill_str_athletics; }
    public void setSkill_str_athletics(@NonNull int skill_str_athletics) {
        this.skill_str_athletics = skill_str_athletics;
    }

    @NonNull
    public int getSkill_con_st() { return skill_con_st ; }
    public void setSkill_con_st(@NonNull int skill_con_st) {
        this.skill_con_st = skill_con_st ;
    }

    @NonNull
    public int getSkill_dex_st() { return skill_dex_st; }
    public void setSkill_dex_st(@NonNull int skill_dex_st) {
        this.skill_dex_st = skill_dex_st ;
    }

    @NonNull
    public int getSkill_dex_acrobatics() { return skill_dex_acrobatics; }
    public void setSkill_dex_acrobatics(@NonNull int skill_dex_acrobatics) {
        this.skill_dex_acrobatics = skill_dex_acrobatics ;
    }

    @NonNull
    public int getSkill_dex_sleigth_of_hands() { return skill_dex_sleigth_of_hands; }
    public void setSkill_dex_sleigth_of_hands(@NonNull int skill_dex_sleigth_of_hands) {
        this.skill_dex_sleigth_of_hands = skill_dex_sleigth_of_hands ;
    }

    @NonNull
    public int getSkill_dex_stealth() { return skill_dex_stealth; }
    public void setSkill_dex_stealth(@NonNull int skill_dex_stealth ) {
        this.skill_dex_stealth = skill_dex_stealth ;
    }

    @NonNull
    public int getSkill_int_st() { return skill_int_st ; }
    public void setSkill_int_st(@NonNull int skill_int_st) {
        this.skill_int_st = skill_int_st ;
    }

    @NonNull
    public int getSkill_int_arcana_magic() { return skill_int_arcana_magic; }
    public void setSkill_int_arcana_magic(@NonNull int skill_int_arcana_magic ) {
        this.skill_int_arcana_magic = skill_int_arcana_magic ;
    }

    @NonNull
    public int getSkill_int_religion() { return skill_int_religion ; }
    public void setSkill_int_religion(@NonNull int skill_int_religion) {
        this.skill_int_religion = skill_int_religion ;
    }

    @NonNull
    public int getSkill_int_nature() { return skill_int_nature; }
    public void setSkill_int_nature(@NonNull int skill_int_nature ) {
        this.skill_int_nature = skill_int_nature;
    }

    @NonNull
    public int getSkill_int_investigation() { return skill_int_investigation ; }
    public void setSkill_int_investigation(@NonNull int skill_int_investigation ) {
        this.skill_int_investigation = skill_int_investigation ;
    }

    @NonNull
    public int getSkill_int_history() { return skill_int_history; }
    public void setSkill_int_history(@NonNull int skill_int_history) {
        this.skill_int_history = skill_int_history ;
    }

    @NonNull
    public int getSkill_wis_st() { return skill_wis_st ; }
    public void setSkill_wis_st(@NonNull int skill_wis_st) {
        this.skill_wis_st = skill_wis_st;
    }

    @NonNull
    public int getSkill_wis_survival() { return skill_wis_survival; }
    public void setSkill_wis_survival(@NonNull int skill_wis_survival) {
        this.skill_wis_survival = skill_wis_survival ;
    }

    @NonNull
    public int getSkill_wis_perception() { return skill_wis_perception; }
    public void setSkill_wis_perception(@NonNull int skill_wis_perception) {
        this.skill_wis_perception = skill_wis_perception ;
    }

    @NonNull
    public int getSkill_wis_medicine() { return skill_wis_medicine ; }
    public void setSkill_wis_medicine(@NonNull int skill_wis_medicine) {
        this.skill_wis_medicine = skill_wis_medicine ;
    }

    @NonNull
    public int getSkill_wis_insight() { return skill_wis_insight; }
    public void setSkill_wis_insight(@NonNull int skill_wis_insight ) {
        this.skill_wis_insight = skill_wis_insight;
    }

    @NonNull
    public int getSkill_wis_animal_handling() { return skill_wis_animal_handling; }
    public void setSkill_wis_animal_handling(@NonNull int skill_wis_animal_handling) {
        this.skill_wis_animal_handling = skill_wis_animal_handling;
    }

    @NonNull
    public int getSkill_cha_st() { return skill_cha_st; }
    public void setSkill_cha_st(@NonNull int skill_cha_st) {
        this.skill_cha_st = skill_cha_st;
    }

    @NonNull
    public int getSkill_cha_deception() { return skill_cha_deception; }
    public void setSkill_cha_deception(@NonNull int skill_cha_deception) {
        this.skill_cha_deception = skill_cha_deception;
    }

    @NonNull
    public int getSkill_cha_intimidation() { return skill_cha_intimidation; }
    public void setSkill_cha_intimidation(@NonNull int skill_cha_intimidation) {
        this.skill_cha_intimidation = skill_cha_intimidation;
    }

    @NonNull
    public int getSkill_cha_perfomance() { return skill_cha_perfomance ; }
    public void setSkill_cha_perfomance(@NonNull int skill_cha_perfomance ) {
        this.skill_cha_perfomance = skill_cha_perfomance ;
    }

    @NonNull
    public int getSkill_cha_persuasion() { return skill_cha_persuasion; }
    public void setSkill_cha_persuasion(@NonNull int skill_cha_persuasion) {
        this.skill_cha_persuasion = skill_cha_persuasion;
    }


}


