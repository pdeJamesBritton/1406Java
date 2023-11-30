import java.util.*;
import java.lang.Math;
public class Triangle extends Shape{

   Vector<double> ab = new Vector<double>(); //from a to b vector
   Vector<double> ac = new Vector<double>(); //from a to c vector
   Vector<double> bc = new Vector<double>(); //from c to c vector


   // -------------------------------------------------
   // Constructors for the Shape class
   // -------------------------------------------------

   protected final XYCoord a; // the anchor point
   public Triangle(XYCoord a, XYCoord b , XYCoord c) {
      // make all vectors neeced for cross product
      this.a = a;
      ab.add(b.getX() - a.getX());
      ab.add( b.getY() - a.getY());

      
      ac.add( c.getX() - a.getX());
      ac.add( c.getY() - a.getY());

      
      bc.add( c.getX() - b.getX());
      bc.add( c.getY() - b.getY());


   }
   
   /** Computes and returns the area of this shape. 
    * 
    * @return the area of <code>this</code> shape. 
    */
   public double area(){
      return Math.abs( 0.5 * (ab.getX() * ac.getY() - ac.getX() * ab.getY()) );
   }


   /** Computes and returns the perimeter of this shape.
    * 
    * @return the perimeter of <code>this</code> shape. 
    */
   public double perimeter(){
      double perm = 0;
      perm += getVectorLength(ab);
      perm += getVectorLength(ac);
      perm += getVectorLength(bc);
      return perm;
   }

   public void setBC(XYCoord newB, XYCoord newC)
   {
      ab.set(0, newB.getX() - a.getX());
      ab.set(1, newB.getY() - a.getY());


      ac.set(0,newC.getX() - a.getX());
      ac.set(1,newC.getY() - a.getY());


      bc.set(0,newC.getX() - newB.getX());
      bc.set(1,newC.getY() - newB.getY());
   }
   
   
   @Override
   public String toString(){
      return "Shape anchored at " + this.a.toString();
   }

}