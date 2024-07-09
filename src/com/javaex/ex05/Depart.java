package com.javaex.ex05;

public class Depart extends Employee{

	 //코드작성
	//필드
	public String department;

	//생성자
	public Depart() {
		super();
	}

	public Depart(String name, int salary,String department) {
		super();
		super.setName(name);
		super.setSalary(salary);
		this.department = department;
	}

	//메소드 gs
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void showInformation() {
        System.out.println("이름:" + super.getName() + " 연봉:" + super.getSalary()+" 부서:"+department);
    }
	
	

}
