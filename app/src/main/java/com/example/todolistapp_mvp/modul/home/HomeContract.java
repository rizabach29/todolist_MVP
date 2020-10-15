package com.example.todolistapp_mvp.modul.home;

import com.example.todolistapp_mvp.base.BasePresenter;
import com.example.todolistapp_mvp.base.BaseView;

import java.util.LinkedList;

/**
 * Created by fahrul on 13/03/19.
 */

public interface HomeContract {
    interface View extends BaseView<Presenter> {
        void loadItem(LinkedList<String> mTaskList);
    }

    interface Presenter extends BasePresenter {
        void loadData();
    }
}
