package com.javaex.ex03;

public class Shape {	//Shape.java (수정할 것)
	
	//아래의 코드는 오류가 있습니다. 오류의 원인을 찾고 Shape클래스를 수정하여 오류를 수정하세요.
	//(ShapeApp.java, Triangle.java 는 수정하지 말것)
	
	//필드
	protected String fillColor;  //private->protected 자식들 클래스에서 쓰려면 
	protected String lineColor;	//사용이 가능하도록 바꿔줘야한다
	
	//생성자
	public Shape() {  //추가해줘야함
		super();
	}
	
	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	//메소드 gs
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	//메소드 일반
	
}

