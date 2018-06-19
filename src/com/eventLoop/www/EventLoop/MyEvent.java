package com.eventLoop.www.EventLoop;

import java.util.LinkedList;
import java.util.List;


public class MyEvent{
    private EventLoop eventLoop;
    private List<EventObject> eventList;

    public MyEvent() {
        eventLoop = new EventLoop();
        eventList = new LinkedList<EventObject>();

        Thread t = new Thread(eventLoop);
        t.setDaemon(true);
        t.start();
    }

    public void on(String name, Command c) {
        EventObject event = new EventObject(name, c);
        eventList.add(event);
    }

    public void emit(String name) {
        eventList.forEach(event -> {
            if(event.getEventName() == name) {
                eventLoop.addEvent(event);
            } else
                return;
        });
    }
}