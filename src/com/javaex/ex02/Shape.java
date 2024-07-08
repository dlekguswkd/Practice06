package com.javaex.ex02;

public class Shape {
	
	//클래스를 분석하여 출력결과를 예상하고 코딩 후 확인해 보세요.(생성자 순서 파악 문제)
	
	//필드
	private String fillColor;
	private String lineColor;
	
	//생성자
	public Shape() {
		System.out.println("생성자 Shape(0) 실행");
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("생성자 Shape(2) 실행");
	}
	
	//메소드 gs
	
	//메소드 일반

}

