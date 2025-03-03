package jml2.Task1.EmployeeType;
import jml2.Task1.Annotations.AlwaysPositive;
import jml2.Task1.Annotations.NotBlank;
import jml2.Task1.Annotations.NotNull;

public abstract class Employee {
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @AlwaysPositive
    private Integer employeeId;
    @NotNull
    @AlwaysPositive
    private Integer age;
    @NotNull
    @AlwaysPositive
    private Double baseSalary;
    public Employee(EmployeeBuilder<?> builder){
        this.name = builder.name;
        this.employeeId = builder.employeeId;
        this.age = builder.age;
        this.baseSalary = builder.baseSalary;

    }

    public static class EmployeeBuilder<T extends EmployeeBuilder<T>>{
        private String name;
        private Integer age;
        private Integer employeeId;
        private Double baseSalary;
        public T name(String name){
            this.name=name;
            return (T) this;
        }
        public T baseSalary(Double salary){
            this.baseSalary = salary;
            return (T) this;
        }
        public T age(Integer age){
            this.age = age;
            return (T) this;
        }
        public T employeeId(Integer employeeId){
            this.employeeId=employeeId;
            return (T) this;
        }
    }

    public String getName() {
        return name;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public Integer getAge() {
        return age;
    }
}
