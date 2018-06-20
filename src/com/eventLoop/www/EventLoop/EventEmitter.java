package com.eventLoop.www.EventLoop;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class EventEmitter {
    private EventLoop eventLoop;
    private List<EventObject> eventList;
    private Thread mainThread;

    public EventEmitter() {
        eventLoop = new EventLoop();
        eventList = new LinkedList<EventObject>();
        mainThread = Thread.currentThread();

        Thread t = new Thread(eventLoop);
        t.setDaemon(true);
        t.start();
    }

    public void on(String name, EventFunctor c) {
        EventObject event = new EventObject(name, c);
        eventList.add(event);
    }

    public void emit(String name, Object... data) {
        eventList.forEach(event -> {
            if(event.getEventName().equals(name)) {
                eventLoop.addEvent(event, data);
            } else
                return;
        });
    }
}