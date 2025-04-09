package net.javaguides.ems.service;

import net.javaguides.ems.dto.EmployeeDto;
import java.util.List;


public interface EmployeeService {
    // Implement logic for CRUD operations on Employee entity
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployeeDto);

    void deleteEmployee(Long employeeId);


}
