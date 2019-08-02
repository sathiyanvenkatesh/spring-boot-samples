/**
 * 
 */
package com.hds.springboot2jparest.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hds.springboot2jparest.service.EmployeeService;
import com.hds.springboot2jparest.exception.ResourceNotFoundException;
import com.hds.springboot2jparest.model.Employee;

/**
 * @author Sathiyan
 *
 */
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee")
	public List<Employee> getEmployees() {
		logger.warn("EmployeeController.getEmployees() calling ... ");
		return employeeService.getEmployees();
	}

	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeebyId(@PathVariable Long id) throws ResourceNotFoundException {
		logger.warn("EmployeeController.getEmployee() calling  with employe id ... " + id);
		Employee employee = employeeService.getEmployee(id);
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping("/employee")
	public Employee createEmployee(@Valid @RequestBody Employee emp) {
		logger.warn("EmployeeController.createEmployee() calling ... ");
		return employeeService.createEmployee(emp);
	}

	@PutMapping("/employee/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @Valid @RequestBody Employee emp)
			throws ResourceNotFoundException {
		return employeeService.updateEmployee(id, emp);

	}

	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable  Long id)
			throws ResourceNotFoundException {
		return employeeService.deleteEmployee(id);
	}
}

