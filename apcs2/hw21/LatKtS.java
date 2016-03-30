/*
Ayman Ahmed
APCS2 pd5
HW#21 -- Stack: What is It Good For?
2016-03-30
*/

public class LatKts {

    public static String flip(String s) {
        String returnu = "";
        Latkes stringstacku = new Latkes(s.length());
        for (int i = 0 ; i < s.length ; i++) {
            stringstacku.push(s.substring(i, i++));
        }
        while (!(stringstacku.isEmpty())) {
            returnu += stringstacku.pop();
        }
        return returnu;
    }

}
