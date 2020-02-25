/**
 * 
 */
package com.hds.springboot2jparest.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito.BDDMyOngoingStubbing;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static java.util.Collections.singletonList;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hds.springboot2jparest.jwt.service.JwtUserDetailsService;
import com.hds.springboot2jparest.model.Employee;
import com.hds.springboot2jparest.service.EmployeeService;

/**
 * @author Sathiyan
 *
 */
//@RunWith(SpringRunner.class)
//@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTests {
	 //  @Autowired
	  // private MockMvc mvc;

	  /* @MockBean
	   private EmployeeService employeeService;
	   
	   @MockBean
	   private JwtUserDetailsService jwtuserdetailsService;
	 
	   
	   @Test
	   public void getEmployees() throws Exception {
		   // given
		   Employee emp = new Employee();
		   emp.setId(1L);
	       emp.setEmail("test@test.com");
	       emp.setFirst_name("FirstName");
	       emp.setLast_name("LastName");
	       emp.setPhone("999999");
	       List<Employee> allEmployees = singletonList(emp);

	       given(employeeService.getEmployees()).willReturn(allEmployees);

	    // when + then
	        this.mvc.perform(get("/api/v1/employees"))
	                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
	                .andExpect(status().isOk())
	                .andExpect(content().json("[{'id': 1,'first_name': 'FirstName','last_name':'LastName','email':'test@test.com','phone':'999999'}]"));
	   }
	   @Test
	   public void getEmployeeById_ok() throws Exception {
		   // given
		   Employee emp = new Employee();
		   emp.setId(1L);
	       emp.setEmail("test@test.com");
	       emp.setFirst_name("FirstName");
	       emp.setLast_name("LastName");
	       emp.setPhone("999999");	    

	       given(employeeService.getEmployee(1L)).willReturn(emp);

	    // when + then
	        this.mvc.perform(get("/api/v1/employee/1"))
	                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
	                .andExpect(status().isOk())
	                .andExpect(content().json("{'id': 1,'first_name': 'FirstName','last_name':'LastName','email':'test@test.com','phone':'999999'}"));
	   }
	   */
	   
	  /* @Test
	   public void createEmployee() throws Exception {
		   // given
		   Employee emp = new Employee();
		   emp.setId(0l);
	       emp.setEmail("test@test.com");
	       emp.setFirst_name("FirstName");
	       emp.setLast_name("LastName");
	       emp.setPhone("999999");
	       Employee newemp = new Employee();
			   newemp.setId(1L);
			   newemp.setEmail("test@test.com");
			   newemp.setFirst_name("FirstName");
			   newemp.setLast_name("LastName");
			   newemp.setPhone("999999");
	       given(employeeService.createEmployee(emp)).willReturn(newemp);
	       
	    // when + then
	        this.mvc.perform(post("/api/v1/employee"))
	                 .andExpect(status().isOk())
	                 .andExpect(content().json("{'id': 1,'first_name': 'FirstName','last_name':'LastName','email':'test@test.com','phone':'999999'}"));
			   
			   
			   
			// studentService.addCourse to respond back with mockCourse
				Mockito.when(
						employeeService.createEmployee(emp)).thenReturn(newemp);

				// Send course as body to /students/Student1/courses
				RequestBuilder requestBuilder = MockMvcRequestBuilders
						.post("/api/v1/employee")
						.accept(MediaType.APPLICATION_JSON).content(asJsonString(newemp))
						.contentType(MediaType.APPLICATION_JSON);

				MvcResult result = mvc.perform(requestBuilder).andReturn();

				MockHttpServletResponse response = result.getResponse();

				assertEquals(HttpStatus.CREATED.value(), response.getStatus());

				assertEquals("http://localhost//api/v1/employee/1",
						response.getHeader(HttpHeaders.LOCATION));

	   }*/
	   
	/*   public static String asJsonString(final Object obj) {
	        try {
	            return new ObjectMapper().writeValueAsString(obj);
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }*/
}

