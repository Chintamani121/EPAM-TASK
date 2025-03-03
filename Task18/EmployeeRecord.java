package jml1.Task18;

public record EmployeeRecord(String name, double salary) {
    public EmployeeRecord {
        if(name.isEmpty()) throw new IllegalArgumentException("Name can not be null");
        if(name.isBlank()) throw new IllegalArgumentException("Name can not be blank");
        if(salary<0) throw new IllegalArgumentException("salary can not be negative");
    }
}
