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
        TreeNode toInsert = new TreeNode(newVal);
        TreeNode current = root;
        if (current == null) {
            current = toInsert;
        }
        else {
            while (true) {
                if (newVal < current.getValue()) {
                    if (current.getLeft() == null) {
                        current.setLeft(toInsert);
                        return;
                    }
                }
                else {
                    current = current.getLeft();
                }
                //greater than and equals to
                if (newVal > current.getValue()){
                    if (current.getRight() == null) {
                        current.setRight(toInsert);
                        return;
                    }
                }
                else {
                    current = current.getRight();
                }
            }
        }
    }


    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

    // each traversal should simply print to standard out 
    // the nodes visited, in order

    public void preOrderTrav() 
    {
        /*** YOUR IMPLEMENTATION HERE ***/
        TreeNode current = root;
        if (current != null) {
            System.out.println(current.getValue());
            preOrderTravH(current.getLeft());
            preOrderTravH(current.getRight());
        }
    }

    public void preOrderTravH(TreeNode start) {
        TreeNode current = start;
        if (current != null) {
            System.out.println(current.getValue());
            preOrderTravH(current.getLeft());
            preOrderTravH(current.getRight());
        }
    }

    public void inOrderTrav() 
    {
        /*** YOUR IMPLEMENTATION HERE ***/
    }

    public void postOrderTrav() 
    {
        /*** YOUR IMPLEMENTATION HERE ***/
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

        /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
          System.out.println( "\nin-order traversal:" );
          arbol.inOrderTrav();
	
          System.out.println( "\npost-order traversal:" );
          arbol.postOrderTrav();	
          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class





    
