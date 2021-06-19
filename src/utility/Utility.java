/**
 * ****************************************************************************
 * Purpose: This Utility class is containing a number of methods which can be
 * called from the main. This class contains methods that perform
 * common, often reused functions.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 15-06-2021
 * ****************************************************************************
 */

package utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Utility {
    static Scanner scan = new Scanner(System.in);


    /**
     * This method is used to get string as input and return it.
     *
     * @return Input String
     */
    public static String inputString() {

        try {
            return scan.next();
        } catch (Exception e) {
            scan.nextLine();
            System.out.println("Invalid input, try again.");
            return inputString();
        }
    }


    /**
     * This method is used to get integer as input and return it.
     *
     * @return Input integer
     */
    public static int inputInt() {
        try {
            return scan.nextInt();
        } catch (Exception e) {
            scan.nextLine();
            System.out.println("Invalid input, try again.");
            return inputInt();
        }
    }


    /**
     * This method is used for Insertion Sort.
     * It is used to sort the array of genetic type in ascending order.
     *
     * @param array contains list of elements of generic type;
     * @param <T>   is a type parameter used instead of specific data type.
     */
    public static <T extends Comparable<T>> void insertionSort(T array[]) {
        int length = array.length;
        int j;
        T temp;
        for (int i = 0; i < length; i++) {
            j = i;
            temp = array[i];
            while (j > 0 && temp.compareTo(array[j - 1]) < 0) {//
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = temp;//insert unsorted element
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    /**
     * This method is used to sort using Bubble Sort technique.
     *
     * @param array contains list of elements of generic type;
     * @param <T>   is a type parameter used instead of specific data type.
     */
    public static <T extends Comparable<T>> void bubbleSort(T array[]) {
        int length = array.length;


        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    /**
     * This method is used to input string line
     * Here nextLine() reads until the end of line
     *
     * @return next line
     */
    public static String inputStringLine() {
        try {
            return scan.nextLine();
        } catch (Exception e) {
            scan.nextLine();
            System.out.println("Invalid input, try again.");
            return inputStringLine();
        }
    }


    /**
     * This method is used for string anagram detection.
     *
     * @param str1 first string input
     * @param str2 second string input
     * @return if 2 strings are anagrams or not
     */
    public static boolean Anagram(String str1, String str2) {
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        boolean isAnagram;
        isAnagram = Arrays.equals(string1, string2);
        if (isAnagram == true) {
            System.out.println(str1 + " , " + str2 + " are Anagram Strings");
            return true;
        } else
            System.out.println(str1 + " , " + str2 + " are not Anagram Strings");
        return false;
    }


    /**
     * This method is used to display anagrams.
     *
     * @param status isAnagram
     */
    public static void displayAngaram(boolean status) {
        if (status) {
            System.out.println("Is Anagram");
        } else
            System.out.println("Is Not Anagram");
    }


    /**
     * This method is used to check if the input integers are anagrams
     *
     * @param n1 input number 1
     * @param n2 input number 2
     * @return true if inputs are anagrams and false if not anagrams
     */
    public static boolean AnagramInteger(int n1, int n2) {

        String num1 = String.valueOf(n1);
        String num2 = String.valueOf(n2);
        boolean status = Anagram(num1, num2);
        return status;
    }


    /**
     * This method is used to find the prime numbers that are anagram.
     *
     * @param output is the prime numbers
     * @return Status true or false
     */
    public static boolean findAnagram(int[] output) {
        int len = output.length;
        boolean status = false;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                status = AnagramInteger(output[i], output[j]);
            }
        }
        return status;
    }


    /**
     * This method is used to customize message demonstration using regular expression.
     *
     * @param firstname is user's first name
     * @param lastname  is user's Last name
     * @param mobile    is user's mobile number
     *                  Prints the message in customized form.
     */
    public static void regularExpression(String firstname, String lastname, String mobile) {
        String message = "Hello <<name>>, We have your full name as <<full name>> in our system.\n" +
                "Your contact number is 91+XXXXXXXXXX. Please, let us know in case of any\n" +
                "clarification.\nThank you BridgeLabz XX/XX/XXXX .";
        Date d = new Date();
        String date = new SimpleDateFormat().format(d);
        mobile = "+" + mobile;
        String name = firstname + " " + lastname;
        message = message.replace("<<name>>", firstname);
        message = message.replace("<<full name>>", name);
        message = message.replace("+XXXXXXXXXX", mobile);
        message = message.replace("XX/XX/XXXX", date);
        System.out.println(message);
    }


    /**
     * This method is used to find your number. It ask user the range and
     * guesses the answer with n questions.
     *
     * @param first is the first number in that range
     * @param last  is the last number in that range
     */
    public static void findNumber(int first, int last) {
        int mid = (first + last) / 2;
        while (first < last) {
            System.out.println("Is your number between " + first + "and " + mid + " [y/n] ");
            char choice = scan.next().charAt(0);
            if (choice == 'Y' || choice == 'y') {
                findNumber(first, mid);
                System.out.println("Number is " + first);
            } else if (choice == 'N' || choice == 'n') {
                findNumber(mid + 1, last);
                System.out.println(" Number is " + last);
            } else {
                System.out.println("number found at last index ");
            }
        }
    }


    /**
     * This method is used to find the Palindrome of a number
     *
     * @param arr
     */
    public static void findPalindrome(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int r;
            int reverse = 0;
            int num = arr[i];
            int temp = num;
            while (num > 0) {
                r = num % 10;
                reverse = (reverse * 10) + r;
                num = num / 10;
            }
            if (temp == reverse) {
                System.out.println(temp + " is Palindrome");
            }
        }
    }


    /**
     * This method is used to return all the permutations of a string.
     *
     * @param string is the input from user
     */
    public static void permute(String string, String ans) {

        if (string.length() == 0) {
            System.out.print(ans + " ");

        }
        for (int i = 0; i < string.length(); i++) {

            char ch = string.charAt(i);

            String ros = string.substring(0, i) + string.substring(i + 1);

            permute(ros, ans + ch);
        }
    }


    /**
     * This method is used for Prime numbers
     *
     * @param n input number
     * @return Array of prime numbers
     */
    public static int[] primeNumbers(int n) {
        int a[] = new int[n];
        int k = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                a[k] = i;
                k++;
            }
        }
        int len = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0)
                len++;
        }

        int[] newArray = new int[len];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                newArray[j] = a[i];
                j++;
            }
        }
        System.out.println();
        return newArray;
    }

    /**
     * This method is used to check if the number is prime or not
     *
     * @param number input
     * @return true:if prime and false:if not prime
     */
    public static boolean isPrime(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * This method is used to display Array.
     *
     * @param array contains array elements.
     */
    public static void display(int array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * This method is used to sort using merge sort technique.
     *
     * @param a    is the array which contains list of elements
     * @param low  pointer
     * @param high pointer
     * @param <T>  is a type parameter used instead of specific data type.
     */
    public static <T extends Comparable<T>> void mergeSort(T a[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    public static <T extends Comparable<T>> void merge(T a[], int start, int mid, int end) {
        //stores the starting position of both parts in temporary variables.
        int p = start, q = mid + 1;
        Object[] arr1 = new Object[end - start + 1];
        int k = 0;
        for (int i = start; i <= end; i++) {
            //checks if first part comes to an end or not .
            if (p > mid) {
                arr1[k++] = a[q++];
            }
            //checks if second part comes to an end or not
            else if (q > end) {
                arr1[k++] = a[p++];
            }
            //checks which part has smaller element.
            else if (a[p].compareTo(a[q]) < 0) {
                arr1[k++] = a[p++];
            } else {
                arr1[k++] = a[q++];
            }
        }
        for (int l = 0; l < k; l++) {
            a[start++] = (T) arr1[l];
        }
        System.out.println("After Sorting:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


    /**
     * This method is used to read a file
     */
    public static FileReader fileRead(String string) {
        FileReader f = null;
        try {
            f = new FileReader(string);
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        return f;
    }


    /**
     * This method is used to perform binary search operation
     *
     * @param <T> is a type parameter used instead of specific data type.
     */
    public static <T extends Comparable<T>> void BinarySearch(T[] array, T search) {
        int length = array.length;
        int first = 0;
        int last = length - 1;
        int mid;

        while (first <= last) {
            mid = (first + last) / 2;
            if (array[mid].compareTo(search) < 0) {
                first = mid + 1;
            } else if (array[mid].compareTo(search) == 0) {
                System.out.println(search + " found in location " + mid);
                break;
            } else if (array[mid].compareTo(search) > 0) {
                last = mid - 1;
            }
        }
        if (first > last) {
            System.out.println(search + "Not found");
        }
    }

    /**
     * This method is used to find a word from
     * the file having a list of words
     *
     * @param file is having list of words
     */
    public static void findWord(FileReader file) {
        BufferedReader bf = new BufferedReader(file);
        String string;
        String[] array = null;
        try {
            while ((string = bf.readLine()) != null) {
                array = string.split(",");
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Enter the word to search:");
        String search = Utility.inputString();
        Utility.BinarySearch(array, search);
    }

}