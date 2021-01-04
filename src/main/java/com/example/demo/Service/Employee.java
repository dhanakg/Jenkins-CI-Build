package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.Model.EmployeeModel;

@Service
public class Employee {
	
	private List<EmployeeModel> employees;
	
	@Autowired
	private EmployeeModel employeeModel;
	
	public List<EmployeeModel> EmployeeList() {
        employees = new ArrayList<>();
        employees.add(employeeModel.myModel("1","Mick","19001","Tester"));
        employees.add(employeeModel.myModel("2","John","19002","developer"));
        employees.add(employeeModel.myModel("3","Andrews","19003","Solution Architect"));
        employees.add(employeeModel.myModel("4","Manick","19004","Lead Automation"));
        employees.add(employeeModel.myModel("5","Sathish","19005","DevOps Specialist"));
        employees.add(employeeModel.myModel("6","steve","19006","Tester"));
        employees.add(employeeModel.myModel("7","Mccallem","19007","Tester"));
        employees.add(employeeModel.myModel("8","rodes","19008","Tester"));
        employees.add(employeeModel.myModel("9","Virat","19009","Tester"));
        employees.add(employeeModel.myModel("10","Dhoni","19010","Tester"));        
        return employees;
    }

}
