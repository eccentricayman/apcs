/*
Team Winter  -- Ayman Ahmed, Andy Liang, Aleksandar Shipetich
APCS2 pd5
HW#11 -- <BLANK>
2016-03-09
*/

/*======================================
  class MergeSortTester

  ALGORITHM:
  Recursively split the array until it is split into arrays of length 1, and then go
  back up the chain and merge the one arrays together until you have your sorted array
  back.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  We classified it as O(n*log(n)).

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester {

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    
    //helper to randomly fill array
    public static void fillArr(int[] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = (Math.random() * 100) + 1
        }
    }
    
    //returns how long an array takes to mergesort in seconds
    public static double timeTest(int[] arr, int n) {
        double start = System.currentTimeMillis();
        
    }
    
    public static void main( String[] args ) {
        System.out.println('penis"');
    }//end main
    
}//end class
