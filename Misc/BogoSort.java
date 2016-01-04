/*
The worst sorting algrithm to exist since
well ever
at least it's better than manually sorting data yourself!
sometimes
*/

import java.util.ArrayList;

public class BogoSort {
    public static ArrayList populate( int size, int lo, int hi ) {
		ArrayList<Integer> retAL = new ArrayList<Integer>();
		while( size > 0 ) {
	   		//     offset + rand int on interval [lo,hi]
	    	retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    	size--;
		}
		return retAL;
    }

    public static void shuffle( ArrayList<Integer> al ) {
		int randomIndex;
    	for( int i = al.size()-1; i > 0; i-- ) {
     		randomIndex = (int)( (i+1) * Math.random() );
         	al.set( i, al.set( randomIndex, al.get(i) ) );
    	}
    }

    public static void sort(ArrayList<Integer> data) {
    	int sorted = 1;
    	for (int i = 0 ; i < data.size() - 1 ; i++) {
    		if (data.get(i).compareTo(data.get(i + 1)) >= 0) {
    			sorted = 0;
    		}
    	}
    	if (sorted == 0) {
    		shuffle(data);
    		sort(data);
    	}
    }

    public static void main(String[] args) {
    	ArrayList<Integer> test = populate(7, 69, 420);	
    	System.out.println(test);
    	double start = System.currentTimeMillis();
    	sort(test);
    	double end = System.currentTimeMillis();
    	System.out.println(end - start);
    	System.out.println(test);
    }
}
