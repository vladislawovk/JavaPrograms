package com.vladislawovk;

public class Main {

    public static void main(String[] args) {
        isPerfectNumber(28);
    }

    public static boolean isPerfectNumber(int number) {
        if(number < 1) {
            return false;
        }
        int isNumber = 0;

        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                isNumber = isNumber + i;
            }
        }
        return (isNumber == number);
    }
}
