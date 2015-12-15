/*
  Ayman Ahmed
  APCS1 pd5
  HW#48 -- Half(l)ing Time Trials
  2015-12-14
*/


/*============================================
  class OrderedArrayList
  Wrapper class for ArrayList.
  Imposes the restriction that stored items 
  must remain sorted in ascending order
  ============================================*/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;

public class OrderedArrayList {

    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList() {
        _data = new ArrayList<Comparable>();
    }

    
    public String toString() { 
        return _data.toString();
    }

    public Comparable remove( int index ) { 
        Comparable temp = _data.get(index);
        _data.remove(index);
        return temp;
    }


    public int size() { 
        return _data.size();
    }

	
    public Comparable get( int index ) { 
        return _data.get(index);
    }


    // addLinear takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a linear search to find appropriate index
    public void addLinear( Comparable newVal ) { 
    	int breaker = 1;
        if (_data.size() == 0) {
            _data.add(newVal);
        }
        else {
            for (int i = 0 ; i < _data.size() && breaker != 0 ; i++) {
                if (_data.get(i).compareTo(newVal) >= 0) {
                    _data.add(i, newVal);
                    breaker = 0;
                }
            }
        }
    }

    public void addBinary( Comparable newVal ) { 
        //initialize upperbound, lowerbound and median
        int lo = 0;
        int med = 0;
        int hi = _data.size()-1;

        while ( lo <= hi ) { //running until target is found or bounds cross

            med = (lo + hi) / 2;
            int x = _data.get(med).compareTo( newVal );
	        
            if ( x == 0 ) { //equal value found, insert here
                _data.add( med, newVal );
                return;
            }
            else if ( x > 0 ) //newVal < med, so look at lower half of data
                hi = med - 1;
            else //newVal > med, so look at upper half of data
                lo = med + 1;
        }
        // If you make it this far, newVal was not in the ArrayList.
        // So insert at lo. Q: How do you know lo is correct insertion index?
        _data.add( lo, newVal );
    }	

    public boolean findLin(Comparable target) {
        for (int i = 0 ; i < _data.size() ; i++) {
            if (_data.get(i).compareTo(target) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean findBin(Comparable target) {
        int lo = 0;
        int hi = this.size() - 1;
        int med = (hi + lo) / 2;
        while ( lo <= hi ) { //running until target is found or bounds cross
            med = (lo + hi) / 2;
            int x = _data.get(med).compareTo(target);
            if ( x == 0 ) { //equal value found, insert here
                _data.add( med, target );
                return true;
            }
            else if ( x > 0 ) //newVal < med, so look at lower half of data
                hi = med - 1;
            else //newVal > med, so look at upper half of data
                lo = med + 1;
        }
        return false;
    }
    
    public static void main( String[] args ) {

        OrderedArrayList Franz = new OrderedArrayList();

        System.out.println("\nValues to add via addLinear() calls:");

        // testing linear search
        for( int i = 0; i < 15; i++ ) {
            int valToAdd = (int)( 50 * Math.random() );
            System.out.println( valToAdd );
            Franz.addLinear( valToAdd );
        }
        System.out.println("\nafter population via addLinear() calls:");
        System.out.println( Franz );
        System.out.println();
        System.out.println("\nClearing Franz and testing Binary...");
        Franz = new OrderedArrayList();
        for (int i = 0 ; i < 15 ; i++) {
            Franz.addBinary(i);
        }
        System.out.println(Franz);
        System.out.println("\nTesting time of find with multiple runs on a short arraylist with findLin...");
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 1000000 ; i++) {
            Franz.findLin(999);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("\nTesting time of find with multiple runs on a short arraylist with findBin...");
        start = System.currentTimeMillis();
        for (int i = 0 ; i < 1000000 ; i++) {
            Franz.findBin(14);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("\nTesting time of find with a long array, making large arraylist now...");
        Franz = new OrderedArrayList();
        for (int i = 0 ; i < 10000000 ; i++) {
            Franz.addLinear(i);
        }
        System.out.println("\nNow testing findLin time on large arraylist...");
        start = System.currentTimeMillis();
        Franz.findLin(99999);
        end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("\nNow testing findBin time on large arraylist...");
        start = System.currentTimeMillis();
        Franz.findBin(99999);
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}//end class OrderedArrayList
