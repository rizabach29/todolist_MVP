package com.example.todolistapp_mvp.modul.home;

import java.util.LinkedList;

/**
 * Created by fahrul on 13/03/19.
 */

public class HomePresenter implements HomeContract.Presenter{
    private final HomeContract.View view;
    private final LinkedList<String> mTaskList = new LinkedList<>();

    public HomePresenter(HomeContract.View view) {
        this.view = view;

    }

    @Override
    public void loadData() {
        for (int i = 0; i < 5; i++) {
            mTaskList.add("Task Number " + i);
        }
        view.loadItem(mTaskList);
    }

    @Override
    public void start() {}

}
