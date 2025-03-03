package jml1.Task0;
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
            BonusCalculator bonus=(d)->{
                return d*0.2;
            };
            System.out.println(bonus.calculateBonus(b.getSalary()));
        }
    }
}
