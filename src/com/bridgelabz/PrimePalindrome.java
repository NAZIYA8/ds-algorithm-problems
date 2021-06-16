/**
 * ****************************************************************************
 * Purpose: This class is implemented to find the prime numbers that are
 *          palindrome.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 15-06-2021
 * ****************************************************************************
 */

package com.bridgelabz;

import utility.Utility;

public class PrimePalindrome {
    public static void main(String[] args) {
        new Utility();
        System.out.println("Enter the nth term: ");
        int n = Utility.inputInt();
        int out[];
        out = Utility.primeNumbers(n);
        Utility.findPalindrome(out);
    }
}
