package com.samples;

import java.util.Scanner;

public class OverloadMethod {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter the first number: ");
        int a = reader.nextInt();

        System.out.println("Enter the Second number: ");
        int b = reader.nextInt();
        reader.close();

        OverloadMethod sample = new OverloadMethod();

        System.out.println("The sum is "+ sample.sum(a,b) );

        System.out.println("The sum is "+ sample.sum(a,b,b) );

        /*
        Method overloading
 allows different methods to have same name,
but different signatures where signature can differ by number
of input parameters or type of input parameters or both.

Overloading will allow same return type for overloaded method,
since over loading is mainly looking number and type of parameters
to avoid conflict of method call

         */

    }

    private int sum (int a, int b) {
        return  a+b;
    }

    private int sum(int a, int b, int c) {

        return a+b+c;
    }

    public double sum(double x, double y) {
        return (x + y);
    }

}
