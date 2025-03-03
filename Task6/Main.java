package jml1.Task6;
import jml1.EmployeeData.*;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeArrayList = EmployeeData.employees;
        List<Double> listOfSalary = employeeArrayList.stream().
                sorted(Comparator.comparingDouble(Employee::getSalary)).
                map(Employee::getSalary).
                toList();
        listOfSalary.stream().filter(x->x>400000).forEach(System.out::println);
    }
}