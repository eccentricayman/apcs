/*  Team eam am m -- Ayman Ahmed, Andy Liang, Lucy Tang
    APCS1 pd5
    HW#17 -- GCD Three Ways
    2015-10-16
*/

public class Stats{
    
    public static void main(String[] args) { //main method to test the methodstuf thingys
	double test1 = 2;    //used to test the difference between the double and int
	double test2 = 4;
	double test3 = 6;
	System.out.println("\nMean Tests");
	System.out.println(mean(1,3));  //tests of stuf
	System.out.println(mean(test1, test2));
	System.out.println("\nMax Tests");
	System.out.println(max(1,3));
	System.out.println(max(test1, test2));
	System.out.println("\nGeo Mean Tests");
	System.out.println(geoMean(1,3));
	System.out.println(geoMean(test1, test2));
	System.out.println("\nGCD Tests");
	System.out.println(gcd(12,10)); //2
	System.out.println(gcd(5,5)); //5
	System.out.println(gcd(12,36)); //12
	System.out.println("\nGCDER Tests");
	System.out.println(gcdER(12,10)); //2
	System.out.println(gcdER(5,5)); //5
	System.out.println(gcdER(12,36)); //12
	System.out.println("\nGCDEW Tests");
	System.out.println(gcdEW(12,10)); //2
	System.out.println(gcdEW(5,5)); //5
	System.out.println(gcdEW(12,36)); //12
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
    /*-----------------HERE WE GO HW 17 STUF-----------------*/ 
	 //smallest of given numbers
    public static int min(int a, int b){//using integer inputs
	if (a < b) return a;
	return b;
    }

    //using while, using bruteforce method
    public static int gcd(int a, int b){
	if (a == b) return a;
	int greater = max(a,b);
	int smaller = min(a,b);
	int GCD = smaller;
	while (greater%GCD != 0 || smaller%GCD != 0){
	    GCD -= 1;
	}
	return GCD;
	    }
    
    /*SUMMARIZING OUR EUCLID ALGORITHM
      1. Divide the greater number by the smaller number, keep track of the remainder.
      2. Divide the smaller number by the remainder, keep track of the remainder.
      3. Repeat until the remainder becomes 0 and the GCD will be the smaller number that is divided to yield 0.
      EX:
      210/45 = 4 R 30
      45/30 = 1 R 15
      30/15 = 2 R 0
      Therefore the GCD is 15
     */

    //using recursion for Euclid's algorithm
    public static int gcdER(int a, int b){
	if (a == b) return a;
	int greater = max(a,b);
	int smaller = min(a,b);
	if (greater%smaller == 0) return smaller;
	else {
	    return gcdER(smaller,greater%smaller);
	}
    }

    //using while for  Euclid's algorithm
    public static int gcdEW(int a, int b){
	if (a == b) return a;
	int greater = max(a,b);
	int smaller = min(a,b);
	int GCD = smaller;
	while (greater%GCD != 0 || smaller%GCD != 0) {
	    GCD = greater%smaller;
	    greater = smaller;
	}
	return GCD;
    }
    
}
