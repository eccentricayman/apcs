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
		for (int i = 0 ; i < DEFAULT_SIZE ; i++) {
			for (int j = 0 ; j < DEFAULT_SIZE ; j++) {
				matrix[i][j] = new Object();
			}
		}
    }


    //constructor intializes an a*a matrix
    public Matrix( int a ) {
		matrix = new Object[a][a];
		for (int i = 0 ; i < a ; i++) {
			for (int j = 0 ; j < a ; j++) {
				matrix[i][j] = new Object();
			}
		}
    }


    //return size of this matrix, where size is 1 dimension
    private int size() {
		return matrix.length;
    }


    //return the item at the specified row & column   
    private Object get( int r, int c ) {
		return matrix[r - 1][c - 1];
    }


    //return true if index of matrix is empty, false otherwise
    private boolean isEmpty(int r, int c) {
        if (matrix[r - 1][c - 1] != null) {
            return false;
        }
        else {
            return true;
        }
    }


    //overwrite item at specified row and column with newVal
    //return old value
    private Object set( int r, int c, Object newVal ) {
        if (matrix[r - 1][c - 1] != null) {
           Object temp = matrix[r - 1][c - 1]; 
           matrix[r - 1][c - 1] = newVal;
           return temp;
        }
        else {
            matrix[r - 1][c - 1] = newVal;
            //not the best practice
            return null;
        }
    }


    //return String representation of this matrix
    // (make it look like a matrix)
    //not properly working, only works on 2x2s
	public String toString() {
    	String retstr = "";   
    	String addto = "";
    	String seperator = "";
    	for (int i = 0; i < this.size(); i++) {
            for (Object[] j : matrix) {
               addto = "\t" + "|" + "\t" + j[i];
               retstr += addto;
            }
            retstr += "\t|";
            retstr += "\n";
            for (int k = 0 ; k <= addto.length() ; k++) {
            	seperator += "-";
            }
            retstr += "\t\t\t" + seperator + seperator + "\n";
        }
        retstr = "\t\t\t" + seperator + "\n" + retstr;
        //to bypass the weird length problem
        return retstr.substring(0, retstr.length() - seperator.length());
	}

    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    // and identical values in each slot
    public boolean equals( Object rightSide ) {
    	boolean allequal = true;
        for (int i = 1 ; i <= this.size() ; i++) {
        	for (int j = 1 ; j <= this.size() ; j++) {
        		if (this.get(i, j) != ((Matrix)(rightSide)).get(i, j) && this.size() == ((Matrix)(rightSide)).size()) {
        			allequal = false;
        		}
        	}
        }
        return allequal;
    }


    //swap two columns of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapColumns( int c1, int c2  ) {
        Object[] temp = matrix[c1 - 1];
        matrix[c1 -1] = matrix[c2 - 1];
        matrix[c2 - 1] = temp;
    }


    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapRows( int r1, int r2  ) {
        //using 1 and <= because starts at 1, 1
        for (int i = 1 ; i <= this.size() ; i++) {
            set(r1, i , set(r2, i, get(r1, i)));
        }
    }


    //main method for testing
    public static void main( String[] args ) {
        Matrix neo = new Matrix(2);
        Matrix morpheus = new Matrix(2);
        Matrix trinity = morpheus;
        System.out.println("Printing matrices...");
        System.out.println(neo);
        System.out.println(morpheus);
        System.out.println(trinity);
        System.out.println("Testing get, set, isEmpty, toString, and size...");
        System.out.println(neo.size());
        System.out.println(neo.toString());
        System.out.println(neo.get(1, 1));
        Object neoadd = new Integer((int)(Math.random() * 10));
        System.out.println(neo.set(1, 1, neoadd));
        System.out.println("After set...");
        System.out.println(neo.toString());
        System.out.println("Swapping rows....");
        System.out.println("Before swap...");
        System.out.println(morpheus);
        System.out.println(trinity);
        morpheus.swapRows(1 , 2);
        trinity.swapRows(1, 2);
        System.out.println("After swap...");
        System.out.println(morpheus);
        System.out.println(trinity);
        System.out.println("Swapping columns....");
        System.out.println("Before swap...");
        System.out.println(morpheus);
        System.out.println(trinity);
        morpheus.swapColumns(1 , 2);
        trinity.swapColumns(1, 2);
        System.out.println("After swap...");
        System.out.println(morpheus);
        System.out.println(trinity);
        System.out.println("Testing equals...");
        System.out.println(morpheus.equals(trinity));
    }

}//end class Matrix
