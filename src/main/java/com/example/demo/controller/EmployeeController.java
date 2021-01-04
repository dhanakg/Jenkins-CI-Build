package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.Model.EmployeeModel;

@org.springframework.stereotype.Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeModel employeeModel;
	
	private List<EmployeeModel> employees;
	
    @GetMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
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
    
    @GetMapping(path = "/whoami",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String Employeeami() {
        employees = new ArrayList<>();        
        return "I_AM_EMPLOYEE";
    }
    
}
