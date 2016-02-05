public class Warrior {

    public String name;
    public int health;
    public int strength;
    public int defense;
    public double attackRating;

    public Warrior(String wName) {
	name = wName;
	health = 100;
	strength = 100;
	defense = 50;
	attackRating = .5;
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

    public void lowerHP(int damage) {
	health -= damage;
    }

    public int attack(Monster smaug) {
	int damage = (int) ((strength * attackRating) - smaug.getDefense());
	if (damage < 0) {
	    damage = 0;
	}
	smaug.lowerHP(damage);
	return damage;
    }

    public void specialize() {
	defense = 25;
	attackRating = .8;
    }

    public void normalize() {
	defense = 50;
	attackRating = .5;
    }
}
