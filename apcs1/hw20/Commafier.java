/*
Ayman Ahmed
APCS1 pd5
HW #20: Karmacomma,  
2015-22-10
*/

public class Commafier {
    public static void main(String[] args) {
        /*
        for ( String s : args ) {
            int temp = Integer.parseInt(s);
            System.out.println( "commafyR(" + temp + "): " + commafyR(temp) );
            System.out.println( "commafyF(" + temp + "): " + commafyF(temp) );
        } 
        */
        System.out.println(commafyF(1));
        System.out.println(commafyF(1000));
        //System.out.println(commafyF(1 1000));   //I DON'T UNDERSTAND FOREACH LOOPS :(
        System.out.println(commafyR(1));
        System.out.println(commafyR(1000));
        //System.out.println(commafyR(1 1000));
    }
    public static String commafyR(int x) {
        String str = "" + x;
        if (x <= 999) {
            return str;
        }
        else {
            return commafyR(x / 1000) + "," + str.substring(str.length() - 3);
        }
    }
    public static String reverseF(String s) {
        String rs = "";
        for (int i = s.length() - 1 ; i >= 0 ; i--) {
            rs = rs + s.substring(i, i + 1);
        }
        return rs;
    }
    public static String commafyF(int x) {
        String y = "" + x;
        String commafied = "";
        int ctr = 0;
        for (int i = y.length() ; i > 0 ; i-- ) {
            if ((ctr % 3) == 0 && ctr != 0) {
                commafied += ",";
                ctr += 1;
                i += 1;
            }
            else {
                commafied += y.substring(i - 1 , i);
                ctr += 1;
            }
        }
        return reverseF(commafied);
    }
}