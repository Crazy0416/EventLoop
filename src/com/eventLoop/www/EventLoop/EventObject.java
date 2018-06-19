package com.eventLoop.www.EventLoop;

public class EventObject {
    private String eventName;
    private EventFunctor command;

    EventObject(String eventName, EventFunctor eventFunctor) {
        this.eventName = eventName;
        this.command = eventFunctor;
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