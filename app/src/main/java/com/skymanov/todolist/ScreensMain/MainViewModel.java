package com.skymanov.todolist.ScreensMain;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.skymanov.todolist.App;
import com.skymanov.todolist.model.Note;

import java.util.List;

public class MainViewModel extends ViewModel {
    private LiveData<List<Note>> noteLiveData = App.getInstance().getNoteDao().getAllLiveData();

    public LiveData<List<Note>> getNoteLiveData() {
        return noteLiveData;
    }
}
