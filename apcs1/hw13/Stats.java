/*  Ayman Ahmed
    APCS1 pd5
    HW13 - May ah Hahv S'Maur, Please?
    2015-10-06
    */

public class Stats{
    public static void main(String[] args) { //main method to print stuf
    double test1 = 2;    //used to test the difference between the double and int
    double test2 = 4;
    double test3 = 6;
    System.out.println(mean(1,3));  //tests
    System.out.println(mean(test1, test2));
    System.out.println(max(1,3));
    System.out.println(max(test1, test2));
    System.out.println(geoMean(1,3));
    System.out.println(geoMean(test1, test2));
    }


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
    
    public static double max(double a, double b, double c) {
        if (a > b) {
            return a;
        }
        else if (b > c) {
            return b;
        }
        else {
            return c;
        }
    }
    public static int geoMean(int a, int b, int c) {
        return (int)(Math.cbrt(a * b * c));
    }
    
    public static double geoMean(double a, double b, double c) {
        return (int)(Math.cbrt(a * b * c));
    }
    
}