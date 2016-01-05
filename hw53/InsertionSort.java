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
  n-1 passes.
  Q3: What is known after pass p, and how do you know it?
  That at least p elements are sorted, because it inserts p elements into
  the right place.
  Q4: What is the runtime classification of this sort?
    Linear runtime.
*/

import java.util.ArrayList;

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

    //selectionsort void
    public static void selectionSortV( ArrayList<Comparable> data ) {
        for (int i = 0; i < data.size() - 1; i++) {
            int index = i;
            //gets minimum number in list
            for (int j = i + 1; j < data.size(); j++) {
                if (data.get(j).compareTo(data.get(index)) < 0) {
                    index = j;
                }
            }
            swap(data, index, i);
        }
    }//end selectionSortV -- O(n^2)
    

    
    //swaps two elements in an arraylist
    public static void swap(ArrayList<Comparable> data, int a, int b) {
		data.set(a, data.set(b, data.get(a) ) );
    }

	//void version of insertionsort
	public static void isortV(ArrayList<Comparable> data) {
        int i, j;
        //i runs through arraylist, j is index of other
        for (i = 1 ; i < data.size() ; i++) {
            j = 0;
            //if j is bigger than i, move to next index of j
            while (i > j && (data.get(j).compareTo(data.get(i)) < 0)) {
                j++;
            }
            //add comparable at j, remove the one above i
            data.add(j, data.get(i));
            data.remove(i + 1);
        }
	}

    //arraylist returning version of insertionsort
	public static ArrayList<Comparable> isort(ArrayList<Comparable> input) {
        ArrayList<Comparable> data = input;
        int i, j;
        //i runs through arraylist, j is index of other
        for (i = 1 ; i < data.size() ; i++) {
            j = 0;
            //if j is bigger than i, move to next index of j
            while (i > j && (data.get(j).compareTo(data.get(i)) < 0)) {
                j++;
            }
            //add comparable at j, remove the one above i
            data.add(j, data.get(i));
            data.remove(i + 1);
        }
        return data;
	}
	
	    public static void main( String [] args ) {

	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  isortV(glen);
	  System.out.println( "ArrayList glen after sorting:\n" + glen );
	  /*============================================
	  ============================================*/
	
	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  isortV(coco);
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
	  ArrayList glenSorted = isort( glen );
	  System.out.println( "sorted version of ArrayList glen:\n" 
	  + glenSorted );
	  System.out.println( "ArrayList glen after sorting:\n" + glen );

	  coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  ArrayList cocoSorted = isort( coco );
	  System.out.println( "sorted version of ArrayList coco:\n" 
	  + cocoSorted );
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  System.out.println( coco );
	  /*==========for AL-returning methods==========
	  ============================================*/

    }//end main
    
}
