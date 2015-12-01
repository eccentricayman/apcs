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
		int uguess = 1000; //just to initialize
		int min = 1;
		int max = 100;
		System.out.println("Random number generated.");
		System.out.println("Guess a number from 1-100!");
		while (uguess != num) {
			if (uguess >= min & uguess <= max) {
				uguess = Keyboard.readInt();
			}
			else {
				System.out.println("Out of range, try again.");
				uguess = Keyboard.readInt();
			}	
			if (uguess > num) {
				max = uguess - 1;
				System.out.println("Too high, try again.");
				nguess += 1;
				System.out.println("Guess a number from "+ min + " to " + max + " .");
			}
			else if (uguess == num) {
				nguess += 1;
				System.out.println("Correct! It took " + nguess + " guesses.");
			}
			else {
				min = uguess + 1;
				System.out.println("Too low, try again.");
				nguess += 1;
				System.out.println("Guess a number from " + min + " to " + max + " .");
			}
		}

	}

}
