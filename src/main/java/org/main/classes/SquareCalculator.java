package org.main.classes;

import java.util.Scanner;

public class SquareCalculator {

    public void squaring() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an number: ");
        int number = scanner.nextInt();

        int square = number * number;
        System.out.println("The square of " + number + " is " + square);
    }

    public void squareRooting() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an number: ");
        int number = scanner.nextInt();

        int root = (int) Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + root);
    }


}
