/**
 * ****************************************************************************
 * Purpose: This class is implemented to return all the permutations of the string
 *          using iterative method and recursion method.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 15-06-2021
 * ****************************************************************************
 */

package com.bridgelabz;

import utility.Utility;

import java.util.Scanner;

public class Permutation {


    public static void main(String[] args) {
        new Utility();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String string = scan.nextLine();
        System.out.println("All the permutations of " + string + " are : ");
        Utility.permute(string, "");
    }

}

