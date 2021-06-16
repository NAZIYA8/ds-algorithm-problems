package com.bridgelabz;

import utility.Utility;

import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number :");
        int first = scan.nextInt();
        System.out.println("Enter last number :");
        int last = scan.nextInt();

        Utility.findNumber(first, last);

    }

}
