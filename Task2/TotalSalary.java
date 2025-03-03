package jml1.Task2;

public class TotalSalary {
    public static double getTotalSalary(Double baseSalary, SalaryCalculator salaryCalculator, BonusCalculator bonusCalculator){
        if (baseSalary==null) throw new IllegalArgumentException("base salary can not be null");
        if (baseSalary<0) throw new IllegalArgumentException("base salary can not be negative");
        if(salaryCalculator==null) throw new IllegalArgumentException("salaryCalculator can not be null");
        if(bonusCalculator==null) throw new IllegalArgumentException("bonusCalculator can not be null");
        double bonus=bonusCalculator.calculateBonus(baseSalary);
        double salary=salaryCalculator.calculate(baseSalary);
        return salary+bonus;
    }
}
