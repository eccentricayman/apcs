/*
  Ayman Ahmed
  APCS2 pd5
  HW#9 -- Mergers and Acquisitions
  2016-03-04
*/

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:

  ======================================*/

public class MergeSort {

    /******************************************************
     * int[] merge(int[],int[])
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) {
        //counter for inserting items into ret_arr
        int a_ctr = 0;
        int b_ctr = 0;
        int ctr = 0 ;
        //sorted array to return
        int[] ret_arr = new int[a.length + b.length];
        //iterating over the arrays
        while (a_ctr < a.length && b_ctr < b.length) {
            if (a[a_ctr] < b[b_ctr]) {
                ret_arr[ctr] = a[a_ctr];
                a_ctr++;
                ctr++;
            }
            else if (b[b_ctr] < a[a_ctr]) {
                ret_arr[ctr] = b[b_ctr];
                b_ctr++;
                ctr++;
            }
            else {
                //if they're equal values, just use the value from a
                ret_arr[ctr] = a[a_ctr];
                a_ctr++;
                ctr++;
            }
        }
        //to get rid of the rest of list a
        while (a_ctr < a.length) {
        	ret_arr[ctr] = a[a_ctr];
        	a_ctr++;
        	ctr++;
        }
        //same thing for b
        while (b_ctr < b.length) {
        	ret_arr[ctr] = b[b_ctr];
        	b_ctr++;
        	ctr++;
        }
        return ret_arr;
    }//end merge()


    /******************************************************
     * int[] sort(int[])
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) {
        if (arr.length == 1) {
        	return arr;
        }
        else {
      		int[] first = new int[arr.length / 2];
      		int[] second = new int[arr.length / 2];
      		for (int i = 0 ; i < arr.length / 2 ; i++) {
      			first[i] = arr[i];
      			second[i] = arr[i + (arr.length / 2)];
      		}
      		return merge(sort(first), sort(second));
        }
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
        for( int i = 0 ; i<a.length; i++ )
            a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
        System.out.print("[");
        for( int i : a )
            System.out.print( i + ",");
        System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {

        int[] arr0 = {0};
        int[] arr1 = {1};
        int[] arr2 = {1,2};
        int[] arr3 = {3,4};
        int[] arr4 = {1,2,3,4};
        int[] arr5 = {4,3,2,1};
        int[] arr6 = {9,42,17,63,0,512,23};
        int[] arr7 = {9,42,17,63,0,9,512,23,9};

        System.out.println("\nTesting mess-with-array method...");
        printArray( arr3 );
        mess(arr3);
        printArray( arr3 );

        System.out.println("\nMerging arr1 and arr0: ");
        printArray( merge(arr1,arr0) );

        System.out.println("\nMerging arr4 and arr6: ");
        printArray( merge(arr4,arr6) );

        System.out.println("\nSorting arr4-7...");
        printArray( sort( arr4 ) );
        printArray( sort( arr5 ) );
        printArray( sort( arr6 ) );
        printArray( sort( arr7 ) );
        /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class MergeSort
