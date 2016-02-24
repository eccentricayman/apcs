/*
  Ayman Ahmed
  APCS2 pd5
  HW03 -- Execution
  23-2-16
*/

/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 */

public class QueenBoard {

    private int[][] _board;

    public QueenBoard( int size ) {
        _board = new int[size][size];
    }

    /***
     * precondition: board is filled with 0's only.
     * postcondition:
     * If a solution is found, board shows position of N queens,
     * returns true.
     * If no solution, board is filled with 0's,
     * returns false.
     */
    public boolean solve() {
        //solves with first column;
        if (solveH(0)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     *Helper method for solve.
     */
    private boolean solveH( int col ) {
        if (col == _board.length) {
            printSolution();
            return true;
        }
        for (int i = 0 ; i < _board.length ; i++) {
            if (addQueen(i, col)) {
                if (solveH(col + 1)) {
                    return true;
                }
                else {
                    removeQueen(i, col);
                }
            }
        }
        //probably won't reach here unless something is seriously wrong
        return false;
    }


    public void printSolution() {
        /** Print board, a la toString...
            Except:
            all negs and 0's replaced with underscore
            all 1's replaced with 'Q'
        */
        String retstr = "";
        String ret = this.toString();
        //splits string by tabs
        String[] places = ret.split("\\t");
        for (int i = 0 ; i < places.length ; i++) {
            if (!(places[i].equals("\\n")) && Integer.parseInt(places[i]) <= 0) {
                places[i] = "_";
            }
            else if (!(places[i].equals("\\n")) && Integer.parseInt(places[i]) == 1) {
                places[i] = "Q";
            }
        }
        for (int j = 0 ; j < places.length ; j++) {
            retstr += places[j] + "\t";
        }
        System.out.println(retstr);
    }



    //================= YE OLDE SEPARATOR =================

    /***
     * <General description>
     * precondition: row and column are within range of _board
     * postcondition: If you can add a queen at a position, it does that, then
     returns true. If you can't, it returns false.
     */
    private boolean addQueen(int row, int col) {
        if(_board[row][col] != 0){
            return false;
        }
        _board[row][col] = 1;
        int offset = 1;
        while(col+offset < _board[row].length){
            _board[row][col+offset]--;
            if(row - offset >= 0){
                _board[row-offset][col+offset]--;
            }
            if(row + offset < _board.length){
                _board[row+offset][col+offset]--;
            }
            offset++;
        }
        return true;
    }
    

    /***
     * <General description>
     * precondition: Row and column must be within range of _board
     * postcondition: Returns false if there is no queen at given position,
     and removes the queen from a position and returns true if there is one.
     */
    private boolean removeQueen(int row, int col) {
        if ( _board[row][col] != 1 ) {
            return false;
        }
        _board[row][col] = 0;
        int offset = 1;

        while( col+offset < _board[row].length ) {
            _board[row][col+offset]++;
            if( row - offset >= 0 ) {
                _board[row-offset][col+offset]++;
            }
            if( row + offset < _board.length ) {
                _board[row+offset][col+offset]++;
            }
            offset++;
        }
        return true;
    }


    /***
     * <General description>
     * precondition: Board must be solved for anything meaningful
     * postcondition: WIll return a string of the board, with 1s representing
     queens.
     */
    public String toString() {
        String ans = "";
        for( int r = 0; r < _board.length; r++ ) {
            for( int c = 0; c < _board[0].length; c++ ) {
                ans += _board[r][c]+"\t";
            }
            ans += "\n";
        }
        return ans;
    }


    //main method for testing...
    public static void main( String[] args ) {
        QueenBoard b = new QueenBoard(5);
        System.out.println(b);
        b.addQueen(3,0);
        b.addQueen(0,1);
        System.out.println(b);
        b.removeQueen(3,0);
        System.out.println(b);
    }

}//end class
