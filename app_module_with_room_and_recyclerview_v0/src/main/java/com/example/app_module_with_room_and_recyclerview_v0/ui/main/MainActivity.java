package com.example.app_module_with_room_and_recyclerview_v0.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.app_module_with_room_and_recyclerview_v0.App;
import com.example.app_module_with_room_and_recyclerview_v0.R;
import com.example.app_module_with_room_and_recyclerview_v0.db.DatabaseHelper;
import com.example.app_module_with_room_and_recyclerview_v0.db.model.DataModel;
import com.example.app_module_with_room_and_recyclerview_v0.ui.AddDataActivity;
import com.example.app_module_with_room_and_recyclerview_v0.ui.fragments.adapter.FragmentAdapter;
import com.example.app_module_with_room_and_recyclerview_v0.ui.fragments.fragmentviewpager.FragmentWithViewpager;
import com.example.app_module_with_room_and_recyclerview_v0.ui.fragments.recyclerview.FragmentWithRecyclerView;
import com.example.app_module_with_room_and_recyclerview_v0.ui.main.adapter.SomeDataRecyclerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.app_module_with_room_and_recyclerview_v0.R.id.fragmentwithviewpager;
import static com.example.app_module_with_room_and_recyclerview_v0.R.id.recyclerView;


public class MainActivity extends AppCompatActivity implements SomeDataRecyclerAdapter.OnDeleteListener {

    @BindView(R.id.container)
    FrameLayout container;

    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());
        //        adapter.addFragment(new FragmentWithViewpager(),"--");
        //        container.setAdapter(adapter);

        Fragment newFragment = new FragmentWithRecyclerView();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack if needed

        transaction.replace(R.id.container, newFragment);
        transaction.addToBackStack(null);

        // Commit the transaction

        transaction.commit();

        //container.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

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
               // startActivity(new Intent(this, AddDataActivity.class));

                Fragment newFragment = new FragmentWithViewpager();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack if needed

                transaction.replace(R.id.container, newFragment);
                transaction.addToBackStack(null);

                // Commit the transaction

                transaction.commit();

                break;
            }
        }
        return false;
    }

    @Override
    protected void onResume() {
        super.onResume();
     //   SomeDataRecyclerAdapter recyclerAdapter = new SomeDataRecyclerAdapter(this, databaseHelper.getDataDao().getAllData());
     //   recyclerAdapter.setOnDeleteListener(this);
        //recyclerView.setAdapter(recyclerAdapter);
    }

    @Override
    public void onDelete(DataModel dataModel) {
        databaseHelper.getDataDao().delete(dataModel);
    }
}
