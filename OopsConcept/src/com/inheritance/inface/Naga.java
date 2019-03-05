   package com.inheritance.inface;

public class Naga implements Employee, City {

	
	@Override
	public void mycity() {
		// TODO Auto-generated method stub
		System.out.println(" My city is Chittor");

	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("My salary is 5 didgit");
		

	}

	@Override
	public void position() {
		// TODO Auto-generated method stub
		System.out.println(" My position is team lead");

	}

}
