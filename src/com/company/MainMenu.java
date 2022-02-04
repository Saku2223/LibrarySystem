package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    private static ArrayList<String> books = new ArrayList<>();
    private static ArrayList<String> register = new ArrayList<>();
    private static int menuInt = 0;
    private static int loginSys = 0;
    private static String password;
    private static String username;
    private static String userLog;
    private static String userPass;
    private static int booksToAdd = 1;

    private static final File myObj = new File("bookList.txt");
    private static final File myLogin = new File("userLogins.txt");
    public static void MainMenu() {
        System.out.println("\n");
        System.out.println("Please choose an option from the menu: ");
        System.out.println("1 - add books ");
        System.out.println("2 - display books ");
        System.out.println("3 - delete file ");

        Scanner input = new Scanner(System.in);
        menuInt = input.nextInt();
        // I'm trying to move everything from the main about the MainMenu to the MainMenu.java section
    }

}
