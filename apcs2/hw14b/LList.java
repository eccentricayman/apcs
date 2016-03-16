/*
Ayman Ahmed
APCS2 pd5
HW#14 -- On the DLL
2016-03-16
*/

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
    	String retstr = "HEAD --> ";
    	LLNode current = beginning;
        while (current != null) {
            retstr += current.get() + " --> ";
            current = current.getNext();
        }
        retstr += "NULL";
        return retstr;
    }

    public static void main(String[] args) {
        LList james = new LList();

        System.out.println( james );
        System.out.println( "size: " + james.size() );

        james.add("beat");
        System.out.println( james );
        System.out.println( "size: " + james.size() );

        james.add("a");
        System.out.println( james );
        System.out.println( "size: " + james.size() );

        james.add("need");
        System.out.println( james );
        System.out.println( "size: " + james.size() );

        james.add("I");
        System.out.println( james );
        System.out.println( "size: " + james.size() );

        System.out.println( "2nd item is: " + james.get(1) );

        System.out.println( "...and now 2nd item is: " + james.set(1,"got") );
        System.out.println( james );

        james.add(0,"whut");
        System.out.println( "...after add(0,whut): " );
        System.out.println( james );

        james.add(4,"phat");
        System.out.println( "...after add(4,phat): " );
        System.out.println( james );

        System.out.println( "...after remove last: " 
                            + james.remove( james.size() - 1) );
        System.out.println( james );

        System.out.println( "...after remove(0): " + james.remove(0) );
        System.out.println( james );

        System.out.println( "...after remove(0): " + james.remove(0) );
        System.out.println( james );

        System.out.println( "...after remove(0): " + james.remove(0) );
        System.out.println( james );
    
        /*===========================
          ===========================*/
    }

}
