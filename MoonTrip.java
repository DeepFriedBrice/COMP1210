import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
 *Create reader for long ticket strands.
 *
 *Project 3
 *Weston Craig COMP 1210-005
 *September 13, 2017
*/
public class MoonTrip {
   static final double STUDENT_DISCOUNT = .40;
   static final double EMPLOYEE_DISCOUNT = .20;
   /**
    * Create reader for long ticket strands.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      String ticket = "";
      //initialize variables
      DecimalFormat df = new DecimalFormat("$#,###.00");
      DecimalFormat rand = new DecimalFormat("0000");
      double price;
      char category;
      String hour;
      String minutes;
      String month;
      String day;
      String year;
      String seat;
      String description;
      double cost;
      int prize;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter ticket code: ");
      ticket = scan.nextLine();
      if (ticket.length() < 26) {
         System.out.print("***Invalid ticket code***"
                           + "\nTicket code must have at least 26 characters.");
      }
      else {
         ticket = ticket.trim();
         price = Double.parseDouble(ticket.substring(13, 21));
         category = ticket.charAt(12);
         //set discounts
         if (category == 's') {
            cost = price * STUDENT_DISCOUNT;
         }
         else if (category == 'e') {
            cost = price * EMPLOYEE_DISCOUNT;
         }
         else {
            cost = price;
         }  
         //using subscript divide ticket code into information
         month = ticket.substring(0, 2);
         day = ticket.substring(2, 4);
         year = ticket.substring(4, 8);
         hour = ticket.substring(8, 10);
         minutes = ticket.substring(10, 12);
         seat = ticket.substring(22, 25);
         description = ticket.substring(25);
         Random gen = new Random();
         prize = gen.nextInt(9999) + 1; 
         //print all data
         System.out.println("\nDate: " + month + "/" + day + "/" + year 
            + "   Time: " + hour + ":" + minutes + "   Seat: " + seat);
         System.out.println("Itinerary: " + description);
         System.out.println("Price: " + df.format(price) 
            + "   Category: " + category + "   Cost: " + df.format(cost));
         System.out.println("Prize Number: " + rand.format(prize));
      }
   }   
}
