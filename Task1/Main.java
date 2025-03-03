package jml1.Task1;
import jml1.Task0.RegularSalaryCalculator;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
            Supplier<Double> gets=()->b.getSalary();
            Consumer<Double> fets=(ba)->System.out.println(ba);
            Function<Integer,Double> func=(ab)-> Double.valueOf(ab);
            Predicate<Integer> sunc=(ba)->(ba>100000)?true:false;
            BonusCalculator bonus=()->b.getSalary();
            //BonusCalculator tonus=an->an+1;
            //bonus.calculateBonus();
            //double ana=(BonusCalculator m, RegularSalaryCalculator n)->m.calculateBonus()+n.calculate(12);
            System.out.println(gets.get());
        }
    }
}
