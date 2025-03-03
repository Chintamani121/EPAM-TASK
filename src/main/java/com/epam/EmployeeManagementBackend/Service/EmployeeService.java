package com.epam.EmployeeManagementBackend.Service;
import com.epam.EmployeeManagementBackend.EmployeeDTO.EmployeeDTO;
import com.epam.EmployeeManagementBackend.Entity.Employee;
import com.epam.EmployeeManagementBackend.Mapper.EmployeeMapper;
import com.epam.EmployeeManagementBackend.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    public void saveDetails(Employee employee){
        employeeRepo.save(employee);
    }
    public Employee getElementById(Long id){
        return employeeRepo.findById(id).orElseThrow(() ->
                new NoSuchElementException("Employee with id " + id + " not found"));
    }

    public int payroll(){
        return employeeRepo.
                findAllSalaries().stream().
                mapToInt(Integer::intValue).
                sum() +
                employeeRepo.findAllBonuses().stream().
                        mapToInt(Integer::intValue).
                        sum();
    }
    public double getAverageSalaryPerDept(String department) {
        Double avgSalary = employeeRepo.getAverageSalaryPerDepartment(department);
        return (avgSalary != null) ? avgSalary : 0.0;
    }
    public Map<String,List<EmployeeDTO>> getEmployeesGroupedByDepartment(){
        List<Employee> listEMP=employeeRepo.employeeList();
        Map<String,List<EmployeeDTO>> mapDTO=listEMP.stream().
                map(EmployeeMapper::toDTO).
                collect(Collectors.groupingBy(EmployeeDTO
                        ::getDepartment));
        return mapDTO;
    }
    public List<EmployeeDTO> getHighestPaidEmployee(int n){
        List<Employee> listEMP = employeeRepo.highestPaidEmployees(n);
        return listEMP.stream().map(EmployeeMapper::toDTO).toList();
    }
    public int getSalaryByTitle(String title){
        List<Employee> listEMP=employeeRepo.employeesOrderedByTitle(title);
        return listEMP.stream().map(x->x.getBonus()+x.getBaseSalary()).
                mapToInt(Integer::intValue).sum();
    }
    public List<EmployeeDTO> getEmployeeHiredInLastN(int months){
        List<Employee> listEMP = employeeRepo.findEmployeesHiredInLastNMonths(months);
        return listEMP.stream().map(EmployeeMapper::toDTO).toList();
    }
}
