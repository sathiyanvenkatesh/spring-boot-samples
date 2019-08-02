/**
 * 
 */
package com.hds.springboot2jparest.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hds.springboot2jparest.exception.ResourceNotFoundException;
import com.hds.springboot2jparest.model.Employee;
import com.hds.springboot2jparest.repository.EmployeRepository;

/**
 * @author Sathiyan
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeRepository employeRepo;
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		 return employeRepo.findAll();
	}

	@Override
	public Employee getEmployee(Long id) throws ResourceNotFoundException {
		Employee employee = employeRepo.findById(id)
		          .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
		return employee;
	}

	@Override
	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeRepo.save(emp);
	}

	@Override
	public ResponseEntity<Employee> updateEmployee(Long id, Employee emp) throws ResourceNotFoundException {
		Employee employee = employeRepo.findById(id)
		          .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
		employee.setEmail(emp.getEmail());
		employee.setFirst_name(emp.getFirst_name());
		employee.setLast_name(emp.getLast_name());
		employee.setPhone(emp.getPhone());
		
		final Employee updatedEmployee=employeRepo.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}

	@Override
	public Map<String, Boolean> deleteEmployee(Long id) throws ResourceNotFoundException {
		Employee employee = employeRepo.findById(id)
		          .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
		employeRepo.delete(employee);
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	}

}
