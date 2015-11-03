/*
Ayman Ahmed
APCS1 pd5
HW#22 -- Augmenting Your Array of Tools
2015-11-02
*/

public class ArrayUtils {
    public static void Populate(int[] a, int range) {
		for (int i = 0 ; i < a.length ; i++) {
	    	a[i] = (int)(Math.random()*range + 1);    //takes an array and a range as input, fills array with ints from 0 to range
		}
    }
    public static String arrayReturn(int[] a) {
		String retstr = "";
		for (int i = 0 ; i < a.length - 1; i++) {
	    	retstr += Integer.toString(a[i]);   
	    	retstr += ", ";    // seperates values by a comma
		}
		retstr += a[a.length - 1];   //adds last value to the string
		return retstr;
    }
    public static void main(String[] args) {
		int[] array =  new int[5];
		Populate(array, 15);     //testing methods
		System.out.println(arrayReturn(array));
    }
}
