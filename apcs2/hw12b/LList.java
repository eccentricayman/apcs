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

	public LList(String x) {
		beginning = new LLNode(x);
		end = null;
        beginning.setNext(end);
        nodecount = 1;
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
        return true;
	}

	public String get(int i) {
        LLNode current = beginning;
		for (int j = 0 ; j < i ; j++) {
            if (current.getNext() == null) {
                break;
            }
            current = current.getNext();
		}
        return current.get();
	}

    public String set(int i, String x) {
        String tmp = get(i);
        LLNode current = beginning;
        for (int j = 0 ; j < i ; j++) {
            if (current.getNext() == null) {
                break;
            }
            current = current.getNext();
        }
        current.set(x);
        return tmp;
    }

    public static void main(String[] args) {
        LList x = new LList("Barnie");
        System.out.println(x.get(0));
        System.out.println(x.add("Arnold"));
        System.out.println(x.set(0,"Tarah"));
        System.out.println(x.get(0));
        System.out.println(x.get(1));
        System.out.println(x.size());   
    }
    
}
