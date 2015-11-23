import cs1.Keyboard;  //if comfortable with Scanner, you may comment this out

		
public class Concentration {

		//instance variables
		private Tile[][] _board;     //storage for 4x4 grid of Tiles.
		private int _numberFaceUp;   //count of Tiles with faces visible
		private String[] _words;     //list of unique Strings used for Tile vals
		private static int _numRows = 4;


		//insert constructor and methods here


		
		//DO NOT MODIFY main()
		public static void main(String[] args){
				Concentration game = new Concentration();
				game.play();
		}

}//end class Concentration

