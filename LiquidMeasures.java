import java.util.Scanner;
/**
 *Divide liquid quantity into barrels, gallons and quarts.
 *
 *Project 2
 *@author Weston Craig COMP1210-005
 *@version September 1, 2017
 */
public class LiquidMeasures {
   /**
    *Given ounces, find the make up in barrels, gallons, etc.
    *
    *@param args Command line argument (not used)
    */
   public static void main(String[] args) {
      //set all variables equal to 0
      int liquid = 0;
      int barrels = 0;
      int gallons = 0;
      int quarts = 0;
      int ounces = 0;
      int leftover = 0;
      //get input on amount of liquid
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter amount of liquid in ounces: ");
      liquid = userInput.nextInt();
      //Calculate barrels, gallons, quarts and ounces
      if (liquid < 1000000000) {
         barrels = liquid / 5376;
         leftover = liquid % 5376;
         gallons = leftover / 128;
         leftover = leftover % 128;
         quarts = leftover / 32;
         ounces = leftover % 32;
         //print amounts
         System.out.print("Measures by volume: \n\tBarrels: " + barrels
                           + "\n\tGallons: " + gallons + "\n\tQuarts: "
                           + quarts + "\n\tOunces: " + ounces); 
         //prints equation to get total amount from each part
         System.out.print("\n" + liquid + " oz = (" + barrels + " bl * 5376 oz)"
                          + " +" + " (" + gallons + " gal * 128 oz) + (" 
                          + quarts + " qt * 32 oz) + (" + ounces + " oz)");
      }
      else {
         System.out.println("\rAmount must not exceed 1,000,000,000.");
      }
   }
}
