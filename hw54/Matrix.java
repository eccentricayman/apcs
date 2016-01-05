/*
  Ayman Ahmed
  APCS1 pd5
  HW54 --
  2016-5-1
*/

/*====================================
  class Matrix -- models a square matrix
  
  TASK: Implement methods below.
  Categorize runtime of each. 
  Test in your main method.
  ====================================*/ 

public class Matrix {

    //constant for default matrix size
    private final static int DEFAULT_SIZE = 2;

    private Object[][] matrix;


    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
    public Matrix() {
		matrix = new Object[DEFAULT_SIZE][DEFAULT_SIZE];
    }


    //constructor intializes an a*a matrix
    public Matrix( int a ) {
		matrix = new Object[a][a];
    }


    //return size of this matrix, where size is 1 dimension
    private int size() {
		return matrix.length;
    }


    //return the item at the specified row & column   
    private Object get( int r, int c ) {
		return matrix[r][c];
    }


    //return true if this matrix is empty, false otherwise
    private boolean isEmpty( int r, int c ) {
		if (matrix[r][c] instanceof Object) {
			return true;
		}
		else {
			return false;
		}
    }


    //overwrite item at specified row and column with newVal
    //return old value
    private Object set( int r, int c, Object newVal ) {
		matrix[r][c] = newVal;
    }


    //return String representation of this matrix
    // (make it look like a matrix)
    public String toString() {
		
    }


    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    // and identical values in each slot
    public boolean equals( Object rightSide ) {

    }


    //swap two columns of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapColumns( int c1, int c2  ) {

    }


    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapRows( int r1, int r2  ) {

    }


    //main method for testing
    public static void main( String[] args ) {

    }

}//end class Matrix
