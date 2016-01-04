/*
  Ayman Ahmed
  APCS1 pd5
  HW53 -- Poker Face
  2016-4-1
*/

/*
  Q1: Is more work done toward beginning or end of insertion sort? Why?
  - More work is done 
  Q2: For n items, how many passes are necessary to sort?
  
  Q3: What is known after pass p, and how do you know it?
  
  Q4: What is the runtime classification of this sort?

*/

public class InsertionSort {
    //fills arraylist with random ints in a range
	public static ArrayList populate( int size, int lo, int hi ) {
		ArrayList<Integer> retAL = new ArrayList<Integer>();
		while( size > 0 ) {
	   		//     offset + rand int on interval [lo,hi]
	    	retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    	size--;
		}
		return retAL;
    }

	//randomly rearranges elements in ArrayList
	public static void shuffle( ArrayList al ) {
		int randomIndex;
    	for( int i = al.size()-1; i > 0; i-- ) {
    		//pick an index at random
    		randomIndex = (int)( (i+1) * Math.random() );
    		//swap the values at position i and randomIndex
        	al.set( i, al.set( randomIndex, al.get(i) ) );
    	}
    }

	//void version of insertionsort
	public static void isortV(Arraylist<Comparable> data) {
		for (int i = 0 ; i < data.size() ; i++) {
			for (int i2 = 0 ; i2 < data.size() - i ; i2++) {
				if (data.get(i) <
			}
		}
	}
}