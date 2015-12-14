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

    public int searchBinary(Comparable target) {
        int lo = 0;
        int hi = this.size() - 1;
        int med = (hi + lo) / 2;
        int breaker = 1; //used to break the while
        while (breaker != 0) {
            if (this.get(med).compareTo(target) >= 0) {
                //lo = med + 1;
                hi = med - 1;
            }
            else if (this.get(med).compareTo(target) <= 0) {
                //hi = med - 1;
                lo = med + 1;
            }
            else {
                breaker = 0;
            }
            if (lo > hi) {
                breaker = 0;
            }
            else {
                med = (hi + lo) / 2;
            }
        }
        if (lo <= hi) {
            return med;
        }
        else {
            return lo;
        }
    }
	
    public void addBinary(Comparable newVal) {
        if (_data.size() == 0) {
            _data.add(newVal);
        }
        else {
            _data.add(searchBinary(newVal), newVal);
        }
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
        System.out.println("Clearing Franz and testing Binary...");
        Franz = new OrderedArrayList();
        for (int i = 0 ; i < 15 ; i++) {
            Franz.addBinary(i);
        }
        System.out.println(Franz);
    }

}//end class OrderedArrayList
