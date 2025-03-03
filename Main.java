package jml2.Task1;
import jml2.Task1.AbstractFactoryCalculator.SalaryCalculatorFactory;
import jml2.Task1.Decorators.AdditionalBonus;
import jml2.Task1.Decorators.PayCut;
import jml2.Task1.EmployeeType.Employee;
import jml2.Task1.EmployeeType.FullTimeEmployee;
import jml2.Task1.EmployeeType.ContractorEmployee;
import jml2.Task1.EventType.Event;
import jml2.Task1.Publisher.NotificationService;
import jml2.Task1.Subscriber.EmailListener;
import jml2.Task1.Subscriber.Listener;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee.FullTimeEmployeeBuilder().
                age(20).annualBonus(100000).employeeId(1).
                name("Samridhi").baseSalary(1000000.0).build();
        ContractorEmployee emp2 = new ContractorEmployee.ContractorEmployeeBuilder().
                age(19).hoursWorked(8).hourlyRate(50).name("Dawar").
                employeeId(2).baseSalary(100000.0).build();
        SalaryCalculatorFactory factory = new SalaryCalculatorFactory();
        factory.calculate(emp1);
        factory.calculate(emp2);
        NotificationService notificationService = new NotificationService();
        Listener emailListener = new EmailListener(emp2);
        notificationService.subscribe(Event.SALARY,emailListener);
        Employee emp= (new PayCut<>(new AdditionalBonus<>(new AdditionalBonus<>(emp1))));
    }
}
