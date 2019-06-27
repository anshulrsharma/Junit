package com.lti.junit;

public class Employee {
private int Id;
private String name;
private int salary;
public Employee(int Id,String name,int salary) {
	super();
	this.name=name;
	this.Id=Id;
	this.salary=salary;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public boolean equals(Object obj) {
	Employee emp=(Employee) obj;
	boolean status=false;
	if(this.name.equalsIgnoreCase(emp.name) && this.Id==emp.Id && this.salary==emp.salary) {
		status=true;
	} 
		return status;
	}
public static String getEmployeeNameWithHighestSalary() {
	return "Anshul";
}
public static Employee getHighestPaidEmployee() {
	return new Employee(1,"an",15000);
	
}
public int hashCode() {
	return this.Id;
}
}
