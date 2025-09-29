package org.main.classes;
import java.util.ArrayList;
import java.util.Scanner;

public class Lists {

        public void sumOfList() {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> numbers = new ArrayList<>();

            while (true) {
                System.out.print("Enter a number (-1 to stop): ");
                int num = scanner.nextInt();
                if (num == -1) {
                    break;
                }
                numbers.add(num);
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            System.out.println("The sum of the numbers is: " + sum);
        }

    public void checkStringInList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            inputs.add(input);
        }

        System.out.println("Search for?");
        String search = scanner.nextLine();

        if (inputs.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
    }

}
