package com.basturk.observer;

/**
 * Created by basturk
 * Date: 11.02.2017.
 */
public abstract class Observer {
    protected Subject subject;

    abstract void update();
}
