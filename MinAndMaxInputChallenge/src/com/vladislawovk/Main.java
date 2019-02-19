    //Task
//-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//-Before the user enters the number, print the message ЃgEnter number:Ѓh
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//Hint:
//-Use an endless while loop.

package com.vladislawovk;

    import java.util.Scanner;

    public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE; // int min = 2147483647;
        int max = Integer.MIN_VALUE; // int max = -2147483648;
//        boolean first = true;

        while(true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {

                int number = scanner.nextInt();

//                if(first) {
////                    first = false;
////                    min = number;
////                    max = number;
////                }

                if(number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }

            } else {
                break;
            }

            scanner.nextLine(); // handle input
        }

        System.out.println("min= " + min + ", max= " + max);
        scanner.close();
    }
}
