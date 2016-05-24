/*
Ayman Ahmed
APCS2 pd5
HW#36 -- Algorithm as Data Structure
2016-05-09
*/

/*****************************************************
 * class BST - skeleton
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT) 
 * A BST maintains the invariant that, for any node N with value V, 
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value, 
 *  and any value in its right subtree must be greater.)
 * This BST only holds ints (its nodes have int cargo)
 *****************************************************/

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
          /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class
