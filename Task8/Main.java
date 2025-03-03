package jml1.Task8;
import jml1.EmployeeData.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> listOfEmployees = EmployeeData.employees;
        List<Double> listOfAnnualSalary = listOfEmployees.stream().map(x->x.getSalary()*12).toList();
        listOfAnnualSalary.forEach(System.out::println);
    }
}
