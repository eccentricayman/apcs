/*
Ayman Ahmed
APCS2 pd5
HW#27 -- Now Let's Consider You Lot at Fake Terry's 
2016-04-05
*/

/*****************************************************
 * class RQueue
 * A linked-list-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linked list points opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 ******************************************************/

import java.util.NoSuchElementException;

public class RQueue<T> implements Queue<T> {

	private LLNode<T> _front, _end;
	private int _size;


	// default constructor creates an empty queue
	public RQueue() { 
		_end = new LLNode<T>(null, null);
		_front = new LLNode<T>(null, _end);
		_size = 0;
	}//end default constructor

	public void enqueue( T enQVal ) {
        LLNode<T> temp = new LLNode(enQVal, null);
        LLNode<T> current = _front;
        while (!(current.getNext().equals(_end))) {
            current = current.getNext();
        }
        current.setNext(temp);
        temp.setNext(_end);
	}//end enqueue()

	// remove and return thing at front of queue, then reorder elements
	// assume _queue ! empty
	public T dequeue() { 
		//remove person from queue
		T temp = _front.getNext().getValue();
        if (_front.getNext().equals(_end)) {
            throw new NoSuchElementException();
        }
        else {
            _front.setNext(_front.getNext().getNext());
        }
        //shuffle now
        sample();
        return temp;
	}//end dequeue()

	public T peekFront() {
		return _front.getNext().getValue();
	}

	/******************************************
	 * void sample() -- a means of "shuffling" the queue
	 * Algo:
	 * ...
	 * 
	******************************************/
	public void sample () {
		LLNode<T> end = _front;
		while (!(end.getNext().equals(_end))) {
			end = end.getNext();
		}
		//just to get last element
		//to actually randomize
		LLNode<T> current = _front;
		while (!(current.getNext().equals(_end))) {
			int fiftyfifty = (int)(Math.random()); 
			//fifty percent chance to move to end
			if (fiftyfifty == 0) {
				LLNode<T> tomove = current;
				end.setNext(tomove);
				tomove.setNext(_end);
			}
		}
	}//end sample()

	public boolean isEmpty() {
		return _front.getNext().equals(_end);
	} //O(1)

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
	}//end toString()

	public T reta() {
		return _front.getNext().getValue();
	}

	//main method for testing
	public static void main( String[] args ) {


	Queue<String> PirateQueue = new RQueue<String>();

	System.out.println("\nnow enqueuing..."); 
	PirateQueue.enqueue("Dread");
	PirateQueue.enqueue("Pirate");
	PirateQueue.enqueue("Robert");
	PirateQueue.enqueue("Blackbeard");
	PirateQueue.enqueue("Peter");
	PirateQueue.enqueue("Stuyvesant");

	System.out.println("\nnow testing toString()..."); 
	System.out.println( PirateQueue ); //for testing toString()...

	System.out.printnl("\nnow dequeuing..."); 
	System.out.println( PirateQueue.dequeue() );
	System.out.println(PirateQueue.reta());
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );

	System.out.println("\nnow dequeuing fr empty queue..."); 
	System.out.println( PirateQueue.dequeue() );

	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
	^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

	}//end main

}//end class RQueue
