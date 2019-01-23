package com.vladislawovk;

public class Main {

    public static void main(String[] args) {
        sumFirstAndLastDigit(123321);
    }

    public static int sumFirstAndLastDigit (int number){
        if (number < 0)
            return -1;


        int reverse = 0;
        int last = number % 10;


        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        int first = reverse % 10;
        int sum = first + last;
        return sum;
    }
}
