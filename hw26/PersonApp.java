//driver file for class Person

import cs1.Keyboard;

public class PersonApp {

    public static void main( String[] args ) {

	/* ==================================
	Person Kirk = new Person();
	System.out.println("Testing Kirk...");
	System.out.println(Kirk); //should show def.face & Will's name

	Person Spock = new Person("Leonard", "Nimoy");
	System.out.println("Testing Spock...");
	System.out.println(Spock); //should yield "null" & Leonard's name
	================================== */

	Person Scotty = new Person("James", "Doohan", 
				   new Face( "|||||||",
					     "| X X |",
					     "|( 0 )|", 
					     "|  v  |" ));

	System.out.println("Testing Scotty...");
	System.out.println(Scotty); // ASCII face, body & James's name


        // prompt user to modify hair
	System.out.print( "Modifying hair: " );
	String hair = Keyboard.readString();
	Scotty.getFace().setHair(hair);

	System.out.println( "Scotty:" );
	System.out.println( Scotty );


	Person McCoy = new Person("DeForest", "Kelley", 
				  new Face( "~~~~~~~", 
					    "| ^ ^ |", 
					    "|  U  |",
					    "| --- |" ));
	System.out.println( "Testing McCoy..." );
	System.out.println( McCoy ); //should show face, name and body

	System.out.print("Now swapping noses: ");
	/*
	String mccoyOldNose = McCoy.getFace().getNose();
	String scottyOldNose = Scotty.getFace().setNose(mccoyOldNose);
	McCoy.getFace().setNose(scottyOldNose);
	*/
	// Next line is equiv to preceding 3 lines
	McCoy.getFace().setNose( Scotty.getFace().setNose( McCoy.getFace().getNose() ) );

	System.out.println( "McCoy after nose-swap:" );
	System.out.println( McCoy );
	System.out.println( "Scotty after nose-swap:" );
	System.out.println( Scotty );


	/* ==================================
	================================== */
    }

}//end class PersonApp