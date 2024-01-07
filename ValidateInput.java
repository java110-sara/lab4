//name: Sara Russert
//date: 1/7/24
//file: ValidateInput.java

import java.util.Scanner;

public class ValidateInput {
   public static void main(String[] args) {
      //declare constant for required string length
      final int INPUT_STRING_LEN = 4;
      
      //declare variable for the inputString
      String inputString;
      
      //declare variable to store the length of the input string
      int inputStringLen;
      
      //declare boolean variable to store whether string is valid
      //initialize at false
      boolean validInput = false;
      
      //create Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //get user input for the string
      System.out.print("Enter a string with length " + INPUT_STRING_LEN + ": ");
      inputString = keyboard.nextLine();
      System.out.println("You entered: " + inputString);
      
      //determine length of the inputString
      inputStringLen = inputString.length();
      
      //determine if string is the correct length
      //if it is, flip boolean to true
      if (inputStringLen == INPUT_STRING_LEN)
         //flip boolean variable to true
         validInput = true;
      
      //display result to the user
      if (validInput)
         System.out.println("You correctly entered a string with " + INPUT_STRING_LEN + " characters.");
      else {
         System.out.println("You did not enter a string with " + INPUT_STRING_LEN + " characters.");    
         System.out.println("Instead, you entered a string with " + inputStringLen + " characters.");
      }
   }
}

