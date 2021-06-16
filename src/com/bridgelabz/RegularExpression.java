/**
 * ****************************************************************************
 * Purpose: This class is implemented to customize the message demonstration
 *          using string function and RegEx.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 15-06-2021
 * ****************************************************************************
 */

package com.bridgelabz;

import utility.Utility;

public class RegularExpression {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new Utility();
        System.out.println("Enter Your Firstname:");
        String firstName = Utility.inputString();
        System.out.println("Enter Your Lastname:");
        String lastName = Utility.inputString();
        System.out.println("Enter Your Mobile Number:");
        String mobile = Utility.inputString();
        Utility.regularExpression(firstName, lastName, mobile);
    }
}
