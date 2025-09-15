package org.main.classes;

import java.util.Scanner;

public class ValueComparison {

    Scanner scanner = new Scanner(System.in);

    public void compare() {


        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        if (first > second) {
            System.out.println(first + " is greater than " + second);
        } else if (first < second) {
            System.out.println(first + " is smaller than " + second);
        } else {
            System.out.println(first + " is equal to " + second);
        }
    }
}

