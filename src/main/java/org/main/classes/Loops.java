package org.main.classes;

import java.util.Scanner;

public class Loops {

    Scanner scanner = new Scanner(System.in);

    public void carryOn() {
        String response;

        do {
            System.out.print("Shall we carry on? ");
            response = scanner.nextLine().trim().toLowerCase();
        } while (!response.equals("no"));

        System.out.println("Okay, stopping now.");
    }


    public void loopTo4() {
        int input;
        do {
            System.out.print("Enter an integer (enter 4 to stop): ");
            input = scanner.nextInt();
        } while (input != 4);

        System.out.println("You entered 4. Program terminated.");
    }

    public void inputCounter() {
        int count = 0;
        int input;

        do {
            System.out.print("Enter an integer (enter 0 to stop): ");
            input = scanner.nextInt();

            if (input != 0) {
                count++;
            }
        } while (input != 0);

        System.out.println("Total number of values entered: " + count);
    }

    public void calculateAverageOfPositive() {
        int input;
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter an integer (0 to stop): ");
            input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            if (input > 0) {
                sum += input;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of positive numbers: " + average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }

    public void countToHundred() {

        System.out.print("Enter a number less than 100: ");
        int number = scanner.nextInt();

        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }


    public void factorialCalculator() {

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println(number + "! = " + factorial);
    }


    public void numberStats() {

        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Give numbers:");

        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            sum += number;
            count++;

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
        } else {
            System.out.println("Average: 0");
        }

        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }

}


