package jml1.Task11;
import jml1.EmployeeData.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeData.employees;
        System.out.println(employeeList.stream().map(Employee::getSalary).reduce(Double::sum).get());
    }
}
