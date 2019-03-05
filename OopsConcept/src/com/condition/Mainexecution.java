package com.condition;

public class Mainexecution {
	private static Object exRes;

	public static void main(String[] args) {
		EvenOdd n1= new EvenOdd();
	String num1=n1.evaluate(124);
	String num2=n1.evaluate(21);
	System.out.println("first :"+num1);
	System.out.println("second num:"+num2);
	
	CheckMath t=new CheckMath();
	int exRes=26;
	int obRes=t.add(12, 14);
	if(obRes==exRes) {
		System.out.println("add is working");		
	}else {			
			System.out.println("add is not working");
	  }
	}
	
}
