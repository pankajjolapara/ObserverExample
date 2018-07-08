package com.example.pankaj.observerexample;

import android.app.Application;

import com.example.pankaj.observerexample.obsrv.ObservableData;

public class AppBase extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public ObservableData getObserver() {
        return ObservableData.getInstant();
    }
}
