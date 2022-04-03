package com.practice.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.practice.pojo.Employee;

public class UtilService {
	
	public static List<Employee> employees = new CopyOnWriteArrayList<>();
	
	public static List<Employee> getAllEmployees() {
		employees.add(new Employee("Meghan123", "Meghan W/o ANil", 35000.56, "Devlopement"));
		employees.add(new Employee("Anil124", "Velupula Anill", 65000.56, "SD"));
		employees.add(new Employee("Sai123", "SaiKrishna", 65000.56, "SD"));
		
		/*employees = List.of(new Employee("Meghan123", "Meghan W/o ANil", 35000.56, "Devlopement"), new Employee("Anil124", "Velupula Anill", 65000.56, "SD"),
				new Employee("Sai123", "SaiKrishna", 65000.56, "SD"));*/
		return employees;
	}
	
}
