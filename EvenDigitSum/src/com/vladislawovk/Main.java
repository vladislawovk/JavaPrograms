package com.vladislawovk;

public class Main {

    public static void main(String[] args) {

    }

    public static int getEvenDigitSum(int number){
        if(number<0)
            return -1;
        int sum =  0;

        while (number != 0) {
            int remainder = number % 10;
            number = number / 10;
            if (remainder % 2 ==0) {
                sum += remainder;
            }
        }
        return sum;
    }
}
