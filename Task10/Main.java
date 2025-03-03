package jml1.Task10;
import jml1.EmployeeData.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeData.employees;
        employeeList.stream().map(Employee::getName).forEach(System.out::println);
    }
}
