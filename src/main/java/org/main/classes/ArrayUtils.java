package org.main.classes;

public class ArrayUtils {

    public static String arrayAsString(int[][] array) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result.append(array[i][j]);
            }
            if (i < array.length - 1) {
                result.append("\n");
            }
        }

        return result.toString();
    }
}
