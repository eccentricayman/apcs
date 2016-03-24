/*
Ayman Ahmed
APCS2 pd5
HW#15 -- Generically Speaking...
2016-03-17
*/

public class LLNode<T> {

    //data in this node
	private T data;
	//next element
	private LLNode<T> nextNode;
    //previous element
    private LLNode<T> prevNode;

    public LLNode(T x, LLNode<T> nxt, LLNode<T> prv) {
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

    public LLNode<T> getNext() {
    	return this.nextNode;
    }

    public LLNode<T> getPrev() {
        return this.prevNode;
    }

    //used to link to another node
    public boolean setNext(LLNode<T> z) {
    	this.nextNode = z;
        return true;
    }

    public boolean setPrev(LLNode<T> X) {
        this.prevNode = X;
        return true;
    }

}

