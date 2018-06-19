package com.eventLoop.www;

import com.eventLoop.www.EventLoop.EventFunctor;
import com.eventLoop.www.EventLoop.MyEvent;

public class Main {

    public static void main(String[] args) {
        MyEvent event = new MyEvent();
        event.on("event1", new EventFunctor() {
            @Override
            public void execute() {
                System.out.println("hello world");
            }
        });
        event.emit("event1");
    }
}
