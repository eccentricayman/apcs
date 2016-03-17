/*
  Team Unlnkd -- Ayman Ahmed and Jessica Yang
  APCS2 pd5
  HW#14 -- On the DLL
  2016-03-16
*/

public class DLList implements List {

	private DLLNode beginning;
	private int nodecount;

	public DLList() {
		beginning = null;
		nodecount = 0;
	}

	public int size() {
		return nodecount;
	}

	public boolean add(String x) {
		DLLNode temp = new DLLNode(x, beginning, null);
        beginning = temp;
        nodecount++;
        return true;
	}

	public String get(int i) {
		if (i < 0 || i >= size()) {
			throw new IndexOutOfBoundsException();
		}
        DLLNode current = beginning;
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
        DLLNode current = beginning;
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
        DLLNode toadd = new DLLNode(s, null, null);
        DLLNode current = beginning;
        if (i == 0) {
            add(s);
        }
        else {
            DLLNode temp = beginning;
            for (int j = 0 ; j < i - 1 ; j++) {
                temp = temp.getNext();
            }
            toadd.setNext(temp.getNext());
            temp.setNext(toadd);
            nodecount++;
        }
    }

    public String remove(int i) {
        DLLNode current = beginning;
        String temp = "";
        if (i == 0) {
            temp = beginning.get();
            beginning = beginning.getNext();
            nodecount--;
            return temp;
        }
        else {
            for (int j = 0 ; j < i - 1 ; j++) {
                current = current.getNext();
            }
            temp = current.getNext().get();
            //current.getPrev().setNext(current.getNext());
            current.setNext(current.getNext().getNext());
            nodecount--;
            return temp;
        }
    }

    public String toString() {
    	String retstr = "HEAD --> ";
    	DLLNode current = beginning;
        while (current != null) {
            retstr += current.get() + " --> ";
            current = current.getNext();
        }
        retstr += "NULL";
        return retstr;
    }

    public static void main(String[] args) {
        DLList james = new DLList();

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
