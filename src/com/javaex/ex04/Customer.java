package com.javaex.ex04;

public class Customer extends User{
	
	//필드
	private int point;		//포인트점수
	
	//생성자
	public Customer() {
		super();
	}

	public Customer(int point) {
		super();
		this.point = point;
	}
	
	public Customer(String id, String password, String name, int point) {
		super();
		super.setId(id);
		super.setPassword(password);
		super.setName(name);
		this.point = point;
	}

	//메소드 gs
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println("#아이디: "+super.getId()+", #패스워드:"+ super.getPassword()+", #이름:"+super.getName()+", #포인트:"+point);
	}
		

	

}
