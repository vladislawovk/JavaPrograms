package com.vladislawovk;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean hasSameLastDigit (int one, int two, int three){
        if(isValid(one) && isValid(two) && isValid(three)){
            int rightOne = one%10;
            int rightTwo = two%10;
            int rightThree = three%10;
            if (rightOne==rightTwo || rightOne==rightThree || rightTwo==rightThree){
                return true;
            }
        }
        return false;
    }

    public static boolean isValid (int a){
        return(a>=10 && a<=1000);
    }
}
