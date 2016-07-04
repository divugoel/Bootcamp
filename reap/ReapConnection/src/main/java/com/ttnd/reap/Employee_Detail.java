package com.ttnd.reap;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "employee_detail")
public class Employee_Detail {
	@Id
	private int employeeId;
	private String employeeName;
	private String employeeEmailId;
	private String password;
	private String serviceLine;
	private String practice;
	private String role;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int id) {
		this.employeeId = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String name) {
		this.employeeName = name;
	}

	public String getEmployeeEmailId() {
		return employeeEmailId;
	}

	public void setEmployeeEmailId(String emailId) {
		this.employeeEmailId = emailId;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}
	
	public String getServiceLine() {
		return serviceLine;
	}

	public void setServiceLine(String service_Line) {
		this.serviceLine = service_Line;
	}
	
	public String getPractice() {
		return practice;
	}

	public void setPractice(String practice) {
		this.practice = practice;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
