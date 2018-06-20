package com.eventLoop.www.EventLoop;

import java.util.Arrays;

public class EventObject {
    private String eventName;
    private EventFunctor command;
    private Object[] parameter;

    EventObject(String eventName, EventFunctor eventFunctor) {
        this.eventName = eventName;
        this.command = eventFunctor;
    }

    public void eventExcute() {
        command.execute(parameter);
    }

    public String getEventName() {
        return eventName;
    }

    public void setParameter(Object... data) {
        parameter = data;
    }

    @Override
    public boolean equals(Object obj) {
        EventObject src = (EventObject) obj;

        if(src.getEventName().equals(eventName))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "eventName: " + eventName +
                "\ncommand: " + command.toString() +
                "\nparameter: " + Arrays.toString(parameter);
    }
}