package com.bijaypractise.core;

public class StringReplace {

	/*You are given a string text consisting of English letters and spaces. Find all the
        capital and lowercase Fs in it and insert a capital K right before each one of them.
    */

    /* Using StringBuffer */
	public static String getFs(String text) {

		char[] textinput = text.toCharArray();
		StringBuffer sb  = new StringBuffer();
        for (char ch : textinput){
            if(ch=='F' || ch=='f'){
                sb.append('K');
            }
            sb.append(String.valueOf(ch));
        }
        return sb.toString();
	}

    public static void main(String[] args) {
        String str1 = "abcaadefaaghiaakla";
        String result = remove_Character(str1);
        System.out.println("\nOriginal string:");
        System.out.println(str1);
        System.out.println("\nSecond string:\n");
        System.out.println(result);

        String text = "gooFssfse";
        System.out.println(getFs(text));

    }

    /* Using StringBuilder*/
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
