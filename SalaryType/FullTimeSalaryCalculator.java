package jml2.Task1.SalaryType;
import jml2.Task1.EmployeeType.FullTimeEmployee;

public class FullTimeSalaryCalculator implements SalaryCalculator<FullTimeEmployee> {
    @Override   
    public void calculate(FullTimeEmployee emp) {
        System.out.println("Full time salary calculator : "+
                (emp.getAnnualBonus()+ emp.getBaseSalary()));
    }
}
