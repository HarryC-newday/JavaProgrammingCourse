package org.main.classes;

public class Calculator {

    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int total = sum(number1, number2, number3, number4);
        return (double) total / 4;
    }
}
