package com.bijay.core.java;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Training1 {

    public static void main(String[] args) {
        System.out.println("Output:" + getReverseString("I am Bijay Bhandari."));

        System.out.println("String builder: " +getReverseStringSb("You are the one.") );

        getDupString("Bijjjayyyy Bhanndari");

        System.out.println( "Is it Anargam String: " + getAnargam("Bijay", "yajiB"));

        getDuplicateWords();

    }

    //1. Reverse the String
    //eg; I am Bijay Bhandari
    public static String getReverseString(String input){
        char[] ch=input.toCharArray();
        StringBuilder sb = new StringBuilder();
         for(int i=ch.length-1; i>=0; i--){
             sb.append(ch[i]);
         }
         return sb.toString();
    }

    //2. Reverse through StringBuilder
     /*eg; You are the one.*/
    public static String getReverseStringSb(String input) {
       StringBuilder sb = new StringBuilder(input);
       sb.reverse();
       return sb.toString();
    }

    /* Dupilcate String
    * eg, BijjjayyyyBhanndari
    *
    * */
    public static void getDupString(String input){
        LinkedHashSet<Character> str = new LinkedHashSet();

        for(int i=0;i<input.length();i++){
            str.add(input.charAt(i));
        }
       for(Character c : str){
           System.out.println("" + c);
       }
    }

    /* Anargam no*/
    public static boolean getAnargam(String s1, String s2){
        char [] c1 = s1.toCharArray();
        char[] c2= s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return  Arrays.equals(c1,c2);
    }

    /* Duplicate in sentence
    * I am the king of jungle Lion.
    * */
    public static void getDuplicateWords(){
        String str = "I am the king of jungle - Lion said.";
        char[] carray = str.toCharArray();
        System.out.println("The string is:" + str);
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }
    }
}
