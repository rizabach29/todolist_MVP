package com.example.todolistapp_mvp.modul.newTask;

public class NewTaskPresenter implements NewTaskContract.Presenter{
    private final NewTaskContract.View view;

    public NewTaskPresenter(NewTaskContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void addNewTask(String description) {

    }
}
