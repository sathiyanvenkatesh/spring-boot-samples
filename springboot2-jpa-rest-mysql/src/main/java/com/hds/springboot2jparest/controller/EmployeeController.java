/**
 * 
 */
package com.hds.springboot2jparest.controller;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.hds.springboot2jparest.service.EmployeeService;

import io.swagger.annotations.Api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hds.springboot2jparest.exception.ResourceNotFoundException;
import com.hds.springboot2jparest.model.Employee;

/**
 * @author Sathiyan
 *
 */

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
@Api(value="Employee Management System",  description=" Employee Management System")


public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		logger.warn("EmployeeController.getEmployees() calling ... ");
		return employeeService.getEmployees();
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeebyId(@PathVariable Long id) throws ResourceNotFoundException {
		logger.warn("EmployeeController.getEmployee() calling  with employe id ... " + id);
		Employee employee = employeeService.getEmployee(id);
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping("/employee")//A POST Service should return a status of created (201) when the resource creation is successful.
	public ResponseEntity<Void> createEmployee(@Valid @RequestBody Employee emp) {
		logger.warn("EmployeeController.createEmployee() calling ... ");
		Employee employee=employeeService.createEmployee(emp);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
				"/{id}").buildAndExpand(employee.getId()).toUri();
		return ResponseEntity.created(location).build();
		
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
	
	@PatchMapping("/employee/{id}")	
	public ResponseEntity<Employee> patchEmployee(@PathVariable Long id,@Valid @RequestBody Employee emp) throws ResourceNotFoundException
	{
	 return employeeService.patchEmployee(id,emp);
	}
	
	
	
	
}

