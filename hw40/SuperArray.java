/*
Team '(1 2 3) -- Ayman Ahmed, Anton Goretsky, Kathy Lau
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

    //=====Accessors for instance variables=========
    public int lastPos() {
        return _lastPos;
    }

    public int size() { //better to have and not need than to not have and need
        return _size;
    }
    
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
        for (int i = 0 ; i < _size ; i++) {  
            retstr += _data[i];
            retstr += ", ";  //personal preference to have a space along with the comma
        }
        if (retstr.length() > 1) {
            retstr = retstr.substring(0, retstr.length() - 2); //get rid of trailing comma
        }
        retstr += "]";
        return retstr;
    }

        
    //double capacity of this SuperArray
    private void expand() {
        int[] temp = new int[_data.length * 2];
        for (int i = 0 ; i < _data.length ; i++) {
            temp[i] = _data[i];
        }      
        _data = temp;
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
    
    public void add(int a) { 
        _lastPos += 1;
        if (_lastPos >= _size) { //expand the array until the size is big enough
            expand();
        }
        _data[_lastPos] = a;
        _size += 1;
    }
    public void add(int a, int index) {
        if (index > _lastPos) { 
            add(a);
        }
        else {
            for (int i = _size ; i>=index ; i--) {
                _data[i] = _data[i - 1];
            }
            _data[index] = a;
            _lastPos += 1;
            _size += 1;
        }
    }
    
    public int remove(int index) {
        int temp = _data[index];
        for (int i = index ; i < _lastPos ; i++) { //starts loop at deleted index
            set(i, set(i + 1, _data[i])); 
        }
        _size -= 1;
        _lastPos -= 1;
        return temp;
    }

    //main method for testing
    public static void main( String[] args ) {
        System.out.println("Testing constructors...");
        SuperArray test = new SuperArray();
        System.out.println("Last Position: " + test._lastPos);
        System.out.println("Size: " + test._size);
        System.out.println("\nTesting toString by printing empty array...");
        System.out.println(test.toString());
        System.out.println("\nTesting accessors and mutators...");
        for (int i = 0 ; i < test._data.length ; i++) {  
            test.set(i, i + 1);
        }
        for (int a = 0 ; a < test._data.length ; a++) {  //hardcoded 10
            System.out.println(test.get(a));
        }
        System.out.println("\nTesting expand...");
        test.expand();
        System.out.println("New Length: " + "20");  //this will be replaced in future with a getlength accessor
        System.out.println("\nFilling expanded superarray...");
        for (int b = 0 ; b < test._data.length ; b++) { 
            test.set(b, b + 1);
        }
        System.out.println("\nTesting add...");
        test.add(128);
        test.add(256);
        test.add(512);
        test.add(1024);
        test.add(2048);
        System.out.println(test.toString());
        System.out.println("\nTesting remove...");
        test.remove(3);
        test.remove(4);
        System.out.println(test.toString());
        System.out.println("\nTesting add at index...");
        test.add(4096, 10);
        test.add(8192, 20);
        System.out.println(test.toString());    
    }//end main

}//end class