public class Convert{

   /** EPSILON is used to check is two doubles are 
       close enough to each other to be considered the same
   */
   public static final double EPSILON = 0.000001;
   
   /** QUIET is used to display less information when testing */
   public static boolean QUIET = false;





   public static double convert(String temperature, char scale){
      // converts a temperature (value/scale) to a new scale
      return -1234567.9;
   }







   /*
    The main method is here for you test your code. 
    It is NOT part of the actual assignment 
    */

    public static void main(String[] args){
      System.out.println("Testing Convert.convert");
      String in = "10.0C";
      char scale = 'F';
      double expect = 50.0;
      double out = Convert.convert(in, scale);
      System.out.print("convert(\"" + in + "\",\'" + scale + "\')  ");
      if( Math.abs(expect-out)<EPSILON){
         System.out.println("[passed]");        
      }else{
         System.out.println("[failed]");  
         if(!QUIET){System.out.println("...expect : " + expect);}
         if(!QUIET){System.out.println("...actual : " + out);}       
      }
      
      
      
      in = "10.0C";
      scale = 'C';
      expect = 10.0;
      out = Convert.convert(in, scale);
      System.out.print("convert(\"" + in + "\",\'" + scale + "\')  ");
      if( Math.abs(expect-out)<EPSILON){
         System.out.println("[passed]");        
      }else{
         System.out.println("[failed]");        
         if(!QUIET){System.out.println("...expect : " + expect);}
      if(!QUIET){System.out.println("...actual : " + out);}
      }
      
   }
}