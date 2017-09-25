/**
 *Gather User Information.
 *
 *Activity 4A
 *@author Weston Craig COMP 1210-005
 *@version September 25, 2017
*/
public class UserInfo {
   // declare instance variables here
   // constructor
   // methods
   // toString method (for String output)
   private String firstName, lastName, location;
   private int age, status;
   private final int offline = 0, online = 1;
   /**
    * Create user information.
    *
    * @param firstNameIn Command line arguments (not used).
    * @param lastNameIn Command line arguments (not used).
    */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = offline;
   }
   /** @param locationName sets location
    */
   public void setLocation(String locationName) {
      location = locationName;
   }
   /**
    *@return age
    */
   public int getAge() {
      return age;
   }
   /**
    *@return location
    */
   public String getLocation() {
      return location;
   }
   /**
    */
   public void logOff() {
      status = offline;
   }
   /**
    */
   public void logOn() {
      status = online;
   }
      
   /**
    *@param ageInYears takes age input to get user age.
    *@return user age
    */
   public boolean setAge(int ageInYears) {
      boolean isSet = false;
      if (ageInYears > 0) {
         age = ageInYears;
         isSet = true;
      }
      return isSet;
   }
     
    /**
     *@return output as string
     */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == offline) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      	
      return output;
   }     
}