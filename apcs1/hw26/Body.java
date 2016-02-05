/*
Ayman Ahmed
APCS1 pd5
HW#26 -- What Makes a Person?
2015-11-07
*/

public class Body {

	private String body;
	private static final String defaultbody = " | ";
	private static final String body1 = " | " + "\n" + "/|\\";
	private static final String body2 = " -|-";
	private static final String body3 = "~|~";

	public Body() {  
		body = defaultbody;
	}

	public Body(int bnum) {
		this();
		if (bnum == 1) {
			body = body1;
		}
		else if (bnum == 2) {
			body = body2;
		}
		else if (bnum == 3) {
			body = body3;
		}
		else {
			System.out.println("There are only 3 body choices, body staying as default body.");
		}
	}
} //end class