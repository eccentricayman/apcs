/*
Ayman Ahmed
APCS2 pd5
HW#27 -- BLEH
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
        LLNode<T> current = _front.getNext();
        while (!(current.getNext().equals(_end))) {
        	int rand = Math.random() * _size;
        	
        }
        return temp;
	}//end dequeue()

	public T peekFront() {

	}

	/******************************************
	 * void sample() -- a means of "shuffling" the queue
	 * Algo:
	 * ...
	 * 
	******************************************/
	public void sample () {

	}//end sample()

	public boolean isEmpty() {

	} //O(?)

	// print each node, separated by spaces
	public String toString() { 

	}//end toString()

	//main method for testing
	public static void main( String[] args ) {

	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

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

	System.out.println("\nnow dequeuing..."); 
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );

	System.out.println("\nnow dequeuing fr empty queue..."); 
	System.out.println( PirateQueue.dequeue() );

	^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

	}//end main

}//end class RQueue
