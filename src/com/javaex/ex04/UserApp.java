package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] uArray=new User[3];
		
		User u01 = new Customer("jws", "j1234", "정우성", 1000);
		
		User u02 = new Employee("yis", "y2345", "이효리", 2000);
		
		uArray[0]=u01;		//고객->회원
		uArray[1]=u02;		//직원->회원
		
		for (int i=0; i<uArray.length; i++) {
			uArray[i].showInfo();
		}
		
		
		System.out.println("운영자의 월급은 "+((Employee)u02).getSalary()+"원 입니다.");
	}

}
