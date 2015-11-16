//Anton Goretsky, Ayman Ahmed, Jason Dong
//APCS1 pd5
//HW28 -- Ye Olde Role Playing Game
//2015-11-10
//Team: Byte-me

/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Warrior and a Monster will be instantiated
    private Character aragorn;   //Is it man or woman?
    private Monster orc; //Friendly generic monster name, eh?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG() {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- facilitates info gathering to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Warrior
      =============================================*/
    public void newGame() {

	String s;
	String str;
	String name = "";
	String role = "";

	s = "Welcome to Middle Earth!\n";

	s += "\nChoose your difficulty: \n";
	s += "\t1: A wee lad, going upon his first adventure. \n";
	s += "\t2: A battle hardened warrior, ready to start anew.\n";
	s += "\t3: The flames of hell rise to greet your challege.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	s = "O wanderer of Middle Earth, what is your name?\n";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }

	str = "What class of adventurer do you take after?\n";
	System.out.print( str );

	try {
		role = in.readLine();
	}
	catch (IOException e) { }

	if (role.toLowerCase() == "rogue") {
	    aragorn = new Rogue(name); //hobbit is rogue
	}
	else if (role.toLowerCase() == "berserker") {
		aragorn = new Berserker(name);  //dwarf is berserker
	}
	else if (role.toLowerCase() == "mage") {
		aragorn = new Mage(name);  //elf is mage
	}
	else {
		aragorn = new Warrior(name); //human is warrior, and warrior is default
	}

    }//end newGame()

    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Warrior aragorn has been initialized
      post: Returns true if player wins (monster dies).
            Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn() {

	int i = 1;
	int d1, d2;

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "Nothing to see here. Move along!" );

	else {
	    System.out.println( "Lo, yonder monster approacheth!" );

	    orc = new Monster();

	    while( orc.isAlive() && aragorn.isAlive() ) {

		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {
		    System.out.println( "You see an opportunity to land a brutal strike upon the orc." );
		    System.out.println( "\t1: You play it safe, and await another opportunity. \n\t2: You take the strike, but leave yourself open." );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }

		if ( i == 2 )
		    aragorn.specialize();
		else
		    aragorn.normalize();

		d1 = aragorn.attack( orc );
		d2 = orc.attack( aragorn );

		System.out.println( aragorn.getName() + " dealt " + d1 +
				    " points of damage.");

		System.out.println( "The orc retaliates, dealing " + d2 +
				    " points of damage.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !orc.isAlive() && !aragorn.isAlive() ) {
		System.out.println( "'As you run the orc through with all the strength you can muster... " + 
				    "the orc reaches out with a dying breath, " +
				    "and you feel a stab in your stomach." +
				    "You lie upon the ground, both the orc's and your blood pooling around as the world goes black." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !orc.isAlive() ) {
		System.out.println( "You have slain the orc, but his brethren still roam these lands." );
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !aragorn.isAlive() ) {
		System.out.println( "Feeling a sharp pain and hearing a guttural cry of victory, you fall, seeing nothing but blood and the ground rising to meet you." );
		return false;
	    }
	}//end else

	return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args ) {

	//As usual, move the begin-comment bar down as you progressively 
	//test each new bit of functionality...

	//loading...
	YoRPG game = new YoRPG();

	int encounters = 0;

	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	}

	System.out.println( "And so, weary adventurer, does your tale end." );
	
    }//end main

}//end class YoRPG
