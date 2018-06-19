package com.eventLoop.www.EventLoop;

public class EventObject {
    private String eventName;
    private Command command;

    EventObject(String eventName, Command command) {
        this.eventName = eventName;
        this.command = command;
    }

    public void eventExcute() {
        command.execute();
    }

    public String getEventName() {
        return eventName;
    }

    @Override
    public boolean equals(Object obj) {
        EventObject src = (EventObject) obj;

        if(src.getEventName() == eventName)
            return true;
        else
            return false;
    }
}