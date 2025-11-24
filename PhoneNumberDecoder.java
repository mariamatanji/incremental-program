import java.util.Scanner;

public class PhoneNumberDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String phoneStr;   // User input: Phone number string
      int i;             // Current index in phone number string

      System.out.print("Enter number: ");
      phoneStr = scnr.next();

      for (i = 0; i < phoneStr.length(); ++i) { // For each element
         System.out.println("Element " + i + " is: " + phoneStr.charAt(i));
      }
   }
}
