/*****************************************************
 * skeleton for class LatKtS (LatKeysToSuccess)
 * Driver class for Latkes.
 * Uses a stack to reverse a text string, check for sets of matching parens.
 *****************************************************/


public class LatKtS 
{

    /**********************************************************
     * precondition:  input string has length > 0
     * postcondition: returns reversed string s
     *                flip("desserts") -> "stressed"
     **********************************************************/
    public static String flip( String s ) 
    { 
        String returnu = "";
        Latkes stringstacku = new Latkes(s.length());
        for (int i = 0 ; i < s.length() ; i++) {
            stringstacku.push(s.substring(i, i++));
        }
        while (!(stringstacku.isEmpty())) {
            returnu += stringstacku.pop();
        }
        return returnu;
    }//end flip()


    /**********************************************************
     * precondition:  s contains only the characters {,},(,),[,]
     * postcondition: allMatched( "({}[()])" )    -> true
     *                allMatched( "([)]" )        -> false
     *                allMatched( "" )            -> true
     **********************************************************/
    public static boolean allMatched( String s ) 
    { 
        
    }//end allMatched()


    //main method to test
    public static void main( String[] args ) { 

        /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
          System.out.println(flip("stressed"));
          System.out.println(allMatched( "({}[()])" )); //true
          System.out.println(allMatched( "([)]" ) ); //false
          System.out.println(allMatched( "(){([])}" ) ); //true
          System.out.println(allMatched( "](){([])}" ) ); //false
          System.out.println(allMatched( "(){([])}(" ) ); //false
          System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
          ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
    }

}//end class LatKtS
