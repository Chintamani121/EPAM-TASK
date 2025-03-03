package jml1.Task9;
import jml1.EmployeeData.*;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Employee> listOfEmployee = EmployeeData.employees;
        listOfEmployee.stream().
                filter(x-> Objects.equals(x.getRole(), "Manager")).
                filter(x->x.getSalary()>400000).
                forEach(System.out::println);

    }
}
