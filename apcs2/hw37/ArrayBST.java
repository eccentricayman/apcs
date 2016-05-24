/*
  Ayman Ahmed
  APCS2 pd5
  HW#37 -- Algorithm as Data Structure
  2016-05-11
*/

public class ArrayBST {

    private int[] tree;

    public ArrayBST(int height) {
        //maximum possible amount of nodes (idk why pow requires typecasting for ints)
        tree = new int[(int)(Math.pow(2, height)) - 1];
        for (int i = 0 ; i < tree.length ; i++) {
            tree[i] = -1;
        }
    }
    
    public static boolean isFull(int[] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == -1) {
                return true;
            }
        }
        return false;
    }

    public void insert(int newVal) {
        int index = 0;
        boolean added = false;
        while (!added) {
            if (tree[index] == -1) {
                tree[index] = newVal;
                added = true;
            }
            if (tree[index] == newVal) {
                added = true;
            }
            else if (tree[index] > newVal) {
                if (index == 0) {
                    index = 1;
                }
                else {
                    index *= 2;
                }
            }
            else {
                if (index == 0) {
                    index = 2;
                }
                else {
                    index = (index * 2) + 1;
                }
            }
                                         
        }
    }
   

    public void preOrderTrav() {
        preOrderTravH(0);
    }

    private void preOrderTravH(int index) {
        if (index < tree.length && tree[index] != -1) {
            if (index == 0) {
                System.out.println(tree[index]);
                preOrderTravH(1);
                preOrderTravH(2);
            }
            else {
                System.out.println(tree[index]);
                preOrderTravH(index * 2);
                preOrderTravH((index * 2) + 1);
            }
        }
    }

    public void inOrderTrav() {
        inOrderTravH(0);
    }

    private void inOrderTravH(int index) {
        if (index < tree.length && tree[index] != -1) {
            if (index == 0) {
                inOrderTravH(1);
                System.out.println(tree[index]);
                inOrderTravH(2);
            }
            else {
                inOrderTravH(index * 2);
                System.out.println(tree[index]);
                inOrderTravH((index * 2) + 1);
            }
        }
    }

    public void postOrderTrav() {
        postOrderTravH(0);
    }

    private void postOrderTravH(int index) {
        if (index < tree.length && tree[index] != -1) {
            if (index == 0) {
                postOrderTravH(1);
                postOrderTravH(2);
                System.out.println(tree[index]);

            }
            else {
            postOrderTravH(index * 2);
            postOrderTravH((index * 2) + 1);
            System.out.println(tree[index]);
            }
        }
    }

    public static void main(String[] args) {
        
        ArrayBST arbol = new ArrayBST(6);

        arbol.insert( 4 );
        arbol.insert( 2 );
        arbol.insert( 5 );
        arbol.insert( 6 );
        arbol.insert( 1 );
        arbol.insert( 3 );

        System.out.println( "\npre-order traversal:" );
        arbol.preOrderTrav();

        System.out.println( "\nin-order traversal:" );
        arbol.inOrderTrav();
	
        System.out.println( "\npost-order traversal:" );
        arbol.postOrderTrav();	
        /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }

}
