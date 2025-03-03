package jml2.Task1.SalaryType;

import jml2.Task1.EmployeeType.Employee;

public class BaseSalaryCalculator implements SalaryCalculator<Employee> {
    @Override
    public void calculate(Employee emp) {
        System.out.println(emp.getBaseSalary());
    }
}
