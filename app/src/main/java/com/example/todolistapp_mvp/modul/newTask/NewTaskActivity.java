package com.example.todolistapp_mvp.modul.newTask;

import android.view.View;

import com.example.todolistapp_mvp.base.BaseFragmentHolderActivity;


public class NewTaskActivity extends BaseFragmentHolderActivity {
    NewTaskFragment newTaskFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
        ivIcon.setVisibility(View.VISIBLE);

        newTaskFragment = new NewTaskFragment();
        setCurrentFragment(newTaskFragment, true);

    }

}
