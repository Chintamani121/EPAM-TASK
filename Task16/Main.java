package jml1.Task16;
import jml1.EmployeeData.Employee;
import jml1.EmployeeData.EmployeeData;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeData.employees;
        if(!employeeList.isEmpty()) {
            HashSet<String> empSet= new HashSet<>((HashSet<String>)
                    employeeList.stream().
                    map(Employee::getName)
                    .collect(Collectors.toSet()));
        }
    }
}
