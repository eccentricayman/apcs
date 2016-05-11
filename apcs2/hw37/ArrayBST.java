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
        if (!isFull(tree)) {
            int root = 0;
            while (root != -1) {
                if (tree[root] == -1) {
                    tree[root] = newVal;
                    root = -1;
                }
                else if (newVal >= tree[root]) {
                    root *= 2;
                    root++;
                }
                else if (newVal < tree[root]) {
                    root *= 2;
                }
                else {
                    root = -1;
                }
            }
        }
        else {
            System.out.println("Tree is full.");
        }
    }

    public void preOrderTrav() {
        
    }

}
