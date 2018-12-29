package com.vladislawovk;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes).
	    int myIntValue = 5 / 3;
	    // width of float = 32 (4 bytes).
	    float myFloatValue = 5f / 3f; // В конце float ставится буква f, иначе интерпретатор посчитает это значение за double
        //width of double = 64 (8 bytes).
        double myDoubleValue = 5d / 3d; // double тоже можно обозначить буквой d, но это не обязательно
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // результат деления 5 на 3 будет  разным у float и double, из-за их размеров


        // Task
        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        // Solution
        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);

        double pi = 3_000_000.1415927d;
    }
}
