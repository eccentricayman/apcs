/*
Ayman Ahmed
APCS2 pd5
HW#1 -- I Am Still Searching
2016-02-11
*/

public class MatrixSearch {
    
    public static boolean SEARCHUUU(int[][] tosearch, int tofind) {
        return helpdeSEARCHUUU(tosearch, tofind, 0, 0);
    }

    public static boolean helpdeSEARCHUUU(int[][] tosearch, int tofind, int x, int y) {
        int value = tosearch[x][y];
        if (value == tofind) {
            return true;
        }
        else if (value < tofind) {
            return helpdeSEARCHUUU(tosearch, tofind, x, y + 1);
        }
        else if (value > tofind) {
            return helpdeSEARCHUUU(tosearch, tofind, x - 1, y);
        }
        else {
            return false;
        }
    }

    public static int FINDTEHMISSINGNUMBA(int[] tofind) {
        int duplicate = 0;
        int sum = 0;
        for (int i = 0 ; i < tofind.length ; i++) {
            sum += tofind[i];
            if (tofind[tofind[i]] > 0) {
                tofind[tofind[i]] = -1;
            }
            if (tofind[tofind[i]] == -1) {
                duplicate = tofind[tofind[i]];
            }
        }
        return ((tofind.length * (tofind.length + 1)) / 2) - sum + duplicate;
    }

}
