package jml1.Task13;
import jml1.EmployeeData.Employee;
import jml1.EmployeeData.EmployeeData;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeData.employees;
        if(!employeeList.isEmpty()) {
            employeeList.stream().map(Employee::getSalary).
                    sorted(Comparator.comparingDouble(x -> -x)).
                    forEach(System.out::println);
        }
    }
}
