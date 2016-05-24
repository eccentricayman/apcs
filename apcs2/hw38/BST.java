/*
  Ayman Ahmed
  APCS2 pd5
  HW#38 -- Neighbourhood Search & Rescue
  2016-05-12
*/

public class BST {

    //instance variables / attributes of a BST:
    private TreeNode root;

    /*****************************************************
     * default constructor
     *****************************************************/
    BST( ) {
        /*** YOUR IMPLEMENTATION HERE ***/
        root = null;
    }


    /*****************************************************
     * void insert( int ) 
     * Adds a new data element to the tree at appropriate location.
     *****************************************************/
    public void insert( int newVal ) {
     	/*** YOUR IMPLEMENTATION HERE ***/
        root = insertH(root, newVal);
    }

    public TreeNode insertH(TreeNode current, int newVal) {
        if (current == null) {
            return new TreeNode(newVal);
        }
        if (current.getValue() < newVal) {
            current.setLeft(insertH(current.getLeft(), newVal));
        }
        else if (current.getValue() > newVal) {
            current.setRight(insertH(current.getRight(), newVal));
        }
        return current;
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

    // each traversal should simply print to standard out 
    // the nodes visited, in order

    public void preOrderTrav() 
    {
        /*** YOUR IMPLEMENTATION HERE ***/
        preOrderTravH(root);
    }

    public void preOrderTravH(TreeNode start) {
        if (start != null) {
            System.out.println(start.getValue());
            preOrderTravH(start.getLeft());
            preOrderTravH(start.getRight());
        }
    }

    public void inOrderTrav() 
    {
        /*** YOUR IMPLEMENTATION HERE ***/
        inordertravH(root);
    }

    public void inordertravH(TreeNode start) {
        if (start != null) {
            inordertravH(start.getLeft());
            System.out.println(start.getValue());
            inordertravH(start.getRight());
        }
    }

    public void postOrderTrav() 
    {
        /*** YOUR IMPLEMENTATION HERE ***/
        postOrderTravH(root);
    }

    public void postOrderTravH(TreeNode start) {
        if (start != null) {
            postOrderTravH(start.getLeft());
            postOrderTravH(start.getRight());
            System.out.println(start.getValue());
        }
    }

    public int height() {
        return heightH(root);
    }

    private int heightH(TreeNode start) {
        if (start == null) {
            return 0;
        }
        else if (start.getLeft() == null && start.getRight() == null) {
            return 1;
        }
        else {
            return 1 + Math.max(heightH(start.getLeft()), heightH(start.getRight()));
        }
    }

    public int numLeaves() {
        return numLeavesH(root);
    }

    private int numLeavesH(TreeNode start) {
        if (start == null) {
            return 0;
        }
        else if (start.getLeft() == null && start.getRight() == null) {
            return 1;
        }
        else {
            return 1 + numLeavesH(start.getLeft()) + numLeavesH(start.getRight());
        }
    }

    public TreeNode search(int value) {
        TreeNode current = root;
        while (current != null) {
            if (current.getValue() == value) {
                return current;
            }
            else if (current.getValue() > value) {
                current = current.getLeft();
            }
            else {
                current = current.getRight();
            }
        }
        return null;
    }

    //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    //main method for testing
    public static void main( String[] args ) {

        BST arbol = new BST();

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

        System.out.println("\nHeight: ");
        System.out.println(arbol.height());

        System.out.println("\nnumLeaves: ");
        System.out.println(arbol.numLeaves());

        System.out.println("\nSearch: ");
        System.out.println(arbol.search(4));
        /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class
