package jml1.Task0;

public class RegularSalaryCalculator implements SalaryCalculator{
    @Override
    public double calculate(double baseSalary){
        return baseSalary-baseSalary*0.3;
    }
}
