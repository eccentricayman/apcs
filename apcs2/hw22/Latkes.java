/*****************************************************
 * skeleton for class Latkes
 * Implements stack of Strings using array as underlying container.
 * new in Version 2: typed for generics
 *****************************************************/

public class Latkes<T> implements Stack<T> {

    private T [] _stack;
    private int _stackSize;


    //constructor
    public Latkes() { 
        _stack = (T[])new Object[10];
        _stackSize = 0;
    }

    //overloaded constructor allows for intial capacity declaration
    public Latkes( int size ) { 
        _stack = (T[])(new Object[size]);
        _stackSize = 0;
    }
    
    public boolean isEmpty() {
        return _stackSize == 0;
    }

    public boolean isFull() {
        return _stackSize >= _stack.length;
    }

    public void push(T s) {
        if (isFull()) {
            T[] temp = (T[])new Object[_stack.length * 2];
            for (int i = 0 ; i < _stack.length ; i++) {
                temp[i] = _stack[i];
            }
            _stack = temp;
        }
        _stack[_stackSize] = s;
        _stackSize++;
    }

    public T pop() {
        T retT = (T)new Object();
        if (isEmpty()) {
            return null;
        }
        retT = _stack[_stackSize---1];
        return retT;
    }
    
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return _stack[_stackSize];
    }
    
pp    //main method for testing
    public static void main( String[] args ) {


	Latkes<String> tastyStack = new Latkes<String>(10);

	tastyStack.push("aoo");
	tastyStack.push("boo");
	tastyStack.push("coo");
	tastyStack.push("doo");
	tastyStack.push("eoo");
	tastyStack.push("foo");
	tastyStack.push("goo");
	tastyStack.push("hoo");
	tastyStack.push("ioo");
	tastyStack.push("joo");
	tastyStack.push("coocoo");
	tastyStack.push("cachoo");

	//cachoo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//coocoo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//joo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//ioo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//hoo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//goo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//foo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//eoo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//doo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//coo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//boo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//aoo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
    System.out.println("THE NULL STUF HERE");
	//stack empty by now; SOP(null)
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	System.out.println( tastyStack.pop() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
          ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
    }//end main()

}//end class Latkes
