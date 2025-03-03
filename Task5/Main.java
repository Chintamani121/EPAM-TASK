package jml1.Task5;
import jml1.EmployeeData.*;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Double rate = 0.2;
        UnaryOperator<Optional<Double>> SalaryCalculator = salaryOpt ->
                salaryOpt.map(salary -> salary - rate * salary);

        List<Employee> employeeArrayList = EmployeeData.employees;

        // Iterate over employees
        for (Employee employee : employeeArrayList) {
            if(employee.getSalary()!=0)
                System.out.println(SalaryCalculator
                        .apply(Optional.of(employee.getSalary()))
                        .orElse(null));
        }
    }
}
