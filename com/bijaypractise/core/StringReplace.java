package com.bijaypractise.core;

public class StringReplace {

	/*public static void main(String[] args) {
		String text = "goose"; // Add A in the front and replace o with A.
        System.out.println(getReplace(text));

	}

	public static String getReplace(String text) {

		char[] str = text.toCharArray();
		StringBuilder sb  = new StringBuilder(text);

        for (char ch1 : str) {
               String c= Character.toString(ch1);
            if(c.contains("o")){
                sb.append(c);
            }

        }
        return sb.toString();

	}*/

    public static void main(String[] args) {
        String str1 = "abcaadefaaghiaakla";
        String result = remove_Character(str1);
        System.out.println("\nOriginal string:");
        System.out.println(str1);
        System.out.println("\nSecond string:");
        System.out.println(result);
    }
    public static String remove_Character(String str1) {
        StringBuilder sb = new StringBuilder();
        char[] chArray = str1.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] != 'a') {
                sb.append(chArray[i]);
            }
           // sb.append('A');
        }
        return sb.toString();
    }

}
