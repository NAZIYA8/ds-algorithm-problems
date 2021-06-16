/**
 * ****************************************************************************
 * Purpose: This class is implemented to check if two strings are anagram or not
 *          and display it.
 *
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 15-06-2021
 * ****************************************************************************
 */


package com.bridgelabz;

import utility.Utility;

public class Anagram {

    public static void main(String[] args) {
        new Utility();
        System.out.println("Enter String 1:");
        String str1 = Utility.inputStringLine().toLowerCase().replaceAll("\\s", "");
        System.out.println("Enter String 2:");
        String str2 = Utility.inputStringLine().toLowerCase().replaceAll("\\s", "");
        boolean status = Utility.Anagram(str1, str2);
        Utility.displayAngaram(status);

    }
}
