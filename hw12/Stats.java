/*
Ayman Ahmed
APCS1 pd5
HW12 -- stAtistically sPeaking
2015-10-05
*/   
//I CHANGED MY C9.IO KEYBOARD CONTROLS TO EMACS AND I STILL DON'T KNOW ANY OF THE SHORTCUTS I ACCIDENTALLY ALMOST KILLED THE FILE ONCE BUT C9 WARNS YOU BEFORE DELETING FILE AND I AM VERY HAPPY ABOUT THAT
public class Stats {

    public static void main(String[] args) { //main method to print stuf
    double test1 = 2;    //used to test the difference between the double and int
    double test2 = 4;
    System.out.println(mean(1,3));  //tests
    System.out.println(mean(test1, test2));
    System.out.println(max(1,3));
    System.out.println(max(test1, test2));
    System.out.println(geoMean(1,3));
    System.out.println(geoMean(test1, test2));
    }
   // didn't add the new methods because I have my driver file for that!!!

    public static int mean(int a, int b) {
        return (a + b) / 2;
        }
 
 
    public static double mean(double a, double b) {
        return (a + b) / 2;
        }


    public static int max(int a, int b) {
        if (a > b) {
        return a;
        }
        else {
        return b;
        }
    }
    
    
    public static double max(double a, double b) {
        if (a > b) {
        return a;
        }
        else {
        return b;
        }
    }


    public static int geoMean(int a, int b) {
        return (int)Math.sqrt((a * b));
    }


    public static double geoMean(double a, double b) {
        return (double)Math.sqrt((a * b));
    }

}