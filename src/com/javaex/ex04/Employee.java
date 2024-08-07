package com.javaex.ex04;

public class Employee extends User{
	
	//필드
	private int salary;		//급여

	//생성자
	public Employee() {
		super();
	}

	public Employee(int salary) {
		super();
		this.salary = salary;
	}
	
	public Employee(String id, String password, String name, int salary) {
		super();
		super.setId(id);
		super.setPassword(password);
		super.setName(name);
		this.salary = salary;
	}

	//메소드 gs
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println("#아이디: "+super.getId()+", #패스워드:"+ super.getPassword()+", #이름:"+super.getName()+", #월급:"+salary);
	}	
	
}
