/**
 * 
 */
package com.hds.springboot2jparest.service;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.hds.springboot2jparest.exception.ResourceNotFoundException;
import com.hds.springboot2jparest.model.Employee;

/**
 * @author Sathiyan
 *
 */
public interface EmployeeService {

	List<Employee> getEmployees();
	
	Employee getEmployee(Long id) throws ResourceNotFoundException;

	Employee createEmployee(Employee emp);

	ResponseEntity<Employee> updateEmployee(Long id,  Employee emp) throws ResourceNotFoundException;

	Map<String, Boolean> deleteEmployee(Long id)throws ResourceNotFoundException;

	ResponseEntity<Employee> patchEmployee(Long id, @Valid Employee emp)throws ResourceNotFoundException;
	
	
}
