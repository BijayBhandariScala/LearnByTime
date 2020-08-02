package com.bijaypractise.core;

public class ReverseString {

    public static void main(String[] args) {
        String text = "I love programming."; //Reverse the String.
        System.out.println(getReverse(text));
    }

    public static String getReverse(String str){

        StringBuilder stringBuilder = new StringBuilder();
        char [] ch = str.toCharArray();

        for(int i=ch.length-1;i>=0;i--){
            stringBuilder.append(ch[i]);

        }
        return stringBuilder.toString();

    }
}
