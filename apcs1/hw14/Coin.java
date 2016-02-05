/*  
Ayman Ahmed
APCS1 pd5
HW 14 -- Wayne's World
2015-10-08   
*/

public class Coin {
    int value, flipCtr, headsCtr, tailsCtr;
    String name, upFace;
    double bias;
    
    public Coin() {
        value = 0;
        flipCtr = 0;
        headsCtr = 0;
        tailsCtr = 0;
        name = "null";
        upFace = "heads";
        bias = 0.5;
    }
    public Coin(String cointype) {
        this();
        name = cointype;
    }
    public Coin(String cointype, String upface) {
        this(cointype);
        upFace = upface;
    }
    public String flip() {
        if (Math.random() < bias) {
	        upFace = "heads";
	        headsCtr = headsCtr + 1;
	        return "heads";
            
        }
	    else {
	        upFace = "tails";
	        tailsCtr = tailsCtr + 1;
	        return "tails";
	        
	    }
    }
    public String toString() {
        return name + " -- " + upFace;
    }
    public String getupFace() {
        return upFace;
    }
    public boolean equals(Object othercoin) {
        return (upFace.equals(((Coin) othercoin).getupFace()));
    }

    public void assignValue() {
        if (name == "dollar") { // didn't wanna put this until i remembered dollar coins exist
            value = (int)(1.00);
        }
        else if (name == "half-dollar") { //yes, it is a coin!!!
            value = (int)(0.50);
        }
        else if (name == "quarter") {
            value = (int)(0.25);
        }
        else if (name == "dime") {
            value = (int)(0.10);
        }
        else if (name == "nickel") {
            value = (int)(0.05);
        }
        else if (name == "penny") {
            value = (int)(0.01);
        }
        else {
            value = (int)(0.00);
        }
        
    }
}