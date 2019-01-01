package com.vladislawovk;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50; //here expression is: myVariable = 50
                            //here the statement is the entire line(полная линия): int myVariable = 50;
        myVariable++; //statement
        myVariable--; //statement

        System.out.println("This is a test"); //эта строка тоже statement,
                                             // т.к. тут присутствует вызов метода и точка с запятой на конце.

        System.out.println("This is" + //statement не обязательно одна строка,
                " another" +          // может быть разбито на множество, джава не считает пробелы.
                " still more.");

        int anotherVariable = 50;myVariable--;System.out.println("This is another one"); //на одной строке также может быть несколько statement.


        // white spaces(белые пробелы) это пространство между выражениями
        // игнорируемое джавой, существующее лишь для удобства чтения кода
        // джава будет сама удалять "лишние" пробелы
        // пример:
        //int myWhiteSpaceVariable=50;
                                    // Эти два выражения будут одинакомвы для джавы
        int myWhiteSpaceVariable         =
                50
                ;
    }
}
