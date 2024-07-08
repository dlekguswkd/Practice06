package com.javaex.ex04;

public class User {
	
	//클래스 다이어그램을 보고 클래스를 작성하세요. 그리고 아래의 출력결과가 나오도록 UserApp.java를 프로그래밍 하세요.
	//(모든 고객과 직원은 하나의 배열로 관리합니다.)
	
	//필드
	private String id;		//아이디
	private String password;	//패스워드
	private String name;		//이름
	
	//생성자
	public User() {
		super();
	}
	
	public User(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	//메소드 gs
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println("");
	}
	
}
