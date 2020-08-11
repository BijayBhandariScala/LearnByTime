package com.bijay.core.java;

public class AbstractSubClass extends AbstractClass{

    @Override
    public void walk() {
        System.out.println("I am override method.");

    }

  /*  public void print(){
        walk();
        run();
    }*/

    public static void main(String[] args) {
       AbstractSubClass abs = new AbstractSubClass();
       abs.walk();
       abs.run();
    }
}
