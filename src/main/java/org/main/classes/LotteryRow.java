package org.main.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        this.random = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();

        while (this.numbers.size() < 7) {
            int randomNumber = random.nextInt(40) + 1;

            if (!this.containsNumber(randomNumber)) {
                this.numbers.add(randomNumber);
            }
        }

        Collections.sort(this.numbers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        LotteryRow otherRow = (LotteryRow) other;

        if (this.numbers == null || otherRow.numbers == null) {
            return this.numbers == otherRow.numbers;
        }

        if (this.numbers.size() != otherRow.numbers.size()) {
            return false;
        }

        ArrayList<Integer> thisNumbers = new ArrayList<>(this.numbers);
        ArrayList<Integer> otherNumbers = new ArrayList<>(otherRow.numbers);
        Collections.sort(thisNumbers);
        Collections.sort(otherNumbers);

        return thisNumbers.equals(otherNumbers);
    }
}
