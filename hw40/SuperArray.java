/*
Ayman Ahmed
APCS1 pd5
HW#40 -- Array of Grade 316
2015-12-02
*/

/*****************************
 * SKELETON for
 * class SuperArray --  A wrapper class for an array. 
 * Maintains functionality:
 *  access value at index
 *  overwrite value at index
 * Adds functionality to std Java array:
 *  resizability
 *  ability to print meaningfully
 *****************************/

public class SuperArray {

        //~~~~~INSTANCE VARS~~~~~
        //underlying container, or "core" of this data structure:
    private int[] _data;

        //position of last meaningful value
    private int _lastPos;

        //size of this instance of SuperArray
    private int _size;

        
        //~~~~~METHODS~~~~~
    //default constructor that initializes 10-item array
    public SuperArray() {
        _data = new int[10];
        _lastPos = -1; //nothing has been changed yet'
        _size = 0;
    }

        
    //output array in [a,b,c] format, eg
    // {1,2,3}.toString() -> "[1,2,3]"
    public String toString() {
        String retstr = "[";
        for (int i = 0 ; i < _data.length - 1 ; i++) {
            retstr += _data[i];
            retstr += ", ";
        }
        retstr += _data[_data.length - 1];
        retstr += "]";
        return retstr;
    }

        
    //double capacity of this SuperArray
    private void expand() {
        int[] tmp = new int[_data.length * 2];
        for (int i = 0 ; i < _data.length ; i++) {
            tmp[i] = _data[i];
        }      
        _data = tmp;
    }

        
    //accessor -- return value at specified index
    public int get( int index ) {
        return _data[index];
    }

        
    //mutator -- set value at index to newVal, 
    //           return old value at index
    public int set( int index, int newVal ) {
        int old = _data[index];
        _data[index] = newVal;
        return old;
    }
    
    public boolean add(int a) {
        try {
            _lastPos += 1;
            _data[_lastPos] = a;
            _size += 1;
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    public boolean add(int a, int index) {
        if (index > _lastPos) {
            add(a);
        }
        else {
            size += 1;
            while (_data.length < size) {
                expand();
            }
            add(a);
            _size -= 1;
            for (int i = _lastPos; i >= index; i--) {
                
            }
        }
    }

    //main method for testing
    public static void main( String[] args ) {
        System.out.println("Testing constructors...");
        SuperArray test = new SuperArray();
        System.out.println("Last Position: " + test._lastPos);
        System.out.println("Size: " + test._size);
        System.out.println("\nTesting accessors and mutators...");
        for (int i = 0 ; i < 10 ; i++) {  //10 is hardcoded in for now, actual length will be implemented in future
            test.set(i, i + 1);
        }
        for (int a = 0 ; a < 10 ; a++) {  //hardcoded 10
            System.out.println(test.get(a));
        }
        System.out.println("\nTesting expand...");
        test.expand();
        System.out.println("New Length: " + "20");  //this will be replaced in future with a getlength accessor
        System.out.println("\nFilling expanded superarray...");
        for (int b = 0 ; b < 20 ; b++) {  //hardcoded 20
            test.set(b, b + 1);
        }
        System.out.println("\nTesting toString...");
        System.out.println(test.toString());

    }//end main
        
}//end class