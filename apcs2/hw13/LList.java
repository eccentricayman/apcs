/*
  Ayman Ahmed
  APCS2 pd5
  HW#13 -- LoList, LoLit
  2016-03-15
*/

public class LList implements List {

	private LLNode beginning;
	private int nodecount;

	public LList() {
		beginning = null;
		nodecount = 0;
	}

	public int size() {
		return nodecount;
	}

	public boolean add(String x) {
		LLNode temp = new LLNode(x);
    temp.setNext(beginning);
		beginning = temp;
		nodecount++;
        return true;
	}

	public String get(int i) {
		if (i < 0 || i >= size()) {
			throw new IndexOutOfBoundsException();
		}
        LLNode current = beginning;
		for (int j = 0 ; j < i ; j++) {
            if (current.getNext() == null) {
                return new String();
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

    public void add(int i, String s) {
        LLNode toadd = new LLNode(s);
        LLNode current = beginning;
        int index = i - 1;
        for (int j = 0 ; j < size() ; j++) {
            if (j == index) {
                toadd.setNext(current.getNext());
                current.setNext(toadd);
            }
            current = current.getNext();
        }
        nodecount++;
    }

    public String remove(int i) {
        LLNode current = beginning;
        String temp = "";
        int ctr = 0;
		 while (current.getNext() != null) {
		 	if (ctr == i - 1) {
		 		temp = current.getNext().get();
		 		current.setNext(current.getNext().getNext());
		 		break;
		 	}
		 	ctr++;
		 }
		 return temp;
    }

    public String toString() {
    	String retstr = "[";
    	LLNode current = beginning;
    	while (current.getNext() != null) {
    		retstr += current.get() + ", ";
    		current = current.getNext();
    	}
    	retstr = retstr.substring(0, retstr.length() - 2) + "]";
    	return retstr;
    }

    public static void main(String[] args) {
        LList x = new LList();
        System.out.println(x.add("Arnold"));
        System.out.println(x.add("Barnie"));
        System.out.println(x.set(0,"Tarah"));
        System.out.println(x.get(0));
        System.out.println(x.size());
        System.out.println(x.get(1));
        x.add(1, "Billary");
        System.out.println(x);
        System.out.println(x.remove(0));
        System.out.println(x);
        /*
        */
    }

}
