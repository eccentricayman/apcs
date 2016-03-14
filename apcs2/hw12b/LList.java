/*
Ayman Ahmed
APCS2 pd5
HW#12 -- Truckin' Through the Night
2016-03-14
*/

public class LList implements List {

	private LLNode beginning;
	private LLNode end;
	private int nodecount;

	public LList() {
		beginning = null;
		end = null;
	}

	public int size() {
		return nodecount;
	}

	public boolean add(String x) {
		LLNode temp = new LLNode(x);
		LLNode current = beginning;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		nodecount++;
	}
	
	public String get(int i) {
		for (int j = nodecount ; j > i ; j--) {
			
		}
	}
}