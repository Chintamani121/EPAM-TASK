package jml1.Task15;
import jml1.EmployeeData.Employee;
import jml1.EmployeeData.EmployeeData;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeData.employees;
        if(!employeeList.isEmpty()) {
            employeeList.stream().
                    map(Employee::getSalary).
                    distinct().forEach(System.out::println);
        }
    }
}
