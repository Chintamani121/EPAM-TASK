package jml2.Task1.Publisher;
import jml2.Task1.EmployeeType.Employee;
import jml2.Task1.EventType.Event;
import jml2.Task1.Subscriber.Listener;
import java.util.*;

public class NotificationService {
    private static final Map<Event,List<Listener>> listeners = new HashMap<>();
    public NotificationService() {
        Arrays.stream(Event.values()).
                forEach(event -> listeners.put(event,new ArrayList<>()));
    }

    public void subscribe(Event event,Listener listener) {
        listeners.get(event).add(listener);
    }

    public void remove(Listener listener,Event event) {
        listeners.get(event).remove(listener);
    }

    public static void notifyObserver(Event event, Employee emp) {
        for(Listener listener1:listeners.get(event)){
            listener1.update(event,emp);
        }
    }
}
