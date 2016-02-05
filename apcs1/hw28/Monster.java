public class Monster {

    public String name;
    public int health;
    public int strength;
    public int defense;
    public double attack;

    public Monster() {
	health = 150;
	strength = (int) (Math.random() * 45 + 20);
	defense = 20;
	attack = 1;
	name = "smaug";
    }
    public Boolean isAlive() {
	return health > 0;
    }

    public int getDefense() {
	return defense;
    }

    public String getName() {
	return name;
    }

    public void lowerHP(int damage){
	health -= damage;
    }

    public int attack(Warrior pat) {
	int damage = (int) ((strength * attack) - pat.getDefense());
	if (damage < 0) {
	    damage = 0;
	}
	pat.lowerHP(damage);
	return damage;
    }
}
	    
