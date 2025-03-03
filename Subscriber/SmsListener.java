package jml2.Task1.Subscriber;
import jml2.Task1.EmployeeType.Employee;
import jml2.Task1.EventType.Event;
import jml2.Task1.Publisher.NotificationService;

public class SmsListener implements Listener{
    private Employee emp;
    private NotificationService payrollObservable = new NotificationService();
    public SmsListener(Employee emp){
        this.emp = emp;
    }
    @Override
    public String getName(){
        return emp.getName();
    }
    @Override
    public void update(Event event , Employee employee) {
        System.out.println(emp.getName()+" got notified about "+event+" of "+employee.getName()+" through sms");
    }

    @Override
    public String getListenerType() {
        return "SMS";
    }
}
