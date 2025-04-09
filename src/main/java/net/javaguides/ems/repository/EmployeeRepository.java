package net.javaguides.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.ems.entity.Employee;


/**
 * Employee Repository interface for JPA operations
 */

public interface EmployeeRepository extends JpaRepository <Employee, Long> {


}
