package jml1.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee a=new Employee(12,"Shan","JAVA",8,120000);
        ArrayList<Employee> arr=new ArrayList<>();
        arr.add(a);
        arr.add(new Employee(123,"Chan","JAVA",8,120000));
        arr.add(new Employee(1,"Shon","JAVA",8,120000));
        arr.add(new Employee(2,"Han","JAVA",8,120000));
        for(Employee b:arr){
            //functional lambda expression
            //10 percent increment
            BonusCalculator bonus=(salary)->salary*0.1;
            //30 percent tax deduction
            SalaryCalculator salaryCalculator=(salary)->salary-salary*0.3;
            //total salary
            System.out.println(TotalSalary.getTotalSalary(b.getSalary(),salaryCalculator,bonus));
        }
    }
}
