package jml2.Task1.AbstractFactoryCalculator;
import jml2.Task1.EmployeeType.Employee;
import jml2.Task1.EmployeeType.FullTimeEmployee;
import jml2.Task1.EmployeeType.ContractorEmployee;
import jml2.Task1.SalaryType.BaseSalaryCalculator;
import jml2.Task1.SalaryType.FullTimeSalaryCalculator;
import jml2.Task1.SalaryType.ContractorSalaryCalculator;
import jml2.Task1.SalaryType.SalaryCalculator;
import java.util.HashMap;
import java.util.Map;

public class SalaryCalculatorFactory {
    private final static Map<Class<? extends Employee>,
            SalaryCalculator<? extends Employee>>
            calculators = new HashMap<>();
    static{
        calculators.put(FullTimeEmployee.class,new FullTimeSalaryCalculator());
        calculators.put(ContractorEmployee.class,new ContractorSalaryCalculator());
        calculators.put(Employee.class,new BaseSalaryCalculator());
    }
    public <T extends Employee> void register(T emp, SalaryCalculator<T> calculator){
        if(calculators.containsKey(emp.getClass())){
            throw new IllegalArgumentException("Already present");
        }
        calculators.put(emp.getClass(),calculator);
    }

    public <T extends Employee> void calculate(T emp){
        SalaryCalculator salaryCalculator = calculators.get(emp.getClass());
        salaryCalculator.calculate(emp);
    }
}
