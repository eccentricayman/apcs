/*
Team HexaBinary -- Ayman Ahmed and Calvin Vuong
APCS1 pd5
HW44 -- This or That or Fourteen Other Things
2015-12-09
*/

public class Hexadecimal {
	
	private final static String HEXDIGITS = "0123456789ABCDEF";
	private int _decNum;
	private String _hexNum;
	
	/*=====================================
	default constructor
	pre:  n/a
	post: initializes _decNum to 0, _hexNum to "0"
	=====================================*/
	public Hexadecimal() {
		_decNum = 0;
		_hexNum = "0";
	}
	
	/*=====================================
	overloaded constructor
	pre:  n >= 0
	post: sets _decNum to n, _hexNum to equiv string of hexadecimals
	=====================================*/
	public Hexadecimal( int n ) {
		_decNum = n;
		_hexNum = decToHex(n);
	}
	
	/*=====================================
	overloaded constructor
	pre:  s is String representing non-negative hexadecimal
	post: sets _hexNum to input, _decNum to decimal equiv
	=====================================*/
	public Hexadecimal( String s ) {
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
		String retstr = "";
		//uses algo discussed in class
		while (n != 0) {
			int remainder = n % 16;
			String hexDigit = HEXDIGITS.substring(remainder, remainder+1); //hex equivalent to remainder
			retstr = hexDigit + retstr; //add hexDigit to beginning of hex string
			n = n / 16; //repeat process but with quotient
		}
		return retstr;
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
		if (n == 0){ //base case
			return "";
		}
		else{ //recursive case
			int remainder = n % 16;
			String hexDigit = HEXDIGITS.substring(remainder, remainder+1); //hex equivalent to remainder
			return decToHexR((n / 16)) + hexDigit; //add this hex digit to end of conversion of quotient
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
		for (int i = 0 ; i < s.length() ; i++) { //iterate left to right
			String hexDigit = s.substring(i, i + 1); //digit currently iterating over
			int hexValue = HEXDIGITS.indexOf(hexDigit); //value of hexDigit in base10
			retInt += hexValue * Math.pow(16, s.length()-1 - i);
		}
		return retInt;
	}
	
	/*=====================================
	String hexToDecR(String) -- converts hexadecimal input into base-10, recursively
	pre:  s represents non-negative Hexadecimal number
	post: returns int equivalent in base-10
	eg
	hexToDecR("0") -> 0
	hexToDecR("1") -> 1
	hexToDecR("2") -> 2
	hexToDecR("3") -> 3
	hexToDecR("E") -> 14
	=====================================*/
	public static int hexToDecR(String s) {
		if (s.length() == 0){ //base case
			return 0;
		}
		else{ //recursive case
			String hexDigit = s.substring(0,1); //first hex digit
			//val of digit
			int hexInBase10 = HEXDIGITS.indexOf(hexDigit)
			* (int) Math.pow(16, s.length()-1);
			//return value of this digit plus value of other digits
			return hexInBase10 + hexToDecR(s.substring(1));
		}
	}
	
	/*=============================================
	boolean equals(Object) -- tells whether 2 Objs are equivalent
	pre:  other is an instance of class Hexadecimal
	post: Returns true if this and other are aliases (pointers to same
	Object), or if this and other represent equal Hexadecimal values
	=============================================*/
	public boolean equals( Object other ) {
		if (!(other instanceof Hexadecimal)){ //if not same class, throw exception
			throw new ClassCastException("\nYou can only compare two Hexadecimal classes.");
		}
		Hexadecimal otherhex = (Hexadecimal)(other); //type cast to access specific methods
		return (this.compareTo(otherhex) == 0);
	}
	
	/*=============================================
	int compareTo(Object) -- tells which of two Hexadecimal objects is greater
	pre:  other is instance of class Hexadecimal
	post: Returns 0 if this Object is equal to the input Object,
	negative integer if this<input, positive integer otherwise
	=============================================*/
	public int compareTo( Object other ) {
		if (!(other instanceof Hexadecimal)){ //if not same class, throw exception
			throw new ClassCastException("\nYou can only compare two Hexadecimal classes.");
		}
		Hexadecimal otherhex = (Hexadecimal)(other); //typecast to access specific vars
		return this._decNum - otherhex._decNum;
	}
	
	//main method for testing
	public static void main( String[] args ) {
		
		System.out.println();
		System.out.println( "Testing ..." );
		
		Hexadecimal h1 = new Hexadecimal(23);
		Hexadecimal h2 = new Hexadecimal("17");
		Hexadecimal h3 = h1;
		Hexadecimal h4 = new Hexadecimal(100);
		
		System.out.println( h1 );
		System.out.println( h2 );
		System.out.println( h3 );
		System.out.println( h4 );
		
		System.out.println( "\n==..." );
		System.out.println( h1 == h2 ); //should be false
		System.out.println( h1 == h3 ); //should be true
		
		System.out.println( "\n.equals()..." );
		System.out.println( h1.equals(h2) ); //should be true
		System.out.println( h1.equals(h3) ); //should be true
		System.out.println( h3.equals(h1) ); //should be true
		System.out.println( h4.equals(h2) ); //should be false
		System.out.println( h1.equals(h4) ); //should be false
		
		System.out.println( "\n.compareTo..." );
		System.out.println( h1.compareTo(h2) ); //should be 0
		System.out.println( h1.compareTo(h3) ); //should be 0
		System.out.println( h1.compareTo(h4) ); //should be neg
		System.out.println( h4.compareTo(h1) ); //should be pos
		
		System.out.println("\nTesting Recursive Methods...");
		System.out.println( Hexadecimal.decToHexR(100) ); //64
		System.out.println( Hexadecimal.hexToDecR("64") ); //100
		
		System.out.println("\nTesting error throw...");
		System.out.println(h1.equals(new String("hi"))); //should throw error
		
		
	}//end main()
	
} //end class
