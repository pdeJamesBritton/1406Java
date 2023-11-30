import java.util.*;
import java.lang.Math;
public class Circle extends Shape{



   // -------------------------------------------------
   // Constructors for the Shape class
   // -------------------------------------------------
   protected final XYCoord a; // the anchor point
   public Circle(XYCoord centre, double radius){

      this.a = centre;
      if(radius < 0 ) {
         show("radius invalid, set radius == 0");
         radius = 0;
      }


   }



   /** Computes and returns the area of this shape. 
    * 
    * @return the area of <code>this</code> shape. 
    */
   public double area(){return Math.PI * radius * radius;}


   /** Computes and returns the perimeter of this shape.
    * 
    * @return the perimeter of <code>this</code> shape. 
    */
   public double perimeter(){return 2.0 * Math.PI * radius;}


   public void setRadius(double newRadius){
      radius = newRadius;
      if(radius < 0 ) {
         show("radius invalid, set radius == 0");
         radius = 0;
      }

   }
   

   @Override
   public String toString(){
      return "Shape anchored at " + this.a.toString();
   }

}