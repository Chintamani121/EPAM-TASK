package jml1.EmployeeData;
import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    public static List<Employee> employees = Arrays.asList(
            new Employee(1, "ram", "SSD", "Manager", 8, 40000),
            new Employee(2, "sham", "JAVA","Manager", 8, 450000),
            new Employee(3, "carl", "SSD","Manager", 8, 403000),
            new Employee(4, "walter", "SSD","Intern", 8, 300000),
            new Employee(5, "bane", "SSD","SDE", 8, 401000),
            new Employee(6, "rake", "SSD","SDE", 8, 407000),
            new Employee(7, "shake", "SSD","SDE", 8, 460000),
            new Employee(8, "lily", "SSD","SDE", 8, 40000)
    );

    public static List<FullTimeEmployee> fUllTimeEmployees = Arrays.asList(
            new FullTimeEmployee(9, "ram", "SSD", "Manager", 8, 400000,1000000),
            new FullTimeEmployee(10, "sham", "JAVA", "Manager", 8, 450000,10000000),
            new FullTimeEmployee(11, "carl", "SSD", "Manager", 8, 403000,10000000),
            new FullTimeEmployee(12, "walter", "SSD", "Manager", 8, 300000,10000000),
            new FullTimeEmployee(13, "bane", "SSD", "Manager", 8, 401000,1000000),
            new FullTimeEmployee(14, "rake", "SSD", "Manager", 8, 407000,10000000),
            new FullTimeEmployee(15, "shake", "SSD", "Manager", 8, 460000,1000000),
            new FullTimeEmployee(16, "lily", "SSD", "Manager", 8, 40000,1000000)
    );

    public static List<PartTimeEmployee> partTimeEmployees = Arrays.asList(
            new PartTimeEmployee(17, "ram", "SSD","Intern", 8, 400000,1),
            new PartTimeEmployee(18, "sham", "JAVA","Intern", 8, 450000,1),
            new PartTimeEmployee(19, "carl", "SSD","Intern", 8, 403000,1),
            new PartTimeEmployee(20, "walter", "SSD","Intern", 8, 300000,2),
            new PartTimeEmployee(21, "bane", "SSD","Intern", 8, 401000,2),
            new PartTimeEmployee(22, "rake", "SSD","Intern", 8, 407000,2),
            new PartTimeEmployee(23, "shake", "SSD","Intern", 8, 460000,1),
            new PartTimeEmployee(24, "lily", "SSD","Intern", 8, 40000,1)
    );
}
