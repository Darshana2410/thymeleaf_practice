package com.example.EmployeeApplication;

public class Employee_Model {

	public String firstName;
	public String lastName;
    public String email;
    public String role;
    
	public Employee_Model(String firstName, String lastName, String email, String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee_Model [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", role="
				+ role + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
    
}
