package com.javaex.ex06;

public class Base {
	
	//(BaseApp 와 Base 클래스는 수정하지 않습니다.)

    public void service(String state) {

        if (state.equals("낮")) { //문자열의 같다(==) 는 equals()를 사용합니다.
            day();
        } else {
            night();
        }
    }

    public void day() {
        System.out.println("낮");
    }

    public void night() {
    	System.out.println("밤에는 숙면");
    }
}

