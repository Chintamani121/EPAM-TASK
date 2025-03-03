package jml1.Task14;
import jml1.EmployeeData.Employee;
import jml1.EmployeeData.EmployeeData;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeData.employees;
        if(!employeeList.isEmpty()) {
            System.out.println(employeeList.stream().map(Employee::getSalary).
                    filter(x->x>40000).
                    findFirst().
                    orElse(null));
        }
    }
}
