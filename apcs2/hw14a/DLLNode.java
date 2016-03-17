/*
Team Unlnkd -- Ayman Ahmed and Jessica Yang
APCS2 pd5
HW#14 -- On the DLL
2016-03-16
*/

public class DLLNode {

    //data in this node
	private String data;
	//next element
	private DLLNode nextNode;
    //previous element
    private DLLNode prevNode;

    public DLLNode(String x, DLLNode nxt, DLLNode prv) {
    	this.data = x;
    	this.nextNode = nxt;
        this.prevNode = prv;
    }

    public String get() {
    	return this.data;
    }

    public boolean set(String y) {
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
