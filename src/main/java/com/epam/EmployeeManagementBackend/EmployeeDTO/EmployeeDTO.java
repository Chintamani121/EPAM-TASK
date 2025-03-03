package com.epam.EmployeeManagementBackend.EmployeeDTO;
import java.time.LocalDate;

public class EmployeeDTO {
    private String name;
    private Integer age;
    private int baseSalary;
    private String department;
    private int bonus;
    private String title;
    private LocalDate hireDate;
    public EmployeeDTO(String name, Integer age, Integer baseSalary, String department, Integer bonus,String title,LocalDate localDate) {
        this.name = name;
        this.age = age;
        this.baseSalary=baseSalary;
        this.department=department;
        this.bonus=bonus;
        this.title = title;
        this.hireDate=localDate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String role) {
        this.department = department;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", baseSalary=" + baseSalary +
                ", department='" + department + '\'' +
                ", bonus=" + bonus +
                ", title="+ title +
                ", hire_date="+
                '}';
    }
}
