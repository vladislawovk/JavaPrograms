package com.vladislawovk;

public class Main {

    public static void main(String[] args) {
	    isPalindrome(12321);
    }

    public static boolean isPalindrome(int number) {

        int original = number;
        int reverse = 0;


        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        return original == reverse;
    }
}
