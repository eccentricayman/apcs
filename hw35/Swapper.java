/*
Ayman Ahmed
APCS1 pd5
HW#35 -- Put it Together
2015-11-20
*/

import cs1.Keyboard;

public class Swapper {

    public static void print1( String[][] a ) { //HELPER FROM LAST HW
    	String retstr = "";
		for (int x = 0 ; x < a.length ; x++) {
			for (int y = 0 ; y < a[x].length ; y++) {
				retstr += a[x][y] + " ";
			}
			retstr += "\n";
		}
		System.out.println(retstr);
    }

    public static void main(String[] args) {
    	System.out.println("Creating array...");

        String[][] swaparray = new String[][] {
        	{"WHAT", "IS", "UP", "MY", "DUDE"},
        	{"YOU", "CAN", "SWAP", "THIS"},
        	{"AND", "THAT", "AS", "WELL"},
        	{"SO", "COOL", "TRY", "IT"}
        };

        print1(swaparray);
        System.out.println("The location must be in the format of row-column.");
        System.out.print("First position: ");
        String swap1 = Keyboard.readString();
        System.out.print("Second position: ");
        String swap2 = Keyboard.readString();
        int ii = 1;  //used as an alternative to break the for loop
        for (int i = 0 ; ii > 0; i ++) {
	        if (swap1.length() == 3 & swap1.substring(1,2).equals("-") & swap2.length() == 3 & swap2.substring(1,2).equals("-")) {
		        int rowpos1 = Integer.parseInt(swap1.substring(0, 1));
		        int colpos1 = Integer.parseInt(swap1.substring(swap1.length() - 1));
		        int rowpos2 = Integer.parseInt(swap2.substring(0, 1));
		        int colpos2 = Integer.parseInt(swap2.substring(swap2.length() - 1));
	        	String savedswapval = swaparray[rowpos2][colpos2];
	        	swaparray[rowpos2][colpos2] = swaparray[rowpos1][colpos1];
	        	swaparray[rowpos1][colpos1] = savedswapval;
	        	print1(swaparray);
	        	ii = 0;
	        }
	        else {
	        	System.out.println("Your format was incorrect, try again.\n");
	        	System.out.println("The location must be in the format of row-column.");
		        System.out.print("First position: ");
		        swap1 = Keyboard.readString();
		        System.out.println(swap1.substring(1,2));
		        System.out.print("Second position: ");
		        swap2 = Keyboard.readString();
		        System.out.println(swap2.substring(1,2));
	        }
    	}
    }

}