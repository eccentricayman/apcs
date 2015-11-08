/*
Ayman Ahmed
APCS1 pd5
HW#26 -- What Makes a Person?
2015-11-07
*/

public class Face {
	private String hair;
	private String eyes;
	private String nose;
	private String mouth;

	public Face() {
		hair = "^^^";
		eyes = "O o";
		nose = " o ";
		mouth = "___";
	}

	public Face(String newHair, String newEyes, String newNose, String newMouth) {
		hair = newHair;
		eyes = newEyes;
		nose = newNose;
		mouth = newMouth;
	}

	public String getHair() {
		return hair;
	}

	public String getEyes() {
		return eyes;
	}

	public String getNose() {
		return nose;
	}

	public String getMouth() {
		return mouth;
	}

	public String setHair(String newhair) {
		String oldhair = hair;
		hair = newhair;
		return oldhair;
	}

	public String setEyes(String neweyes) {
		String oldeyes = eyes;
		eyes = neweyes;
		return oldeyes;
	}
	public String setNose(String newnose) {
		String oldnose = nose;
		nose = newnose;
		return oldnose;
	}
	
	public String setMouth(String newmouth) {
		String oldmouth = mouth;
		mouth = newmouth;
		return oldmouth;
	}

	public String toString() {
		String retstr = hair + "\n" + eyes + "\n" + nose + "\n" + mouth;
		return retstr;
	}

} //end class