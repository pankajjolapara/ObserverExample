package com.example.pankaj.observerexample.obsrv;

import java.util.Observable;

public class ObservableData extends Observable {
    private String name = "First time i have this Text";


    /**
     * @return the value
     */
    public String getValue() {
        return name;
    }


    /**
     * @param name the value to set
     */
    public void setValue(String name) {
        this.name = name;
        setChanged();
        notifyObservers();
    }

    private static ObservableData mObservableData;

    public static ObservableData getInstant() {
        if (mObservableData == null) {
            mObservableData = new ObservableData();
        }
        return mObservableData;
    }
}
