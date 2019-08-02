/**
 * 
 */
package com.hds.springboot2jparest.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hds.springboot2jparest.model.Employee;

/**
 * @author Sathiyan
 *
 */
@Repository
public interface EmployeRepository extends JpaRepository<Employee, Long> {

	
}
