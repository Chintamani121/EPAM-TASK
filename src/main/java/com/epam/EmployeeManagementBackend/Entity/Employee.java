package com.epam.EmployeeManagementBackend.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @NotNull
    private String name;
    @Column
    @NotNull
    private int age;
    @Column
    @NotNull
    private int baseSalary;
    @Column
    @NotNull
    private String department;
    @Column
    @NotNull
    private int bonus;
    @Column
    @NotNull
    private String title;
    @Column(name = "hire_date")
    @JsonProperty("hire_date")
    @NotNull
    private LocalDate hireDate;
    public Employee(){}
    public Employee(Long id, String name, int age, int baseSalary, String department, int bonus, String title, LocalDate hireDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.department = department;
        this.bonus = bonus;
        this.title = title;
        this.hireDate = hireDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
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
}