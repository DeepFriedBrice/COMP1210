import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *Evaluate given expression given a particular input.
 *
 *Project 3
 *@author Weston Craig COMP 1210-005
 *@version September 13, 2017
 */
public class ExpressionEvaluator {
   /**
    *Given user input calculate the output of a function.
    *
    *@param args Command line argument (not used)
    */
   public static void main(String[] args) {
      //initialize variables, Scanner and DecimalFormat
      Scanner userInput = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#,##0.0####");
      double x, numerator, denominator, result;
      String stringresult = new String();
      System.out.print("Enter a value for x: ");
      //get user input for x
      x = userInput.nextDouble();
      //calculate numerator and denominator seperately then divide
      numerator = Math.sqrt(Math.abs(23.7 * Math.pow(x, 9)) - x);
      denominator = (7.3 * Math.pow(x, 2) + 5.2 * x + 3.1);
      result = numerator / denominator;
      System.out.print("Result: " + result);
      //convert to String
      stringresult = Double.toString(result);
      //digits pre and post decimal place
      int predec = stringresult.indexOf(".");
      int postdec = stringresult.substring(predec).length() - 1;
      System.out.print("\n# digits to left of decimal point: " + predec);
      System.out.print("\n# digits to right of decimal point: " + postdec);
      String number = stringresult;
      //formatt properly
      double amount = Double.parseDouble(number);
      System.out.print("\nFormatted Result: " + df.format(amount));
   }
}