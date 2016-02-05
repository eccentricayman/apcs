// class FaceApp
// driver/tester for class Face

import cs1.Keyboard;

public class FaceApp {

    public static void main( String [] args ) {

	Face dude = new Face();
	String hair;
    String eyes;
	String nose;
	String mouth;

	System.out.println("default dude:");
	System.out.println(dude);
    
        // prompt user to modify hair
	System.out.print("Modifying hair: ");
	hair = Keyboard.readString();
	dude.setHair(hair);
	System.out.println("dude:");
	System.out.println(dude);

	// prompt user to modify eyes
	System.out.print("Getting new eyes: ");
	eyes = Keyboard.readString();
	dude.setEyes(eyes);
	System.out.println("dude:");
	System.out.println(dude);

	// prompt user to modify nose
	System.out.print("Nosejob: ");
	nose = Keyboard.readString();
	dude.setNose(nose);
	System.out.println("dude:");
	System.out.println(dude);

	// prompt user to modify mouth
	System.out.print("Watch your mouth: ");
	mouth = Keyboard.readString();
	dude.setMouth(mouth);
	System.out.println("dude:");
	System.out.println(dude);
    } 

}//end class FaceApp
