//Anton Goretsky, Ayman Ahmed, Jason Dong -- Team Byte-Me
//APCS1 pd5
//HW29 -- Ye Olde Role Playing Game, Improved
//2015-11-10

public class Warrior extends Character {

    public Warrior() {
	name = "pat";
	health = 100;
	strength = 100;
	defense = 50;
	attack = .5;
    }

    public Warrior(String wName) {
	this();
	name = wName;
    }
    
    public void specialize() {
	defense = 25;
	attack = .8;
    }

    public void normalize() {
	defense = 50;
	attack = .5;
    }
}
