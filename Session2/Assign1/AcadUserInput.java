package com.samples;

import java.util.ArrayList;
import java.util.Scanner;

public class AcadUserInput {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter the first number: ");
        int a = reader.nextInt();

        System.out.println("Enter the Second number: ");
        int b = reader.nextInt();
        reader.close();

        int c = a + b;

        System.out.println("The sum is "+ c );

        AcadUserInput sum = new AcadUserInput();

        System.out.println("The sum is "+ sum.sum(a,b) );

        sum.printOddAndEvenNumbers(a,b);

        sum.fristTenMultiples(a);

    }

    private int sum( int a, int b) {
        return a+b;
    }

    private void printOddAndEvenNumbers(int a, int b) {

        ArrayList odd =new ArrayList();
        ArrayList even =new ArrayList();
        for (int i= a; i<=b ; i++) {
            if(i%2 == 0) {

                even.add(i);
            } else {

                odd.add(i);
            }
        }
        System.out.println("Even Numbers "+ even );
        System.out.println("Odd Numbers "+ odd );
    }

    private void fristTenMultiples(int a) {

        for (int i= 1; i <=10 ; i++ ) {

            System.out.println( a +" * " + i + " = " + a*i);
        }
    }
}
