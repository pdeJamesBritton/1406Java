import java.util.*;
import java.lang.Math;

public class Shape{

   // -------------------------------------------------
   // State of all Shapes
   // -------------------------------------------------
   
   

   // -------------------------------------------------
   // Constructors for the Shape class
   // -------------------------------------------------
   public Shape(double x, double y){
      this( new XYCoord(x,y) );
   }

   public Shape(XYCoord anchor){
      this.a = anchor;
   }


   /** Computes and returns the area of this shape. 
    * 
    * @return the area of <code>this</code> shape. 
    */
   public double area(){return -1.0;}


   /** Computes and returns the perimeter of this shape.
    * 
    * @return the perimeter of <code>this</code> shape. 
    */
   public double perimeter(){return -2.0;}


   /** Gets the anchor point for this object.
    * 
    * @return the <code>anchor</code> point of this object. 
    */
   public XYCoord getAnchor(){ return this.a; }

   // calculate the length of any vector
   // ecludean norm
   public double getVectorLength( Vector<double> a){
      double len = 0;
      for(int i = 0; i < a.size(); i++ ){
         len += a(i) * a(i);
      }
      return Math.sqrt(len);
   }
   

   @Override
   public String toString(){
      return "Shape anchored at " + this.a.toString();
   }

}