package com.vladislawovk;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(99,99,1));
    }

    public static boolean canPack( int bigCount, int smallCount, int goal){

        if(bigCount < 0 || smallCount < 0 || goal < 0
                || (bigCount * 5 + smallCount < goal))
            return false;


        return (goal % 5 <= smallCount);

    }
}

