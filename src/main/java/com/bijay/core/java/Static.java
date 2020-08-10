package com.bijay.core.java;

public class Static {
	
	static int a= 10;
	String str = "Bijay";
	
	static String getStatic() {
		
		System.out.println("from Ststic method: "+ a);
		return null;
		
	}

	public static void main(String[] args) {
		System.out.println("Hello Bijay!!" + a );
		
	}

}
