package jml1.Task3;
import jml1.EmployeeData.*;

public class Main {
    public static void main(String[] args) {
        var employeeArrayList = EmployeeData.employees;
        employeeArrayList.stream().filter(x->x.getSalary()>400000).forEach(System.out::println);
    }
}


