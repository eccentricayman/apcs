//Anton Goretsky, Ayman Ahmed, Jason Dong -- Team Byte-me
//APCS1 pd5
//HW28 -- Ye Olde Role Playing Game
//2015-11-10
 
public class Monster extends Character {
 
    public Monster() {  //THIS ORC IS VERY DIFFICULT TO BEAT
                health = 150;
                strength = (int)Math.floor(Math.random() * 25) + 25;
                defense = 25;
                attack = 3;
                name = "Orc";
    }
 
    public Monster(String newname) {
        this();
        name = newname;
    }
 
    public void specialize() {}
    public void normalize() {}   //monsters can't specialize or normalize
 
    public String about() {
        String retstr = "An orc under Azog the Defiler.";
        return retstr;
    }
 
}
	    
