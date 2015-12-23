/*
  Ayman Ahmed
  APCS1 pd5
  HW52 -- Selection, Natch
  2015-22-12
*/

/*======================================
  class SelectionSort -- implements SelectionSort algorithm
  ======================================*/

import java.util.ArrayList;

public class SelectionSort {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
		ArrayList<Integer> retAL = new ArrayList<Integer>();
		while( size > 0 ) {
	   		//     offset + rand int on interval [lo,hi]
	    	retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    	size--;
		}
		return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
		int randomIndex;
    	for( int i = al.size()-1; i > 0; i-- ) {
    		//pick an index at random
    		randomIndex = (int)( (i+1) * Math.random() );
    		//swap the values at position i and randomIndex
        	al.set( i, al.set( randomIndex, al.get(i) ) );
    	}
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static int min(ArrayList<Comparable> data) {
    	Comparable currentmin = data.get(0);
    	//min + index = mindex!
    	int mindex = 0;
    	for (int i = 0 ; i < data.size() ; i++) {
    		if (data.get(i).compareTo(currentmin) < 0) {
    			mindex = i;
    			currentmin = data.get(i);
    		}
    	}
    	return mindex;
    }

    public static void swap(ArrayList<Comparable> data, int a, int b) {
		data.set(a, data.set(b, data.get(a) ) );
    }

    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSortV( ArrayList<Comparable> data ) {
        for (int i = 0; i < data.size(); i++) {
		    int min = min(data);
	    	swap(data, min, i);
		}
    }//end selectionSortV -- O(n^2)
    

    // ArrayList-returning selectionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input ) {
		ArrayList<Comparable> retlist = input;
        for (int i = 0; i < retlist.size(); i++) {
		    int min = min(retlist);
	    	swap(retlist, min, i);
		}
		return retlist;
    }//end selectionSort -- O(?)


    //main method for testing
    public static void main( String [] args ) {

	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  selectionSortV(glen);
	  System.out.println( "ArrayList glen after sorting:\n" + glen );
	  /*============================================
	  ============================================*/
	
	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  selectionSortV(coco);
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  /*===============for VOID methods=============	
	  ============================================*/

	  glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  ArrayList glenSorted = selectionSort( glen );
	  System.out.println( "sorted version of ArrayList glen:\n" 
	  + glenSorted );
	  System.out.println( "ArrayList glen after sorting:\n" + glen );

	  coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  ArrayList cocoSorted = selectionSort( coco );
	  System.out.println( "sorted version of ArrayList coco:\n" 
	  + cocoSorted );
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  System.out.println( coco );
	  /*==========for AL-returning methods==========
	  ============================================*/

    }//end main

}//end class SelectionSort