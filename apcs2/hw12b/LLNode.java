/*
  Ayman Ahmed
  APCS2 pd5
  HW#12 -- We Got a Big Ol' Convoy
  2016-03-14
*/

public class LLNode {
    
    //data in this node
	private String data;
	//next element
	private LLNode nextNode;

    public LLNode(String x) {
    	this.data = x;
    	this.nextNode = null;
    }

    public String get() {
    	return this.data;
    }

    public boolean set(String y) {
    	this.data = y;
    }

    public LLNode getNext() {
    	return this.nextNode;
    }

    //used to link to another node
    public boolean setNext(LLNode z) {
    	this.nextNode = z;
    }

}
