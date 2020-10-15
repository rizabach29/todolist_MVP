package com.example.todolistapp_mvp.modul.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todolistapp_mvp.R;
import com.example.todolistapp_mvp.base.BaseFragment;
import com.example.todolistapp_mvp.modul.newTask.NewTaskActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;

public class HomeFragment extends BaseFragment<HomeActivity, HomeContract.Presenter> implements HomeContract.View {

    TextView tvEmail;
    FloatingActionButton fabAdd;
    String email;
    private RecyclerView mRecyclerView;
    private TaskListAdapter mAdapter;


    public HomeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_home, container, false);
        mPresenter = new HomePresenter(this);
        mPresenter.start();
        Intent intent = getActivity().getIntent();

        tvEmail = (TextView) fragmentView.findViewById(R.id.tvEmail);
        mRecyclerView = fragmentView.findViewById(R.id.recyclerView);
        fabAdd = fragmentView.findViewById(R.id.fabAdd);
        email = intent.getStringExtra("email");
        tvEmail.setText(email + "'s Tasks");
        mPresenter.loadData();

        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                directToNewTask();
            }
        });

        setTitle("Home");

        return fragmentView;
    }

    private void directToNewTask() {
        Intent intent = new Intent(activity, NewTaskActivity.class);
        startActivity(intent);
        activity.finish();
    }

    @Override
    public void loadItem(LinkedList<String> mTaskList) {
        mAdapter = new TaskListAdapter(this.getContext(), mTaskList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        mPresenter = presenter;
    }
}