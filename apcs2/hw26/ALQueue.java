/*
Team NullPointerException -- Ayman Ahmed and Adam McKoy
APCS2 pd5
HW#26 -- Nor Do Aussies
2016-04-04
*/

/*****************************************************
 * class ALQueue
 * uses an ArrayList to implement abstract data type QUEUE
 * (a collection with FIFO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 ******************************************************/

import java.util.ArrayList;


public class ALQueue<T> implements Queue<T> {

    private ArrayList<T> _queue;

    // default constructor
    public ALQueue() {

    }

    // means of adding an item to collection
    public void enqueue( T x ){

    } //O()



    // means of removing an item from collection
    public T dequeue() {

    } //O()



    // means of "peeking" at the front item
    public T peekFront() {

    } //O()

    // means of checking to see if collection is empty
    public boolean isEmpty() {

    } //O()

    public String toString() {

    }

    //main method for testing
    public static void main( String[] args ) {

	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
	Queue<String> ALBSure = new ALQueue<String>();

	System.out.println("\nnow enqueuing thrice...");
	ALBSure.enqueue("Al");
	ALBSure.enqueue("B.");
	ALBSure.enqueue("Sure!");

	System.out.println("\nnow testing toString()...");
	System.out.println( ALBSure ); //for testing toString()...

	System.out.println("\nnow dequeuing thrice...");
	System.out.println( ALBSure.dequeue() );
	System.out.println( ALBSure.dequeue() );
	System.out.println( ALBSure.dequeue() );

	System.out.println("\nDequeuing from empty queue should yield error...");
	System.out.println( ALBSure.dequeue() );
	  ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

    }//end main


}//end class ALQueue
