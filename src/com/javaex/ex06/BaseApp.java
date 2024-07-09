package com.javaex.ex06;

public class BaseApp {
	
	//다음과 같이 2가지 클래스가 제공된다.
	//BaseApp클래스를 실행했을 때 아래와 같이 나올 수 있도록 Base 클래스를 상속하여 MyBase 클래스를 작성하세요.
	//(BaseApp 와 Base 클래스는 수정하지 않습니다.)

    public static void main(String[] args) {

        Base base = new MyBase();
        base.service("낮");
        base.service("밤");
        base.service("오후");
    }

}
