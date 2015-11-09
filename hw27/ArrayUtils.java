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
		int[] array =  new int[5];
		Populate(array, 15);     //testing methods
		System.out.println(arrayReturn(array));
		String[] StringArray = new String[5];
		StringArray[0] = "first";
		StringArray[1] = "second";
		StringArray[2] = "third";
		StringArray[3] = "third";
		StringArray[4] = "third";
		System.out.println(arrayReturn(StringArray) + "\n");
		System.out.println(linSearch(StringArray, "third"));
		System.out.println(linSearchR(StringArray, "third") + "\n");
		System.out.println(freq(StringArray, "second"));
		System.out.println(freq(StringArray, "third"));
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
    
    //NEVER GOT FREQREC WORKING, SO THERE'S NOTHING HERE :(

} //end class
