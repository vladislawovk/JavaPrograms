package com.company;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
	    int myMinValue = -2147483648;
        int myMaxValue = 2_147_483_647; // Удобный способ записи чисел
        int myTotal = (myMinValue/2); // int позволяет проводить такие вычисления
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = -128; //127
        byte myNewByteValue = (byte)(myByteValue/2);                // byte НЕ позволяет проводить такие вычисления,
        System.out.println("myNewByteValue = " + myNewByteValue);   // так как все что стоит после знака равно, должно являться байтом,
                                                                    // чтобы вычисление прошло, необходима приписка (byte)

        // short has a width of 16
        short myShortValue = -32768; //32767
        short myNewShortValue = (short)(myShortValue/2); // Для short те же правила что и для byte

        // long has a width of 64
        long myLongValue = -9_223_372_036_854_775_808L; //9_223_372_036_854_775_807L



        // ЗАДАНИЕ
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);

        System.out.println("longTotal = " + longTotal);
    }
}
