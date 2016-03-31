/*
Ayman Ahmed
APCS2 pd5
HW#21 -- Stack: What is It Good For?
2016-03-30
*/

public class LatKtS {

    public static String flip(String s) {
        String returnu = "";
        Latkes stringstacku = new Latkes(s.length());
        for (int i = 0 ; i < s.length() ; i++) {
            stringstacku.push(s.substring(i, i++));
        }
        while (!(stringstacku.isEmpty())) {
            returnu += stringstacku.pop();
        }
        return returnu;
    }

    public static boolean allMatched(String s) {
        int[] ctr = new int[2];
        Latkes stringstacku = new Latkes(s.length());
        for (int i = 0 ; i < s.length() ; i++) {
            stringstacku.push(s.substring(i, i++));
        }
        while (!(stringstacku.isEmpty())) {
            if (stringstacku.pop().equals("(")) {
                ctr[0]++;
            }
            else if (stringstacku.pop().equals(")")) {
                ctr[1]++;
            }
            else {
                stringstacku.pop();
            }
        }
        return ctr[0] == ctr[1];
    }

    public static void main(String[] args) {
        
    }
    
}
