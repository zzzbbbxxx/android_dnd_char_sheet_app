package com.example.app_module_with_room_and_recyclerview_v0.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.app_module_with_room_and_recyclerview_v0.App;
import com.example.app_module_with_room_and_recyclerview_v0.R;
import com.example.app_module_with_room_and_recyclerview_v0.db.DatabaseHelper;
import com.example.app_module_with_room_and_recyclerview_v0.db.model.DataModel;
import com.example.app_module_with_room_and_recyclerview_v0.ui.AddDataActivity;
import com.example.app_module_with_room_and_recyclerview_v0.ui.fragments.adapter.UsersAPagerAdapter;
import com.example.app_module_with_room_and_recyclerview_v0.ui.fragments.adapter.UsersFragmentWithRecyclerView;
import com.example.app_module_with_room_and_recyclerview_v0.ui.main.adapter.SomeDataRecyclerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements SomeDataRecyclerAdapter.OnDeleteListener {

    @BindView(R.id.main_activity_viewpager)
    public ViewPager viewPager;

    public DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        UsersAPagerAdapter adapter = new UsersAPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new UsersFragmentWithRecyclerView(),"--");
        viewPager.setAdapter(adapter);



        databaseHelper = App.getInstance().getDatabaseInstance();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_add_button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_add: {
                startActivity(new Intent(this, AddDataActivity.class));
                break;
            }
        }
        return false;
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        SomeDataRecyclerAdapter recyclerAdapter = new SomeDataRecyclerAdapter(this, databaseHelper.getDataDao().getAllData());
//        recyclerAdapter.setOnDeleteListener(this);
//        recyclerView.setAdapter(recyclerAdapter);
//    }

    @Override
    public void onDelete(DataModel dataModel) {
        databaseHelper.getDataDao().delete(dataModel);
    }
}
