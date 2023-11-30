import java.util.Arrays;

public class SimplePeaks{

    public static void main(String[] args){
      
      
      for( int[] data : new int[][]{{10, 20, 30, 40},{3, 1, 4, -2, 13, -2, 5},{1, 4, 4, 1}}){
         
         int np = Peaks.numPeaks(data);
         int[] p = Peaks.peaks(data);
         int[][] mm = Peaks.minmax(data);
         System.out.println("data = " + Arrays.toString(data));
         System.out.println("numPeaks(data) -got-> " + np);
         System.out.println("   peaks(data) -got-> " + Arrays.toString(p));
         System.out.println("  minmax(data) -got-> " + Arrays.deepToString(mm));
         System.out.println();
      }
      

      /*


int[]   data2  = {3, 1, 4, -2, 13, -2, 5};    
Peaks.numPeaks(data2) -> 4
Peaks.peaks(data2)    -> [0,2,4,6]
Peaks.minmax(data2)   -> [ [-2,3,5] , [13,4] ]

int[]   data3  = {1, 4, 4, 1};    
Peaks.numPeaks(data2) -> 0
Peaks.peaks(data2)    -> []
Peaks.minmax(data2)   -> [ [1,0,3], [4,1,2] ]

      // you can use this to help test your code

    }
    */
}
}
