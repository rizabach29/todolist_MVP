package com.example.todolistapp_mvp.modul.newTask;

import com.example.todolistapp_mvp.base.BasePresenter;
import com.example.todolistapp_mvp.base.BaseView;

public interface NewTaskContract {
    interface View extends BaseView<Presenter> {
        void redirectToHome();
    }

    interface Presenter extends BasePresenter {
        void addNewTask(String description);
    }
}
