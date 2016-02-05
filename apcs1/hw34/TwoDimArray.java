/*
Ayman Ahmed
APCS1 pd5
HW#34 -- Arrays of Arrays
2015-19-11
*/

// class TwoDimArray
// ...practice working with 2D arrays


public class TwoDimArray {

    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOR loop
    public static void print1( int[][] a ) { 
    	String retstr = "";
		for (int x = 0 ; x < a.length ; x++) {
			for (int y = 0 ; y < a[x].length ; y++) {
				retstr += a[x][y] + " ";
			}
			retstr += "\n";
		}
		System.out.println(retstr);
    }

    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOREACH loop
    public static void print2( int[][] a ) { 
    	String retstr = "";
		for (int[] i : a) {
			for (int ret : i) {
				retstr += ret + " ";
			}
			retstr += "\n";
		}
		System.out.println(retstr);
    }

    //postcond: returns sum of all items in 2D int array a
    public static int sum1( int[][] a ) { 
		int sum = 0;
		for (int x = 0 ; x < a.length ; x++) {
			for (int y = 0 ; y < a[x].length ; y++) {
				sum += a[x][y];
			}
		}
		return sum;
    }

    //postcond: returns sum of all items in 2D int array a
    //          * uses helper fxn sumRow
    public static int sum2( int [][] m ) { 
		int sum = 0;
		for (int i = 0 ; i < m.length ; i++) {
			sum += sumRow(i, m);
		}
		return sum;
    }

    //postcond: returns sum of all items on row r of 2D integer array a
    //          uses a FOR loop
    public static int sumRow( int r, int[][] a ) { 
    	int sum = 0;
		for (int i = 0 ; i < a[r].length ; i++) {
			sum += a[r][i];
		}
		return sum;
    }

    //postcond: returns sum of all items on row r of 2D integer array a
    //          uses a FOREACH loop
    public static int sumRow2(int r, int[][] m){ 
    	int sum = 0;
    	for (int i : m[r]) {
			sum += i;
		}
		return sum;
    }

    public static void main(String [] args) {
		int [][] m1 = new int[4][2];
		int [][] m2 = { {2,4,6}, {3,5,7} };
		int [][] m3 = { {2}, {4,6}, {1,3,5} };
		print1(m1);
		print1(m2);
		print1(m3);
		print2(m1);
		print2(m2);
		print2(m3);
		System.out.print("testing sum1...\n");
		System.out.println("sum m1 : " + sum1(m1));
		System.out.println("sum m2 : " + sum1(m2));
		System.out.println("sum m3 : " + sum1(m3));
		System.out.print("testing sum2...\n");
		System.out.println("sum m1 : " + sum2(m1));
		System.out.println("sum m2 : " + sum2(m2));
		System.out.println("sum m3 : " + sum2(m3));
		System.out.print("testing sumRow2...\n");
		System.out.println("sum of row m1 : " + sumRow2(0, m1));
		System.out.println("sum of row m2 : " + sumRow2(1, m2));
		System.out.println("sum of row m3 : " + sumRow2(2, m3));
		/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class TwoDimArray
