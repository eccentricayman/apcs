/*======================================
  class Tile
  Intended for use with class Concentration.
  ========================================*/

public class Tile {
    
    private String _face;
    private boolean _isFaceUp;
 
    //constructor
    public Tile( String value ) {
	_face = value;
	_isFaceUp = false;
    }
    
    public boolean isFaceUp() { return _isFaceUp; }
 
    public void flip() { _isFaceUp = !_isFaceUp; }
    
    
    //override toString method
    public String toString() {
	if ( isFaceUp() )
	    return _face;
	else
	    return "-X-";
    }
    
 
    //override equals method
    public boolean equals( Object rightSide ) {
	
	//First, check for aliasing.
	boolean retVal = this == rightSide;
	
	//Next, if this and input Object are different objects,
        if ( !retVal )
	    
	    //...check to see if input Object is a Tile
	    retVal = rightSide instanceof Tile 
		
		//...and that its state variables match those of this Tile
		&& this._face.equals( ((Tile)rightSide)._face )
		&& this.isFaceUp() == ((Tile)rightSide).isFaceUp();
	
	return retVal;
    }
    
    
    public static void main(String [] args) {
	Tile t1 = new Tile("cow");
	Tile t2 = new Tile("cow");
	System.out.println("t1\tt2");
	System.out.println( t1 + "\t" + t2);
	System.out.println( "t1 == t2: " + t1.equals(t2) );
	System.out.println();
	t1.flip();
	System.out.println("t1\tt2");
	System.out.println( t1 + "\t" + t2);
	System.out.println( "t1 == t2: " + t1.equals(t2) );
	System.out.println();
	t2.flip();
	System.out.println("t1\tt2");
	System.out.println( t1 + "\t" + t2);
	System.out.println( "t1 == t2: " + t1.equals(t2) );
	System.out.println();
    }
    
}//end class Tile
