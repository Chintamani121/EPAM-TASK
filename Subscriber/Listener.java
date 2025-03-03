package jml2.Task1.Subscriber;

import jml2.Task1.EmployeeType.Employee;
import jml2.Task1.EventType.Event;

public interface Listener {
    void update(Event event, Employee emp);
    String getListenerType();
    String getName();
}
