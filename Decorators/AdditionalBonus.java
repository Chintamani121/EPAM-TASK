package jml2.Task1.Decorators;
import jml2.Task1.EmployeeType.Employee;

public class AdditionalBonus<T extends Employee> extends SalaryDecorators{
    T employee;
    public AdditionalBonus(T employee){
        super(employee);
        this.employee=employee;
    }
    @Override
    public String getName(){
        return employee.getName();
    }
    @Override
    public Double getBaseSalary() {
        return employee.getBaseSalary()+10000;
    }
}
