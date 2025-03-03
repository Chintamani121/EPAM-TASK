package jml1.Task4;
import jml1.EmployeeData.*;

public class Main {
    public static void main(String[] args) {
        var arrayFullTimeEmployees = EmployeeData.fUllTimeEmployees;
        var arrayPartTimeEmployees = EmployeeData.partTimeEmployees;

        for(FullTimeEmployee employee : arrayFullTimeEmployees){
            System.out.println(employee.calculate(employee.getSalary(), employee.getPercentage()));
        }

        for(PartTimeEmployee employee : arrayPartTimeEmployees){
            System.out.println(employee.calculate(employee.getSalary(), employee.getPercentage()));
        }
    }
}
