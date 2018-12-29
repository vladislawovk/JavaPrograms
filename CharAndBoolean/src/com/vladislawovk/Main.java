package com.vladislawovk;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar = 'a'; //char можно присвоить значение только одного символа или один юникод;
        // char wrongChar = 'as';
        char myCharUnicode = '\u00A9';
        System.out.println("Unicode output was: " + myCharUnicode);

        boolean myBoolean = false;
        boolean isMale = true;

        // Task
        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen.

        // Solution
        char registeredSymbol = '\u00AE';
        System.out.println("Registered symbol: " + registeredSymbol);
    }
}
