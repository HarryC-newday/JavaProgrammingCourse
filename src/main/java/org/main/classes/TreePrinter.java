package org.main.classes;

import java.util.Scanner;

public class TreePrinter {

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println(); // Line break after stars
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the Christmas tree: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height-3; i++) {
            int stars = 2 * i - 1;
            int spaces = height - i;
            printSpaces(spaces);
            printStars(stars);
        }

        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }
}

