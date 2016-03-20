/*
Ayman Ahmed
APCS2 pd5
HW#15 -- Generically Speaking...
2016-03-17
*/

/*****************************************************
 * interface List -- subset of actual Java List interface
 * Specifies actions a List must be able to perform.
 *****************************************************/

public interface List<T> { 

    //add node to list, containing input String as its data
    public boolean add( T x ); 

    //inserts a node containing s at position I
    void add( int i, T s ); 

    //removes the node at position i and returns its cargo
    T remove( int i );

    //return data in element at position i
    public T get( int i ); 

    //overwrite data in element at position i
    public T set( int i, T x ); 

    //return length of list
    public int size(); 

}//end interface
