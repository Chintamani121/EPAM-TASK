package com.epam.EmployeeManagementBackend.Repository;
import com.epam.EmployeeManagementBackend.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    @Query(value = "select base_salary from employee",nativeQuery = true)
    List<Integer> findAllSalaries();
    @Query(value = "select bonus from employee",nativeQuery = true)
    List<Integer> findAllBonuses();
    @Query(value = "SELECT AVG(base_salary + bonus) AS average_salary " +
            "FROM EMPLOYEE WHERE department =" +
            " :departmentName", nativeQuery = true)
    Double getAverageSalaryPerDepartment(@Param("departmentName") String departmentName);
    @Query(value = "SELECT * FROM employee ORDER BY department",nativeQuery=true)
    List<Employee> employeeList();
    @Query(value = "select * from employee order by base_salary desc limit :n",nativeQuery = true)
    List<Employee> highestPaidEmployees(@Param("n") int n);
    @Query(value ="select * from employee where title = :title",nativeQuery=true)
    List<Employee> employeesOrderedByTitle(@Param("title") String title);
    @Query(value = "SELECT * FROM employee WHERE" +
            " hire_date >= DATE_SUB(CURDATE(), INTERVAL :months MONTH)",
            nativeQuery = true)
    List<Employee> findEmployeesHiredInLastNMonths(@Param("months") int months);

}
