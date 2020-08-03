package com.bijaypractise.core;

import java.util.ArrayList;
import java.util.List;

public class Java8StreamExample {

    public static void main(String[] args) {
        /* We will create foreach */

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(0 ,"Bijay");
        list.stream()
                .forEach(p-> System.out.println(p.toString()));
    }

}