//class Pig --- SKELETON
//a Pig Latin translator

public class Pig {

    private static final String VOWELS = "aeiou";

    public static boolean hasA( String w, String letter ) {
	if(w.indexOf(letter)!=-1) return true;
	else return false; }

    public static boolean isAVowel( String letter ) {
		return (hasA(VOWELS, letter));
	}

    public static int countVowels( String w ) {
	int vnum=0;
	for(int n=0;n<w.length();n++) {
		if(isAVowel(w.substring(n,n+1))) vnum+=1;}		
	return vnum; }

    public static boolean hasAVowel( String w ) {
	if(countVowels(w)!=0) return true;			
	else return false; }

	public static String allVowels( String w ) {
		String vowelret = "";
			for (int i = 0 ; i < w.length() ; i++) {
				if (isAVowel(w.substring(i))) {
					vowelret += w.substring(i);
				}
				else { }
			}
		return vowelret;
	}
	public static String firstVowel( String w ) {
		String fvowel = "";
		for (int i = 0 ; i < w.length() ; i++) {
			if (isAVowel(w.substring(i)) && fvowel.length() < 1) {
				fvowel += w.substring(i);
			}
			else { }
		}
		return fvowel;
	}
	public static boolean beginsWithVowel( String w ) {
		if (isAVowel(w.substring(0))) {
			return true;
		}
		else {
			return false;
		}
	}


	public static String engToPig( String w ) {
		//TODO
		return ""; //compiler stuf?
	}
	
	public static void main( String[] args ) {

				//Some test calls. You are encouraged to add more.
				/*
					String letter = "p";

					for( String w : args ) {
					System.out.println( w + " has " + letter + "? " 
					+ hasA( w, letter ) );
					}   
				*/

		for( String word : args ) {
			System.out.println( allVowels(word) );
			System.out.println( firstVowel(word) );
			System.out.println( countVowels(word) );
			System.out.println( engToPig(word) );
		}
	}//end main()
} //end class Pig