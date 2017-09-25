import java.util.Scanner;
/**
 *Recived Pyramid data and calculates area.
 *
 *Project 2
 *@author Weston Craig COMP1210-005
 *@version September 1, 2017
 */
public class AreaOfPyramid {
   /**
    *User input data on base and slant height to return area.
    *
    *@param args Command line argument (not used)
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double base = 0;
      double slantHeight = 0;
      System.out.println("Enter values for base and slant height of a "
                        + "pyramid:");
      //get base dimension
      System.out.print("\tbase = ");
      base = userInput.nextDouble();
      //get slant height dimension
      System.out.print("\tslant height = ");
      slantHeight = userInput.nextDouble();
      //final read out and calculation
      System.out.print("\nA pyramid with base = " + base + " and"
                     + " slant height = " + slantHeight + "\nhas an area"
                     + " of " + (base * base + 4 * (base * slantHeight) / 2) 
                     + " square units.");
   }
}
      
   