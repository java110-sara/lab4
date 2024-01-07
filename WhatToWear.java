//name: Sara Russert
//date: 1/7/24
//file: WhatToWear.java

import java.util.Scanner;

public class WhatToWear {
   public static void main(String[] args) {
      
      //declare constants for cutoff temps
      final int JACKET_CUTOFF = 75;
      final int COAT_CUTOFF = 45;
      
      //declare variable for the current temp
      double temp;
      
      //declare string variable to store the answer
      String answer;
      
      //create scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //get user input for the temp
      System.out.print("Enter the current temperature: ");
      temp = keyboard.nextDouble();
      
      //determin whether to wear coat, jacket, or none
      if (temp >= JACKET_CUTOFF)
         answer = "It is warm today; you do not need a jacket or a coat";
      else if (temp >= COAT_CUTOFF)
         answer = "It is cool today; a jacket is recommended";
      else
         answer = "It is cold today; a heavy coat is recommended";
         
      //display answer to the user
      System.out.println("The temperature today is: " + temp);
      System.out.println(answer); 
      
      
   }
}