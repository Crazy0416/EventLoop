package com.eventLoop.www;

import com.eventLoop.www.EventLoop.EventFunctor;
import com.eventLoop.www.EventLoop.EventEmitter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        EventEmitter event = new EventEmitter();
        event.on("event1", new EventFunctor() {
            @Override
            public void execute(Object... data) {
                for(int i = 0; i < 100; i++) {
                    System.out.println( i + " hello world in event1" + Arrays.toString(data));
                }
            }
        });
        event.emit("event1", 5, 10);
        Thread.currentThread().sleep(30);
    }
}
