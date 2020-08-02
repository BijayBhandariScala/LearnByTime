package com.bijaypractise.core;

public class ReverseString {

    public static void main(String[] args) {
        String text = "I love programming.";

        System.out.println(getReverse(text));
    }

    public static String getReverse(String str){

        StringBuilder stringBuilder = new StringBuilder();
        char [] ch = str.toCharArray();

        for(int i=ch.length-1;i>=0;i--){
            stringBuilder.append(ch[i]);
            //System.out.println(ch.toString());
        }
        return ch.toString();

    }
}
