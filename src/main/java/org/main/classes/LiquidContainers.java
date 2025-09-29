package org.main.classes;

import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            if (parts.length < 2) {
                continue;
            }

            String command = parts[0];
            int amount;

            try {
                amount = Integer.valueOf(parts[1]);
            } catch (NumberFormatException e) {
                continue;
            }

            if (amount < 0) {
                continue;
            }

            if (command.equals("add")) {
                first = Math.min(first + amount, 100);

            } else if (command.equals("move")) {
                int amountToMove = Math.min(amount, first);
                first -= amountToMove;
                second = Math.min(second + amountToMove, 100);

            } else if (command.equals("remove")) {
                int amountToRemove = Math.min(amount, second);
                second -= amountToRemove;
            }
        }
    }
}
