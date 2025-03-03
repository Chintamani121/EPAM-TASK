package jml1.Task17;
import jml1.EmployeeData.Employee;
import jml1.EmployeeData.EmployeeData;
import jml1.EmployeeData.FullTimeEmployee;
import jml1.EmployeeData.PartTimeEmployee;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeData.employees;
        List<FullTimeEmployee> fullTimeEmployeeList = EmployeeData.fUllTimeEmployees;
        List<PartTimeEmployee> partTimeEmployeeList = EmployeeData.partTimeEmployees;
    }
}
