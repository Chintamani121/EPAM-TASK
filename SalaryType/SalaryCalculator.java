package jml2.Task1.SalaryType;
import jml2.Task1.EmployeeType.Employee;

public interface SalaryCalculator <T extends Employee> {
    void calculate(T emp);
}
