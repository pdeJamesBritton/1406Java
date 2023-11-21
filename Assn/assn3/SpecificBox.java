public class SpecificBox extends Box{

   //private String label;
   //private String location;
   //private int size;

   /* ------------------------------------------------------------
       Please NOTE the ordering of the input parameters
    -------------------------------------------------------------*/
    /** Simple getter for this box's label
     *
     * @return the label of this box
     */
    public String getLabel(){ return this.label;}

    /** Simple getter for this box's size
     *
     * @return the size of this box
     */
    public int    getSize(){ return this.size;}

    /** Simple getter for this box's location
     *
     * @return the location of this box
     */
    public String getLocation(){ return this.location;}
   public SpecificBox(String label, String location, int size) {
       super(label, location, size);
   }

       // method compare
       public int compareTo(Box Y)
       {
           // returns based off of
           //If the locations of the boxes are different it should return ±1, if the locations are the same,
           //but the lengths of the labels are different it should return ±2, if the locations and label lengths are
           //the same, but the size is different it should return ±3. Finally, if they are the same box (by state)
           //then it should return 0 (zero).

           // will use several if/else statements
           // finding the value for compare location
           // X < Y      1
           // X == Y     0, further comparison needed
           // X > Y      -1

           int compareLocation = this.location.compareTo(Y.getLocation());
           if(compareLocation < 0 )
               compareLocation = -1;
           else if(compareLocation > 0)
               compareLocation = 1;
           else
               compareLocation = 0;
           System.out.println(compareLocation);
           int compareLengths = 10; // dum/testing value
           int compareSize = 10; // dum/testing value

           if (compareLocation != 0)
               return compareLocation;
           else {
               // comparing location size
               if (this.location.length() != Y.getLocation().length()) {
                   compareLocation = (this.location.length() < Y.getLocation().length()) ? -1 : 1;
               } else if (this.location.length() == Y.getLocation().length()) {
                   // finalizing compareLengths
                   compareLengths = (this.label.length() < Y.getLabel().length()) ? -2 : 2;
                   compareLengths = (compareLengths == 2 && this.label.length() == Y.getLabel().length()) ?
                           0 : compareLengths;
                   if (compareLengths != 0)
                       return compareLengths;
               }
           }

           if (compareLocation == 0 && compareLengths == 0) {
               compareSize = (this.size > Y.getSize()) ? -3 : 3;
               if (this.size == Y.getSize())
                   return (0);
               return (compareSize);
           }
           return (compareSize);
       }
   }

