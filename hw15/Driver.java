/*=============================
  driver for class Coin
  ~~~ SUGGESTED WORKFLOW: ~~~
  1. Compile this file and run.
  2. Cut&paste the "TOP" line below the first statement. 
  (with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
  3. Compile and run again. 
  4. Resolve errors 1 at a time until it works
  5. Repeat 2-4 until TOP meets BOTTOM
  =============================*/

public class Driver {
	
	Coin xheads = new Coin("penny");	// new coins for each statement!!!
	Coin othercoin = new Coin("nickel");
	Coin ymatches = new Coin("dime");
	Coin 13coin = new Coin("quarter");
	Coin 13othercoin = new Coin("half-dollar");
	
    public static void main( String[] args ) {

	//build Objects from blueprint specified by class Coin

	//test default constructor
	Coin mine = new Coin();

	//test 1st overloaded constructor
	Coin yours = new Coin( "quarter" );

	//test 2nd overloaded constructor
	Coin wayne = new Coin( "dollar", "heads" );


	//test toString() methods of each Coin
	System.out.println("mine: " + mine);
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	//test flip() method
	System.out.println("\nAfter flipping...");
	yours.flip();
	wayne.flip();
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	//test equals() method
	if ( yours.equals(wayne) ) 
	    System.out.println( "Matchee matchee!" );
	else
	    System.out.println( "No match. Firestarter you can not be." );
    }//end main
    public String xflip(int x) {
		while (xheads.headsCtr < x) {
			xheads.flip();
		}
		return "This coin has been flipped " + xheads.flipCtr + " times, and has landed heads " + x + " times.";
	}
	public String ymatch(int y) {
		int matchctr = 0;
		int totalctr = 0;
		while (matchctr < y) {
			if (ymatches.equals(othercoin)) {
				matchctr = matchctr + 1;
				totalctr = totalctr + 1;
			}
			else {
				totalctr = totalctr + 1;
			}
		}
		return "This coin has been through " + totalctr + " matches, and has matched " + matchctr + " times.";
	}
	public String 13match {
		int ctr = 0;
		while (ctr < 13) {
			if (13coin.equals(13othercoin)) {
				ctr = ctr + 1;
			}

		if (ctr % 13match.value == 0){
			return "The number of matches is " + ctr + " .";
		}
	}
}//end class
