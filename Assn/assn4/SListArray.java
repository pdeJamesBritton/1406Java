/**
 * A string list specification. (Implementation of the String List ADT)
 */

import java.util.HashMap; // import the HashMap class
import java.util.Set; // import the Set class
import java.util.Iterator; 
public class SListArray extends SList{
    String[] myArray;

    // default constructor
    public SListArray()
    {


        myArray = new String[8];

    }

    // Constructor
    public SListArray(String[] elements)
    // Creates a list with the strings in elements
    // the ordering and size of this list will be the same as in the elements
    {

        SListArray sla = new SListArray();
        int startsize = this.size();
        int elmsize = elements.length;
        boolean doublelength = false;
        if(elmsize > startsize)
        {
            sla.myArray = new String[elmsize * 2];
            doublelength = true;
        }
        int i=0;
        for( ; i < elmsize; i++)
        {
            // strings are immutable, so no fancy work
            sla.myArray[i] = elements[i];
        }
        if(doublelength)
            for( ; i < elmsize * 2; i++)
            {
                // initializing all of my array, empty 'spots' to null
                sla.myArray[i] = null;
            }

    }

    /**
     * Returns (but does not remove) the string at the given position.
     *
     * @param position is the position of the string that is retrieved.
     * @return The string at the given position.
     *         If the <code>position</code> was not a valid list position
     *         then returns <code>INDEX_OUT_OF_RANGE</code>.
     */
    public String get(int position)
    {

        
        return myArray[position];

    }

    /**
     * Sets the list element at the given position.
     * <p>
     * Changes the value (string) of the list element at the given position and
     * returns the original value (string)
     *
     * @param position specifies the location in the list whose value will be changed.
     * @param element specifies the new value that the list element at the given <code>position</code> will have.
     * @return Returns the string that was initially in location <code>position</code>.
     *         If the <code>position</code> was not a valid list position
     *         then returns <code>INDEX_OUT_OF_RANGE</code>.
     */
    public String set(int position, String element)
    {

        String b = myArray[position];
        myArray[position] = element;

        return b;
    }

    /**
     * Adds a new string to the given location of the list.
     * <p>
     * Adds a new string to the list at the given position. In order to
     * successfully add a new item to the list, the <code>position</code>
     * must satisfy 0 <= <code>position</code> <= <code>this.size()</code>
     * If this is not satisfied, then the method simply returns <code>INDEX_OUT_OF_RANGE</code>.
     * If this is satisfied, it adds the new string and returns <code>INDEX_OK</code>.
     *
     * @param position specifies the location in the list where the new <code>element</code> will be added.
     * @param element specifies string that is being added at the given <code>position</code> will have.
     * @return If the input <code>position</code> was valid then returns <code>INDEX_OK</code>.
     *         Otherwise, returns <code>INDEX_OUT_OF_RANGE</code>.
     */
    public String add(int position, String element)
    {

        if(position < 0 || position > this.size())
            return "INDEX_OUT_OF_RANGE";
        myArray[position] = element;
        return "INDEX_OK";

    }

    /**
     * Removes the string at a given location from the list and returns it.
     * <p>
     * Removes the string in the list at the given position. If that items exists, the
     * method removes and returns it. If there is no string with the given position,
     * the list is left unchanged and returns <code>INDEX_OUT_OF_RANGE</code>.
     *
     * @param position specifies the position of the string to remove.
     * @return the string that was removed from the list if it existed, otherwise
     *         returns <code>INDEX_OUT_OF_RANGE</code>.
     */
    public String remove(int position)
    {

        if(position < 0 || position > this.size())
            return "INDEX_OUT_OF_RANGE";
        if(myArray[position] == null)
            return "INDEX_OUT_OF_RANGE";
        String a = myArray[position];
        myArray[position] = null;

        return a;
    }


    /**
     * Returns the size of the list.
     *
     * @return the size of the list. (That is, the number of strings in it.)
     */
    public int size()
    {
        int size = 0;

        // will use nulls to get size
        for(int i = 0; i < myArray.length ; i++)
            if(myArray[i] != null)
                size++;

        return size;
    }



    /**
     * Appends another SList to this list.
     * <p>
     * Adds a list to the end of this list.
     * <p>
     * There are no restrictions on the length of either <code>this</code> list
     * or the input <code>anotherSList</code>.
     * <p>
     *
     * @param anotherSList is the list that we adding to <code>this</code> list.

     *                     SListArray
     *                     public void append(SList anotherSList){
     */
    public void append(SList anotherSList){
        int size = 2 * (this.size() + anotherSList.size());
        String[] dumArray = new String[size];
        System.arraycopy(myArray, 0, dumArray, 0, this.size());
        System.arraycopy(anotherSList, 0, dumArray, 0, anotherSList.size());
        myArray = dumArray;

        return;
    }

    /**
     * Finds the strings that appear the most times in <code>this</code> list.
     * <p>
     * There may be zero, one or more than one string that appears the
     * most times in <code>this</code> list. The method returns a new
     * list that contains these strings.
     * <p>
     * For example, if <code>this</code> is empty, then there are no strings
     * that appear the most times.
     * <p>
     * If the list is ["cat", "dog", "cat", "eel", "dog"] then the method should
     * return the list ["cat", "dog"].
     *
     * @return a list containing the strings that appear the most times in <code>this</code> list.
     */
    public SList commonStrings()
    {

        HashMap<String, Integer> dictionary = new HashMap<String, Integer>();
        for(int i =0; i<this.size(); i++)
        {
            if(!dictionary.containsKey(myArray[i]))
            {
                dictionary.put(myArray[i], 1);
                continue;
            }
            dictionary.replace(myArray[i], dictionary.get(myArray[i] + 1));
        }
        //Set<HashMap.Entry<String,Integer>> s = dictionary.entrySet();
        Iterator<HashMap.Entry<String,Integer>> sIterator = dictionary.entrySet().iterator();
        int max = 0;
        // source https://stackoverflow.com/questions/46898/how-do-i-efficiently-iterate-over-each-entry-in-a-java-map
        while(sIterator.hasNext())
        {
            HashMap.Entry<String, Integer> pair = sIterator.next();
            if(max < pair.getValue())
                max = pair.getValue();
        }

        SListArray b;
        b = new SListArray();
        int iter = 0;
        while(sIterator.hasNext())
        {
            HashMap.Entry<String, Integer> pair = sIterator.next();
            if(max == pair.getValue())
            {
                b.add(iter, pair.getKey());
            }
        }

        return b;
    }

    /**
     * Finds the strings that appear the most times in <code>this</code> list.
     * <p>
     * Instead of returning a list of the strings that appear the MOST, this
     * returns <code>n</code> lists, that contain the MOST, Second MOST, ..., <code>n</code>-th MOST
     * frequently appearing strings in <code>this</code> list.
     * <p>
     * Examples: If the list is ["A", "A", "A", "B", "B", "C", "C", "D"]
     * then <code>commonString(1)</code> will return [["A"]] (a list with 1 list in it), and
     * <code>commonString(2)</code> will return the list [["A"], ["B","C"]], and
     * <code>commonString(3)</code> will return the list [["A"], ["B","C"], ["D"]].
     * Note that <code>commonString(6)</code> will also return the list [["A"], ["B","C"], ["D"]]. If
     * data cannot produce <code>n</code> lists then it returns as many as possible.
     *
     * @param n is the number of lists of commonly used words. <code>n</code> must be
     *        at least 1.
     * @return a list of lists of the <code>n</code> most commonly appearing strings in <code>this</code> list.
     *         If <code>n</code> is larger than the actual number of lists that can be generated then returns
     *         a list of lists with as many lists as possible.
     */
    public SListArray[] commonStrings(int n)
    {
        SListArray[] a;
        a = new SListArray[3];
        return a;
    }


    @Override
    public String toString(){
        return "toString(): YOU NEED TO OVERRIDE THIS IN YOUR SListArray CLASS";
    }

    

}