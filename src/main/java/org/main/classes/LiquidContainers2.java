package org.main.classes;

import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

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
                amount = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                continue;
            }

            if (command.equals("add")) {
                first.add(amount);

            } else if (command.equals("move")) {
                int amountToMove = Math.min(amount, first.contains());
                first.remove(amountToMove);
                second.add(amountToMove);

            } else if (command.equals("remove")) {
                second.remove(amount);
            }
        }
    }
}
