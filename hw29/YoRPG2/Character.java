/*
Team Byte-Me -- Ayman Ahmed, Jason Dong, Anton Goretsky
APCS1 pd5
HW29 -- Ye Olde Role Playing Game, Improved
2015-11-11
*/

protected class Character {
    public int health;
    public int strength;
    public int defense;
    public double attack;
    public String name;
    
    public boolean isAlive() {
	return health > 0;  //AZRAEL ARE YOU DEAD
    }

    public int getDefense() {
	return defense;
    }

    public int lowerHP(int damagetaken) {
	health -= damagetaken;
	return health;
    }

    public int attack(Character attacker) {
	
    }	
}