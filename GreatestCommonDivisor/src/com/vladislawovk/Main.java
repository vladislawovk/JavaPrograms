package com.vladislawovk;

public class Main {

    public static void main(String[] args) {
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }
        int greatestDivisor = 0;
        for (int i = 1; ((i <= first) && (i <= second)); i++) {
            if (first % i == 0 && second % i == 0) {
                greatestDivisor = i;
            }
        }

        return greatestDivisor;
    }
}
