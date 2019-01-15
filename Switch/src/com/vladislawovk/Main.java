package com.vladislawovk;

public class Main {     //switch подходит для теста одной переменной, но разными для неё значениями
                        // if удобен для теста разных переменных на ралзичные значения
    public static void main(String[] args) {
//	    int value = 3;  //if используется для
//	    if(value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

	    int switchValue = 6;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;
                // для большого количества значений можно использовать сокращённую форму
            case 3: case4: case5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
               // break; //если не написать break, процесс пойдёт дальше по коду

            default:
                System.out.println("Was not 1,2,3 or 5");
                break;
        }

                //Task
        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

                // Solution
        char variable = 'C';

        switch(variable) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(variable + " was found");
                break;
            default:
                System.out.println("A,B,C,D,E was not found");
                break;
        }

        // String так же может быть обработан switch
        String month = "january"; // Регистр важен
        switch(month) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

    }
}











