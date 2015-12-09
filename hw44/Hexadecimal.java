/*
Team -- Ayman Ahmed and Calvin Vuong
APCS1 pd5
HW44 -- This or That or Fourteen Other Things
2015-12-09
*/

public class Hexadecimal {

    private int _decNum;
    private String _hexNum;

    /*=====================================
      default constructor
      pre:  n/a
      post: initializes _decNum to 0, _hexNum to "0"
      =====================================*/
    public Binary() {
    	_decNum = 0;
    	_hexNum = "0";
    }

    /*=====================================
      overloaded constructor
      pre:  n >= 0
      post: sets _decNum to n, _hexNum to equiv string of hexadecimals
      =====================================*/
    public Binary( int n ) {
    	_decNum = n;
    	_hexNum = decToHex(n);
    }

    /*=====================================
      overloaded constructor
      pre:  s is String representing non-negative hexadecimal
      post: sets _hexNum to input, _decNum to decimal equiv
      =====================================*/
    public Binary( String s ) {
    	_decNum = hexToDec(s); //used because 
		_hexNum = s;    	
    }

    /*=====================================
      String toString() -- returns String representation of this Object
      pre:  n/a
      post: returns hexadecimal representation of this Object
      =====================================*/
    public String toString() {
		return _hexNum;
    }

    /*=====================================
      String decToHex(int) -- converts base-10 input to a hexadecimal
      pre:  n >= 0
      post: returns String in hexadecimal form
      eg  decToHex(0) -> "0"
      decToHex(1) -> "1"
      decToHex(2) -> "2"
      decToHex(3) -> "3"
      decToHex(14) -> "E"
      =====================================*/
    public static String decToHex( int n ) {
    	String ret = "";
    	//algo discussed in class
    	while (n != 0) {
    		ret = (n % 2) + ret;
    		n /= 2; 
    	}
    	return ret;
    }

    /*=====================================
      String decToHexR(int) -- converts base-10 input to a hexadecimal, recursively
      pre:  n >= 0
      post: returns String in hexadecimal form
      eg  decToHexR(0) -> "0"
      decToHexR(1) -> "1"
      decToHexR(2) -> "2"
      decToHexR(3) -> "3"
      decToHexR(14) -> "E"
      =====================================*/

    public static String decToHexR( int n ) {
      if (n == 0){ //recursive case
        return "";
      }
      else{ //recursive case
        return decToHexR(n / 2) + (n % 2);
      }
    }

    /*=====================================
      String hexToDec(String) -- converts hexadecimal input into base-10
      pre:  s represents non-negative hexadecimal
      post: returns int equivalent in base-10
      eg  
      hexToDec("0") -> 0
      hexToDec("1") -> 1
      hexToDec("2") -> 2
      hexToDec("3") -> 3
      hexToDec("E") -> 14
      =====================================*/
    public static int hexToDec( String s ) {
    	int retInt = 0;
    	for (int i = 0 ; i < s.length() ; i++) {
    		retInt += Integer.parseInt(s.substring(i, i + 1)) * Math.pow(2, s.length() - i - 1);
    	}
    	return retInt;  
    }

    /*=====================================
      String hexToDecR(String) -- converts hexadecimal input into base-10, recursively
      pre:  s represents non-negative binary number
      post: returns int equivalent in base-10
      eg  
      hexToDecR("0") -> 0
      hexToDecR("1") -> 1
      hexToDecR("2") -> 2
      hexToDecR("3") -> 3
      hexToDecR("E") -> 14
      =====================================*/
    public static int hexToDecR(String s) {
    	if (s.length() == 0) {
    		return 0;
    	}
    	else {
			return Integer.parseInt(s.substring(0,1)) * (int)Math.pow(2, s.length() - 1) //value of this digit
			+ hexToDecR(s.substring(1)); //value of rest of digits
    	}
    }

    /*=============================================
      boolean equals(Object) -- tells whether 2 Objs are equivalent
      pre:  other is an instance of class Binary
      post: Returns true if this and other are aliases (pointers to same 
      Object), or if this and other represent equal binary values
      =============================================*/
    public boolean equals( Object other ) {
    	Binary otherbin = (Binary)(other);
    	return (this.compareTo(otherbin) == 0);
    }

    /*=============================================
      int compareTo(Object) -- tells which of two Binary objects is greater
      pre:  other is instance of class Binary
      post: Returns 0 if this Object is equal to the input Object,
      negative integer if this<input, positive integer otherwise
      =============================================*/
    public int compareTo( Object other ) {
    	Binary otherbin = (Binary)(other);
    	return this._decNum - otherbin._decNum;
    }

    //main method for testing
    public static void main( String[] args ) {

	System.out.println();
	System.out.println( "Testing ..." );

	Binary b1 = new Binary(5);
	Binary b2 = new Binary(5);
	Binary b3 = b1;
	Binary b4 = new Binary(7);

	System.out.println( b1 );
	System.out.println( b2 );
	System.out.println( b3 );       
	System.out.println( b4 );       

	System.out.println( "\n==..." );
	System.out.println( b1 == b2 ); //should be false
	System.out.println( b1 == b3 ); //should be true

	System.out.println( "\n.equals()..." );
	System.out.println( b1.equals(b2) ); //should be true
	System.out.println( b1.equals(b3) ); //should be true
	System.out.println( b3.equals(b1) ); //should be true
	System.out.println( b4.equals(b2) ); //should be false
	System.out.println( b1.equals(b4) ); //should be false

	System.out.println( "\n.compareTo..." );
	System.out.println( b1.compareTo(b2) ); //should be 0
	System.out.println( b1.compareTo(b3) ); //should be 0
	System.out.println( b1.compareTo(b4) ); //should be neg
	System.out.println( b4.compareTo(b1) ); //should be pos

    }//end main()

} //end class
