/*
Ayman Ahmed
APCS1 pd5
HW#24 -- I Was Born a Gamblin’ Man
2015-11-04
*/

public class Slots {
    private static final String[] FRUITS = {
        "lime", "lime", "lime", 
        "lemon", "lemon", "lemon", 
        "cherry", "cherry", "cherry", 
        "orange", "orange", "orange", 
        "grapefruit", "grapefruit", "grapefruit", 
        "tangerine", "tangerine", "tangerine", 
        "ugli", "ugli", "ugli",
        "peach", "peach", "peach"
    };

    private String[] _fruits; //to be init'd by each instance

    public Slots() {
      _fruits = new String[FRUITS.length];
      for (int i = 0 ; i < FRUITS.length ; i++) {     //makes a new slot machine
        _fruits[i] = FRUITS[i];
      }
    }

    public String toString() {
      String slots = "Current Slots: " + _fruits[0] + "\t" + _fruits[1] + "\t" + _fruits[2]; //returns current slots
      return slots;
    }

    private void swap( int i, int j ) {
      String[] newslot = new String[_fruits.length];
      for (int fori = 0 ; fori < _fruits.length ; fori++) {   //i don't know why not being able to use i in the for loop is so frustrating
        if (i == fori) {
          newslot[fori] = _fruits[j];
        }
        else if (fori == j) {
          newslot[fori] = _fruits[i];
        }
        else {
          newslot[fori] = _fruits[fori];
        }
      }
      _fruits = newslot;
    }

    public void spinOnce() {
        int x = 0;
        int y = 0;
        for (int i = 0 ; i < 1000 ; i++) {
          x = (int)(Math.random() * _fruits.length);
          y = (int)(Math.random() * _fruits.length);   //gets a random from the slot, using a random num from length of _fruits
          swap(x, y);
        }
    }

    public boolean jackpot() {  //true or false depending on jackpot or not
      if (_fruits[0].equals(_fruits[1])) {
        if (_fruits[1].equals(_fruits[2])) {
          return true;
        }
        else {
          return false;
        }
      }
      else {
        return false;
      }
    }

    public boolean miniWin() {
      if (_fruits[0].equals(_fruits[1])) {
        return false;
      }
      else {
        if (_fruits[1].equals(_fruits[2])) {   //if two are equal, no miniwin. Otherwise, miniwin!
          return false;
        }
        else {
          return true;
        }
      }
    }

    public static void main( String[] args ) {  //tests methods and stuf
        Slots machine01 = new Slots();
        Slots machine02 = new Slots();  //tests constructor
        System.out.println();
        System.out.println( "Machine01 initial state:\t" + machine01 );   //tests spinning
        System.out.println( "Machine02 initial state:\t" + machine02 );
        System.out.println( "\nSpinning machine01...\n" );
        machine01.spinOnce();           
        System.out.println();
        System.out.println( "Machine01 state:\t" + machine01 );
        System.out.println( "Machine02 state:\t" + machine02 );
        System.out.println();
        System.out.println( "Preparing to spin until a mini win! . . ." );   // tests miniwinning
        System.out.println( "------------------------------------" );
        while( machine01.miniWin() == false ) {
            System.out.println( "Your spin..." + "\t" + machine01 );
            System.out.println( "LOSE\n" );
            machine01.spinOnce();
        }
        System.out.println( "====================================" );
        System.out.println( "Your spin..." + "\t" + machine01 );   
        System.out.println( "WIN\n" );
        System.out.println( "Preparing to spin until...jackpot! . . ." );  //testing jackpot
        System.out.println( "------------------------------------" );
        while( machine01.jackpot() == false ) {
            System.out.println( "Your spin..." + "\t" + machine01 );
            System.out.println( "LOSE\n" );
            machine01.spinOnce();
        }
        System.out.println( "====================================" );
        System.out.println( "Your spin..." + "\t" + machine01 );
        System.out.println( "JACKPOT!\n" );
    }//end main
} //end class