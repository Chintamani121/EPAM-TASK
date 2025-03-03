package jml1.EmployeeData;
import jml1.Task4.VariableSalaryCalculator;

public final class PartTimeEmployee extends Employee implements VariableSalaryCalculator {
    int experience;
    final String type="Part time";
    final int percentage = 5;

    PartTimeEmployee(int employeeId, String name, String department, String role, int workHours, double salary, int experience) {
        super(employeeId, name, department, role, workHours, salary);
        if(experience<0 || experience>100){
            throw new IllegalArgumentException("write valid experience");
        }
        else this.experience=experience;
    }

    //setters

    void setExperience(int experience) {
        if(experience<0 || experience>=100){
            throw new IllegalArgumentException("write valid experience");
        }
        else this.experience=experience;
    }

    //getters

    int getExperience() {
        return experience;
    }

    public int getPercentage(){
        return percentage;
    }

    String getType(){
        return type;
    }

    @Override
    public String toString(){
        return super.toString()+" work hours is : "+ getWorkHours()+" type is : Part Time"+" Experience is : "+getExperience();
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public double calculate(double baseSalary, double percentage) {
        return baseSalary-(percentage/100)*baseSalary;
    }

}

