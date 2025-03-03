package jml1.Task12;
import jml1.EmployeeData.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeData.employees;
        if(!employeeList.isEmpty()) {
            Map<String, List<Employee>> employeesByDepartment = employeeList.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment));

            System.out.println("Employees grouped by department:");
            employeesByDepartment.forEach((department, employees) -> {
                System.out.println(department + ": " + employees);
            });
        }
    }
}
