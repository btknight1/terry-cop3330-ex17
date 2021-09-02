/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int gender;
        int A;
        int W;
        final double r_men = 0.73;
        final double r_wom = 0.66;
        int H;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        gender = input.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        A = input.nextInt();

        System.out.print("What is your weight, in pounds? ");
        W = input.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        H = input.nextInt();

        double BAC;
        if(gender == 1)
            BAC = (A * 5.14 / W * r_men) -.015 *H;
        else
            BAC = (A * 5.14 / W * r_wom) -.015 *H;

        System.out.printf("%nYour BAC is %f%n", BAC);
        if(BAC <= 0.08)
            System.out.print("It is legal for you to drive.");
        else
            System.out.print("It is not legal for you to drive.");
    }
}
