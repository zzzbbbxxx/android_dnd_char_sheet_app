package com.example.app_module_with_room_and_recyclerview_v0.ui;


import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_module_with_room_and_recyclerview_v0.App;
import com.example.app_module_with_room_and_recyclerview_v0.R;
import com.example.app_module_with_room_and_recyclerview_v0.db.DatabaseHelper;
import com.example.app_module_with_room_and_recyclerview_v0.db.model.DataModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddDataActivity extends AppCompatActivity {

    @BindView(R.id.title)
    EditText title;
    @BindView(R.id.description)
    EditText description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.save)
    public void onSaveClick() {
        DatabaseHelper databaseHelper = App.getInstance().getDatabaseInstance();

        DataModel model = new DataModel();
        model.setCharacter_name(title.getText().toString());
        model.setDescription(description.getText().toString());
        databaseHelper.getDataDao().insert(model);

        finish();
    }
}
