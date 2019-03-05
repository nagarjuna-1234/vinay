package com.encap;

public class MathFunctionDouble {
	private double num1;
	private double num2;
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum1() {
		
		return num1;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getNum2() {
		return num2;
	}
	public void addresult(double first ,double sec) {
		System.out.println("add output="+(first+sec));
	}
		
	public void subresult(double first,double sec) {
			System.out.println("sub ouput"+(sec-first));
	}
	
	
	
	

}
