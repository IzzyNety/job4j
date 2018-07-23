package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length ; i++) {
            for (int j = i + 1; j < data.length; j++) {
                 if (data[i][i] != data[j][j]) {
                        result = false;
                        break;
                    }
                }

            }
            return result;
    }
}

