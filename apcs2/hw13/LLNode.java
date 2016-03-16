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
        return true;
    }

    public LLNode getNext() {
    	return this.nextNode;
    }

    //used to link to another node
    public boolean setNext(LLNode z) {
    	this.nextNode = z;
        return true;
    }

}
