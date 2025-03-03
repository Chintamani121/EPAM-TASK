package jml2.Task1.SalaryType;

import jml2.Task1.EmployeeType.ContractorEmployee;

public class ContractorSalaryCalculator implements SalaryCalculator<ContractorEmployee> {
    @Override
    public void calculate(ContractorEmployee emp) {
        System.out.println("Part time salary calculator : "+
                (emp.getBaseSalary()+emp.getHourlyRate()*emp.getHoursWorked()*30));
    }
}
