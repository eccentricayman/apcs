//Anton Goretsky, Ayman Ahmed, Jason Dong -- Team Byte-Me
//APCS1 pd5
//HW29 -- Ye Olde Role Playing Game, Improved
//2015-11-10

public class Warrior extends Character {

    public Warrior() {  //default, fights normally without much specialization, loses defense for more attack in small increments
		name = "Thorin";
		health = 100;
		strength = 100;
		defense = 50;
		attack = 1.5;
    }

    public Warrior(String newname) {
		this();
		name = newname;
    }
    
    public void specialize() {
		defense += 25;
		attack -= 0.5;
    }

    public void normalize() {
		defense = 50;
		attack = 1.5;
    }

    public String about() {
    	String retstr = "Aragorn, the First High King of Midle Earth, and a noble warrior. \n";
        retstr += "Aragorn is a warrior, who is well rounded in all aspects of battle.";
    	return retstr;
    }

}
