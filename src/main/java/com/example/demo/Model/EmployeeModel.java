package com.example.demo.Model;

import org.springframework.stereotype.Component;

@Component
public class EmployeeModel {
	
	public EmployeeModel() {
		
	}

    public EmployeeModel(String id,String employeeName,String employeeId,String designation) {
    	this.id=id;
    	this.employeeName=employeeName;
    	this.employeeId=employeeId;
    	this.designation=designation;
    }
	
	public String id;
	public String employeeName;
	public String employeeId;
	public String designation;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	public EmployeeModel myModel(String id,String employeeName,String employeeId,String designation) {		
		return new EmployeeModel(id,employeeName,employeeId,designation);
	}
	

}
