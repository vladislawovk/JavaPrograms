package com.vladislawovk;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus = 100;

//	    if(score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if(gameOver)  { //В скобках абревиатура значения (gameOver == true)
            int finalScore = score + (levelCompleted * bonus); //переменная finalScore была создана внутри блока if
            System.out.println("Your final score was " + finalScore);
        }

        //int savedFinalScore = finalScore; // невозможно присвоить значение, т.к только if был
                                         // завершён, все переменные объявленные внутри него были удалены

        //Task
        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        //Solution
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver)  {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
