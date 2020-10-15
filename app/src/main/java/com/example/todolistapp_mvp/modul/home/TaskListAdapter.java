package com.example.todolistapp_mvp.modul.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todolistapp_mvp.R;

import java.util.LinkedList;

public class TaskListAdapter extends RecyclerView.Adapter<TaskListAdapter.TaskViewHolder> {

    private final LinkedList<String> mTaskList;
    private LayoutInflater mInflater;

    class TaskViewHolder extends RecyclerView.ViewHolder {
        public final TextView taskItemView;
        final TaskListAdapter mAdapter;

        public TaskViewHolder(@NonNull View itemView, TaskListAdapter adapter) {
            super(itemView);
            taskItemView = itemView.findViewById(R.id.description);
            this.mAdapter = adapter;
        }
    }

    public TaskListAdapter (Context context, LinkedList<String> taskList) {
        mInflater = LayoutInflater.from(context);
        this.mTaskList = taskList;
    }

    @NonNull
    @Override
    public TaskListAdapter.TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.list_item, parent, false);
        return new TaskViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskListAdapter.TaskViewHolder holder, int position) {
        String mCurrent = mTaskList.get(position);
        holder.taskItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mTaskList.size();
    }
}
