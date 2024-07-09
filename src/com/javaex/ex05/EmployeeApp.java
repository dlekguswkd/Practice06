package com.javaex.ex05;

public class EmployeeApp {
	
	//실행결과를 참조하여 Employee클래스를 상속받아 Depart클래스를 구현합니다.
	//(Employee 와 EmployeeApp 클래스는 수정하지 않습니다.
	//	Depart 클래스의 맴버변수는 String department 로 작성합니다.)

    public static void main(String[] args) {

        Employee pt = new Depart( "홍길동", 5000, "개발부" );
        pt.showInformation();
    }

}


