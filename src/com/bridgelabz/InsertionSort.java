/**
 * ****************************************************************************
 * Purpose: This class is implemented to read Strings as input and print them
 *          in a sorted order using Insertion Sort method.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 15-06-2021
 * ****************************************************************************
 */

package com.bridgelabz;

import utility.Utility;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new Utility();
        List<String> list = new ArrayList<String>();
        System.out.println("Enter the size of list:");
        int n = Utility.inputInt();
        System.out.println("Enter values in to the list:");
        for (int i = 0; i < n; i++) {
            list.add(Utility.inputString());
        }
        String[] array = new String[list.size()];
        array = list.toArray(array);
        System.out.println("After sorting...");
        Utility.insertionSort(array);
    }

}
