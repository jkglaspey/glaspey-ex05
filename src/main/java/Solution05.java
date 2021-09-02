/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Glaspey
 */

import java.util.Scanner;

public class Solution05 {
    /*
    Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:
        'temp' = String to read user input
        'x', 'y' = two integers parsed from 'temp'
        's' = sum
        'd' = difference
        'p' = product
        'q' = quotient
        print "Enter number 1: "
        x = Integer parse of temp
        print "Enter number 2: "
        y = Integer parse of temp
        s = x + y
        d = x - y
        p = x * y
        q = x / y

        //as one statement
        printf "x + y = s"
        printf "x - y = d"
        printf "x * y = p"
        printf "x / y = q"
     */

    public static void main(String[] args) {

        //declare variables
        Scanner in = new Scanner(System.in);
        int x,y,s,d,p,q;
        String temp; //used to read input values

        //prompts
        System.out.printf("What is the first number? ");
        temp = in.nextLine();
        x = Integer.parseInt(temp);
        System.out.printf("What is the second number? ");
        temp = in.nextLine();
        y = Integer.parseInt(temp);

        //processing
        s = x + y;
        d = x - y;
        p = x * y;
        q = x / y;

        //print results
        System.out.printf("%d + %d = %d\n" +
                "%d - %d = %d\n" +
                "%d * %d = %d\n" +
                "%d / %d = %d\n",x,y,s,x,y,d,x,y,p,x,y,q);
    }
}
