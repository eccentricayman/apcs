/*
Team NullPointerException -- Ayman Ahmed and Adam McKoy
APCS2 pd5
HW#25 -- Brits Do Not Wait in Line
2016-04-04
*/

/*****************************************************
 * class LLQueue
 * uses a linked list to implement a QUEUE
 * (a collection with FIFO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 ******************************************************/

import java.util.NoSuchElementException;

public class LLQueue<T> implements Queue<T> {

    private LLNode<T> _front, _end;

    // default constructor creates an empty queue
    public LLQueue() {
        _end = new LLNode<T>(null, null);
        _front = new LLNode<T>(null, _end);
    }

    // means of adding a thing to the collection
    public void enqueue( T enQVal ) {
        LLNode<T> temp = new LLNode(enQVal, null);
        LLNode<T> current = _front;
        while (!(current.getNext().equals(_end))) {
            current = current.getNext();
        }
        current.setNext(temp);
        temp.setNext(_end);
    }//O(n)

    // means of removing a thing from the collection
    // remove and return thing at front of queue
    // assume _queue ! empty
    public T dequeue() {
        T temp = _front.getNext().getValue();
        if (_front.getNext().equals(_end)) {
            throw new NoSuchElementException("The queue's empty, WHAT A SHAME");
        }
        else {
            _front.setNext(_front.getNext().getNext());
        }
        return temp;
    }//O(1)

    // means of peeking at thing next in line for removal
    public T peekFront() {
        return _front.getNext().getValue();
    }//O(1)

    public boolean isEmpty() {
        return _front.getNext().equals(_end);
    }//O(1)

    // print each node, separated by spaces
    public String toString() {
        String retstr = "FRONT ";
        LLNode<T> current = _front.getNext();
        while (!(current.getNext().equals(_end))) {
            retstr += "-> " + current.getValue() + " ";
            current = current.getNext();
        }
        retstr += "-> END";
        return retstr;
    }//O(n)

    public static void main( String[] args ) {

	Queue<String> LLQueuelJ = new LLQueue<String>();

	System.out.println("\nnow enqueuing thrice...");
	LLQueuelJ.enqueue("James");
	LLQueuelJ.enqueue("Todd");
	LLQueuelJ.enqueue("Smith");

	System.out.println("\nnow testing toString()...");
	System.out.println( LLQueuelJ ); //for testing toString()...

	System.out.println("\nnow dequeuing thrice...");
	System.out.println( LLQueuelJ.dequeue() );
	System.out.println( LLQueuelJ.dequeue() );
	System.out.println( LLQueuelJ.dequeue() );

	System.out.println("\nDequeuing from empty queue should yield error...");
	System.out.println( LLQueuelJ.dequeue() );
	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
	  ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

    }//end main

}//end class LLQueue
