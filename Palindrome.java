//program to check whether entered number or string is palindrome or not

import java.util.*;   
class Palindrome
{  
   public static void main(String args[])  
   {  
      String input, reverse = "";
      Scanner scanner = new Scanner(System.in);   
      System.out.println("Enter a number/String : ");  
      input = scanner.nextLine();   
      int length = input.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + input.charAt(i);  
      if (input.equals(reverse))  
         System.out.println(input + " is Palindrome.");  
      else  
         System.out.println(input + " is Not palindrome.");   
   }  
}   