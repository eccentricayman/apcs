/*
Ayman Ahmed
APCS2 pd5
HW#15 -- Generically Speaking...
2016-03-17
*/

public class DLLNode<T> {

    //data in this node
	private T data;
	//next element
	private DLLNode nextNode;
    //previous element
    private DLLNode prevNode;

    public DLLNode(T x, DLLNode nxt, DLLNode prv) {
    	this.data = x;
    	this.nextNode = nxt;
        this.prevNode = prv;
    }

    public T get() {
    	return this.data;
    }

    public boolean set(T y) {
    	this.data = y;
        return true;
    }

    public DLLNode getNext() {
    	return this.nextNode;
    }

    public DLLNode getPrev() {
        return this.prevNode;
    }

    //used to link to another node
    public boolean setNext(DLLNode z) {
    	this.nextNode = z;
        return true;
    }

    public boolean setPrev(DLLNode X) {
        this.prevNode = X;
        return true;
    }

}

