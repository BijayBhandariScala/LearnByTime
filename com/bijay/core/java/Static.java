package com.bijay.core.java;

public class Static {
	
	static int a= 10;
	String str = "Hello Bijay";
	
	static String getStatic() {
		System.out.println("from Static method: "+ a);
		return null;
	}

	/*Non-static method*/
	public void getData(){
		System.out.println("I am here non-static method.");
	}

	public static void main(String[] args) {
		System.out.println("Hello Bijay!!" + a );
		
	}

}
