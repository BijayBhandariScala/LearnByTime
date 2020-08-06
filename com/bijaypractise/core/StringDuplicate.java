package com.bijaypractise.core;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringDuplicate {

    public static void main(String[] args) {

        String str1 = "Totttal";

       removeDuplicates(str1);
    }

     public static void removeDuplicates(String str){

        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));

        // print string after deleting duplicate elements
        for(Character ch : lhs)
            System.out.print(ch);

    }

}
