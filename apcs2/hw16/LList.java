/*
Ayman Ahmed
APCS2 pd5
HW#16 -- Generational Improvement
2016-03-19
*/

public class LList<T> implements List<T> {

	private LLNode<T> beginning;
	private int nodecount;

	public LList() {
		beginning = null;
		nodecount = 0;
	}

	public int size() {
		return nodecount;
	}

	public boolean add(T x) {
		LLNode<T> temp = new LLNode<T>(x, beginning, null);
        beginning = temp;
        nodecount++;
        return true;
	}

	public T get(int i) {
		if (i < 0 || i >= size()) {
			throw new IndexOutOfBoundsException();
		}
        LLNode<T> current = beginning;
		for (int j = 0 ; j < i ; j++) {
            if (current.getNext() == null) {
                return null;
            }
            current = current.getNext();
		}
        return current.get();
	}

    public T set(int i, T x) {
        LLNode<T> tmp = new LLNode<T>(x, null, null);
        LLNode<T> current = beginning;
        for (int j = 0 ; j < i ; j++) {
            if (current.getNext() == null) {
                break;
            }
            current = current.getNext();
        }
        T ret = current.get();
        current.set(x);
        return ret;
    }

    public void add(int i, T s) {
        LLNode<T> toadd = new LLNode<T>(s, null, null);
        LLNode<T> current = beginning;
        if (i == 0) {
            add(s);
        }
        else {
            LLNode<T> temp = beginning;
            for (int j = 0 ; j < i - 1 ; j++) {
                temp = temp.getNext();
            }
            toadd.setNext(temp.getNext());
            temp.setNext(toadd);
            nodecount++;
        }
    }

    public T remove(int i) {
        LLNode<T> current = beginning;
        T temp;
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
    	LLNode<T> current = beginning;
        while (current != null) {
            retstr += current.get() + " --> ";
            current = current.getNext();
        }
        retstr += "NULL";
        return retstr;
    }

    public static void main(String[] args) {
        LList james = new LList<String>();

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

