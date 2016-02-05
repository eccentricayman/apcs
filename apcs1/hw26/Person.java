/*
Ayman Ahmed
APCS1 pd5
HW#26 -- What Makes a Person?
2015-11-07
*/

public class Person {
	private String first;
	private String last;
	private Face currentface;

	public Person() {
		first = "Linus";
		last = "Torvalds";
		currentface = new Face();
	}
	
	public Person(String newfirst, String newlast) {
		first = newfirst;
		last = newlast;
	}
	
	public Person(String newfirst, String newlast, Face newface) {
		first = newfirst;
		last = newlast;
		currentface = newface;
	}

	public String getFirstName() {
		return first;
	}

	public String getLastName() {
		return last;
	}

	public Face getFace() {
		return currentface;
	}

	public String toString() {
		return first + last + "\n" + currentface;
	}

} //end class