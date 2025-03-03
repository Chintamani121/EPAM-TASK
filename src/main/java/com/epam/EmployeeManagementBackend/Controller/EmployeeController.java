package com.epam.EmployeeManagementBackend.Controller;
import com.epam.EmployeeManagementBackend.EmployeeDTO.EmployeeDTO;
import com.epam.EmployeeManagementBackend.Entity.Employee;
import com.epam.EmployeeManagementBackend.Mapper.EmployeeMapper;
import com.epam.EmployeeManagementBackend.Service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/addEmployee")
    public ResponseEntity<String> postDetails(@Valid @RequestBody EmployeeDTO employeeDTO){
        Employee employee = EmployeeMapper.toEntity(employeeDTO);
        employeeService.saveDetails(employee);
        return ResponseEntity.ok("Employee created successfully");
    }
    @GetMapping("getEmployee/{id}")
    public ResponseEntity<String> getDetails(@PathVariable Long id){
        Employee employee = employeeService.getElementById(id);
        EmployeeDTO employeeDTO = EmployeeMapper.toDTO(employee);
        return ResponseEntity.ok(employeeDTO.toString());
    }
    @GetMapping("payroll")
    public ResponseEntity<Integer> getSalaries() {
        return ResponseEntity.ok(employeeService.payroll());
    }
    @GetMapping("department/{departmentName}/average-salary")
    public ResponseEntity<Double> getAverageSalariesPerDepartment(@PathVariable String departmentName){
        return ResponseEntity.ok(employeeService.getAverageSalaryPerDept(departmentName));
    }
    @GetMapping("grouped-by-department")
    public ResponseEntity<Map<String,List<EmployeeDTO>>> getEmployeeListPerDepartment(){
        return ResponseEntity.ok(employeeService.getEmployeesGroupedByDepartment());
    }
    @GetMapping("top-salaries/{n}")
    public ResponseEntity<List<EmployeeDTO>> getHighestPaidEmployees(@PathVariable int n){
        return ResponseEntity.ok(employeeService.getHighestPaidEmployee(n));
    }
    @GetMapping("payroll/job-title/{jobTitle}")
    public ResponseEntity<Integer> getSalaryBasedOnTitle(@PathVariable String jobTitle){
        return ResponseEntity.ok(employeeService.getSalaryByTitle(jobTitle));
    }
    @GetMapping("hired-in-last/{months}")
    public ResponseEntity<List<EmployeeDTO>> getEmployeesHiredInMonths(@PathVariable int months){
        return ResponseEntity.ok(employeeService.getEmployeeHiredInLastN(months));
    }
}
