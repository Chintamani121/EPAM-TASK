package jml2.Task1.Decorators;
import jml2.Task1.EmployeeType.Employee;
import jml2.Task1.EventType.Event;
import jml2.Task1.Publisher.NotificationService;

public abstract class SalaryDecorators extends Employee{
    protected final Employee decoratedEmployee;
    public SalaryDecorators(Employee employee) {
        super(new EmployeeBuilder<>());
        this.decoratedEmployee = employee;
        NotificationService.notifyObserver(Event.SALARY,employee);
    }
}
