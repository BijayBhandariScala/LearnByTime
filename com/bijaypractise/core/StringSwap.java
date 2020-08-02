package com.bijaypractise.core;

public class StringSwap {

	public static void main(String[] args) {
		String text = "gboose"; // Add A in the front and replace o with A.
        System.out.println(getSwap(text));

	}

	public static String getSwap(String text) {

		char[] str = text.toCharArray();
		StringBuilder sb  = new StringBuilder(text);

        for (char c: str) {
            String string=Character.toString(c);
            if(string=="" || string.equals("o")){
                sb.append("A");

            }

        }

        return sb.toString();


	}

}
