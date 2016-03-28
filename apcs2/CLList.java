/*****************************************************
 * skeleton for class CLList 
 * implements a circularly-linked list of doubly-linked nodes
 ******************************************************/

public class CLList<T> {

    // only 1 head/tail/front/end pointer is necessary,
    // since the list is circularly-linked
    private DLLNode<T> _head;
    private int _size = 0;

    public CLList() {
        _head = null;
        _size = 0;
    }

    public int size() { return _size; }

    public boolean add( T x ) {
        return true;
    }


    public T get( int index ) 
    {

    }


    public T set( int index, T newVal ) 
    {

    }


    public String toString() 
    {

    }


    public static void main( String[] args ) {

	CLList<String> liz = new CLList<String>();

	liz.add("kenneth");
	liz.add("jack");
	liz.add("tracy");

	System.out.println(liz);

	System.out.println("\ntesting get()...");
	for( int i = 0; i < liz._size; i++ ) {
	    System.out.println("node " + i + " contains " + liz.get(i) );
	    System.out.println(liz);
	}

	System.out.println("\ntesting set()...");
	for( int i = 0; i < liz._size; i++ ) {
	    System.out.println( liz.set( i, "rock"+i ) );
	    System.out.println(liz);
	}

    }//end main

}//end class CLList
