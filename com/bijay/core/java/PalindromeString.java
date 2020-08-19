package com.bijay.core.java;

public class PalindromeString {

    public static void main(String[] args) {
    String s = "cococ";
    if(getPalindrome(s)){
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }
    }

    /*
    * First way
    * Using recursion
    * */
    public static boolean getPalindrome(String str){

        if(str.length()==0 || str.length()==1)
            return true;
        if(str.charAt(0)== str.charAt(str.length()-1))
            return getPalindrome(str.substring(1,str.length()-1));

        return false;
    }


}
