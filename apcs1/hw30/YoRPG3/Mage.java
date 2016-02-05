//Anton Goretsky, Ayman Ahmed, Jason Dong -- Team Byte-me
//APCS1 pd5
//HW28 -- Ye Olde Role Playing Game
//2015-11-10

public class Mage extends Character {

	public Mage() {  //does damage in spells and mana, which will be implemented later, and is underwhelmingly bad for now
		name = "Galadriel";
		health = 75;
		strength = 15;
		defense = 20;
		attack = 0.25;
	}

	public Mage(String newname) {
		this();
		name = newname;
	}

	public void specialize() {
		health -= 5;
		defense += 10;
		//RESET MANA POINTS TO 100 IN EXCHANGE FOR LOSING HEALTH
	}

	public void normalize() {
		defense -=10;
	}

	public String about() {
		String retstr = "Galadriel, the Lady of Light is a high elf that is considered one of Middle-Earth's greatest mages. \n";
		retstr += "As a mage, Galadriel has access to a vast store of spells that use mana, which she can replenish for a small amount of health.";
		return retstr;
	}
}