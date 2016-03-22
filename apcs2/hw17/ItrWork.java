/*
Ayman Ahmed
APCS2 pd5
HW#17 -- Iteratorator
2016-03-21
*/

/*****************************************************
 * class ItrWork -- skeleton
 * Allows for familiarization with iterators
 *****************************************************/

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork {

    //using FOREACH loop
    //returns a boolean to indicate whether key is present in L
    public static boolean foundA( Integer key, List<Integer> L ) {
        for (Integer i : L) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    //explicitly using an iterator
    //returns a boolean to indicate whether key is present in L
    public static boolean foundB( Integer key, List<Integer> L ) {
        Iterator itr = L.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer)(itr.next());
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    //using FOREACH loop
    //returns a list containing the odd numbers in L
    public static List<Integer> oddsA( List<Integer> L ) {
        List<Integer> retlist = new ArrayList<Integer>();
        for (Integer i : L) {
            if (i % 2 != 0) {
                retlist.add(i);
            }
        }
        return retlist;
    }

    //explicitly using an iterator
    //returns a list containing the odd numbers in L
    public static List<Integer> oddsB( List<Integer> L ) {
        List<Integer> retlist = new ArrayList<Integer>();
        Iterator itr = L.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer)(itr.next());
            if (i % 2 != 0) {
                retlist.add(i);
            }
        }
        return retlist;
    }


    //explicitly using an iterator
    //modifies L s.t. it contains no evens
    public static void removeEvens( List<Integer> L ) {
        int ctr = 0;
        Iterator itr = L.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer)(itr.next());
            if (i % 2 == 0) {
                itr.remove();
            }
            ctr++;
        }
    }


    public static void main( String [] args ) {

        //var type: List   obj type: ArrayList
        List<Integer> L = new ArrayList<Integer>();

        for( int i = 0; i < 10; i++ )
            L.add(i);


        // TASK: write code to print the contents of ArrayList L...

        // a) using a FOREACH loop


        // b) explicitly using an iterator


        System.out.println("\nTesting foundA...");
        System.out.println("9 in L? -> " + foundA(9,L) );
        System.out.println("13 in L? -> " + foundA(13,L) );

        System.out.println("\nTesting foundB...");
        System.out.println("9 in L? -> " + foundB(9,L) );
        System.out.println("13 in L? -> " + foundB(13,L) );

        System.out.println("\nTesting oddsA...");
        List<Integer> A = oddsA(L);
        for( int n : A ) System.out.println(n);

        System.out.println("\nTesting oddsB...");
        List<Integer> B = oddsB(L);
        for( int n : B ) System.out.println(n);

        System.out.println("\nTesting removeEvens...");
        removeEvens(L);
        for( int n : L ) System.out.println(n);
        /*~~~~~~~~~~~~~~~m~o~v~e~~m~e~~d~o~w~n~~~~~~~~~~~~~~
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main

}//end class ItrWork

