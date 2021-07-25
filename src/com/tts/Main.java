package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        System.out.println("What is your last name?");
        String lastName = input.nextLine();

        System.out.printf("Hello %s %s!\n", firstName, lastName);

        //Let's see what happens if I type out Line//
        System.out.printline("What is your first name?");
        String firstName = input.nextLine();
        System.out.printline("What is your last name?");
        String lastName = input.nextLine();

        System.out.printf("Hello %s %s!\n", firstName, lastName);

    }
}
