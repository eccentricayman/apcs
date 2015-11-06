/*
Ayman Ahmed
APCS1 pd5
HW#25 -- Recurse, Recurse, on Elements Not the First! 
2015-11-05
*/

public class Loopier {

    public static int linSearch(int[] a, int target) {
    	for (int i = 0 ; i < a.length ; i++) {
    		if (a[i] == target) {
    			return i;
    		}
    	}
    	return -1;
    }

    public static int linSearchR(int[] a, int target) {
    	int index = 0; 
    	if (index < a.length) {
    		if (a[index] == target) {
    			return index;
    		}
    		else {
    			index += 1;
    			return linSearchR(a, target);
    		}
    	}
    	else {
    		return -1;
    	}
    }

    public static int freq(int[] a, int target) {
    	int ctr = 0;
    	for (int i = 0 ; i <a.length ; i++) {
    		if (a[i] == target) {
    			ctr += 1;
    		}
    	}
    	return ctr;
    }
    public static int freqRec(int[] a, int target) {
    	int ctr = 0;
    	if (a.length != 0) {
    		int currentvalue = a[0];
    		int[] nextarray = new int[a.length - 1]; //new array with length 1 less than a
    		if (currentvalue == target) {
    			ctr += 1;
    		}
    		for (int i = 1 ; i < a.length ; i++) {  //for loop to set values of shortened array, starts at 1 because of nextarray's length
    			nextarray[i-1] = a[i];
    		}
    	}
    	else {
    		return 0;
    	} 
    	return ctr + freqRec(nextarray, target);
    }
    public static void main(String[] args) {
    	int[] x = new int[3];
    	x[0] = 2;
    	x[1] = 2;
    	x[2] = 3;
    	System.out.println(linSearch(x, 1));
    	System.out.println(linSearch(x, 2));
    	System.out.println(linSearch(x, 3));
    	System.out.println(linSearchR(x, 1));
    	System.out.println(linSearchR(x, 2));
    	System.out.println(linSearchR(x, 3));
    	System.out.println(freq(x, 1));
    	System.out.println(freq(x, 2));
    	System.out.println(freq(x, 3));
    	System.out.println(freqRec(x, 1));
    	System.out.println(freqRec(x, 2));
    	System.out.println(freqRec(x, 3));
    }  //end main
} //end class