package com.trial.app.trial_springboot_app.model;

import javax.validation.constraints.Email;

public class Employee {

	private long employeeId;
	private String employeeName;
	@Email
	private String emailId;
	/**
	 * @return the employeeId
	 */
	public long getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public Employee setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
		return this;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public Employee setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
		return this;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public Employee setEmailId(String emailId) {
		this.emailId = emailId;
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emailId=" + emailId + "]";
	}
	
	
}
