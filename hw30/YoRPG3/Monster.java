//Anton Goretsky, Ayman Ahmed, Jason Dong -- Team Byte-me
//APCS1 pd5
//HW28 -- Ye Olde Role Playing Game
//2015-11-10

public class Monster extends Character {

    public Monster() {
	health = 150;
	strength = (int) (Math.random() * 45 + 20);
	defense = 20;
	attack = 1;
	name = "smaug";
    }
}
	    
