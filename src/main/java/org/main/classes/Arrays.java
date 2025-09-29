package org.main.classes;

public class Arrays {

    public static void printArrayInStars(int[] array) {
        for (int number : array) {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
