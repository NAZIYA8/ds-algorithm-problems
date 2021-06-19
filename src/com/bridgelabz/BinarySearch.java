package com.bridgelabz;

import utility.Utility;

import java.io.FileReader;

public class BinarySearch {


    public static void main(String[] args) {
        new Utility();
        FileReader file = Utility.fileRead("C:/Users/Naziya/IdeaProjects/DSAlgorithmProblems/src/files/WordList");
        Utility.findWord(file);
    }
}