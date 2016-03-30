/*
Ayman Ahmed
APCS2 pd5
HW#19 -- Circular Logic (Have We Been Here Before?)
2016-03-29
*/

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
        LLNode<T> front = head;
        while (front.getPrev() != null) {
            front = front.getPrev();
        }
        LLNode<T> temp = new LLNode<T>(x, _head, front);
        _head = temp;
        nodecount++;
        return true;
    }


    public T get( int index ) {
        if (i < 0 || i >= _size()) {
			throw new IndexOutOfBoundsException();
		}
        LLNode<T> current = _head;
		for (int j = 0 ; j < i ; j++) {
            if (current.getNext() == _head) {
                return null;
            }
            current = current.getNext();
		}
        return current.get();
    }

    public T set( int index, T newVal ) {
        LLNode<T> tmp = new LLNode<T>(x, null, null);
        LLNode<T> current = beginning;
        for (int j = 0 ; j < i ; j++) {
            if (current.getNext() == _head) {
                break;
            }
            current = current.getNext();
        }
        T ret = current.get();
        current.set(x);
        return ret;

    }

    public String toString() {
        String retstr = "HEAD --> ";
    	LLNode<T> current = beginning;
        while (current != null) {
            retstr += current.get() + " --> ";
            current = current.getNext();
        }
        retstr += "HEAD";
        return retstr;
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
