package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        File fileName = new File("NewFilename.txt");
    }

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();

    }
    public static String getStudentDetails() {
        int amount = Integer.parseInt(getInput("Enter your student ID"));
        String bookName = getInput("Enter your name");
        String ISBNInput = getInput("Enter your Email address");
        String author = getInput("Enter the author name");
        String genre = getInput("Enter the book genre");
        return (amount + "," + bookName + "," + ISBNInput + "," + author + "," + genre);
    }
    public static void CreateFile() {
        try {
            if (fileName.createNewFile()) {
                System.out.println("File created: " + fileName.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void WriteToFile() {

        try {
            FileWriter myWriter = new FileWriter(fileName.getName(), true); //True means append to file contents, False means overwrite
            System.out.println("This is the contents of the file:");
            myWriter.write("Files in Java might be tricky, but it is fun enough!"); // Overwrites everything in the file
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void WriteToFile() {
        try {
            FileWriter myWriter = new FileWriter(fileName.getName(), false); //True means append to file contents, False means overwrite
            System.out.println("This is the contents of the file:");
            myWriter.write("Files in Java might be tricky, but it is fun enough!"); // Overwrites everything in the file
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
//Matei please see me after class, we need to discuss the copyright and information privitisation act of 1790
//Your code is clean however, you should rename your variables from the source material