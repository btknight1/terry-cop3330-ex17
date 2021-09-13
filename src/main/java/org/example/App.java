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
        boolean tryAgain = false;

        int gender = 0;
        int A = 0;
        int W = 0;
        int H = 0;

        final double r_men = 0.73;
        final double r_wom = 0.66;

        String value = "";
        Scanner input = new Scanner(System.in);

        // Prevent the user from entering non-numeric values.
        do
        {
            System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
            value = input.nextLine();
            tryAgain = false;
            try
            {
                gender = Integer.parseInt(value);
            }
            catch (NumberFormatException ex)
            {
                tryAgain = true;
            }
        } while (tryAgain);


        // Prevent the user from entering non-numeric values.
        do
        {
            System.out.print("How many ounces of alcohol did you have? ");
            value = input.nextLine();
            tryAgain = false;
            try
            {
                A = Integer.parseInt(value);
            }
            catch (NumberFormatException ex)
            {
                tryAgain = true;
            }
        } while (tryAgain);

        // Prevent the user from entering non-numeric values.
        do
        {
            System.out.print("What is your weight, in pounds? ");
            value = input.nextLine();
            tryAgain = false;
            try
            {
                W = Integer.parseInt(value);
            }
            catch (NumberFormatException ex)
            {
                tryAgain = true;
            }
        } while (tryAgain);

        // Prevent the user from entering non-numeric values.
        do
        {
            System.out.print("How many hours has it been since your last drink? ");
            value = input.nextLine();
            tryAgain = false;
            try
            {
                H = Integer.parseInt(value);
            }
            catch (NumberFormatException ex)
            {
                tryAgain = true;
            }
        } while (tryAgain);

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