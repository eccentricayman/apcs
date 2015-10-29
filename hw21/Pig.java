    /*
    Aleksandar Shipetich, Vincent Alykin, Ayman Ahmed; aka Team Agsway
    APCS1 pd5
    HW21 -- Pig Latinifier
    2015-10-28
     */
     
    
    
    //class Pig --- SKELETON
    //a Pig Latin translator
    
    public class Pig {
    
        private static final String VOWELS = "aeiouAEIOU";
    
    
        /*=====================================
          boolean hasA(String,String) -- checks for a letter in a String
          pre:  w != null, letter.length() == 1
          post: hasA("cat", "a") → true  
          hasA("cat", "p") → false
          =====================================*/
        public static boolean hasA( String w, String letter ) {
    
    	for (;w.length() != 0; w= w.substring(1)){
    	    if (w.substring(0,1).equals(letter))
    		return true;
    	}
    	return false;
    
        }//end hasA()
    
    
        /*=====================================
          boolean isAVowel(String) -- tells whether a letter is a vowel
          precondition: letter.length() == 1
          =====================================*/
        public static boolean isAVowel( String letter ) {
    	if (VOWELS.indexOf(letter) != -1)
    	    return true;
    	return false; 
        }
    
    
        /*=====================================
          int countVowels(String) -- counts vowels in a String
          pre:  w != null
          post: countVowels("meatball") → 3
          =====================================*/
        public static int countVowels( String w ) {
    	int aleks = 0;
    	for (; w.length() != 0; w=w.substring(1)){
    	    if (isAVowel(w.substring(0,1)))
    		aleks += 1;
    	}
    	if (aleks > 0){
    	    return aleks;
    	}
    	return -1; //placeholder to get past compiler
        }
    
    
        /*=====================================
          boolean hasAVowel(String) -- tells whether a String has a vowel
          pre:  w != null
          post: hasAVowel("cat") → true
          hasAVowel("zzz") → false
          =====================================*/
        public static boolean hasAVowel( String w ) {
    	if (countVowels(w) != -1)
    	    return true;
    	return false; //placeholder to get past compiler
        }
    
    
        /*=====================================
          String allVowels(String) -- returns vowels in a String
          pre:  w != null
          post: allVowels("meatball") → "eaa"
          =====================================*/
        public static String allVowels( String w ) {
    	String aleks = "";
    	for (; w.length() >0; w= w.substring(1)){
    	    if(isAVowel(w.substring(0,1)))
    		aleks += w.substring(0,1);
    	}
    	return aleks; //placeholder to get past compiler
        }
    
    
        /*=====================================
          String firstVowel(String) -- returns first vowel in a String
          pre:  w != null
          post: firstVowel("") --> ""
          firstVowel("zzz") --> ""
          firstVowel("meatball") --> "e"
          =====================================*/
        public static String firstVowel( String w ) {
    	if (allVowels(w).length() > 0)
    	    return allVowels(w).substring(0,1);
    	return ""; //placeholder to get past compiler
        }
    
    
        /*=====================================
          boolean beginsWithVowel(String) -- tells whether String begins with a vowel
          pre:  w != null and w.length() > 0
          post: beginsWithVowel("apple")  --> true
          beginsWithVowel("strong") --> false
          =====================================*/
        public static boolean beginsWithVowel( String w ) {
    	if (firstVowel(w).equals(w.substring(0,1)))
    	    return true;
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
          String aleks = w;
    	if (beginsWithVowel(w))
    	    return w.toLowerCase() + "way";
    	else {
    	  while(!(beginsWithVowel(aleks)) && !(aleks.substring(0,1).equals(w.substring(w.length() -1,w.length()))) ) {
    	    aleks = aleks.substring(1) + aleks.substring(0,1);
    	  }
    	  return aleks.toLowerCase() + "ay";
    	}
        }
        
        public static String capitalize(String aleks){
          return aleks.substring(0,1).toUpperCase() + aleks.substring(1);
        }
    
        public static void print(String a){
    	System.out.println(a);
        }
    
        public static void print(int a){
    	System.out.println(a);
        }
    
        
        public static void print(boolean a){
    	System.out.println(a);
        }
        
        public static void main( String[] args ) {
    
    	//Some test calls. You are encouraged to add more.
    	/*
    	print(hasAVowel("aleks"));
    	print(hasAVowel("lkjh"));
    		 	  
    			  print(isAVowel("a"));
    			  print(isAVowel("o"));
    			  print(isAVowel("z"));	  
    	  
    			  String letter = "p";
    
    			  for( String w : args ) {
    			  System.out.println( w + " has " + letter + "? " 
    			  + hasA( w, letter ) );
    			  }
    	*/
    	  
    
    	for( String word : args ) {
    	    //print(beginsWithVowel(word));
    	    //System.out.println( allVowels(word) );
    	    //System.out.println( firstVowel(word) );
    	    //System.out.println( countVowels(word) );
    	    print( capitalize(engToPig(word)) );
    	}
    	  
    
        }//end main()
    
    }//end class Pig
    
    
