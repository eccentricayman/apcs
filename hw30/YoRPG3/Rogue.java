//Anton Goretsky, Ayman Ahmed, Jason Dong -- Team Byte-me
//APCS1 pd5
//HW28 -- Ye Olde Role Playing Game
//2015-11-10

public class Rogue extends Character {
	
	public Rogue() {   //heavily relies on critical hits
		name = "Bilbo";
		health = 75;
		strength = 50;
		defense = 10;
		attack = 0.25;
	}

	public Rogue(String newname) {
		this();
		name = newname;
	}

	public void specialize() {
		attack = 10;
		defense = 0;
	}

	public void normalize() {
		attack = 0.25;
		defense = 10;
	}

	public String about() {
		String retstr = "Bilbo is a hobbit from the Shire upon an adventure, with skills unheard of in thievery.";
		retstr += "\n Known as a rogue, Bilbo has little health, but occasionally lands devastating strikes, even with little attack.";
		return retstr;
	}
	
}