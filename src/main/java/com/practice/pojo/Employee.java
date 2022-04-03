package com.practice.pojo;

public class Employee {
	private String empId;
	private String empName;
	private double sal;
	private String dept;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empId, String empName, double sal, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.dept = dept;
	}
}
