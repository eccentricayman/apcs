/*
Team Sparkly Rainbow Walrus Unicorns -- Ayman Ahmed and Lisa Shi
APCS1 pd5
HW#36 -- Some Folks call it a Memory
2015-23-11
*/

import cs1.Keyboard;  //if comfortable with Scanner, you may comment this out

		
public class Concentration {

	//instance variables
	private Tile[][] _board;
     //storage for 4x4 grid of Tiles.
	private int _numberFaceUp;
   //count of Tiles with faces visible
	private String[] _words;
     //list of unique Strings used for Tile vals
	private static int _numRows = 4;

	//insert constructor and methods here
    
	//default constructor
	public Concentration() {
	   _board = new Tile[_numRows][_numRows];
	   _words = new String[8];
	}

	//specified consturctor
	public Concentration() {
	   _words = {"sun","moon","day","night",
		      "jump","land","walk","still"};
	   for (int a = 0; a < _board.length; a++)
    	   for (int b = 0; b < _board.length; b++) {
		_board[a][b] = 

		}
	}

		
	//DO NOT MODIFY main()
	public static void main(String[] args){
		Concentration game = new Concentration();
		game.play();
		}

}//end class Concentration

