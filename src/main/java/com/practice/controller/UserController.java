package com.practice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.pojo.Employee;
import com.practice.util.UtilService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@GetMapping("/testgetapi")
	public String testGetApi() {
		return "Meghana-Anil";
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return UtilService.getAllEmployees();
	}
	
	@PostMapping("/saveEmployee")
	public int saveEmployee(@RequestBody Employee emp) {
		try {
			UtilService.employees.add(emp);
			//return UtilService.getAllEmployees();
			return 1;
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	@PostMapping("/saveEmployeeWithAllEmpList")
	public List<Employee> saveEmployeeWithAllEmpList(@RequestBody Employee emp) {
		try {
			UtilService.employees.add(emp);
			return UtilService.getAllEmployees();
		} catch(Exception e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	@PostMapping("/saveMultipleEmployeeWithAllEmpList")
	public List<Employee> saveMultipleEmployeeWithAllEmpList(@RequestBody List<Employee> empList) {
		try {
			for(Employee emp : empList) {
				UtilService.employees.add(emp);
			}
			return UtilService.getAllEmployees();
		} catch(Exception e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	@DeleteMapping("/delEmployee/{empId}")
	public int delEmployee(@PathVariable String empId) {
		try {
			int res = 0;
			List<Employee> allEmployees = UtilService.getAllEmployees();
			for(Employee emp : allEmployees) {
				if(empId.equalsIgnoreCase(emp.getEmpId())) {
					allEmployees.remove(emp);
					res = 1;
				}
			}
			return res;
		}  catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee empObj) {
		try {
			List<Employee> allEmployees = UtilService.getAllEmployees();
			Employee reseEmp = null;
			for(Employee emp : allEmployees) {
				if(empObj.getEmpId().equalsIgnoreCase(emp.getEmpId())) {
					emp.setSal(empObj.getSal());
					emp.setEmpName(empObj.getEmpName());
					emp.setDept(empObj.getDept());
					reseEmp = emp;
				}
			}
			return reseEmp;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
