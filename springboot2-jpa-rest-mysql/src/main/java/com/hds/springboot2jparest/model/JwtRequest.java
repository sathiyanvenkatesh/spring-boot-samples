package com.hds.springboot2jparest.model;

import java.io.Serializable;
/**
 * @author Sathiyan
 * This class is required for storing the username and password we received from the client.
 */
public class JwtRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	
	private String username;
	private String password;
	
	//default constructor for JSON Parsing
	public JwtRequest()
	{
	}

	public JwtRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}