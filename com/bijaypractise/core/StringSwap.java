package com.bijaypractise.core;

public class StringSwap {

	public static void main(String[] args) {
		String text = "goose"; // Add A in the front and replace o with A.
        System.out.println(getswap(text));

	}

	public static String getswap(String text) {

		//char[] str = text.toCharArray();
		StringBuilder sb  = new StringBuilder(text);
		sb.insert(0,'A');

		return sb.toString();


	}

}