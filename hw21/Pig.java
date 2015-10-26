//class Pig --- SKELETON
//a Pig Latin translator

public class Pig {

    private static final String VOWELS = "aeiou";

    public static boolean hasA( String w, String letter ) {
	if(w.indexOf(letter)!=-1) return true;
	else return false; }

    public static boolean isAVowel( String letter ) {
	if(vowel.length==1) return hasA(VOWELS,letter);
	else return false; }

    public static int countVowels( String w ) {
	int ret=0;
	for(int n=0;n<w.length();n++) {
		if(isAVowel(w.substring(n,n+1)) ret+=1;}		
	return ret; }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel(“cat”) → true
			hasAVowel(“zzz”) → false
      =====================================*/
    public static boolean hasAVowel( String w ) {
	if(countVowels(w)!=0) return true;			
	else return false; }
    public static boolean hasBVowel( String w) {
	for(int n=0;n<


		/*=====================================
			String allVowels(String) -- returns vowels in a String
			pre:  w != null
			post: allVowels(“meatball”) → “eaa”
			=====================================*/
		public static String allVowels( String w ) {
				//your implementation here
				return ""; //placeholder to get past compiler
		}


		/*=====================================
			String firstVowel(String) -- returns first vowel in a String
			pre:  w != null
			post: firstVowel("") --> ""
			firstVowel("zzz") --> ""
			firstVowel("meatball") --> "e"
			=====================================*/
		public static String firstVowel( String w ) {
				//your implementation here
				return ""; //placeholder to get past compiler
		}


		/*=====================================
			boolean beginsWithVowel(String) -- tells whether String begins with a vowel
			pre:  w != null and w.length() > 0
			post: beginsWithVowel("apple")  --> true
			beginsWithVowel("strong") --> false
			=====================================*/
		public static boolean beginsWithVowel( String w ) {
				//your implementation here
				return false; //placeholder to get past compiler
		}


		/*=====================================
			String engToPig(String) -- converts an English word to Pig Latin
			pre:  w.length() > 0
			post: engToPig("apple")  --> "appleway"
			engToPig("strong") --> "ongstray"
			engToPig("java")   --> "avajay"
			=====================================*/
		public static String engToPig( String w ) {
				//your implementation here
				return ""; //placeholder to get past compiler
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

}//end class Pig
