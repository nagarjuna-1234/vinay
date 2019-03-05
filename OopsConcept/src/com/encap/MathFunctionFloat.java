package com.encap;

public class MathFunctionFloat {
	private float num1;
	private float num2;
	
	public void setNum1(float num1) {
		this.num1 = num1;
	}
	public float getNum1() {
		
		return num1;
	}
	public void setNum2(float num2) {
		this.num2 = num2;
	}
	public float getNum2() {
		return num2;
	}
	public void addresult(float first ,float sec) {
		System.out.println("add output="+(first+sec));
	}
		
	public void subresult(float first,float sec) {
			System.out.println("sub ouput"+(sec-first));
	}
	
	
	
	

}
