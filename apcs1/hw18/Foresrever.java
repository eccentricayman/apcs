/*
Ayman Ahmed
APCS1 pd5
HW #18 -- For the Lulz Love of Strings
2015-19-15
*/
public class Foresrever {
    public static String fenceF(int posts) {
        String post = "";
        for (int i = posts ; i > 1 ; i-- ) {
            post = post + "|--";
        }
        post = post + "|";
        return post;
    }
    public static String reverseF(String s) {
        String rs = "";
        for (int i = s.length() - 1 ; i >= 0 ; i--) {
            rs = rs + s.substring(i, i + 1);
        }
        return rs;
    }
    public static String reverseR(String s) {
        String rs = "";
        if (s.length() < 2) {
            return s;
        }
        else {
            return reverseR(s.substring(1)) + s.substring(0,1);
        }
        
    }
    public static void main(String[] args) {
        System.out.println(fenceF(10));
        System.out.println(reverseF("food"));
        System.out.println(reverseF("madam")); //THE ULTIMATELY USELESS TEST CASE
        System.out.println(reverseR("food"));
        System.out.println(reverseR("madam")); //THE ULTIMATELY USELESS TEST CASE RECURSIFIED
    }
}

