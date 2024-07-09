package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] uArray=new User[3];
		
		User c01 = new Customer("jws", "j1234", "정우성", 1000);
		
		User c02 = new Customer("yis", "y2345", "이효리", 2000);
		
		User e01 = new Employee("master", "m7788", "운영자", 5000000);
		
		uArray[0]=c01;		//고객->회원
		uArray[1]=c02;		//고객->회원
		uArray[2]=e01;		//직원->회원
		
		for (int i=0; i<uArray.length; i++) {
			uArray[i].showInfo();
		}
		
		
		System.out.println("운영자의 월급은 "+((Employee)e01).getSalary()+"원 입니다.");
	}

}
