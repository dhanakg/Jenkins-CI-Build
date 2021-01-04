package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.Model.EmployeeModel;
import com.example.demo.controller.EmployeeController;

@SpringBootTest
class HelloWorldApplicationTests {

	@Autowired
	EmployeeController empController;
	
	@Test
	public void testemployeeCollection() {		
        List<EmployeeModel> result = empController.EmployeeList();
        System.out.println("result :"+result);
        Assertions.assertEquals(result, "I_AM_EMPLOYEE");
    }
	
	@Test
	public void testemployee() {		
        String result = empController.Employeeami();
        System.out.println("result :"+result);
        Assertions.assertEquals(result, "I_AM_EMPLOYEE");
    }

}
