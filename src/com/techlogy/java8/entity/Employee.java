package com.techlogy.java8.entity;

public class Employee {
	
	private String empId;
	private String empName;
	private String deptName;
	private Integer salary;
	private String city;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empId, String empName, String deptName, Integer salary, String city) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
		this.salary = salary;
		this.city = city;
	}

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

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", empName=" + empName + ", deptName=" + deptName + ", salary=" + salary
				+ ", city=" + city + "]";
	}
	
	

}
