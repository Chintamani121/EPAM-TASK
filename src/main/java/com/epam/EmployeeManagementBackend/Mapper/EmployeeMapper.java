package com.epam.EmployeeManagementBackend.Mapper;
import com.epam.EmployeeManagementBackend.EmployeeDTO.EmployeeDTO;
import com.epam.EmployeeManagementBackend.Entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {
    public static Employee toEntity(EmployeeDTO employeeDTO){
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setAge(employeeDTO.getAge());
        employee.setBonus(employeeDTO.getBonus());
        employee.setDepartment(employeeDTO.getDepartment());
        employee.setBaseSalary(employeeDTO.getBaseSalary());
        employee.setTitle(employeeDTO.getTitle());
        employee.setHireDate(employeeDTO.getHireDate());
        return employee;
    }
    public static EmployeeDTO toDTO(Employee employee) {
        return new EmployeeDTO(employee.getName(),
                employee.getAge(),
                employee.getBaseSalary(),
                employee.getDepartment(),
                employee.getBonus(),
                employee.getTitle(),
                employee.getHireDate());
    }
}
