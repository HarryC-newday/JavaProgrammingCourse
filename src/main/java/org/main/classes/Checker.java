package org.main.classes;

import java.util.Scanner;

public class Checker {

    Scanner scanner = new Scanner(System.in);

    public void divisibleByThreeInRange() {

        System.out.print("Enter the first number: ");
        int beginning = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();

        int second = scanner.nextInt();
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }


}
