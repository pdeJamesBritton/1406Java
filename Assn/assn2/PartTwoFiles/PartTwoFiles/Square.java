import java.util.*;
import java.lang.Math;

public class Square extends Quadrilateral{

   protected final XYCoord a; // the anchor point
   public Square(XYCoord anchor, double length){

      this.a = anchor;
      this.b = XYCoord(a.getX(), a.getY() + length);
      this.c = XYCoord(a.getX() + length, a.getY() + length);
      this.d = XYCoord(a.getX() + length, a.getY());

   }



}