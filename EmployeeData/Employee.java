package jml1.EmployeeData;
import java.util.HashMap;

public sealed class Employee implements Comparable<Employee> permits FullTimeEmployee, PartTimeEmployee {
    private int employeeId;
    private String name;
    private String department;
    private String role = "Manager";
    private int workHours;
    private double baseSalary;
    private Integer rating=5;
    private static HashMap<Integer,Integer> set=new HashMap<>() ;

    //Constructor

    Employee(int employeeId, String name, String department, String role, int workHours, double salary){
        if(employeeId<=0){
            throw new IllegalArgumentException("write valid employee id");
        }
        else if(set.containsKey(employeeId)){
            throw new IllegalArgumentException("write unique employee id");
        }
        else{
            this.employeeId=employeeId;
            set.put(employeeId,employeeId);
        }
        if(name==null){
            throw new IllegalArgumentException("name can not be null");
        }
        else if(name.isBlank()){
            throw new IllegalArgumentException("write valid name");
        }
        else this.name=name;
        if(role==null){
            throw new IllegalArgumentException("role can not be null");
        }
        else if(role.isBlank()){
            throw new IllegalArgumentException("write valid role");
        }
        else this.role=role;

        if(department==null){
            throw new IllegalArgumentException("department can not be null");
        }
        else if(department.isBlank()){
            throw new IllegalArgumentException("write valid department");
        }
        else this.department=department;

        if(workHours<0 || workHours>24){
            throw new IllegalArgumentException("write valid work hours");
        }
        else this.workHours=workHours;

        if(salary<0 || Double.isNaN(salary)){
            throw new IllegalArgumentException("write valid salary");
        }
        else this.baseSalary=salary;
    }

    //Setter

    public void setEmployeeId(int employeeId) {
        if(employeeId<0){
            throw new IllegalArgumentException("write valid employee id");
        }
        else if(set.containsKey(employeeId)){
            throw new IllegalArgumentException("write unique employee id");
        }
        else{
            this.employeeId=employeeId;
            set.put(employeeId,employeeId);
        }
    }

    public void setName(String name) {
        if(name==null) throw new IllegalArgumentException("name can not be null");
        else if(name.isBlank()) throw new IllegalArgumentException("write valid name");
        else this.name = name;
    }
    public void setDepartment(String department) {
        if(department==null) throw new IllegalArgumentException("department can not be null");
        else if(department.isBlank()) throw new IllegalArgumentException("write valid department");
        else this.department = department;
    }

    public void setWorkHours(int workHours) {
        if(workHours<0 || workHours>24){
            throw new IllegalArgumentException("write valid work hours");
        }
        else this.workHours=workHours;
    }

    public void setSalary(double salary) {
        if(salary<0){
            throw new IllegalArgumentException("write valid salary");
        }
        else this.baseSalary = salary;
    }

    public void setRating(Integer rating){
        this.rating=rating;
    }

    //Getter

    public String getRole() {
        return role;
    }

    int getEmployeeId(){
        return this.employeeId;
    }

    public String getName(){
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }

    public double getSalary(){
        return baseSalary;
    }

    int getWorkHours() {
        return workHours;
    }

    public Integer getRating(){
        return rating;
    }

    //for getting employee info

    @Override
    public String toString(){
        return " Employee id : "+this.employeeId+" Employee name : "+this.name +" Employee department : "+this.department
                + " Salary "+this.baseSalary+" Role "+this.role;
    }

    //CompareTo method for natural ordering

    @Override
    public int compareTo(Employee other){
        return Integer.compare(this.getEmployeeId(),other.getEmployeeId());
    }
}
