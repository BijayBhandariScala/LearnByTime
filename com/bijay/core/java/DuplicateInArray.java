package com.bijay.core.java;
import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5, 5, 6, 7}; //Find the duplicate element values.
        System.out.println("Duplicate Elements are: "+ getDuplicatesArray(array));

    }

    public static Set<Integer> getDuplicatesArray(int[] input){

        Set<Integer> dup_val= new HashSet<>();

        for(int i=0;i<input.length;i++){
            for(int j=1;j<input.length;j++){
                if(input[i]==input[j] && i!=j){
                    dup_val.add(input[i]);
                }
            }
        }

        return dup_val ;
    }
}
