package com.bijaypractise.core;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {

    /* Sorting Array
    * int[]
    * */
    public static void main(String[] args) {

    int[] intArray= {0,10,2,30,4,5,9,-1,8,45,67, -7,406,673,-5,0,1};
        System.out.println("Before :" + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("After :" +Arrays.toString(intArray));

    }
}
