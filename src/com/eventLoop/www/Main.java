package com.eventLoop.www;

import com.eventLoop.www.EventLoop.Command;
import com.eventLoop.www.EventLoop.MyEvent;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyEvent event = new MyEvent();
        event.on("event1", new Command() {
            @Override
            public void execute() {
                System.out.println("hello world");
            }
        });
        event.emit("event1");
    }
}
