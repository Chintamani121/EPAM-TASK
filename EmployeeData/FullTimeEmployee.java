package jml1.EmployeeData;
import jml1.Task4.VariableSalaryCalculator;

public final class FullTimeEmployee extends Employee implements VariableSalaryCalculator {
    int providentFund;
    final String type = "Full time";
    final int percentage = 10;

    FullTimeEmployee(int employeeId, String name, String department,String role, int workHours, double salary, int providentFund) {
        super(employeeId, name, department, role, workHours, salary);
        if (providentFund < 0) {
            throw new IllegalArgumentException("write valid provident fund amount");
        } else this.providentFund = providentFund;

    }

    //getters

    int getProvidentFund() {
        return providentFund;
    }

    public int getPercentage(){
        return percentage;
    }

    String getType(){
        return type;
    }

    void setProvidentFund(int providentFund) {
        if (providentFund < 0) {
            throw new IllegalArgumentException("write valid provident fund amount");
        } else this.providentFund = providentFund;
    }

    @Override
    public String toString() {
        return super.toString() + " work hours is : " + getWorkHours() + "type is : Full Time" + "Provident fund is : " + getProvidentFund();
    }

    @Override
    public double getSalary()  {
        return super.getSalary();
    }

    @Override
    public double calculate(double baseSalary, double percentage) {
        return baseSalary-(percentage/100)*baseSalary;
    }
}
