package main;

/**
 * @author shivendu
 * @version 1.0
 **/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName = "";
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine().trim();
        System.out.println("Welcome," + userName + "!");

    }

}
