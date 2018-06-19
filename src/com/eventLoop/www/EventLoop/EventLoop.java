package com.eventLoop.www.EventLoop;

import java.util.concurrent.LinkedBlockingQueue;

public class EventLoop implements Runnable{
    private LinkedBlockingQueue<EventObject> eventQueue;

    EventLoop() {
        eventQueue = new LinkedBlockingQueue<EventObject>();
    }

    public void addEvent(EventObject e) {
        eventQueue.add(e);
    }

    public void run() {
        while(true) {
            try{
                EventObject e = eventQueue.take();
                e.eventExcute();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
