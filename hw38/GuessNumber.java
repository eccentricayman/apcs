/*
Ayman Ahmed
APCS1 pd5
HW#38 -- Keep Guessing
2015-11-30
*/

import java.util.Random;
import cs1.Keyboard;

public class GuessNumber {
    
    public static int ngen() {  //returns random int from 1-100
        Random r = new Random();
        int rnum = r.nextInt((99) + 1) + 1;
        return rnum;
    }
    
    public static void main(String[] args) {
        int num = ngen();
        int nguess = 0;
        System.out.println("Random number generated.");
        System.out.println("Guess a number from 1-100!");
        
    }
    
}