/**
 * 
 */
package com.hds.springboot2jparest.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Sathiyan
 *
 */
@Entity
@Table(name="employee")
public class Employee {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id ;
	@Column(name="first_name")
    private String firstname;
	@Column(name="last_name")
	private String lastname;
	
	private String email;
	
	private String phone;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the first_name
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the last_name
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", phone=" + phone + "]";
	}

}
