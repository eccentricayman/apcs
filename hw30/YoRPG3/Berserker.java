//Anton Goretsky, Ayman Ahmed, Jason Dong -- Team Byte-me
//APCS1 pd5
//HW28 -- Ye Olde Role Playing Game
//2015-11-10

public class Berserker extends Character {

	public Berserker() {
		name = "Thorin";
		health = 200;
		strength = 150;
		defense = 0;
		attack = 5;
	}

	public Berserker(String newname) {
		this();
		name = newname;
	}

	public void specialize() { //loses health in exchange for massive damage
		health -= 75;
		attack += 20;
	}

	public void normalize() {
		attack = 5;
	}

	public String about() {
		String retstr = "Thorin, son of Thrain, grandson of Thror, and King Under the Mountain. \n";
		retstr += "Thorin is a berserker who fights with no regard for his own health, and does massive damage in exchange for his own health.";
		return retstr;
	}
	
}