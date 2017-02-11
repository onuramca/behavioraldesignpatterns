package com.basturk.observer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by basturk
 * Date: 11.02.2017.
 */
public class MessageStream extends Subject {

    private Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    void setState(String message) {
        messageHistory.add(message);
        this.notifyObservers();
    }

    @Override
    String getState() {
        return messageHistory.getLast();
    }
}
