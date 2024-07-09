package com.javaex.ex07;

public class PhoneApp {
	
	//PhoneApp가 제대로 작동되도록 MusicPhone을 상속한 SmartPhone Class를 작성하세요.
	//[문제 설명] 1. MusicPhone 클래스를 상속받아 SmartPhone 클래스를 작성하는 문제입니다.
			// 2. Phone.java 와 MusicPhone.java 는 변경하지 않습니다.
			// 3. PhoneApp의 main 메서드도 변경하지 않고 실행결과가 나와야 합니다.

    public static void main(String[] args) {

        Phone phone = new SmartPhone();
        phone.execute("앱");
        phone.execute("음악");
        phone.execute("통화");
       
        
    }


}
