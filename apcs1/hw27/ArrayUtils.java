/*
Ayman Ahmed
APCS1 pd5
HW#27 -- Objectify Your Array Tools
2015-11-09
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

    public static String arrayReturn(String[] a) {
		String retstr = "";
		for (int i = 0 ; i < a.length - 1; i++) {
	    	retstr += a[i];   
	    	retstr += ", ";    // seperates values by a comma
		}
		retstr += a[a.length - 1];   //adds last value to the string
		return retstr;
    }

    public static void main(String[] args) {
		String[] array = new String[5];
		array[0] = "first";
		array[1] = "second";
		array[2] = "third";
		array[3] = "third";
		array[4] = "third";
		System.out.println("ArrayReturn");
		System.out.println(arrayReturn(array) + "\n");
		System.out.println("Linear Search, Recursive");
		System.out.println(linSearch(array, "third"));
		System.out.println(linSearchR(array, "third") + "\n");
		System.out.println("Frequency");
		System.out.println(freq(array, "second"));
		System.out.println(freq(array, "third") + "\n");
		System.out.println("Frequency, Recursive");
		System.out.println(freqRec(array, "second"));
		System.out.println(freqRec(array, "third"));
    }

    public static int linSearch(int[] a, int target) {
    	for (int i = 0 ; i < a.length ; i++) {
    		if (a[i] == target) {
    			return i;
    		}
    	}
    	return -1;
    }

    public static int linSearch(String[] a, String target) {
	for (int i = 0 ; i < a.length ; i++) {
	    if (a[i].equals(target)) {
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
    
    public static int linSearchRhelper(String[] a, String target, int cindex) {
    	int index = cindex; 
    	if (index < a.length) {
	    if (a[index].equals(target)) {
		return 0;
	    }
	    else {
		return linSearchRhelper(a, target, index + 1);
	    }
    	}
    	else {
	    return -1;
    	}
    }
    
    public static int linSearchR(String[] a, String target) {
    	return linSearchRhelper(a, target, 0);
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

    public static int freq(String[] a, String target) {
	int ctr = 0;
	for (int i = 0 ; i < a.length ; i++) {
	    if (a[i].equals(target)) {
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
    		return -1;
        }
        else {
        	return ctr;
        }
    }

	public static int freqRec(String[] a, String target) {
    	int ctr = 0;
    	if (a.length != 0) {
    		String currentvalue = a[0];
    		String[] nextarray = new String[a.length - 1]; //new array with length 1 less than a
    		if (currentvalue.equals(target)) {
    			ctr += 1;
    		}
    		return -1;
        }
        else {
        	return ctr;
        }
    }
} //end class
