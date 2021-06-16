/**
 * ****************************************************************************
 * Purpose: This class is implemented to input the range of numbers and find the
 *          prime numbers in that range.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 15-06-2021
 * ****************************************************************************
 */

package com.bridgelabz;

import utility.Utility;

public class PrimeNumbers {
    /**
     * @param args
     */
    public static void main(String[] args) {
        new Utility();
        System.out.println("Enter the nth term:");
        int n = Utility.inputInt();
        int output[];
        output = Utility.primeNumbers(n);
        System.out.println("The Prime Numbers are : ");
        Utility.display(output);
    }
}
