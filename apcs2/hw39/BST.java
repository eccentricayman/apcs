/*
Ayman Ahmed
APCS2 pd5
HW#39 -- Neighbourhood Disposal
2016-05-17
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

    public void remove(int value) {
        removeH(value, root);
    }

    private void removeH(int value, TreeNode start) {
        if (start.getValue() == value) {
            //value found
            //both empty
            if (start.getLeft() == null && start.getRight() == null) {
                start = null;
                return;
            }
            //neither null
            else if (start.getLeft() != null && start.getRight() != null) {
                TreeNode toreplace = minVal(start);
                int temp = toreplace.getValue();
                toreplace.setValue(start.getValue());
                start.setValue(temp);
                return;
            }
            //one is null
            else {
                TreeNode temp = parent(start);
                if (start.getLeft() == null) {
                    if (temp.getLeft() == null) {
                        temp.setRight(start.getRight());
                    }
                    else {
                        temp.setLeft(start.getRight());
                    }
                }
                else {
                    if (temp.getLeft() == null) {
                        temp.setRight(start.getLeft());
                    }
                    else {
                        temp.setRight(start.getLeft());
                    }
                }
            }
        }
        else if (start != null) {
            //recurse left or right
            if (start.getValue() > value) {
                removeH(value, start.getLeft());
            }
            else {
                removeH(value, start.getRight());
            }
        }
        else {
            //start is null, value not found
            return;
        }
    }

    private TreeNode minVal(TreeNode start) {
        TreeNode current = start;
        while (current.getLeft() != null) {
            current = current.getLeft();
        }
        return current;
    }

    private TreeNode parent(TreeNode target) {
        TreeNode current = root;
        if (current.getLeft().equals(target) || current.getRight().equals(target)) {
            return current;
        }
        else {
            if (target.getValue() > current.getValue()) {
                return parent(current.getRight());
            }
            else {
                return parent(current.getLeft());
            }
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

        System.out.println("\nHeight: ");
        System.out.println(arbol.height());

        System.out.println("\nnumLeaves: ");
        System.out.println(arbol.numLeaves());

        System.out.println("\nSearch: ");
        System.out.println(arbol.search(4));
        System.out.println("\n removing 4 and searching for it again(should be in different spot): ");
        arbol.remove(4);
        System.out.println(arbol.search(4));
        /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class
