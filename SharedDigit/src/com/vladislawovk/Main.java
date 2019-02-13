package com.vladislawovk;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean hasSharedDigit(int uno, int due){

        if ((uno<10||due<10) || (uno>99||due>99))
            return false;

        int uno1 = uno/10;
        int uno2 = uno % 10;
        int due1 = due /10;
        int due2 = due % 10;

        return((due2 == uno2)||(uno1 == due1)||(uno1==due2)||(uno2==due1));


    }
}


