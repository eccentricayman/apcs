/* Ayman Ahmed
   APCS1 pd5
   HW16 -- Do I repeat myself? Very well, then I repeat myself
   2015-15-10
*/
public class Repeater {
    public static String fenceW(int posts) {
	int ctr = 0;
	String retstr = "";
	while (ctr < posts - 1) {  //it's posts - 1 due to the last post
	    retstr = retstr + "|--";
	    ctr = ctr + 1;
	}
	retstr = retstr + "|";
       	return retstr;
    }

    public static String fenceR(int posts) {
	String retstr = "|";
	if (posts > 1) {
		retstr += "--";
	}
	else {
	    return retstr;
		}
	return retstr + fenceR(posts - 1);
    }
        public static void main(String[] args) {
        System.out.println("While loop Cases");
       	System.out.println(fenceW(1));
       	System.out.println(fenceW(2));
		System.out.println(fenceW(10));
		System.out.println("\nRecursive Test Cases");
		System.out.println(fenceR(1));
		System.out.println(fenceR(2));
		System.out.println(fenceR(10)); //both methods should return the same thing
        }
}