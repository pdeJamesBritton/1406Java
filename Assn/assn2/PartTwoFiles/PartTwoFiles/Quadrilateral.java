import java.util.*;
import java.lang.Math;
public class Quadrilateral extends Shape{

   Vector < double > ab = new Vector < double >(); //from a to b vector
   Vector<double> bc = new Vector<double>(); //from a to c vector
   Vector<double> cd = new Vector<double>(); //from c to c vector
   Vector<double> da = new Vector<double>(); //from c to c vector
   // needed for making area calculation easy
   Vector<double> ac = new Vector<double>(); //from c to c vector
   // -------------------------------------------------
   // Constructors for the Shape class
   // -------------------------------------------------
   protected final XYCoord a; // the anchor point

   public  XYCoord b;
   public XYCoord c;
   public XYCoord d;
   public Quadrilateral(XYCoord a, XYCoord b , XYCoord c, XYCoord d) {

      this.a = a;

      ab.add(b.getX() - a.getX());
      ab.add( b.getY() - a.getY());


      bc.add( c.getX() - b.getX());
      bc.add( c.getY() - b.getY());


      cd.add( d.getX() - c.getX());
      cd.add( d.getY() - c.getY());

      da.add( a.getX() - d.getX());
      da.add( a.getY() - d.getY());


      ac.add( c.getX() - a.getX());
      ac.add( c.getY() - a.getY());

      
   }

   /** Computes and returns the area of this shape. 
    * 
    * @return the area of <code>this</code> shape. 
    */
   public double area(){
      // using cross products
      return 0.5 * ( Math.abs( ab.getX() * ac.getY() - ac.getX() * ab.getY() )  + Math.abs(  (ad.getX() * ac.getY() - ac.getX() * ad.getY()) ) );
   }


   /** Computes and returns the perimeter of this shape.
    * 
    * @return the perimeter of <code>this</code> shape. 
    */
   public double perimeter(){
      double perm = 0;
      perm += getVectorLength(ab);
      perm += getVectorLength(bc);
      perm += getVectorLength(cd);
      perm += getVectorLength(da);
      return perm;
   }


   /** Gets the anchor point for this object.
    * 
    * @return the <code>anchor</code> point of this object. 
    */
   public XYCoord getAnchor(){ return this.a; }
   

   @Override
   public String toString(){
      return "Shape anchored at " + this.a.toString();
   }

}