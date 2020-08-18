package com.bijay.core.java;

public class ReverseString {

    public static void main(String[] args) {
        String text = "I love programming."; //Reverse the String.
        System.out.println(getReverse(text));
        System.out.println(getStringBuilderWay(text));
        getReverseData(text);
    }

    public static String getReverse(String str){

        StringBuilder stringBuilder = new StringBuilder();
        char [] ch = str.toCharArray();

        for(int i=ch.length-1;i>=0;i--){
            stringBuilder.append(ch[i]);

        }
        return stringBuilder.toString();

    }

    //2nd way
    public static String getStringBuilderWay(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    /*
    *  normal way to reverse
    * */
    public static void getReverseData(String str){
        char [] ch = str.toCharArray();
        for(int i=ch.length-1; i>=0; i--){
            System.out.println(""+ch[i]);

        }

    }
}
