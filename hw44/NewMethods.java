//NEWSHIT:YUS

//decimal to hexadecima
public static String decToHex( int n ) {
	String retstr = "";
	//uses algo discussed in class
	while (n != 0) {
		int remainder = n % 16;
		int hexDigit = HEXDIGITS.substring(remainder, remainder+1); //hex equivalent to remainder
		retstr = hexDigit + retstr; //add hexDigit to beginning of hex string
		n = n / 16; //repeat process but with quotient
	}
	return retstr;
}

public static String decToHexR( int n){
	if (n == 0){ //base case
		return 0;
	}
	else{ //recursive case
		int remainder = n % 16;
		int hexDigit = HEXDIGITS.substring(remainder, remainder+1); //hex equivalent to remainder
		return decToHexR((n / 16)) + hexDigit; //add this hex digit to end of conversion of quotient
	}
}


//hexadecimal to decimal
public static int hexToDec( String s ) {
	int retInt = 0;
	for (int i = 0 ; i < s.length() ; i++) { //iterate left to right
        String hexDigit = s.substring(i, i + 1); //digit currently iterating over
        int hexValue = HEXDIGITS.indexOf(hexDigit); //value of hexDigit in base10 
        retInt += hexValue * Math.pow(16, s.length()-1 - i);
    }
    return retInt;
}   

public static int hexToDecR( String s ){
	if (s.length() == 0){ //base case
		return 0;
	}
	else{ //recursive case
		int hexDigit = s.substring(0,1); //first hex digit
		//val of digit
		int hexInBase10 = Integer.parseInt(HEXDIGITS.indexOf(hexDigit))
		* (int) Math.pow(16, s.length()-1);
		
		//return value of this digit plus value of other digits
		return hexInBase10 + hexToDecR(s.substring(1));
}
/* 

USE THESE AS CLASSCAST ERROR STRINGS THEYRE HILAROUS

http://rymden.nu/exceptions.html

You need to stay in the class or caste you were born into. 
Java will not accept dailits acting as kshatriyas or noblemen pretending to be working class. 
Note the spelling mistake (of caste) that was introduced in Java 1.0 and has not been corrected 
for backwards compatability reasons.

*/